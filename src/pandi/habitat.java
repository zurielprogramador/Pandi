/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandi;


import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carmen Jimenez
 */
public class habitat extends javax.swing.JFrame {

    /**
     * Creates new form habitat
     */
    int x,y;
          int c = 0;
          int con = 0;
    boolean v=false;
//     public void cerrar(){
//       
//    }
//    
    ImageIcon ima2= new ImageIcon();
    infoP n=new infoP("<html>¡FELICIDADES!Has hecho del habitat de pandi un lugar mas limpio"+'\n'+"gracias por ayudar!:3");
        public void no(){
         btnmas.setVisible(false);
        }
        public void eventoMouse(java.awt.event.MouseEvent evt){
            
            x=evt.getX();
            y=evt.getY();
            
            //esto localiza la imagen
        }
        public void puntoMouse(JLabel label, int imagen){
            jLabel15.setVisible(true);
            jLabel16.setVisible(true);
           
             //n.setVisible(true);
            
        label.setVisible(true);
        Point point=MouseInfo.getPointerInfo().getLocation();
        //System.out.println(point);
        label.setLocation(point.x-x,point.y-y);
        basurero.getLocation();
        if((label.getX()>1000&&label.getX()<1200)&&(label.getY()>500&&label.getY()<800)){
            
            label.setVisible(false);
            //con++;
            System.out.println(c);
            if(c==3){ 
                ImageIcon im=(new ImageIcon(getClass().getResource("/imagenes/maes.png")));
               jLabel13.setIcon(im);
                if(imagen == 1){
               ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/cubobasura.png")));
               jLabel9.setIcon(ima);
                }
                if(imagen==2){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/platano.png")));
                jLabel9.setIcon(ima);
                }
                if(imagen==3){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/basurasin.png")));
                jLabel9.setIcon(ima);
                }
                if(imagen==4){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/manzana.png")));
                jLabel9.setIcon(ima);
                }
                if(imagen==5){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/basurra.png")));
                jLabel9.setIcon(ima);
                }
                if(imagen==6){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/deposito.png")));
                jLabel9.setIcon(ima);
                }
                if(imagen==7){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/basura.png")));
                jLabel9.setIcon(ima);
                }
                jLabel13.setVisible(true);
            }
            if(c==4){
              if(imagen == 1){
               ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/cubobasura.png")));
               jLabel11.setIcon(ima);
                }
                if(imagen==2){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/platano.png")));
                jLabel11.setIcon(ima);
                }
                if(imagen==3){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/basurasin.png")));
                jLabel11.setIcon(ima);
                }
                if(imagen==4){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/manzana.png")));
                jLabel11.setIcon(ima);
                }
                if(imagen==5){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/basurra.png")));
                jLabel11.setIcon(ima);
                }
                if(imagen==6){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/deposito.png")));
                jLabel11.setIcon(ima);
                }
                if(imagen==7){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/basura.png")));
                jLabel11.setIcon(ima);
                }
            }
            if(c==5){
            if(imagen == 1){
               ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/cubobasura.png")));
               jLabel10.setIcon(ima);
                }
                if(imagen==2){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/platano.png")));
                jLabel10.setIcon(ima);
                }
                if(imagen==3){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/basurasin.png")));
                jLabel10.setIcon(ima);
                }
                if(imagen==4){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/manzana.png")));
                jLabel10.setIcon(ima);
                }
                if(imagen==5){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/basurra.png")));
                jLabel10.setIcon(ima);
                }
                if(imagen==6){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/deposito.png")));
                jLabel10.setIcon(ima);
                }
                if(imagen==7){
                ImageIcon ima=(new ImageIcon(getClass().getResource("/imagenes/basura.png")));
                jLabel10.setIcon(ima);
                }
            }
            if(jLabel6.isVisible()!=true&&jLabel8.isVisible()==false&&jLabel7.isVisible()==false&&jLabel12.isVisible()==false&&
                    jLabel4.isVisible()==false&&jLabel5.isVisible()==false&&jLabel3.isVisible()==false&&jLabel8.isVisible()==false){
                
                
               
             // if(n.isVisible() != true){
                n.setVisible(true);
              // }
             
//              JOptionPane.showMessageDialog(null,"Felicidades has hecho de el habitat de pandi un lugar mas limpio");
              
              
              basurero.setVisible(false);
              jLabel9.setVisible(false);
              jLabel10.setVisible(false);
              jLabel11.setVisible(false);
              jLabel13.setVisible(false);
              btnmas.setVisible(true);
             
            }
            
           
        
        }
          
        }
        
