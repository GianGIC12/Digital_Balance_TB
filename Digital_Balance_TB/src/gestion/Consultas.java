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

        sql = "select id,idCategoria,destaque,idPais,created_at,idRepub,idSubcategoria from db_todobusco_prod.mod_aviso_aviso"
                + "  limit 100";

        PreparedStatement stm = objCon.getCon().prepareStatement(sql);

        ResultSet rs = stm.executeQuery();

        while (rs.next()) {

            int id = rs.getInt("id");
            int idCategoria = rs.getInt("idCategoria");
            int idSubCategoria=rs.getInt("idSubcategoria");
            String portal = "";
            
            String categoria="";
            
            String subCategoria="";
            
            switch(idCategoria){
                
                case 1: categoria="Inmuebles";break;
                case 2: categoria="Vehiculos";break;
                 case 3: categoria="Equipos Electronicos";break;   
                    case 4: categoria="Repuestos y Accesorios";break;
                    case 5: categoria="Mascotas";break;
                   case 6: categoria="Muebles y Decoracion";break;     
                 case 7: categoria="Instrumentos Musicales";break;    
                 case 8: categoria="Herramientas y Equipos";break;      
                       
                 case 9: categoria="Articulos para Bebes";break;
                case 10: categoria="Bicicletas";break;
                 case 11: categoria="Guia de Servicios";break;   
                    case 12: categoria="Clases y Cursos";break;
                    case 13: categoria="Donaciones";break;
                   case 14: categoria="Granja";break;     
                 case 15: categoria="Turismo";break;    
                 case 16: categoria="Juguetes";break;      
                     
                    case 17: categoria="Inmuebles";break;
                case 18: categoria="Extraviados y robados";break;
                 case 19: categoria="Tecnologia";break;   
                    case 20: categoria="Belleza y Etica";break;
                    case 21: categoria="Talleres y Servicios";break;
                   case 22: categoria="Negocios";break;     
                 case 23: categoria="Clinicas y Servicios";break;    
                 case 24: categoria="Trabajo Eventual";break;   
                 case 25: categoria="Bodas";break;    
                    
                     
                default: categoria="No Definido";break;
                
                
                
            }
            
            
          switch(idSubCategoria){
                
                case 1: subCategoria="Apartamentos";break;
                case 2: subCategoria="Casas";break;
                 case 3: subCategoria="Casas de Playa";break;   
                    case 4: subCategoria="Edidicios";break;
                    case 5: subCategoria="Fincas";break;
                   case 6: subCategoria="Locales Comerciales";break;     
                 case 7: subCategoria="Negocios";break;    
                 case 8: subCategoria="Oficinas";break;      
                       
                 case 9: subCategoria="Propiedades de Islas";break;
                case 10: subCategoria="Lotes y Terrenos";break;
                 case 11: subCategoria="Autos";break;   
                    case 12: subCategoria="Motos";break;
                    case 13: subCategoria="Camiones y Buses";break;
                   case 14: subCategoria="Yates y Barcos";break;     
                 case 15: subCategoria="Equipo Pesado";break;    
                 case 16: subCategoria="Telefonos Celulares";break;      
                     
                    case 17: subCategoria="Computadoras";break;
                case 18: subCategoria="Electrodomesticos";break;
                 case 19: subCategoria="Accesorios";break;   
                    case 20: subCategoria="Impresoras";break;
                    case 21: subCategoria="Tabletas";break;
                   case 22: subCategoria="Amortiguadores";break;     
                 case 23: subCategoria="Chasis y Partes externas";break;    
                 case 24: subCategoria="Equipo de Musica";break;   
                 case 25: subCategoria="Motor y partes";break;    
                    
              
                       case 26: subCategoria="Mufle";break;
                case 27: subCategoria="Neumaticos";break;
                 case 28: subCategoria="Rines";break;   
                    case 29: subCategoria="Otros Repuestos";break;
                    case 30: subCategoria="Perros";break;
                   case 31: subCategoria="Gatos";break;     
                 case 32: subCategoria="Caballos y Ganados";break;    
                 case 33: subCategoria="Peces y Reptiles";break;      
                       
                 case 34: subCategoria="Pajaros";break;
                case 35: subCategoria="Alimentos para Mascotas";break;
                 case 36: subCategoria="Otras Mascotas";break;   
                    case 37: subCategoria="Servcios y Tiendas";break;
                    case 38: subCategoria="Adoptar";break;
                   case 39: subCategoria="Dar en Adopcion";break;     
                 case 40: subCategoria="En General";break;    
                 case 41: subCategoria="Muebles";break;      
                     
                    case 42: subCategoria="Recamaras";break;
                case 43: subCategoria="Muebles de oficina";break;
                 case 44: subCategoria="Ventanas";break;   
                    case 45: subCategoria="Plantas y Muebles de Jardin";break;
                    case 46: subCategoria="Decoracion y Lamparas";break;
                   case 47: subCategoria="Pisos y Alfombras";break;     
                 case 48: subCategoria="Articulos de Cocina";break;    
                 case 49: subCategoria="Cortinas";break;   
                 case 50: subCategoria="Otros Muebles y Decoracion";break; 
                     
                     
                     
                   
                case 51: subCategoria="En General";break;
                case 52: subCategoria="Guitarras";break;
                 case 53: subCategoria="Percusion";break;   
                    case 54: subCategoria="Pianos";break;
                    case 55: subCategoria="Otros Instrumentos Musicales";break;
                   case 56: subCategoria="Herramientas Agricolas";break;     
                 case 57: subCategoria="Herramientas a Gas";break;    
                 case 58: subCategoria="Herramientas Electricas";break;      
                       
                 case 59: subCategoria="Equipo Pesado";break;
                case 60: subCategoria="Equipo Electrico";break;
                 case 61: subCategoria="Basura y Reciclaje";break;   
                    case 62: subCategoria="Ladrillo y Piedra";break;
                    case 63: subCategoria="Carpinteria y Madera";break;
                   case 64: subCategoria="Otras Herramientas y Equipos";break;     
                 case 65: subCategoria="En General";break;    
                 case 66: subCategoria="Coches";break;      
                     
                    case 67: subCategoria="Juguetes";break;
                case 68: subCategoria="Muebles para Bebes";break;
                 case 69: subCategoria="Otros Articulos para Bebes";break;   
                    case 70: subCategoria="Biciletas";break;
                    case 71: subCategoria="Juegos de Ocio";break;
                   case 72: subCategoria="Surf y Acuaticos";break;     
                 case 73: subCategoria="Maquinas de Entrenamiento";break;    
                 case 74: subCategoria="Otros Accesorios";break;   
                 case 75: subCategoria="Venta de Negocios";break;    
                    
              
                       case 76: subCategoria="Negocios Piramides";break;
                case 77: subCategoria="Inversiones";break;
                 case 78: subCategoria="Oportunidades de Pequeña Empresa";break;   
                    case 79: subCategoria="Productos Mayoristas";break;
                    case 80: subCategoria="Otros Servicios en General";break;
                   case 81: subCategoria="En General";break;     
                 case 82: subCategoria="Idiomas";break;    
                 case 83: subCategoria="Arte y Danza";break;      
                       
                 case 84: subCategoria="Cursos Diversos";break;
                case 85: subCategoria="Tecnicos e Informaticos";break;
                 case 86: subCategoria="Licenciaturas";break;   
                    case 87: subCategoria="PostGrados y Maestrias";break;
                    case 88: subCategoria="Seminarios";break;
                   case 89: subCategoria="Libros";break;     
                 case 90: subCategoria="Donaciones";break;    
                 case 91: subCategoria="Regalo";break;      
                     
                    case 92: subCategoria="Ayuda";break;
                case 93: subCategoria="Organizaciones";break;
                 case 94: subCategoria="Voluntarios";break;   
                    case 95: subCategoria="Audio y Video";break;
                    case 96: subCategoria="Equipo de Agricultura";break;
                   case 97: subCategoria="Excursiones";break;     
                 case 98: subCategoria="Espectaculos";break;    
                 case 99: subCategoria="Hoteles";break;   
                 case 100: subCategoria="Hospedajes";break;  
                     

                     
                     
                default: subCategoria="No Definido";break;
                
                
                
            }
            


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
            aviso.setCategoria(categoria);
            aviso.setSubCategoria(subCategoria);

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
                    + " Fecha_Creacion: " + aviso.getFecha_publicacion()
                  + " Categoria: " + aviso.getCategoria()
            + " SubCategoria: " + aviso.getSubCategoria()
            
            );

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
