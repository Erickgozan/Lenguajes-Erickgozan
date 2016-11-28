
package Proyecto;

import javax.swing.JFrame;

public class Pregunta1 extends JFrame {
    
    Thread h1;
   private int segundos = 30;
   private boolean loop = true;
   
    private boolean respuesta = false;

    public Pregunta1() {
        initComponents();

        h1 = new Thread(new Runnable() {

            public void run() {
                while (loop) {
                    segundos--;
                    try {
                        if (segundos <= 9) {
                            reloj.setText("0:0" + segundos);
                            if (segundos == 0) {
                                loop = false;
                                 new Pregunta2().setVisible(true);
                                dispose();                               
                            }
                        } else {
                            reloj.setText("0:" + segundos);
                        }

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }
                }

            }
        });
        h1.start();

        jButton1.setEnabled(false);
        setTitle("Pregunta 1");
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        reloj = new javax.swing.JLabel();
        Rbtn_1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        Rbtn_3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 300, 500, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("¿Cual es la capital de Tailandia?");

        jButton1.setText("siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        reloj.setText("Reloj");

        buttonGroup1.add(Rbtn_1);
        Rbtn_1.setText("Taipei");
        Rbtn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Hong kong");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Rbtn_3);
        Rbtn_3.setText("Bangkok");
        Rbtn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rbtn_3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Birmania");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(reloj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(Rbtn_1)
                            .addComponent(Rbtn_3)
                            .addComponent(jRadioButton4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(Rbtn_1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(Rbtn_3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(reloj))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           loop = false;
           Pregunta2 pregunta2 = new Pregunta2();
           pregunta2.setVisible(true);
            dispose();        
        if(respuesta){ 
            Principal.contador++;
            Principal.contador++;
          respuesta = false;         
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Rbtn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_1ActionPerformed
           jButton1.setEnabled(true);
    }//GEN-LAST:event_Rbtn_1ActionPerformed

    private void Rbtn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rbtn_3ActionPerformed
            jButton1.setEnabled(true);
        respuesta = true;
                           
    }//GEN-LAST:event_Rbtn_3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
     jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
       jButton1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    public static void main(String args[]) {
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Rbtn_1;
    private javax.swing.JRadioButton Rbtn_3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel reloj;
    // End of variables declaration//GEN-END:variables
}