    public habitat() {
        
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }
    
    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        basurero = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnmas = new javax.swing.JButton();
        reiniciar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pandaH.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 160, 300));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/deposito.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 580, 130, 140));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basurasin.png"))); // NOI18N
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 640, 150, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basurra.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, -1, 90));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cubobasura.png"))); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
        });
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 680, 180, 90));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 530, 120, 90));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/basura.png"))); // NOI18N
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel12MouseDragged(evt);
            }
        });
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 700, 120, 70));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 550, 150, 60));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 500, 110, 110));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 520, 120, 60));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/manzana.png"))); // NOI18N
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8MouseDragged(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 700, 70, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/platano.png"))); // NOI18N
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel7MouseDragged(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 50, 60));

        basurero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botA.png"))); // NOI18N
        getContentPane().add(basurero, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 430, 220, 350));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 80, -1, -1));

        btnmas.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnmas.setForeground(new java.awt.Color(255, 255, 255));
        btnmas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconoP.png"))); // NOI18N
        btnmas.setText("AGREGAR AMIGOS");
        btnmas.setBorder(null);
        btnmas.setContentAreaFilled(false);
        btnmas.setFocusPainted(false);
        btnmas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasActionPerformed(evt);
            }
        });
        getContentPane().add(btnmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 150, -1, -1));

        reiniciar.setForeground(new java.awt.Color(255, 255, 255));
        reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asearpanda/imagenes/volver.png"))); // NOI18N
        reiniciar.setText("REINICIAR");
        reiniciar.setBorder(null);
        reiniciar.setContentAreaFilled(false);
        reiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        reiniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 230, -1, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 550, 360, 200));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 50, 60));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 90, 130));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 30, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/habitat.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1460, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
     this.eventoMouse(evt);
     c++;
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
        this.puntoMouse(jLabel6, 1);
        //c++;
        //JOptionPane.showMessageDialog(null,c);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
this.eventoMouse(evt);
        c++;
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
       this.puntoMouse(jLabel3,6);
       //c++;
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        this.eventoMouse(evt);
        c++;
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
          this.puntoMouse(jLabel5,5);// TODO add your handling code here:
          //c++;
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        this.eventoMouse(evt);
        c++;
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
       this.puntoMouse(jLabel4,3);  // TODO add your handling code here:
       //c++;
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
       
        this.eventoMouse(evt); 
        c++;
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseDragged
        this.puntoMouse(jLabel8,4);
        //c++;
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseDragged

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
       this.eventoMouse(evt);  // TODO add your handling code here:
       c++;
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel7MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseDragged
        this.puntoMouse(jLabel7,2);
        //c++;
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseDragged

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
   this.eventoMouse(evt); 
       c++;
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel12MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseDragged
         this.puntoMouse(jLabel12,7);
         
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseDragged

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        c=0;
        jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel9.setVisible(true);
        jLabel12.setVisible(true);
        jLabel8.setVisible(true);
        jLabel9.setIcon(ima2);
        jLabel11.setVisible(true);
        jLabel11.setIcon(ima2);
        jLabel10.setVisible(true);
        jLabel10.setIcon(ima2);
        jLabel13.setVisible(true);
        jLabel13.setIcon(ima2);
        basurero.setVisible(true);
        jLabel14.setVisible(false);
        jLabel14.setIcon(ima2);
        jLabel15.setVisible(false);
        jLabel15.setIcon(ima2);
        jLabel16.setVisible(false);
        jLabel16.setIcon(ima2);
        jLabel17.setVisible(false);
        jLabel17.setIcon(ima2);
        System.out.println(c);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_reiniciarActionPerformed

    private void btnmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasActionPerformed
    jLabel14.setVisible(true);
    jLabel15.setVisible(true);
    jLabel16.setVisible(true);
    jLabel17.setVisible(true);
        ImageIcon im2=(new ImageIcon(getClass().getResource("/imagenes/pbb.gif")));
        ImageIcon im=(new ImageIcon(getClass().getResource("/imagenes/pandaH1.gif")));
        ImageIcon im3=(new ImageIcon(getClass().getResource("/imagenes/pandaH2.gif")));
        ImageIcon im4=(new ImageIcon(getClass().getResource("/imagenes/pandaH3.gif")));
        
   jLabel14.setIcon(im2);
   jLabel15.setIcon(im);
   jLabel16.setIcon(im3);
   jLabel17.setIcon(im4);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmasActionPerformed

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
            java.util.logging.Logger.getLogger(habitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(habitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(habitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(habitat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new habitat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel basurero;
    private javax.swing.JButton btnmas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton reiniciar;
    // End of variables declaration//GEN-END:variables
}
