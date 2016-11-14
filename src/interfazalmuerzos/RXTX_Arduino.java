
package interfazalmuerzos;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import panamahitek.Arduino.PanamaHitek_Arduino;


public class RXTX_Arduino{
    private static String NumberUID = "";
    static String NombreCarrera[][] = new String[4][2];
    static String Tag[] = new String[4];
    static int DocSaldos[][] = new int [4][2];
    int aux=0;
    static String photo="goku";
    
    public void informacion(){
        NombreCarrera[0][0] = "Enderson Gonzalo Diaz Muñoz";
        NombreCarrera[1][0] = "Mauricio Meza Burbano";
        NombreCarrera[2][0] = "Jose Leonardo Aranda Monje";
        NombreCarrera[3][0] = "Sebastian Tovar";
        NombreCarrera[0][1] = "Ingenieria de Sistemas";
        NombreCarrera[1][1] = "Psicologia";
        NombreCarrera[2][1] = "Medicina";
        NombreCarrera[3][1] = "Derecho";
        DocSaldos[0][0] = 1013681625;
        DocSaldos[1][0] = 990800000;
        DocSaldos[2][0] = 945984984;
        DocSaldos[3][0] = 946541611;
        DocSaldos[0][1] = 10000;
        DocSaldos[1][1] = 15000;
        DocSaldos[2][1] = 18000;
        DocSaldos[3][1] = 22000;
        Tag[0] = "Card UID: 2B A0 0B 7F";
        Tag[1] = "Card UID: 86 01 70 85";
        Tag[2] = "Card UID: D5 E8 B2 4F";
        Tag[3] = "Card UID: 7E 16 41 C4";
        
    }
    
    public void setDatos(JLabel textoNombre,JLabel textoCarrera, JLabel textoDocumento, JLabel textoSaldo, JLabel Foto, PanamaHitek_Arduino Arduino) {
            
        informacion();        
        
        switch(aux){
            case 0:
                photo = "mario";
            break;
            case 1:
                photo = "goku";
            break;
            case 2:
                photo = "vegeta";
            break;
            case 3:
                photo = "luigi";
            break;
        }
        for (int i = 0; i < Tag.length; i++) {
            String Doc = String.valueOf(DocSaldos[i][0]);
            String Saldo = String.valueOf(DocSaldos[i][1]);
            if (NumberUID.equals(Tag[i])) {
                textoNombre.setText(NombreCarrera[i][0]);
                textoCarrera.setText(NombreCarrera[i][1]);
                textoDocumento.setText(Doc);
                textoSaldo.setText("$ " + Saldo);
                aux = i;
                Foto.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass()
                        .getResource("/interfazalmuerzos/Imagenes/" + RXTX_Arduino.photo + ".jpg"))
                        .getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH)));

            }

        }
        
    }
   
    
    public void leer(PanamaHitek_Arduino Arduino) {
        while (Arduino.isMessageAvailable()) {
            NumberUID = Arduino.printMessage();
            System.out.println("Leer...");
            System.out.println(NumberUID);

        }

    }
}
    
   
