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
        
        avisos= new ArrayList<AvisoBean>();
        repetidos= new ArrayList<Integer>();
    }
    
    
  public void completarAvisos() throws SQLException{
      
     Conexion objCon = new Conexion();
     objCon.conectar();
     
     sql="select id,idCategoria,destaque,idPais,created_at,idRepub from db_todobusco_prod.mod_aviso_aviso"
             +"  limit 100";
      
      PreparedStatement stm = objCon.getCon().prepareStatement(sql);

        ResultSet rs = stm.executeQuery();
        
         while (rs.next()) {
             
        int id= rs.getInt("id");
        int idCategoria= rs.getInt("idCategoria");
        String portal="";
        
             if (idCategoria==1) {
                 
                 portal="CasaTB";
                 
             }else if(idCategoria==2) {
                 
                 portal="CarroTB";
                 
             }else{
        
                 portal="VentaTB";
                 
             }
             
             
         int destaqueSQL=rs.getInt("destaque");
             
         String destaque="";
         
         
         
             if (destaqueSQL==1) {
                 
                 destaque="Aviso Simple";
                 
             }else if(destaqueSQL==2) {
                 
                 portal="Destaque Plata";
                 
             }else if(destaqueSQL==3) {
                 
                 portal="Destaque Oro";
                 
             }else if(destaqueSQL==6) {
                 
                 portal="Destaque Membresia";
                 
             }
         
         int idPais= rs.getInt("idPais");
         
         String pais="No Definido";
         
         
             if (idPais==13) {
                 pais="Bolivia";
             }else if (idPais==38) {
                 
                 pais="Costa Rica";
                 
             }else if (idPais==39) {
                 
                 pais="Dominicana";
                 
             }else if (idPais==34) {
                 
                 pais="Guatemala";
                 
             }else if (idPais==1) {
                 
                 pais="Nicaragua";
                 
             }else if (idPais==14) {
                 
                 pais="Panama";
                 
             }else if (idPais==2) {
                 
                 pais="Peru";
                 
             }
         
         String fecha=rs.getString("created_at").substring(0,10);
         
        String aux=fecha.substring(0,4)+fecha.substring(5,7)+fecha.substring(8,10);
             
             int id_fecha=Integer.parseInt(aux);
             
             int idRep=rs.getInt("idRepub");
             
             AuxBean auxB= new AuxBean();
        
             auxB.setIdRep(idRep);
             
             if (auxB!=null) {
                 
                 repetidos.add(idRep);
                 
             }
             
             AvisoBean aviso= new AvisoBean();
             
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
    
    
}
