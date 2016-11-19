
package interfazalmuerzos;


import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Fondo extends javax.swing.JPanel {
    VentanadeCobro f;
    Registro formulario;
    Image Background;
    Textwriter writer = new Textwriter();
    Intercambio inter;
    public Fondo(VentanadeCobro f) {
        this.f = f;
        initComponents();
             
          Background = new ImageIcon(this
            .getClass()
            .getResource("/interfazalmuerzos/Imagenes/Backgroundcyt.jpg")).getImage();
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawImage(Background, 0, 0, getWidth(), getHeight()/3, this);
 
        setOpaque(false);
        super.paint(g);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCobrar = new javax.swing.JButton();
        Foto = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoCarrera = new javax.swing.JLabel();
        textoDocumento = new javax.swing.JLabel();
        textoSaldo = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        botonCobrar1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(226, 224, 224));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(450, 603));

        botonCobrar.setBackground(new java.awt.Color(102, 204, 0));
        botonCobrar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        botonCobrar.setForeground(new java.awt.Color(255, 255, 255));
        botonCobrar.setText("Recargar");
        botonCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCobrarActionPerformed(evt);
            }
        });

        Foto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfazalmuerzos/Imagenes/UN.png"))); // NOI18N
        Foto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        titulo.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        titulo.setText("Cafeterias UN");

        textoNombre.setBackground(new java.awt.Color(204, 204, 204));
        textoNombre.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(102, 102, 102));
        textoNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoNombre.setText("Nombre");
        textoNombre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        textoNombre.setName(""); // NOI18N

        textoCarrera.setBackground(new java.awt.Color(204, 204, 204));
        textoCarrera.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        textoCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoCarrera.setText("Carrera");
        textoCarrera.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoDocumento.setBackground(new java.awt.Color(204, 204, 204));
        textoDocumento.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        textoDocumento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoDocumento.setText("Documento");
        textoDocumento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        textoSaldo.setBackground(new java.awt.Color(204, 204, 204));
        textoSaldo.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        textoSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoSaldo.setText("Saldo:");
        textoSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        botonRegistrar.setBackground(new java.awt.Color(202, 153, 40));
        botonRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setLabel("Registrar");
        botonRegistrar.setPreferredSize(new java.awt.Dimension(141, 39));
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonCobrar1.setBackground(new java.awt.Color(136, 100, 66));
        botonCobrar1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        botonCobrar1.setForeground(new java.awt.Color(255, 255, 255));
        botonCobrar1.setText("Cobrar");
        botonCobrar1.setPreferredSize(new java.awt.Dimension(141, 39));
        botonCobrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCobrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(textoCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonCobrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(titulo)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(botonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(30, 30, 30)
                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCobrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botonCobrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobrarActionPerformed
        // TODO add your handling code here:
//        try {
//            writer.guardardatos();
//            System.out.println("presionado");
//            //Arduino.sendData("a");
//        } catch (Exception ex) {
//            Logger.getLogger(VentanadeCobro.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_botonCobrarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        f.Panel.removeAll();
        f.Panel.add(new Registro(f));
        f.validate();
      
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonCobrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCobrar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Foto;
    private javax.swing.JButton botonCobrar;
    private javax.swing.JButton botonCobrar1;
    private static javax.swing.JButton botonRegistrar;
    public static javax.swing.JLabel textoCarrera;
    public static javax.swing.JLabel textoDocumento;
    public static javax.swing.JLabel textoNombre;
    public static javax.swing.JLabel textoSaldo;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
