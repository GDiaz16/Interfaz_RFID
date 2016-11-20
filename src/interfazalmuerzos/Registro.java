/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazalmuerzos;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import panamahitek.Arduino.PanamaHitek_Arduino;

/**
 *
 * @author FAMILIA
 */
public class Registro extends javax.swing.JPanel {
    Image Background2;
    VentanadeCobro f;
    public static String NumberUID;
    String nombre;
    String documento;
    String carrera;
    String saldo;
    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    Textwriter writer = new Textwriter();
    public Registro(VentanadeCobro d) {
        initComponents();
//        textNombre.setEnabled(false);
//        textCarrera.setEnabled(false);
//        textDocumento.setEnabled(false);

        
        //fondo = new Fondo(f);
        this.f = d;
         Background2 = new ImageIcon(this
            .getClass()
            .getResource("/interfazalmuerzos/Imagenes/Backgroundcyt.jpg")).getImage();
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(Background2, 15, 370, getWidth()-30, getHeight()/3, this);
 
        setOpaque(false);
        super.paint(g);
       repaint();
    }
//public static void actualizarTextos(PanamaHitek_Arduino Arduino){
//        if (Arduino.isMessageAvailable()) {
//            NumberUID = Arduino.printMessage();
//            if (NumberUID.startsWith("Card UID:")) {
//                
//                System.out.println("Tarjeta Valida");
//                System.out.println(NumberUID);
//                //Registro.NumberUID = NumberUID;
//                Registro.revisionTarjeta.setText("Tarjeta valida");
//                Registro.revisionTarjeta.setForeground(Color.GREEN);
//                Registro.textCarrera2.setEnabled(true);
//                Registro.textDocumento2.setEnabled(true);
//                Registro.textNombre2.setEnabled(true);
//              
//            }
//        }
//    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nombre = new javax.swing.JLabel();
        Carrera = new javax.swing.JLabel();
        Documento = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        textCarrera = new javax.swing.JTextField();
        textDocumento = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        buttonGuardar = new javax.swing.JButton();
        atrasButton = new javax.swing.JButton();
        Labelsaldo = new javax.swing.JLabel();
        textSaldo = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(450, 603));

        Nombre.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Nombre.setText("Nombre:");

        Carrera.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Carrera.setText("Carrera:");

        Documento.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Documento.setText("Documento:");

        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        textCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCarreraActionPerformed(evt);
            }
        });

        textDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDocumentoActionPerformed(evt);
            }
        });

        Titulo.setBackground(new java.awt.Color(0, 171, 159));
        Titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Titulo.setText("Registro de datos para nuevos estudiantes");

        buttonGuardar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        atrasButton.setBackground(new java.awt.Color(240, 215, 141));
        atrasButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        atrasButton.setText("Atrás");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        Labelsaldo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Labelsaldo.setText("Saldo");

        textSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSaldoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre)
                            .addComponent(Documento)
                            .addComponent(Carrera)
                            .addComponent(Labelsaldo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(textDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(textSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(buttonGuardar)
                                .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textNombre))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(Carrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(textDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Labelsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(textSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atrasButton)
                .addContainerGap(268, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
       nombre = textNombre.getText();
    }//GEN-LAST:event_textNombreActionPerformed

    private void textCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCarreraActionPerformed
        
        carrera = textCarrera.getText();
    }//GEN-LAST:event_textCarreraActionPerformed

    private void textDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDocumentoActionPerformed
       documento = textDocumento.getText();        
    }//GEN-LAST:event_textDocumentoActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        f.Panel.removeAll();
        f.Panel.add(new Fondo(f));
        f.validate();
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        
        NumberUID = RXTX_Arduino.NumberUID2;
        //
        
        try {
            writer.guardardatos(NumberUID, nombre, carrera, documento, saldo);
            System.out.println("presionado");
            NumberUID = null;
            nombre = null;
            carrera = null;
            documento = null;
            saldo = null;
            //Arduino.sendData("a");
        } catch (Exception ex) {
            Logger.getLogger(VentanadeCobro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void textSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSaldoActionPerformed
        // TODO add your handling code here:
        saldo = textSaldo.getText();
    }//GEN-LAST:event_textSaldoActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Documento;
    private javax.swing.JLabel Labelsaldo;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton buttonGuardar;
    public static javax.swing.JTextField textCarrera;
    public static javax.swing.JTextField textDocumento;
    public static javax.swing.JTextField textNombre;
    public static javax.swing.JTextField textSaldo;
    // End of variables declaration//GEN-END:variables
}
