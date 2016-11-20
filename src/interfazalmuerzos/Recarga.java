
package interfazalmuerzos;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Recarga extends javax.swing.JPanel {
    Image Background3;
    VentanadeCobro f;
    double valor;
    public Recarga(VentanadeCobro d) {
        this.f = d;
        initComponents();
        Background3 = new ImageIcon(this
                .getClass()
                .getResource("/interfazalmuerzos/Imagenes/Backgroundcyt.jpg")).getImage();
    }

     @Override
    public void paint(Graphics g) {
        g.drawImage(Background3, 15, 370, getWidth()-30, getHeight()/3, this);
 
        setOpaque(false);
        super.paint(g);
       repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        revisionTarjeta = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        Titulo3 = new javax.swing.JLabel();
        textvalor = new javax.swing.JTextField();
        recargar = new javax.swing.JButton();
        atras = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(450, 603));

        Titulo.setBackground(new java.awt.Color(176, 225, 95));
        Titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Recarga de saldo");
        Titulo.setOpaque(true);

        revisionTarjeta.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        revisionTarjeta.setForeground(new java.awt.Color(51, 204, 0));
        revisionTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        revisionTarjeta.setText("Tarjeta valida");

        nombre.setBackground(new java.awt.Color(0, 171, 159));
        nombre.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombre.setText("Nombre");

        saldo.setBackground(new java.awt.Color(0, 171, 159));
        saldo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        saldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldo.setText("Saldo");

        Titulo3.setBackground(new java.awt.Color(0, 171, 159));
        Titulo3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Titulo3.setText("Valor");

        textvalor.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        textvalor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textvalorActionPerformed(evt);
            }
        });

        recargar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        recargar.setText("Recargar");
        recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recargarActionPerformed(evt);
            }
        });

        atras.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(revisionTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(166, 166, 166)
                            .addComponent(atras))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Titulo3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(38, 38, 38)
                                            .addComponent(recargar))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(textvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(saldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(revisionTarjeta)
                .addGap(18, 18, 18)
                .addComponent(nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Titulo3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(recargar)
                .addGap(18, 18, 18)
                .addComponent(atras)
                .addContainerGap(263, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        f.Panel.removeAll();
        f.Panel.add(new Fondo(f));
        f.validate();
                
    }//GEN-LAST:event_atrasActionPerformed

    private void recargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_recargarActionPerformed

    private void textvalorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textvalorActionPerformed
      valor = Integer.parseInt(textvalor.getText());
        
    }//GEN-LAST:event_textvalorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo3;
    public javax.swing.JButton atras;
    public static javax.swing.JLabel nombre;
    public javax.swing.JButton recargar;
    public static javax.swing.JLabel revisionTarjeta;
    public static javax.swing.JLabel saldo;
    public static javax.swing.JTextField textvalor;
    // End of variables declaration//GEN-END:variables
}
