/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import beans.AuxBean;
import beans.AvisoBean;
import beans.ContactabilidadBean;
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
    List<ContactabilidadBean> contactos;
    List<Integer> repetidos;
    String sql;

    public Consultas() {

        avisos = new ArrayList<AvisoBean>();
        contactos = new ArrayList<ContactabilidadBean>();
        repetidos = new ArrayList<Integer>();
    }

    public void completarAvisos() throws SQLException {

        Conexion objCon = new Conexion();
        objCon.conectar();

        sql = "select id,idCategoria,destaque,idPais,created_at,idRepub,idSubcategoria from db_todobusco_prod.mod_aviso_aviso"
                + "  limit 120000";

        PreparedStatement stm = objCon.getCon().prepareStatement(sql);

        ResultSet rs = stm.executeQuery();

        while (rs.next()) {

            int id = rs.getInt("id");
            int idCategoria = rs.getInt("idCategoria");
            int idSubCategoria = rs.getInt("idSubcategoria");
            String portal = "";

            String categoria = "";

            String subCategoria = "";

            switch (idCategoria) {

                case 1:
                    categoria = "Inmuebles";
                    break;
                case 2:
                    categoria = "Vehiculos";
                    break;
                case 3:
                    categoria = "Equipos Electronicos";
                    break;
                case 4:
                    categoria = "Repuestos y Accesorios";
                    break;
                case 5:
                    categoria = "Mascotas";
                    break;
                case 6:
                    categoria = "Muebles y Decoracion";
                    break;
                case 7:
                    categoria = "Instrumentos Musicales";
                    break;
                case 8:
                    categoria = "Herramientas y Equipos";
                    break;

                case 9:
                    categoria = "Articulos para Bebes";
                    break;
                case 10:
                    categoria = "Bicicletas";
                    break;
                case 11:
                    categoria = "Guia de Servicios";
                    break;
                case 12:
                    categoria = "Clases y Cursos";
                    break;
                case 13:
                    categoria = "Donaciones";
                    break;
                case 14:
                    categoria = "Granja";
                    break;
                case 15:
                    categoria = "Turismo";
                    break;
                case 16:
                    categoria = "Juguetes";
                    break;

                case 17:
                    categoria = "Inmuebles";
                    break;
                case 18:
                    categoria = "Extraviados y robados";
                    break;
                case 19:
                    categoria = "Tecnologia";
                    break;
                case 20:
                    categoria = "Belleza y Etica";
                    break;
                case 21:
                    categoria = "Talleres y Servicios";
                    break;
                case 22:
                    categoria = "Negocios";
                    break;
                case 23:
                    categoria = "Clinicas y Servicios";
                    break;
                case 24:
                    categoria = "Trabajo Eventual";
                    break;
                case 25:
                    categoria = "Bodas";
                    break;

                default:
                    categoria = "No Definido";
                    break;

            }

            switch (idSubCategoria) {

                case 1:
                    subCategoria = "Apartamentos";
                    break;
                case 2:
                    subCategoria = "Casas";
                    break;
                case 3:
                    subCategoria = "Casas de Playa";
                    break;
                case 4:
                    subCategoria = "Edidicios";
                    break;
                case 5:
                    subCategoria = "Fincas";
                    break;
                case 6:
                    subCategoria = "Locales Comerciales";
                    break;
                case 7:
                    subCategoria = "Negocios";
                    break;
                case 8:
                    subCategoria = "Oficinas";
                    break;

                case 9:
                    subCategoria = "Propiedades de Islas";
                    break;
                case 10:
                    subCategoria = "Lotes y Terrenos";
                    break;
                case 11:
                    subCategoria = "Autos";
                    break;
                case 12:
                    subCategoria = "Motos";
                    break;
                case 13:
                    subCategoria = "Camiones y Buses";
                    break;
                case 14:
                    subCategoria = "Yates y Barcos";
                    break;
                case 15:
                    subCategoria = "Equipo Pesado";
                    break;
                case 16:
                    subCategoria = "Telefonos Celulares";
                    break;

                case 17:
                    subCategoria = "Computadoras";
                    break;
                case 18:
                    subCategoria = "Electrodomesticos";
                    break;
                case 19:
                    subCategoria = "Accesorios";
                    break;
                case 20:
                    subCategoria = "Impresoras";
                    break;
                case 21:
                    subCategoria = "Tabletas";
                    break;
                case 22:
                    subCategoria = "Amortiguadores";
                    break;
                case 23:
                    subCategoria = "Chasis y Partes externas";
                    break;
                case 24:
                    subCategoria = "Equipo de Musica";
                    break;
                case 25:
                    subCategoria = "Motor y partes";
                    break;

                case 26:
                    subCategoria = "Mufle";
                    break;
                case 27:
                    subCategoria = "Neumaticos";
                    break;
                case 28:
                    subCategoria = "Rines";
                    break;
                case 29:
                    subCategoria = "Otros Repuestos";
                    break;
                case 30:
                    subCategoria = "Perros";
                    break;
                case 31:
                    subCategoria = "Gatos";
                    break;
                case 32:
                    subCategoria = "Caballos y Ganados";
                    break;
                case 33:
                    subCategoria = "Peces y Reptiles";
                    break;

                case 34:
                    subCategoria = "Pajaros";
                    break;
                case 35:
                    subCategoria = "Alimentos para Mascotas";
                    break;
                case 36:
                    subCategoria = "Otras Mascotas";
                    break;
                case 37:
                    subCategoria = "Servcios y Tiendas";
                    break;
                case 38:
                    subCategoria = "Adoptar";
                    break;
                case 39:
                    subCategoria = "Dar en Adopcion";
                    break;
                case 40:
                    subCategoria = "En General";
                    break;
                case 41:
                    subCategoria = "Muebles";
                    break;

                case 42:
                    subCategoria = "Recamaras";
                    break;
                case 43:
                    subCategoria = "Muebles de oficina";
                    break;
                case 44:
                    subCategoria = "Ventanas";
                    break;
                case 45:
                    subCategoria = "Plantas y Muebles de Jardin";
                    break;
                case 46:
                    subCategoria = "Decoracion y Lamparas";
                    break;
                case 47:
                    subCategoria = "Pisos y Alfombras";
                    break;
                case 48:
                    subCategoria = "Articulos de Cocina";
                    break;
                case 49:
                    subCategoria = "Cortinas";
                    break;
                case 50:
                    subCategoria = "Otros Muebles y Decoracion";
                    break;

                case 51:
                    subCategoria = "En General";
                    break;
                case 52:
                    subCategoria = "Guitarras";
                    break;
                case 53:
                    subCategoria = "Percusion";
                    break;
                case 54:
                    subCategoria = "Pianos";
                    break;
                case 55:
                    subCategoria = "Otros Instrumentos Musicales";
                    break;
                case 56:
                    subCategoria = "Herramientas Agricolas";
                    break;
                case 57:
                    subCategoria = "Herramientas a Gas";
                    break;
                case 58:
                    subCategoria = "Herramientas Electricas";
                    break;

                case 59:
                    subCategoria = "Equipo Pesado";
                    break;
                case 60:
                    subCategoria = "Equipo Electrico";
                    break;
                case 61:
                    subCategoria = "Basura y Reciclaje";
                    break;
                case 62:
                    subCategoria = "Ladrillo y Piedra";
                    break;
                case 63:
                    subCategoria = "Carpinteria y Madera";
                    break;
                case 64:
                    subCategoria = "Otras Herramientas y Equipos";
                    break;
                case 65:
                    subCategoria = "En General";
                    break;
                case 66:
                    subCategoria = "Coches";
                    break;

                case 67:
                    subCategoria = "Juguetes";
                    break;
                case 68:
                    subCategoria = "Muebles para Bebes";
                    break;
                case 69:
                    subCategoria = "Otros Articulos para Bebes";
                    break;
                case 70:
                    subCategoria = "Biciletas";
                    break;
                case 71:
                    subCategoria = "Juegos de Ocio";
                    break;
                case 72:
                    subCategoria = "Surf y Acuaticos";
                    break;
                case 73:
                    subCategoria = "Maquinas de Entrenamiento";
                    break;
                case 74:
                    subCategoria = "Otros Accesorios";
                    break;
                case 75:
                    subCategoria = "Venta de Negocios";
                    break;

                case 76:
                    subCategoria = "Negocios Piramides";
                    break;
                case 77:
                    subCategoria = "Inversiones";
                    break;
                case 78:
                    subCategoria = "Oportunidades de Pequenia Empresa";
                    break;
                case 79:
                    subCategoria = "Productos Mayoristas";
                    break;
                case 80:
                    subCategoria = "Otros Servicios en General";
                    break;
                case 81:
                    subCategoria = "En General";
                    break;
                case 82:
                    subCategoria = "Idiomas";
                    break;
                case 83:
                    subCategoria = "Arte y Danza";
                    break;

                case 84:
                    subCategoria = "Cursos Diversos";
                    break;
                case 85:
                    subCategoria = "Tecnicos e Informaticos";
                    break;
                case 86:
                    subCategoria = "Licenciaturas";
                    break;
                case 87:
                    subCategoria = "PostGrados y Maestrias";
                    break;
                case 88:
                    subCategoria = "Seminarios";
                    break;
                case 89:
                    subCategoria = "Libros";
                    break;
                case 90:
                    subCategoria = "Donaciones";
                    break;
                case 91:
                    subCategoria = "Regalo";
                    break;

                case 92:
                    subCategoria = "Ayuda";
                    break;
                case 93:
                    subCategoria = "Organizaciones";
                    break;
                case 94:
                    subCategoria = "Voluntarios";
                    break;
                case 95:
                    subCategoria = "Audio y Video";
                    break;
                case 96:
                    subCategoria = "Equipo de Agricultura";
                    break;
                case 97:
                    subCategoria = "Excursiones";
                    break;
                case 98:
                    subCategoria = "Espectaculos";
                    break;
                case 99:
                    subCategoria = "Hoteles";
                    break;
                case 100:
                    subCategoria = "Hospedajes";
                    break;

                case 101:
                    subCategoria = "Restaurantes";
                    break;

                case 102:
                    subCategoria = "Bares y Discotecas";
                    break;
                case 103:
                    subCategoria = "Varios";
                    break;
                case 104:
                    subCategoria = "Coches";
                    break;
                case 105:
                    subCategoria = "Juguetes";
                    break;
                case 106:
                    subCategoria = "Otro";
                    break;
                case 107:
                    subCategoria = "Bodegas";
                    break;
                case 108:
                    subCategoria = "Articulos de Temporada";
                    break;
                case 109:
                    subCategoria = "Venta de Garage";
                    break;
                case 110:
                    subCategoria = "Vestimenta";
                    break;

                case 111:
                    subCategoria = "Otros Articulos Varios";
                    break;

                case 112:
                    subCategoria = "Masajes terapeuticos";
                    break;
                case 113:
                    subCategoria = "Medicina Alternativa";
                    break;
                case 114:
                    subCategoria = "Otros belleza y Estetica";
                    break;
                case 115:
                    subCategoria = "Prestamos e Hipotecas";
                    break;
                case 116:
                    subCategoria = "Otros Negocios";
                    break;
                case 117:
                    subCategoria = "Decoracion y Acabados";
                    break;
                case 118:
                    subCategoria = "Express (a domicilio)";
                    break;
                case 119:
                    subCategoria = "Otros Talleres y Servicios";
                    break;
                case 120:
                    subCategoria = "Profesionales Independientes";
                    break;

                case 121:
                    subCategoria = "Servicios de Construccion";
                    break;

                case 122:
                    subCategoria = "Reparacion y Mantenimiento";
                    break;
                case 123:
                    subCategoria = "Televisores y Consolas";
                    break;
                case 124:
                    subCategoria = "Telecomunicaciones";
                    break;
                case 125:
                    subCategoria = "Otros Tecnologia";
                    break;
                case 126:
                    subCategoria = "Otros Extraviados y Robados";
                    break;
                case 127:
                    subCategoria = "Medicos";
                    break;
                case 128:
                    subCategoria = "Clinicas";
                    break;
                case 129:
                    subCategoria = "Hospitales";
                    break;
                case 130:
                    subCategoria = "Farmacias";
                    break;

                case 131:
                    subCategoria = "Servicios de Salud";
                    break;

                case 132:
                    subCategoria = "Ambulancias";
                    break;
                case 133:
                    subCategoria = "Servicios de Enefermeria";
                    break;
                case 134:
                    subCategoria = "Dentistas";
                    break;
                case 135:
                    subCategoria = "Fisioteraputas";
                    break;
                case 136:
                    subCategoria = "Clinicas Esteticas";
                    break;
                case 137:
                    subCategoria = "Otros Servicios Medicos";
                    break;
                case 138:
                    subCategoria = "Albaniil";
                    break;
                case 139:
                    subCategoria = "Ama de Llaves";
                    break;
                case 140:
                    subCategoria = "Chofer";
                    break;

                case 141:
                    subCategoria = "Costurera";
                    break;

                case 142:
                    subCategoria = "Dealer";
                    break;
                case 143:
                    subCategoria = "Digitador";
                    break;
                case 144:
                    subCategoria = "Electricista";
                    break;
                case 145:
                    subCategoria = "Guia de Turismo";
                    break;
                case 146:
                    subCategoria = "Jardinero";
                    break;
                case 147:
                    subCategoria = "Joyero";
                    break;
                case 148:
                    subCategoria = "Mecanico";
                    break;
                case 149:
                    subCategoria = "Motorizado";
                    break;
                case 150:
                    subCategoria = "Niniera";
                    break;

                case 151:
                    subCategoria = "Pintor";
                    break;

                case 152:
                    subCategoria = "Recepcionista";
                    break;
                case 153:
                    subCategoria = "Secretaria";
                    break;
                case 154:
                    subCategoria = "Tecnico Electronico";
                    break;
                case 155:
                    subCategoria = "Vigilante";
                    break;
                case 156:
                    subCategoria = "Voluntarios";
                    break;
                case 157:
                    subCategoria = "Bodas en General";
                    break;
                case 158:
                    subCategoria = "Analista";
                    break;
                case 159:
                    subCategoria = "Animador";
                    break;
                case 160:
                    subCategoria = "Agente Call Center";
                    break;

                case 161:
                    subCategoria = "Ayudante";
                    break;

                case 162:
                    subCategoria = "Bar Tender";
                    break;
                case 163:
                    subCategoria = "Cocinero";
                    break;
                case 164:
                    subCategoria = "Contabilidad";
                    break;
                case 165:
                    subCategoria = "Domestica";
                    break;
                case 166:
                    subCategoria = "Mensajero";
                    break;
                case 167:
                    subCategoria = "Oficial de Seguridad";
                    break;
                case 168:
                    subCategoria = "Recepcionista";
                    break;
                case 169:
                    subCategoria = "Salonero";
                    break;
                case 170:
                    subCategoria = "Secretaria";
                    break;

                case 171:
                    subCategoria = "Sobrecargo";
                    break;

                case 172:
                    subCategoria = "Personal Comidas Rapidas";
                    break;
                case 173:
                    subCategoria = "Vendedor";
                    break;
                case 174:
                    subCategoria = "Vigilante";
                    break;
                case 175:
                    subCategoria = "Camionetas y Pick UP";
                    break;
                case 176:
                    subCategoria = "Otros";
                    break;
                case 177:
                    subCategoria = "Bovedas";
                    break;
                case 178:
                    subCategoria = "Condominios";
                    break;
                case 179:
                    subCategoria = "Quintas";
                    break;
                case 180:
                    subCategoria = "Habitaciones";
                    break;

                case 181:
                    subCategoria = "tecnico";
                    break;

                case 182:
                    subCategoria = "Presupuestista";
                    break;
                case 183:
                    subCategoria = "Chofer";
                    break;
                case 184:
                    subCategoria = "Cajero";
                    break;
                case 185:
                    subCategoria = "Agente";
                    break;
                case 186:
                    subCategoria = "Dentista";
                    break;
                case 187:
                    subCategoria = "Arquitecto";
                    break;
                case 188:
                    subCategoria = "Personal";
                    break;
                case 189:
                    subCategoria = "Abogado";
                    break;
                case 190:
                    subCategoria = "Asistente";
                    break;

                case 191:
                    subCategoria = "Enfermero";
                    break;

                case 192:
                    subCategoria = "Auxiliar";
                    break;
                case 193:
                    subCategoria = "Ingeniero";
                    break;
                case 194:
                    subCategoria = "Gerente";
                    break;
                case 195:
                    subCategoria = "Masajista";
                    break;
                case 196:
                    subCategoria = "Albaniil";
                    break;
                case 197:
                    subCategoria = "Ama de LLaves";
                    break;
                case 198:
                    subCategoria = "Costurera";
                    break;
                case 199:
                    subCategoria = "Dealer";
                    break;
                case 200:
                    subCategoria = "Digitador";
                    break;

                case 201:
                    subCategoria = "Electricista";
                    break;

                case 202:
                    subCategoria = "Guia de Turismo";
                    break;
                case 203:
                    subCategoria = "Jardinero";
                    break;
                case 204:
                    subCategoria = "Joyero";
                    break;
                case 205:
                    subCategoria = "Mecanico";
                    break;
                case 206:
                    subCategoria = "Motorizado";
                    break;
                case 207:
                    subCategoria = "Niniera";
                    break;
                case 208:
                    subCategoria = "Pintor";
                    break;
                case 209:
                    subCategoria = "Tecnico Electronico";
                    break;
                case 210:
                    subCategoria = "Voluntarios";
                    break;

                default:
                    subCategoria = "No Definido";
                    break;

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

    public void completarContactos() throws SQLException {

        Conexion objCon = new Conexion();
        objCon.conectar();

        sql = "SELECT id,idAviso,name,email,phone,created_at FROM db_todobusco_prod.mod_aviso_contacto"
                + " limit 12000";

        PreparedStatement stm = objCon.getCon().prepareStatement(sql);

        ResultSet rs = stm.executeQuery();
        int i = 0;
        while (rs.next()) {

            String fecha = rs.getString("created_at").substring(0, 10);

            String aux = fecha.substring(0, 4) + fecha.substring(5, 7) + fecha.substring(8, 10);

            int id_fecha = Integer.parseInt(aux);

            int id_contacto = rs.getInt("id");
            int id_aviso = rs.getInt("idAviso");
            String nombreContacto = rs.getString("name");
            String emailContacto = rs.getString("email");
            String celular = rs.getString("phone");

            ContactabilidadBean contacto = new ContactabilidadBean();

            contacto.setId_contacto(id_contacto);
            contacto.setId_Aviso(id_aviso);
            contacto.setId_Fecha(id_fecha);
            contacto.setNombreContacto(nombreContacto);
            contacto.setEmailContacto(emailContacto);
            contacto.setCelular(celular);
            contacto.setFecha_contacto(fecha);
            i++;
            System.out.println("*****Insertando Contactos***: " + i);

            contactos.add(contacto);

        }

        objCon.desconectar();

    }

    public void completarContactabilidad() throws SQLException {

        Conexion objCon = new Conexion();
        objCon.conectar();

        int i = 0;

        for (ContactabilidadBean contacto : contactos) {

            sql = "select id,idCategoria,idSubcategoria,idPais,destaque from db_todobusco_prod.mod_aviso_aviso where id=" + contacto.getId_Aviso();
            i++;
            PreparedStatement stm = objCon.getCon().prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            System.out.println(i + "  :**" + sql);

            while (rs.next()) {

                int idCategoria = rs.getInt("idCategoria");
                int idSubCategoria = rs.getInt("idSubcategoria");
                int idPais = rs.getInt("idPais");

                String portal = "";
                String categoria = "";
                String subCategoria = "";
                String pais = "No Definido";

                if (idCategoria == 1) {

                    portal = "CasaTB";

                } else if (idCategoria == 2) {

                    portal = "CarroTB";

                } else {

                    portal = "VentaTB";

                }

                switch (idCategoria) {

                    case 1:
                        categoria = "Inmuebles";
                        break;
                    case 2:
                        categoria = "Vehiculos";
                        break;
                    case 3:
                        categoria = "Equipos Electronicos";
                        break;
                    case 4:
                        categoria = "Repuestos y Accesorios";
                        break;
                    case 5:
                        categoria = "Mascotas";
                        break;
                    case 6:
                        categoria = "Muebles y Decoracion";
                        break;
                    case 7:
                        categoria = "Instrumentos Musicales";
                        break;
                    case 8:
                        categoria = "Herramientas y Equipos";
                        break;

                    case 9:
                        categoria = "Articulos para Bebes";
                        break;
                    case 10:
                        categoria = "Bicicletas";
                        break;
                    case 11:
                        categoria = "Guia de Servicios";
                        break;
                    case 12:
                        categoria = "Clases y Cursos";
                        break;
                    case 13:
                        categoria = "Donaciones";
                        break;
                    case 14:
                        categoria = "Granja";
                        break;
                    case 15:
                        categoria = "Turismo";
                        break;
                    case 16:
                        categoria = "Juguetes";
                        break;

                    case 17:
                        categoria = "Inmuebles";
                        break;
                    case 18:
                        categoria = "Extraviados y robados";
                        break;
                    case 19:
                        categoria = "Tecnologia";
                        break;
                    case 20:
                        categoria = "Belleza y Etica";
                        break;
                    case 21:
                        categoria = "Talleres y Servicios";
                        break;
                    case 22:
                        categoria = "Negocios";
                        break;
                    case 23:
                        categoria = "Clinicas y Servicios";
                        break;
                    case 24:
                        categoria = "Trabajo Eventual";
                        break;
                    case 25:
                        categoria = "Bodas";
                        break;

                    default:
                        categoria = "No Definido";
                        break;

                }

                switch (idSubCategoria) {

                    case 1:
                        subCategoria = "Apartamentos";
                        break;
                    case 2:
                        subCategoria = "Casas";
                        break;
                    case 3:
                        subCategoria = "Casas de Playa";
                        break;
                    case 4:
                        subCategoria = "Edidicios";
                        break;
                    case 5:
                        subCategoria = "Fincas";
                        break;
                    case 6:
                        subCategoria = "Locales Comerciales";
                        break;
                    case 7:
                        subCategoria = "Negocios";
                        break;
                    case 8:
                        subCategoria = "Oficinas";
                        break;

                    case 9:
                        subCategoria = "Propiedades de Islas";
                        break;
                    case 10:
                        subCategoria = "Lotes y Terrenos";
                        break;
                    case 11:
                        subCategoria = "Autos";
                        break;
                    case 12:
                        subCategoria = "Motos";
                        break;
                    case 13:
                        subCategoria = "Camiones y Buses";
                        break;
                    case 14:
                        subCategoria = "Yates y Barcos";
                        break;
                    case 15:
                        subCategoria = "Equipo Pesado";
                        break;
                    case 16:
                        subCategoria = "Telefonos Celulares";
                        break;

                    case 17:
                        subCategoria = "Computadoras";
                        break;
                    case 18:
                        subCategoria = "Electrodomesticos";
                        break;
                    case 19:
                        subCategoria = "Accesorios";
                        break;
                    case 20:
                        subCategoria = "Impresoras";
                        break;
                    case 21:
                        subCategoria = "Tabletas";
                        break;
                    case 22:
                        subCategoria = "Amortiguadores";
                        break;
                    case 23:
                        subCategoria = "Chasis y Partes externas";
                        break;
                    case 24:
                        subCategoria = "Equipo de Musica";
                        break;
                    case 25:
                        subCategoria = "Motor y partes";
                        break;

                    case 26:
                        subCategoria = "Mufle";
                        break;
                    case 27:
                        subCategoria = "Neumaticos";
                        break;
                    case 28:
                        subCategoria = "Rines";
                        break;
                    case 29:
                        subCategoria = "Otros Repuestos";
                        break;
                    case 30:
                        subCategoria = "Perros";
                        break;
                    case 31:
                        subCategoria = "Gatos";
                        break;
                    case 32:
                        subCategoria = "Caballos y Ganados";
                        break;
                    case 33:
                        subCategoria = "Peces y Reptiles";
                        break;

                    case 34:
                        subCategoria = "Pajaros";
                        break;
                    case 35:
                        subCategoria = "Alimentos para Mascotas";
                        break;
                    case 36:
                        subCategoria = "Otras Mascotas";
                        break;
                    case 37:
                        subCategoria = "Servcios y Tiendas";
                        break;
                    case 38:
                        subCategoria = "Adoptar";
                        break;
                    case 39:
                        subCategoria = "Dar en Adopcion";
                        break;
                    case 40:
                        subCategoria = "En General";
                        break;
                    case 41:
                        subCategoria = "Muebles";
                        break;

                    case 42:
                        subCategoria = "Recamaras";
                        break;
                    case 43:
                        subCategoria = "Muebles de oficina";
                        break;
                    case 44:
                        subCategoria = "Ventanas";
                        break;
                    case 45:
                        subCategoria = "Plantas y Muebles de Jardin";
                        break;
                    case 46:
                        subCategoria = "Decoracion y Lamparas";
                        break;
                    case 47:
                        subCategoria = "Pisos y Alfombras";
                        break;
                    case 48:
                        subCategoria = "Articulos de Cocina";
                        break;
                    case 49:
                        subCategoria = "Cortinas";
                        break;
                    case 50:
                        subCategoria = "Otros Muebles y Decoracion";
                        break;

                    case 51:
                        subCategoria = "En General";
                        break;
                    case 52:
                        subCategoria = "Guitarras";
                        break;
                    case 53:
                        subCategoria = "Percusion";
                        break;
                    case 54:
                        subCategoria = "Pianos";
                        break;
                    case 55:
                        subCategoria = "Otros Instrumentos Musicales";
                        break;
                    case 56:
                        subCategoria = "Herramientas Agricolas";
                        break;
                    case 57:
                        subCategoria = "Herramientas a Gas";
                        break;
                    case 58:
                        subCategoria = "Herramientas Electricas";
                        break;

                    case 59:
                        subCategoria = "Equipo Pesado";
                        break;
                    case 60:
                        subCategoria = "Equipo Electrico";
                        break;
                    case 61:
                        subCategoria = "Basura y Reciclaje";
                        break;
                    case 62:
                        subCategoria = "Ladrillo y Piedra";
                        break;
                    case 63:
                        subCategoria = "Carpinteria y Madera";
                        break;
                    case 64:
                        subCategoria = "Otras Herramientas y Equipos";
                        break;
                    case 65:
                        subCategoria = "En General";
                        break;
                    case 66:
                        subCategoria = "Coches";
                        break;

                    case 67:
                        subCategoria = "Juguetes";
                        break;
                    case 68:
                        subCategoria = "Muebles para Bebes";
                        break;
                    case 69:
                        subCategoria = "Otros Articulos para Bebes";
                        break;
                    case 70:
                        subCategoria = "Biciletas";
                        break;
                    case 71:
                        subCategoria = "Juegos de Ocio";
                        break;
                    case 72:
                        subCategoria = "Surf y Acuaticos";
                        break;
                    case 73:
                        subCategoria = "Maquinas de Entrenamiento";
                        break;
                    case 74:
                        subCategoria = "Otros Accesorios";
                        break;
                    case 75:
                        subCategoria = "Venta de Negocios";
                        break;

                    case 76:
                        subCategoria = "Negocios Piramides";
                        break;
                    case 77:
                        subCategoria = "Inversiones";
                        break;
                    case 78:
                        subCategoria = "Oportunidades de Pequenia Empresa";
                        break;
                    case 79:
                        subCategoria = "Productos Mayoristas";
                        break;
                    case 80:
                        subCategoria = "Otros Servicios en General";
                        break;
                    case 81:
                        subCategoria = "En General";
                        break;
                    case 82:
                        subCategoria = "Idiomas";
                        break;
                    case 83:
                        subCategoria = "Arte y Danza";
                        break;

                    case 84:
                        subCategoria = "Cursos Diversos";
                        break;
                    case 85:
                        subCategoria = "Tecnicos e Informaticos";
                        break;
                    case 86:
                        subCategoria = "Licenciaturas";
                        break;
                    case 87:
                        subCategoria = "PostGrados y Maestrias";
                        break;
                    case 88:
                        subCategoria = "Seminarios";
                        break;
                    case 89:
                        subCategoria = "Libros";
                        break;
                    case 90:
                        subCategoria = "Donaciones";
                        break;
                    case 91:
                        subCategoria = "Regalo";
                        break;

                    case 92:
                        subCategoria = "Ayuda";
                        break;
                    case 93:
                        subCategoria = "Organizaciones";
                        break;
                    case 94:
                        subCategoria = "Voluntarios";
                        break;
                    case 95:
                        subCategoria = "Audio y Video";
                        break;
                    case 96:
                        subCategoria = "Equipo de Agricultura";
                        break;
                    case 97:
                        subCategoria = "Excursiones";
                        break;
                    case 98:
                        subCategoria = "Espectaculos";
                        break;
                    case 99:
                        subCategoria = "Hoteles";
                        break;
                    case 100:
                        subCategoria = "Hospedajes";
                        break;

                    case 101:
                        subCategoria = "Restaurantes";
                        break;

                    case 102:
                        subCategoria = "Bares y Discotecas";
                        break;
                    case 103:
                        subCategoria = "Varios";
                        break;
                    case 104:
                        subCategoria = "Coches";
                        break;
                    case 105:
                        subCategoria = "Juguetes";
                        break;
                    case 106:
                        subCategoria = "Otro";
                        break;
                    case 107:
                        subCategoria = "Bodegas";
                        break;
                    case 108:
                        subCategoria = "Articulos de Temporada";
                        break;
                    case 109:
                        subCategoria = "Venta de Garage";
                        break;
                    case 110:
                        subCategoria = "Vestimenta";
                        break;

                    case 111:
                        subCategoria = "Otros Articulos Varios";
                        break;

                    case 112:
                        subCategoria = "Masajes terapeuticos";
                        break;
                    case 113:
                        subCategoria = "Medicina Alternativa";
                        break;
                    case 114:
                        subCategoria = "Otros belleza y Estetica";
                        break;
                    case 115:
                        subCategoria = "Prestamos e Hipotecas";
                        break;
                    case 116:
                        subCategoria = "Otros Negocios";
                        break;
                    case 117:
                        subCategoria = "Decoracion y Acabados";
                        break;
                    case 118:
                        subCategoria = "Express (a domicilio)";
                        break;
                    case 119:
                        subCategoria = "Otros Talleres y Servicios";
                        break;
                    case 120:
                        subCategoria = "Profesionales Independientes";
                        break;

                    case 121:
                        subCategoria = "Servicios de Construccion";
                        break;

                    case 122:
                        subCategoria = "Reparacion y Mantenimiento";
                        break;
                    case 123:
                        subCategoria = "Televisores y Consolas";
                        break;
                    case 124:
                        subCategoria = "Telecomunicaciones";
                        break;
                    case 125:
                        subCategoria = "Otros Tecnologia";
                        break;
                    case 126:
                        subCategoria = "Otros Extraviados y Robados";
                        break;
                    case 127:
                        subCategoria = "Medicos";
                        break;
                    case 128:
                        subCategoria = "Clinicas";
                        break;
                    case 129:
                        subCategoria = "Hospitales";
                        break;
                    case 130:
                        subCategoria = "Farmacias";
                        break;

                    case 131:
                        subCategoria = "Servicios de Salud";
                        break;

                    case 132:
                        subCategoria = "Ambulancias";
                        break;
                    case 133:
                        subCategoria = "Servicios de Enefermeria";
                        break;
                    case 134:
                        subCategoria = "Dentistas";
                        break;
                    case 135:
                        subCategoria = "Fisioteraputas";
                        break;
                    case 136:
                        subCategoria = "Clinicas Esteticas";
                        break;
                    case 137:
                        subCategoria = "Otros Servicios Medicos";
                        break;
                    case 138:
                        subCategoria = "Albaniil";
                        break;
                    case 139:
                        subCategoria = "Ama de Llaves";
                        break;
                    case 140:
                        subCategoria = "Chofer";
                        break;

                    case 141:
                        subCategoria = "Costurera";
                        break;

                    case 142:
                        subCategoria = "Dealer";
                        break;
                    case 143:
                        subCategoria = "Digitador";
                        break;
                    case 144:
                        subCategoria = "Electricista";
                        break;
                    case 145:
                        subCategoria = "Guia de Turismo";
                        break;
                    case 146:
                        subCategoria = "Jardinero";
                        break;
                    case 147:
                        subCategoria = "Joyero";
                        break;
                    case 148:
                        subCategoria = "Mecanico";
                        break;
                    case 149:
                        subCategoria = "Motorizado";
                        break;
                    case 150:
                        subCategoria = "Niniera";
                        break;

                    case 151:
                        subCategoria = "Pintor";
                        break;

                    case 152:
                        subCategoria = "Recepcionista";
                        break;
                    case 153:
                        subCategoria = "Secretaria";
                        break;
                    case 154:
                        subCategoria = "Tecnico Electronico";
                        break;
                    case 155:
                        subCategoria = "Vigilante";
                        break;
                    case 156:
                        subCategoria = "Voluntarios";
                        break;
                    case 157:
                        subCategoria = "Bodas en General";
                        break;
                    case 158:
                        subCategoria = "Analista";
                        break;
                    case 159:
                        subCategoria = "Animador";
                        break;
                    case 160:
                        subCategoria = "Agente Call Center";
                        break;

                    case 161:
                        subCategoria = "Ayudante";
                        break;

                    case 162:
                        subCategoria = "Bar Tender";
                        break;
                    case 163:
                        subCategoria = "Cocinero";
                        break;
                    case 164:
                        subCategoria = "Contabilidad";
                        break;
                    case 165:
                        subCategoria = "Domestica";
                        break;
                    case 166:
                        subCategoria = "Mensajero";
                        break;
                    case 167:
                        subCategoria = "Oficial de Seguridad";
                        break;
                    case 168:
                        subCategoria = "Recepcionista";
                        break;
                    case 169:
                        subCategoria = "Salonero";
                        break;
                    case 170:
                        subCategoria = "Secretaria";
                        break;

                    case 171:
                        subCategoria = "Sobrecargo";
                        break;

                    case 172:
                        subCategoria = "Personal Comidas Rapidas";
                        break;
                    case 173:
                        subCategoria = "Vendedor";
                        break;
                    case 174:
                        subCategoria = "Vigilante";
                        break;
                    case 175:
                        subCategoria = "Camionetas y Pick UP";
                        break;
                    case 176:
                        subCategoria = "Otros";
                        break;
                    case 177:
                        subCategoria = "Bovedas";
                        break;
                    case 178:
                        subCategoria = "Condominios";
                        break;
                    case 179:
                        subCategoria = "Quintas";
                        break;
                    case 180:
                        subCategoria = "Habitaciones";
                        break;

                    case 181:
                        subCategoria = "tecnico";
                        break;

                    case 182:
                        subCategoria = "Presupuestista";
                        break;
                    case 183:
                        subCategoria = "Chofer";
                        break;
                    case 184:
                        subCategoria = "Cajero";
                        break;
                    case 185:
                        subCategoria = "Agente";
                        break;
                    case 186:
                        subCategoria = "Dentista";
                        break;
                    case 187:
                        subCategoria = "Arquitecto";
                        break;
                    case 188:
                        subCategoria = "Personal";
                        break;
                    case 189:
                        subCategoria = "Abogado";
                        break;
                    case 190:
                        subCategoria = "Asistente";
                        break;

                    case 191:
                        subCategoria = "Enfermero";
                        break;

                    case 192:
                        subCategoria = "Auxiliar";
                        break;
                    case 193:
                        subCategoria = "Ingeniero";
                        break;
                    case 194:
                        subCategoria = "Gerente";
                        break;
                    case 195:
                        subCategoria = "Masajista";
                        break;
                    case 196:
                        subCategoria = "Albaniil";
                        break;
                    case 197:
                        subCategoria = "Ama de LLaves";
                        break;
                    case 198:
                        subCategoria = "Costurera";
                        break;
                    case 199:
                        subCategoria = "Dealer";
                        break;
                    case 200:
                        subCategoria = "Digitador";
                        break;

                    case 201:
                        subCategoria = "Electricista";
                        break;

                    case 202:
                        subCategoria = "Guia de Turismo";
                        break;
                    case 203:
                        subCategoria = "Jardinero";
                        break;
                    case 204:
                        subCategoria = "Joyero";
                        break;
                    case 205:
                        subCategoria = "Mecanico";
                        break;
                    case 206:
                        subCategoria = "Motorizado";
                        break;
                    case 207:
                        subCategoria = "Niniera";
                        break;
                    case 208:
                        subCategoria = "Pintor";
                        break;
                    case 209:
                        subCategoria = "Tecnico Electronico";
                        break;
                    case 210:
                        subCategoria = "Voluntarios";
                        break;

                    default:
                        subCategoria = "No Definido";
                        break;

                }

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

                contacto.setPortal(portal);
                contacto.setCategoria(categoria);
                contacto.setSubCategoria(subCategoria);
                contacto.setPais(pais);
                contacto.setDestaque(destaque);

            }
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

    public void recorrerContactos() {

        for (ContactabilidadBean contacto : contactos) {

            System.out.println("**" + contacto.getId_Aviso()
                    + "**" + contacto.getId_contacto()
                    + "**" + contacto.getId_Fecha()
                    + "**" + contacto.getFecha_contacto()
                    + "**" + contacto.getNombreContacto()
                    + "**" + contacto.getEmailContacto()
                    + "**" + contacto.getCelular()
                    + "**" + contacto.getPortal()
                    + "**" + contacto.getCategoria()
                    + "**" + contacto.getSubCategoria()
                    + "**" + contacto.getPais()
                    + "**" + contacto.getDestaque());

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

    public List<ContactabilidadBean> getContactos() {
        return contactos;
    }

    public void setContactos(List<ContactabilidadBean> contactos) {
        this.contactos = contactos;
    }

}
