
package interfazalmuerzos;

import java.io.BufferedWriter;
import java.io.File;

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
    int numeroAleatorio = (int) (Math.random()*5+1);
    public void guardardatos(String NumberUID, String nombre, String carrera, String documento){
        File f = new File("Archivo.txt");

//Escritura
        try {

            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            bw.write(NumberUID+"$"+nombre+"$"+carrera+"$"+documento);
            bw.flush();
           
            bw.close();
                System.out.println("escribir");

        } catch (IOException e) {
            System.out.println("Error E/S: "+e);
        }

    }

}

