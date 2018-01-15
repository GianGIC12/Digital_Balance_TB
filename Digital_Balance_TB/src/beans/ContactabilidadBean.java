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
public class ContactabilidadBean {

    int id_contacto, id_Aviso, id_Fecha;
    String nombreContacto, emailContacto, celular, fecha_contacto,
            portal, categoria, subCategoria, pais, destaque;

    public ContactabilidadBean() {
    }

    public int getId_contacto() {
        return id_contacto;
    }

    public void setId_contacto(int id_contacto) {
        this.id_contacto = id_contacto;
    }

    public int getId_Aviso() {
        return id_Aviso;
    }

    public void setId_Aviso(int id_Aviso) {
        this.id_Aviso = id_Aviso;
    }

    public int getId_Fecha() {
        return id_Fecha;
    }

    public void setId_Fecha(int id_Fecha) {
        this.id_Fecha = id_Fecha;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getEmailContacto() {
        return emailContacto;
    }

    public void setEmailContacto(String emailContacto) {
        this.emailContacto = emailContacto;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFecha_contacto() {
        return fecha_contacto;
    }

    public void setFecha_contacto(String fecha_contacto) {
        this.fecha_contacto = fecha_contacto;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDestaque() {
        return destaque;
    }

    public void setDestaque(String destaque) {
        this.destaque = destaque;
    }

}
