package interfazalmuerzos;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.awt.Panel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

import panamahitek.Arduino.PanamaHitek_Arduino;

public class VentanadeCobro extends javax.swing.JFrame {
    //Fondo p;
    static PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    static RXTX_Arduino Lector = new RXTX_Arduino();
    //Panel = new Fondo(this);
    //Fondo Contenedor = new Fondo(this);
    //Registro registro = new Registro(this);
    static Textwriter writer = new Textwriter();
    //static JPanel Panel;
    SerialPortEventListener evento = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
//    SerialPortEventListener evento = (SerialPortEvent spe) -> {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    };

    public VentanadeCobro() {
      
        initComponents();
        Panel.add(new Fondo(this));
        //setContentPane(Panel);
        validate();
     
            try {
                Arduino.arduinoRX("COM3", 9600, evento);
               
            } catch (Exception ex) {
                Logger.getLogger(VentanadeCobro.class.getName()).log(Level.SEVERE, null, ex);
              
            }
         
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafeterias UN");
        setLocation(new java.awt.Point(300, 100));
        setPreferredSize(new java.awt.Dimension(451, 601));
        setResizable(false);
        getContentPane().setLayout(new java.awt.CardLayout());

        Panel.setLayout(new java.awt.CardLayout());
        getContentPane().add(Panel, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanadeCobro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanadeCobro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanadeCobro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanadeCobro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanadeCobro().setVisible(true);
            }
        });
        while (true) {
            Lector.leer(Arduino);
            Lector.setDatos(Fondo.textoNombre, Fondo.textoCarrera, Fondo.textoDocumento, Fondo.textoSaldo,Fondo.Foto, Arduino);
            Lector.actualizarTextos(Arduino);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Panel;
    // End of variables declaration//GEN-END:variables
}
