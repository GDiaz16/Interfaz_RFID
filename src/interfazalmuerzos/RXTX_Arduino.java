package interfazalmuerzos;


import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import panamahitek.Arduino.PanamaHitek_Arduino;

public class RXTX_Arduino {

    public static String NumberUID = "";
    public static String NumberUID2 = "";
    static String NombreCarrera[][] = new String[4][2];
    static String Nombre[] = new String[25];
    static String Carrera[] = new String[25];
    static String Tag[] = new String[4];
    static String Tag2[] = new String[25];
    static long DocSaldos[][] = new long[4][2];
    static String Doc[] = new String[25];
    static String Saldos[] = new String[25];
    int aux = 0;
    static String photo;

    static String nombrePanel;
    Textwriter writer = new Textwriter();

    public void informacion() {
        NombreCarrera[0][0] = "Enderson Gonzalo Diaz Muñoz";
        NombreCarrera[1][0] = "Mauricio Meza Burbano";
        NombreCarrera[2][0] = "Jose Leonardo Aranda Monje";
        NombreCarrera[3][0] = "Sebastian Tovar";
        NombreCarrera[0][1] = "Ingenieria de Sistemas";
        NombreCarrera[1][1] = "Psicologia";
        NombreCarrera[2][1] = "Medicina";
        NombreCarrera[3][1] = "Derecho";
        DocSaldos[0][0] = 1013681625;
        DocSaldos[1][0] = 1085340778;
        DocSaldos[2][0] = 99081501302L;
        DocSaldos[3][0] = 99021513683L;
        DocSaldos[0][1] = 10000;
        DocSaldos[1][1] = 15000;
        DocSaldos[2][1] = 18000;
        DocSaldos[3][1] = 22000;
        Tag[0] = "Card UID: 2B A0 0B 7F";
        Tag[1] = "Card UID: 86 01 70 85";
        Tag[2] = "Card UID: D5 E8 B2 4F";
        Tag[3] = "Card UID: 7E 16 41 C4";
        writer.leerdatos();
        for (int i = 0; i < 25; i++) {
            Nombre[i] = writer.nombres[i];
            Carrera[i] = writer.carreras[i];
            Doc[i] = writer.documentos[i];
            Saldos[i] = writer.saldos[i];
            Tag2[i] = writer.Tag[i];
            
        }
        
    }

    public void setDatos(JLabel textoNombre, JLabel textoCarrera, JLabel textoDocumento, JLabel textoSaldo, JLabel Foto, PanamaHitek_Arduino Arduino) {

        informacion();
        
        
        for (int i = 0; i < Tag2.length; i++) {
           
            if (NumberUID.equals(Tag2[i])) {
                aux = writer.aleatorios[i];
                switch (aux) {
            case 0:
                photo = "mario";
                break;
            case 1:
                photo = "mauriciomeza";
                break;
            case 2:
                photo = "josearanda";
                break;
            case 3:
                photo = "sebastiantovar";
                break;
        }
                 String Document = String.valueOf(Doc[i]);
                    String Saldo = String.valueOf(Saldos[i]);
                Foto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/interfazalmuerzos/Imagenes/" + photo + ".jpg"))
                        .getImage().getScaledInstance(150, 200, Image.SCALE_FAST)));    
                textoNombre.setText(Nombre[i]);
                textoCarrera.setText(Carrera[i]);
                textoDocumento.setText("N° Documento: " + Document);
                textoSaldo.setText("Saldo: $ " + Saldo);
                
                

            }

        }
            
    }

    public void leer(PanamaHitek_Arduino Arduino) {
       
        if (Arduino.isMessageAvailable()) {
            NumberUID = Arduino.printMessage();
             if (NumberUID.startsWith("Card UID:")) {
            NumberUID2 = NumberUID;
            System.out.println("Leer...");
            System.out.println(NumberUID2);
             
        }
        }
    }

//    public void actualizarTextos(PanamaHitek_Arduino Arduino) {
////        if (Arduino.isMessageAvailable()) {
////            NumberUID = Arduino.printMessage();
////            if (NumberUID.startsWith("Card UID:")) {
////                
////                System.out.println("Tarjeta Valida");
////                System.out.println(NumberUID);
////                Registro.NumberUID = NumberUID;
////                Registro.revisionTarjeta.setText("Tarjeta valida");
////                Registro.revisionTarjeta.setForeground(Color.GREEN);
////                Registro.textCarrera2.setEnabled(true);
////                Registro.textDocumento2.setEnabled(true);
////                Registro.textNombre2.setEnabled(true);
////              
////            }
////        }
////           try{
////        Registro.actualizarTextos(Arduino);}
////           catch(NullPointerException ex){
////               ex.getMessage();
////           }
//    }

}
