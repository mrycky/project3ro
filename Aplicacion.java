
package prueba_con_ant;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Aplicacion extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    public Aplicacion() {
        this.setLocationRelativeTo(this);
        this.setContentPane(fondo);
        
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlmenu = new javax.swing.JPanel();
        btnCarton = new rsbuttom.RSButtonMetro();
        btnPapel = new rsbuttom.RSButtonMetro();
        btnVidrio = new rsbuttom.RSButtonMetro();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();
        rSButtonMetro3 = new rsbuttom.RSButtonMetro();
        rSButtonMetro4 = new rsbuttom.RSButtonMetro();
        pnlMenu = new javax.swing.JPanel();
        btnMenu = new rsbuttom.RSButtonMetro();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App Reciclaje");

        pnlmenu.setBackground(new java.awt.Color(60, 121, 99));

        btnCarton.setBackground(new java.awt.Color(60, 121, 99));
        btnCarton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/caja-del-paquete.png"))); // NOI18N
        btnCarton.setText("Cartón");
        btnCarton.setToolTipText("");
        btnCarton.setColorHover(new java.awt.Color(255, 255, 255));
        btnCarton.setColorNormal(new java.awt.Color(60, 121, 99));
        btnCarton.setColorPressed(new java.awt.Color(60, 121, 99));
        btnCarton.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnCarton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartonActionPerformed(evt);
            }
        });

        btnPapel.setBackground(new java.awt.Color(60, 121, 99));
        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/papel-reciclado.png"))); // NOI18N
        btnPapel.setText("Papel");
        btnPapel.setToolTipText("");
        btnPapel.setColorHover(new java.awt.Color(255, 255, 255));
        btnPapel.setColorNormal(new java.awt.Color(60, 121, 99));
        btnPapel.setColorPressed(new java.awt.Color(60, 121, 99));
        btnPapel.setColorTextHover(new java.awt.Color(0, 0, 0));

        btnVidrio.setBackground(new java.awt.Color(60, 121, 99));
        btnVidrio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vidrio.png"))); // NOI18N
        btnVidrio.setText("Vidrio");
        btnVidrio.setToolTipText("");
        btnVidrio.setColorHover(new java.awt.Color(255, 255, 255));
        btnVidrio.setColorNormal(new java.awt.Color(60, 121, 99));
        btnVidrio.setColorPressed(new java.awt.Color(60, 121, 99));
        btnVidrio.setColorTextHover(new java.awt.Color(0, 0, 0));

        rSButtonMetro1.setBackground(new java.awt.Color(60, 121, 99));
        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Latas.png"))); // NOI18N
        rSButtonMetro1.setText("Latas");

        rSButtonMetro2.setBackground(new java.awt.Color(60, 121, 99));
        rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baterias.png"))); // NOI18N
        rSButtonMetro2.setText("Pilas");

        rSButtonMetro3.setBackground(new java.awt.Color(60, 121, 99));
        rSButtonMetro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/electronico.png"))); // NOI18N
        rSButtonMetro3.setText("Desechos electrónicos");

        rSButtonMetro4.setBackground(new java.awt.Color(60, 121, 99));
        rSButtonMetro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/telas.png"))); // NOI18N
        rSButtonMetro4.setText("Telas");
        rSButtonMetro4.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonMetro4.setColorNormal(new java.awt.Color(60, 121, 99));
        rSButtonMetro4.setColorPressed(new java.awt.Color(60, 121, 99));
        rSButtonMetro4.setColorTextHover(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnlmenuLayout = new javax.swing.GroupLayout(pnlmenu);
        pnlmenu.setLayout(pnlmenuLayout);
        pnlmenuLayout.setHorizontalGroup(
            pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPapel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVidrio, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
            .addComponent(rSButtonMetro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonMetro2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonMetro3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rSButtonMetro4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnCarton, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
        );
        pnlmenuLayout.setVerticalGroup(
            pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlmenuLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnVidrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(rSButtonMetro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(pnlmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlmenuLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btnCarton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(232, Short.MAX_VALUE)))
        );

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));

        btnMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu 3.png"))); // NOI18N
        btnMenu.setText("  Menú");
        btnMenu.setColorHover(new java.awt.Color(255, 255, 255));
        btnMenu.setColorNormal(new java.awt.Color(255, 255, 255));
        btnMenu.setColorPressed(new java.awt.Color(255, 255, 255));
        btnMenu.setColorTextHover(new java.awt.Color(0, 0, 0));
        btnMenu.setColorTextNormal(new java.awt.Color(0, 0, 0));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscar.setForeground(new java.awt.Color(60, 121, 99));
        txtBuscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(60, 121, 99), 3, true));

        lblBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/busqueda.png"))); // NOI18N

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(389, 389, 389)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBuscar)
                .addContainerGap(653, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1363, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        int posicion = this.pnlmenu.getX();
        if(posicion > -1){
            Animacion.Animacion.mover_izquierda(0, -220, 2, 2, pnlmenu);
        }else{
            Animacion.Animacion.mover_derecha(-220, 0, 2, 2, pnlmenu);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCartonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCartonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btnCarton;
    private rsbuttom.RSButtonMetro btnMenu;
    private rsbuttom.RSButtonMetro btnPapel;
    private rsbuttom.RSButtonMetro btnVidrio;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlmenu;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    private rsbuttom.RSButtonMetro rSButtonMetro3;
    private rsbuttom.RSButtonMetro rSButtonMetro4;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    
    
    //------Creacion de imagen en el Jframe------//
    class FondoPanel extends JPanel
    {
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen = new ImageIcon(getClass().getResource("/Images/Fondo.png")).getImage();
            
            g.drawImage(imagen,0, 0, getWidth(), getHeight(),this);
            
            setOpaque(false);
            super.paint(g);
        }
    }

}
