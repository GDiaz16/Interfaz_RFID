/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazalmuerzos;

import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import panamahitek.Arduino.PanamaHitek_Arduino;

/**
 *
 * @author FAMILIA
 */
public class Registro extends javax.swing.JPanel {
    Image Background2;
    VentanadeCobro f;
    String NumberUID;
    String nombre;
    String documento;
    String carrera;
    PanamaHitek_Arduino Arduino = new PanamaHitek_Arduino();
    Textwriter writer = new Textwriter();
    public Registro(VentanadeCobro d) {
        initComponents();
        textNombre.setEnabled(false);
        textCarrera.setEnabled(false);
        textDocumento.setEnabled(false);
        
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
        revisionTarjeta = new javax.swing.JLabel();
        atrasButton = new javax.swing.JButton();

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

        revisionTarjeta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        revisionTarjeta.setForeground(new java.awt.Color(0, 0, 255));
        revisionTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        revisionTarjeta.setText("Acerque una tarjeta");

        atrasButton.setBackground(new java.awt.Color(240, 215, 141));
        atrasButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        atrasButton.setText("Atrás");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre)
                    .addComponent(Documento)
                    .addComponent(Carrera))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(revisionTarjeta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(atrasButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(revisionTarjeta)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nombre)
                    .addComponent(textNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Carrera)
                    .addComponent(textCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(atrasButton)
                .addGap(287, 287, 287))
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
        // TODO add your handling code here:
         //if (tarjeta(Arduino)){
        //textNombre.setEnabled(true);
        //textNombre.validate();
        System.out.println("documento " + documento + "\n" + "carrera " + carrera + "\n" + "nombre " + nombre);
        try {
            writer.guardardatos(NumberUID, nombre, carrera, documento);
            System.out.println("presionado");
            //Arduino.sendData("a");
        } catch (Exception ex) {
            Logger.getLogger(VentanadeCobro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Documento;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton buttonGuardar;
    public static javax.swing.JLabel revisionTarjeta;
    public static javax.swing.JTextField textCarrera;
    public static javax.swing.JTextField textDocumento;
    public static javax.swing.JTextField textNombre;
    // End of variables declaration//GEN-END:variables
}
