package interfazalmuerzos;

import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import panamahitek.Arduino.PanamaHitek_Arduino;

public class VentanadeCobro extends javax.swing.JFrame {

    static PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    static RXTX_Arduino Lector = new RXTX_Arduino();
    static int k=0;
    SerialPortEventListener evento = new SerialPortEventListener() {
        @Override
        public void serialEvent(SerialPortEvent spe) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };

    public VentanadeCobro() {
       // int k = 0;
        initComponents();
        

            try {
                Arduino.arduinoRX("COM3", 9600, evento);
                k++;
            } catch (Exception ex) {
                Logger.getLogger(VentanadeCobro.class.getName()).log(Level.SEVERE, null, ex);
                k++;
            }
         
    }
//     private URL url = getClass().getResource("/img/java.png");
//    Image image = new ImageIcon(url).getImage();
// 
//    @Override
//    public void paint(Graphics g){
//       
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Documento = new javax.swing.JLabel();
        Carrera = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoCarrera = new javax.swing.JLabel();
        textoDocumento = new javax.swing.JLabel();
        textoSaldo = new javax.swing.JLabel();
        Saldo = new javax.swing.JLabel();
        botonCobrar = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cafeterias UN");
        setLocation(new java.awt.Point(300, 150));
        setResizable(false);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setOpaque(false);

        titulo.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        titulo.setText("Cafeterias UN");

        Nombre.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Nombre.setText("Nombre:");

        Documento.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Documento.setText("Documento:");

        Carrera.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Carrera.setText("Carrera:");

        textoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textoNombre.setName(""); // NOI18N

        textoCarrera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textoDocumento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        textoSaldo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        Saldo.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Saldo.setText("Saldo:");

        botonCobrar.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        botonCobrar.setText("COBRAR");
        botonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCobrarActionPerformed(evt);
            }
        });

        Foto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazalmuerzos/Imagenes/UN.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Nombre)
                                .addGap(43, 43, 43)
                                .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(Saldo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Documento)
                                    .addComponent(Carrera))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(botonCobrar)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Documento)
                            .addComponent(textoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Carrera)
                            .addComponent(textoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Saldo)
                            .addComponent(textoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(botonCobrar)
                .addGap(41, 41, 41))
        );

        Nombre.getAccessibleContext().setAccessibleDescription("Nombre");
        Documento.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobrarActionPerformed
        // TODO add your handling code here:
        try {

            //Arduino.sendData("a");
        } catch (Exception ex) {
            Logger.getLogger(VentanadeCobro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonCobrarActionPerformed
    
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
                k++;

            }
        });
        while (true) {
            Lector.leer(Arduino);
            Lector.setDatos(textoNombre, textoCarrera, textoDocumento, textoSaldo, Foto, Arduino);
            System.out.println(RXTX_Arduino.photo);
            System.out.println("k = "+k);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Documento;
    private static javax.swing.JLabel Foto;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Saldo;
    private javax.swing.JButton botonCobrar;
    private javax.swing.JPanel jPanel1;
    private static javax.swing.JLabel textoCarrera;
    private static javax.swing.JLabel textoDocumento;
    private static javax.swing.JLabel textoNombre;
    private static javax.swing.JLabel textoSaldo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
