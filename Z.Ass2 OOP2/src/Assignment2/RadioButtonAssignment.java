package Assignment2;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

/**
 *
 * @author PETER
 */
public class RadioButtonAssignment extends javax.swing.JFrame {

    /**
     * Creates new form RadioButtonAssignment
     */
    public RadioButtonAssignment() {
        initComponents();
       // Grouping the radio buttons
        groupRadioButtons(); 
    }
    // Grouping the radio buttons
    private void groupRadioButtons() {
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(birdButton);
        buttonGroup.add(catButton);
        buttonGroup.add(dogButton);
        buttonGroup.add(rabbitButton);
        buttonGroup.add(pigButton);
        buttonGroup.add(monkeyButton);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rabbitButton = new javax.swing.JRadioButton();
        pigButton = new javax.swing.JRadioButton();
        birdButton = new javax.swing.JRadioButton();
        catButton = new javax.swing.JRadioButton();
        dogButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        monkeyButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rabbitButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        rabbitButton.setText("Rabbit");
        rabbitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rabbitButtonActionPerformed(evt);
            }
        });

        pigButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        pigButton.setText("Pig");
        pigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pigButtonActionPerformed(evt);
            }
        });

        birdButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        birdButton.setText("Bird");
        birdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birdButtonActionPerformed(evt);
            }
        });

        catButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        catButton.setText("Cat");
        catButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catButtonActionPerformed(evt);
            }
        });

        dogButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        dogButton.setText("Dog");
        dogButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel2.setText("Select Your Pet");

        monkeyButton.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        monkeyButton.setText("Monkey");
        monkeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monkeyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birdButton)
                            .addComponent(pigButton)
                            .addComponent(rabbitButton)
                            .addComponent(dogButton)
                            .addComponent(catButton)
                            .addComponent(monkeyButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)))
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(birdButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dogButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rabbitButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pigButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monkeyButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rabbitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rabbitButtonActionPerformed
        // button for rabbit
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/rabbit.jpeg")));
    }//GEN-LAST:event_rabbitButtonActionPerformed

    private void pigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pigButtonActionPerformed
        // button for pig
         jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/pig.jpeg")));
    }//GEN-LAST:event_pigButtonActionPerformed

    private void birdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birdButtonActionPerformed
        // button for bird
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/bird.jpeg")));
    }//GEN-LAST:event_birdButtonActionPerformed

    private void catButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catButtonActionPerformed
        // button for cat
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/cat.jpeg")));
    }//GEN-LAST:event_catButtonActionPerformed

    private void dogButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogButtonActionPerformed
        // button for dog
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/dog.jpeg")));
    }//GEN-LAST:event_dogButtonActionPerformed

    private void monkeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monkeyButtonActionPerformed
        // monkey button
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/images/monkey.jpeg")));
    }//GEN-LAST:event_monkeyButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RadioButtonAssignment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton birdButton;
    private javax.swing.JRadioButton catButton;
    private javax.swing.JRadioButton dogButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton monkeyButton;
    private javax.swing.JRadioButton pigButton;
    private javax.swing.JRadioButton rabbitButton;
    // End of variables declaration//GEN-END:variables
}
