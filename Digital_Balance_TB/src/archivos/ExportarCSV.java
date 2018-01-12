/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivos;

import beans.AvisoBean;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author user
 */
public class ExportarCSV {

    public ExportarCSV() {
    }
    
  public void exportarResultados( List<AvisoBean> avisos) throws IOException{
      
      
      String outputFile = "C:/Users/user/Google Drive/Digital_Balance_TB/bd_Avisos_creados.csv";

      boolean alreadyExists = new File(outputFile).exists();
      
      if (alreadyExists) {
            File bd_avisos_creados = new File(outputFile);
            bd_avisos_creados.delete();
        }
      
      CsvWriter csvOutput = new CsvWriter(new FileWriter(outputFile, true), ';');
      
      csvOutput.write("id_aviso");
        csvOutput.write("id_fecha");
        csvOutput.write("pais");
        csvOutput.write("portal");
        csvOutput.write("destaque");
        csvOutput.write("fecha_creacion");
        
        csvOutput.endRecord();

      
      for (AvisoBean aviso: avisos) {
          
          if (aviso.getId_Aviso()!=0) {
              
              
              csvOutput.write(aviso.getId_Aviso()+"");
        csvOutput.write(aviso.getId_fecha()+"");
        csvOutput.write(aviso.getPais()+"");
        csvOutput.write(aviso.getPortal());
        csvOutput.write(aviso.getDestaque());
        csvOutput.write(aviso.getFecha_publicacion());
              
              csvOutput.endRecord();
              
          }
          
          
          
      }
      
      
        csvOutput.close();
      
      
  }  
    
    
    
    
}
