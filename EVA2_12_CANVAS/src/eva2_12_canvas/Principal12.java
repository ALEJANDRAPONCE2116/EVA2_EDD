package eva2_12_canvas;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Point;

public class Principal12 extends javax.swing.JFrame {

    Graphics gpsMiDibu;
    Point coord = null; //variable temporal
    Point iniciar = null;

    public Principal12() {
        initComponents();
        gpsMiDibu = cnvDibu.getGraphics();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cnvDibu = new java.awt.Canvas();
        btnUnir = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cnvDibu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cnvDibuMouseClicked(evt);
            }
        });

        btnUnir.setLabel("Unir");
        btnUnir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cnvDibu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(btnUnir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cnvDibu, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUnir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cnvDibuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cnvDibuMouseClicked
        cnvDibu.getGraphics();
        gpsMiDibu.drawOval(evt.getX() - 2, evt.getY() - 2, 4, 1);
        if (coord != null) {
            gpsMiDibu.drawLine(coord.x, coord.y, evt.getX(), evt.getY());
            coord = new Point(evt.getX(), evt.getY());
            coord.x = evt.getX();
            coord.y = evt.getY();
        } else {
            coord = new Point(evt.getX(), evt.getY());
            iniciar = new Point(evt.getX(), evt.getY());

        }
    }//GEN-LAST:event_cnvDibuMouseClicked

    private void btnUnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirActionPerformed
        gpsMiDibu.drawLine(coord.x, coord.y, iniciar.x, iniciar.y);
    }//GEN-LAST:event_btnUnirActionPerformed

    public Graphics getGpsMiDibu() {
        return gpsMiDibu;
    }

    public void setGpsMiDibu(Graphics gpsMiDibu) {
        this.gpsMiDibu = gpsMiDibu;
    }

    public Canvas getCnvDibu() {
        return cnvDibu;
    }

    public void setCnvDibu(Canvas cnvDibu) {
        this.cnvDibu = cnvDibu;
    }

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
            java.util.logging.Logger.getLogger(Principal12.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal12.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal12.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal12.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnUnir;
    private java.awt.Canvas cnvDibu;
    // End of variables declaration//GEN-END:variables
}
//hilo de ejecucion, ejecuta en multitarea, sino se van a bloquear
