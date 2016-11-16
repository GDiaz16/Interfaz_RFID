package interfazalmuerzos;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import panamahitek.Arduino.PanamaHitek_Arduino;

public class VentanadeCobro extends javax.swing.JFrame {

    static PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    static RXTX_Arduino Lector = new RXTX_Arduino();
    private static final Fondo Contenedor = new Fondo();
    static Textwriter writer = new Textwriter();
    SerialPortEventListener evento = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public VentanadeCobro() {
      
        initComponents();
        setContentPane(Contenedor);
        
            try {
                Arduino.arduinoRX("COM3", 9600, evento);
               
            } catch (Exception ex) {
                Logger.getLogger(VentanadeCobro.class.getName()).log(Level.SEVERE, null, ex);
              
            }
         
    }
//    public void setImagen(String nombreImagen) {
//        jPanel1.setImagen(nombreImagen);
//    }
// 
//    public void setImagen(Image nuevaImagen) {
//        jPanel1.setImagen(nuevaImagen);
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafeterias UN");
        setLocation(new java.awt.Point(300, 150));
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//   
    
    public static void main(String args[]) {
       
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
             }
         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanadeCobro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanadeCobro().setVisible(true);
                

            }
        });
        while (true) {
            Lector.leer(Arduino);
            Lector.setDatos(Contenedor.textoNombre, Contenedor.textoCarrera, Contenedor.textoDocumento, Contenedor.textoSaldo, Contenedor.Foto, Arduino);
            //System.out.println(RXTX_Arduino.photo);
            //writer.guardardatos();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
