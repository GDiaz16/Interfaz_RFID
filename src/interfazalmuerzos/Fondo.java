
package interfazalmuerzos;

import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Fondo extends javax.swing.JPanel {
    Image Background;
    Textwriter writer = new Textwriter();
    public Fondo() {
        initComponents();
          Background = new ImageIcon(this
            .getClass()
            .getResource("/interfazalmuerzos/Imagenes/Backgroundcyt.jpg")).getImage();
    }
    ///private Image imagen;
 
   
    @Override
    public void paint(Graphics g) {
        g.drawImage(Background, 0, 0, getWidth(), getHeight(), this);
 
        setOpaque(false);
        super.paint(g);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Saldo = new javax.swing.JLabel();
        botonCobrar = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Documento = new javax.swing.JLabel();
        Carrera = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoCarrera = new javax.swing.JLabel();
        textoDocumento = new javax.swing.JLabel();
        textoSaldo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(770, 441));

        Saldo.setBackground(new java.awt.Color(204, 204, 204));
        Saldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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

        titulo.setFont(new java.awt.Font("Nirmala UI", 0, 36)); // NOI18N
        titulo.setText("Cafeterias UN");

        Nombre.setBackground(new java.awt.Color(204, 204, 204));
        Nombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Nombre.setText("Nombre:");

        Documento.setBackground(new java.awt.Color(204, 204, 204));
        Documento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Documento.setText("Documento:");

        Carrera.setBackground(new java.awt.Color(204, 204, 204));
        Carrera.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Carrera.setText("Carrera:");

        textoNombre.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textoNombre.setName(""); // NOI18N

        textoCarrera.setBackground(new java.awt.Color(204, 204, 204));
        textoCarrera.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoDocumento.setBackground(new java.awt.Color(204, 204, 204));
        textoDocumento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        textoSaldo.setBackground(new java.awt.Color(204, 204, 204));
        textoSaldo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Documento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Carrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 62, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(botonCobrar)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(botonCobrar)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Documento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Carrera))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Saldo)
                            .addComponent(textoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobrarActionPerformed
        // TODO add your handling code here:
        try {
            writer.guardardatos();
            System.out.println("presionado");
            //Arduino.sendData("a");
        } catch (Exception ex) {
            Logger.getLogger(VentanadeCobro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonCobrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrera;
    private javax.swing.JLabel Documento;
    public javax.swing.JLabel Foto;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Saldo;
    private javax.swing.JButton botonCobrar;
    public javax.swing.JLabel textoCarrera;
    public javax.swing.JLabel textoDocumento;
    public javax.swing.JLabel textoNombre;
    public javax.swing.JLabel textoSaldo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
