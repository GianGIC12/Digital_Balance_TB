/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas;

import archivos.ExportarCSV;
import gestion.Consultas;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Contactabilidad_TB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
        // TODO code application logic here
        
        Consultas c = new Consultas();
        
        c.completarContactos();
        
        c.completarContactabilidad();
        
        c.recorrerContactos();
        
        ExportarCSV e = new ExportarCSV();
        
        e.exportarContactabilidad(c.getContactos());
        
    }
    
}
