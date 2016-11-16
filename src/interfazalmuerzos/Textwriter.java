
package interfazalmuerzos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Textwriter {
    String[] datos; 
    
    public void guardardatos(){
        File f = new File("Archivo.txt");

//Escritura
        try {

            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            bw.write("Esta es una linea de codigo.......");
            bw.flush();
           
            bw.close();
                System.out.println("escribir");

        } catch (IOException e) {
            System.out.println("Error E/S: "+e);
        }

    }

}

//       
//    }
//    private void leeDatos() { 
//        String linea = null;//Para guardar los datos de forma temporal 
//        if (fichero.exists()) {//Si se ha creado el fichero 
//            try { 
//                Scanner lector = new Scanner(fichero); 
//                while(lector.hasNextLine()){ 
//                linea=lector.next(); 
//                } 
//                datos = linea.split(","); 
//                 System.out.println(datos[0]); 
//                 System.out.println(datos[1]); 
//                 System.out.println(datos[2]); 
//            } catch (FileNotFoundException ex) { 
//                System.out.print("No se pudo abrir el archivo!"+ex.getMessage()); 
//            } 
//        } 


    
   
