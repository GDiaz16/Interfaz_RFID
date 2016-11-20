
package interfazalmuerzos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Textwriter {
    int size = 25;
    String[] Tag = new String[size];
    String[] nombres = new String[size];
    String[] carreras = new String[size];
    String[] documentos = new String[size];
    String[] saldos = new String[size];
    int[] aleatorios = new int[size];
    int numeroAleatorio;
    
    public void guardardatos(String NumberUID, String nombre, String carrera, String documento, String saldo){
        File f = new File("Archivo.txt");
        numeroAleatorio = (int) (Math.random()*10+1);
           if((NumberUID!=null&&nombre!=null)&&carrera!=null&&documento!=null){
//Escritura
        try {

            FileWriter w = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(w);
            bw.write("UID2"+NumberUID+"NOMBRE"+nombre+"CARRERA"+carrera+"DOCUMENTO"+documento+"AL$"+numeroAleatorio+"SALDO"+saldo);
            bw.newLine();
            bw.flush();
            RXTX_Arduino.NumberUID2=null;
            bw.close();
                System.out.println("escribir");

        } catch (IOException e) {
            System.out.println("Error E/S: "+e);
        }
           } System.out.println("Aleatorio "+numeroAleatorio);
    }
    
    public void leerdatos(){
        String texto = "";

        try {

            FileReader lector = new FileReader("Archivo.txt");

            BufferedReader contenido = new BufferedReader(lector);

            for (int i = 1; (texto = contenido.readLine()) != null && i <= 10; i++) {
                //System.out.println("Linea "+i+"  "+ texto);
                Tag[i] = texto.substring(texto.indexOf("UID2") + 4, texto.indexOf("NOMBRE"));
                nombres[i] = texto.substring(texto.indexOf("NOMBRE") + 6, texto.indexOf("CARRERA"));
                carreras[i] = texto.substring(texto.indexOf("CARRERA") + 7, texto.indexOf("DOCUMENTO"));
                documentos[i] = texto.substring(texto.indexOf("DOCUMENTO") + 9, texto.indexOf("AL$"));
                aleatorios[i] = Integer.parseInt(texto.substring(texto.indexOf("AL$") +3, texto.indexOf("SALDO")));
                saldos[i] = texto.substring(texto.indexOf("SALDO") +5, texto.length());
                
            }
           
        }
        catch (Exception e) {
            System.out.println("Error al leer");
        }
        for (int i = 0; i < Tag.length; i++) {
            //System.out.println("Linea "+i+" "+Tag[i]+" "+nombres[i]+" "+carreras[i]+" "+documentos[i]+" AL "+aleatorios[i]+" "+saldos[i]);
            //System.out.println("Linea "+i+" aleatorio "+aleatorios[i]);
        }
    }


}

