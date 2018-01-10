/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beans;

/**
 *
 * @author user
 */
public class AvisoBean {
    
    int id_Aviso,id_fecha;
    String portal,destaque,pais,fecha_publicacion;

    public AvisoBean(int id_Aviso, int id_fecha, String portal, String destaque, String pais, String fecha_publicacion) {
        this.id_Aviso = id_Aviso;
        this.id_fecha = id_fecha;
        this.portal = portal;
        this.destaque = destaque;
        this.pais = pais;
        this.fecha_publicacion = fecha_publicacion;
    }

    public AvisoBean() {
    }

    public int getId_Aviso() {
        return id_Aviso;
    }

    public void setId_Aviso(int id_Aviso) {
        this.id_Aviso = id_Aviso;
    }

    public int getId_fecha() {
        return id_fecha;
    }

    public void setId_fecha(int id_fecha) {
        this.id_fecha = id_fecha;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getDestaque() {
        return destaque;
    }

    public void setDestaque(String destaque) {
        this.destaque = destaque;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getFecha_publicacion() {
        return fecha_publicacion;
    }

    public void setFecha_publicacion(String fecha_publicacion) {
        this.fecha_publicacion = fecha_publicacion;
    }
    
  
    
    
    
}
