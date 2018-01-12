/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import beans.AuxBean;
import beans.AvisoBean;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Consultas {

    List<AvisoBean> avisos;
    List<Integer> repetidos;
    String sql;

    public Consultas() {

        avisos = new ArrayList<AvisoBean>();
        repetidos = new ArrayList<Integer>();
    }

    public void completarAvisos() throws SQLException {

        Conexion objCon = new Conexion();
        objCon.conectar();

        sql = "select id,idCategoria,destaque,idPais,created_at,idRepub from db_todobusco_prod.mod_aviso_aviso"
                + "  limit 10000";

        PreparedStatement stm = objCon.getCon().prepareStatement(sql);

        ResultSet rs = stm.executeQuery();

        while (rs.next()) {

            int id = rs.getInt("id");
            int idCategoria = rs.getInt("idCategoria");
            String portal = "";

            if (idCategoria == 1) {

                portal = "CasaTB";

            } else if (idCategoria == 2) {

                portal = "CarroTB";

            } else {

                portal = "VentaTB";

            }

            int destaqueSQL = rs.getInt("destaque");

            String destaque = "";

            if (destaqueSQL == 1) {

                destaque = "Aviso Simple";

            } else if (destaqueSQL == 2) {

                destaque = "Destaque Plata";

            } else if (destaqueSQL == 3) {

                destaque = "Destaque Oro";

            } else if (destaqueSQL == 6) {

                destaque = "Destaque Membresia";

            }

            int idPais = rs.getInt("idPais");

            String pais = "No Definido";

            if (idPais == 13) {
                pais = "Bolivia";
            } else if (idPais == 38) {

                pais = "Costa Rica";

            } else if (idPais == 39) {

                pais = "Dominicana";

            } else if (idPais == 34) {

                pais = "Guatemala";

            } else if (idPais == 1) {

                pais = "Nicaragua";

            } else if (idPais == 14) {

                pais = "Panama";

            } else if (idPais == 2) {

                pais = "Peru";

            }

            String fecha = rs.getString("created_at").substring(0, 10);

            String aux = fecha.substring(0, 4) + fecha.substring(5, 7) + fecha.substring(8, 10);

            int id_fecha = Integer.parseInt(aux);

            int idRep = rs.getInt("idRepub");

            AuxBean auxB = new AuxBean();

            auxB.setIdRep(idRep);

            if (auxB != null) {

                repetidos.add(idRep);

            }

            AvisoBean aviso = new AvisoBean();

            aviso.setId_Aviso(id);
            aviso.setId_fecha(id_fecha);
            aviso.setPortal(portal);
            aviso.setPais(pais);
            aviso.setDestaque(destaque);
            aviso.setFecha_publicacion(fecha);

            avisos.add(aviso);

        }

        objCon.desconectar();

    }

    public void eliminarRepetidos() {

        for (Integer repetido : repetidos) {

            for (AvisoBean aviso : avisos) {

                if (aviso.getId_Aviso() == repetido) {

                    aviso.setId_Aviso(0);

                }

            }

        }

    }

    public void recorrerAvisos() {

        for (AvisoBean aviso : avisos) {

            System.out.println("Id_Aviso: " + aviso.getId_Aviso()
                    + " Id_Fecha: " + aviso.getId_fecha()
                    + " Portal: " + aviso.getPortal()
                    + " Destaque: " + aviso.getDestaque()
                    + " Pais: " + aviso.getPais()
                    + " Fecha_Creacion" + aviso.getFecha_publicacion());

        }

    }

    public void recorrerRepetidos() {
        int i = 0;
        for (Integer repetido : repetidos) {
            i++;
            System.out.println(i + "  ****" + repetido);

        }

    }

    public List<AvisoBean> getAvisos() {
        return avisos;
    }

    public void setAvisos(List<AvisoBean> avisos) {
        this.avisos = avisos;
    }

    public List<Integer> getRepetidos() {
        return repetidos;
    }

    public void setRepetidos(List<Integer> repetidos) {
        this.repetidos = repetidos;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }
    


}
