/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_9_read_text_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ProBook
 */
public class EVA3_9_READ_TEXT_FILES {

    public static void main(String[] args)  {
        String ruta="C:\\archivos\\documento.txt";//windows
        try {
            readUsingFiles(ruta);
        } catch (IOException ex) {
            Logger.getLogger(EVA3_9_READ_TEXT_FILES.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void readUsingFiles(String ruta)throws IOException{
        Path path;
        //recibimos la ruta enformato de texto laconverimos a formato path
      /*  Path path= Paths.get(ruta);
        
        List<String> contenidoArch=Files.readAllLines(path);
        for (int i = 0; i < contenidoArch.size(); i++) {
            
        }
        System.out.println(contenidoArch.toString();
    }*/
     byte[]arregloBytes= Files.readAllBytes(path);
        System.out.println(new String(arregloBytes));
    }
}
