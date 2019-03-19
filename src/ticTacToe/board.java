/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Mateusz
 */
public class board extends javax.swing.JFrame {

    /**
     * Creates new form board
     */
    public board() {
        initComponents();
        boardInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        RESET = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        gameScoreLabel = new javax.swing.JLabel();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic-tac-toe");

        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        C2.setText("C2");
        C2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        A1.setText("A1");
        A1.setToolTipText("");
        A1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B1.setText("B1");
        B1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setText("C1");
        C1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        A2.setText("A2");
        A2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setText("A3");
        A3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        C3.setText("C3");
        C3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        gameScoreLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gameScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gameScoreLabel.setText("jLabel1");

        B2.setText("B2");
        B2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setText("B3");
        B3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(118, 118, 118)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RESET))))
                            .addGap(156, 156, 156))
                        .addComponent(gameScoreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(RESET)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(C1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(18, 18, 18)
                    .addComponent(gameScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Cross And Circle");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        buttonClick(B3);
        computerMove();
    }//GEN-LAST:event_B3ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        buttonClick(B2);
        computerMove();
    }//GEN-LAST:event_B2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        buttonClick(C3);
        computerMove();
    }//GEN-LAST:event_C3ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        buttonClick(A3);
        computerMove();
    }//GEN-LAST:event_A3ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        buttonClick(A2);
        computerMove();
    }//GEN-LAST:event_A2ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        buttonClick(C1);
        computerMove();
    }//GEN-LAST:event_C1ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        buttonClick(B1);
        computerMove();
    }//GEN-LAST:event_B1ActionPerformed

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        buttonClick(A1);
        computerMove();
    }//GEN-LAST:event_A1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        buttonClick(C2);
        computerMove();
    }//GEN-LAST:event_C2ActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        clearBoard();
    }//GEN-LAST:event_RESETActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new board().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton RESET;
    private javax.swing.JLabel gameScoreLabel;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    List<JButton> buttons = new ArrayList<>();

    private void fillListOfButtons() {
        this.buttons.add(A1);
        this.buttons.add(A3);
        this.buttons.add(B1);
        this.buttons.add(B2);
        this.buttons.add(B3);
        this.buttons.add(A2);
        this.buttons.add(C1);
        this.buttons.add(C2);
        this.buttons.add(C3);
    }

    private void boardInit() {
        fillListOfButtons();
        for (JButton button : buttons) {
            button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticTacToe/disp/empty.jpg")));
            button.setText("empty");
            button.setEnabled(true);
        }
        gameScoreLabel.setText("Game in progress");
    }

    private void clearBoard() {
        boardInit();
    }

    private void buttonClick(JButton button) {
        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticTacToe/disp/cross.jpg")));
        button.setText("cross");
        button.setEnabled(false);
        checker();
    }

    private void computerClick(JButton button) {

        button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ticTacToe/disp/circle.jpg")));
        button.setText("circle");
        button.setEnabled(false);
        checker();

    }

    private boolean offensiveComputer() {

        String A1Text = A1.getText();
        String B1Text = B1.getText();
        String C1Text = C1.getText();
        String A2Text = A2.getText();
        String B2Text = B2.getText();
        String C2Text = C2.getText();
        String A3Text = A3.getText();
        String B3Text = B3.getText();
        String C3Text = C3.getText();

        if (A1Text.equals("circle") && B1Text.equals("circle") && C1.isEnabled()) {
            computerClick(C1);
            return false;
        }
        if (A2Text.equals("circle") && B2Text.equals("circle") && C2.isEnabled()) {
            computerClick(C2);
            return false;
        }
        if (A3Text.equals("circle") && B3Text.equals("circle") && C3.isEnabled()) {
            computerClick(C3);
            return false;
        }
        if (A1Text.equals("circle") && B2Text.equals("circle") && C3.isEnabled()) {
            computerClick(C3);
            return false;
        }
        if (A3Text.equals("circle") && B2Text.equals("circle") && C1.isEnabled()) {
            computerClick(C1);
            return false;
        }
        if (A1Text.equals("circle") && A2Text.equals("circle") && A3.isEnabled()) {
            computerClick(A3);
            return false;
        }
        if (B1Text.equals("circle") && B2Text.equals("circle") && B3.isEnabled()) {
            computerClick(B3);
            return false;
        }
        if (C1Text.equals("circle") && C2Text.equals("circle") && C3.isEnabled()) {
            computerClick(C3);
            return false;
        }
        if (C1Text.equals("circle") && B1Text.equals("circle") && A1.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (C2Text.equals("circle") && B2Text.equals("circle") && A2.isEnabled()) {
            computerClick(A2);
            return false;
        }
        if (C3Text.equals("circle") && B3Text.equals("circle") && A3.isEnabled()) {
            computerClick(A3);
            return false;
        }
        if (C3Text.equals("circle") && B2Text.equals("circle") && A1.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (C1Text.equals("circle") && B2Text.equals("circle") && A3.isEnabled()) {
            computerClick(A3);
            return false;
        }
        if (A3Text.equals("circle") && A2Text.equals("circle") && A1.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (B3Text.equals("circle") && B2Text.equals("circle") && B1.isEnabled()) {
            computerClick(B1);
            return false;
        }
        if (C3Text.equals("circle") && C2Text.equals("circle") && C1.isEnabled()) {
            computerClick(C1);
            return false;
        }
        if (A1Text.equals("circle") && A3Text.equals("circle") && A2.isEnabled()) {
            computerClick(A2);
            return false;
        }
        if (A1Text.equals("circle") && C3Text.equals("circle") && B2.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (A1Text.equals("circle") && C1Text.equals("circle") && B1.isEnabled()) {
            computerClick(B1);
            return false;
        }
        if (A2Text.equals("circle") && C2Text.equals("circle") && B2.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (A3Text.equals("circle") && C1Text.equals("circle") && B2.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (A3Text.equals("circle") && C3Text.equals("circle") && B3.isEnabled()) {
            computerClick(B3);
            return false;
        }
        if (B1Text.equals("circle") && B3Text.equals("circle") && B2.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (C1Text.equals("circle") && C3Text.equals("circle") && C2.isEnabled()) {
            computerClick(C2);
            return false;
        }
        return true;
    }

    private boolean defensiveComputer() {

        String A1Text = A1.getText();
        String B1Text = B1.getText();
        String C1Text = C1.getText();
        String A2Text = A2.getText();
        String B2Text = B2.getText();
        String C2Text = C2.getText();
        String A3Text = A3.getText();
        String B3Text = B3.getText();
        String C3Text = C3.getText();

        if (A1Text.equals("cross") && B1Text.equals("cross") && C1.isEnabled()) {
            computerClick(C1);
            return false;
        }
        if (A2Text.equals("cross") && B2Text.equals("cross") && C2.isEnabled()) {
            computerClick(C2);
            return false;
        }
        if (A3Text.equals("cross") && B3Text.equals("cross") && C3.isEnabled()) {
            computerClick(C3);
            return false;
        }
        if (A1Text.equals("cross") && B2Text.equals("cross") && C3.isEnabled()) {
            computerClick(C3);
            return false;
        }
        if (A3Text.equals("cross") && B2Text.equals("cross") && C1.isEnabled()) {
            computerClick(C1);
            return false;
        }
        if (A1Text.equals("cross") && A2Text.equals("cross") && A3.isEnabled()) {
            computerClick(A3);
            return false;
        }
        if (B1Text.equals("cross") && B2Text.equals("cross") && B3.isEnabled()) {
            computerClick(B3);
            return false;
        }
        if (C1Text.equals("cross") && C2Text.equals("cross") && C3.isEnabled()) {
            computerClick(C3);
            return false;
        }
        if (C1Text.equals("cross") && B1Text.equals("cross") && A1.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (C2Text.equals("cross") && B2Text.equals("cross") && A2.isEnabled()) {
            computerClick(A2);
            return false;
        }
        if (C3Text.equals("cross") && B3Text.equals("cross") && A3.isEnabled()) {
            computerClick(A3);
            return false;
        }
        if (C3Text.equals("cross") && B2Text.equals("cross") && A1.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (C1Text.equals("cross") && B2Text.equals("cross") && A3.isEnabled()) {
            computerClick(A3);
            return false;
        }
        if (A3Text.equals("cross") && A2Text.equals("cross") && A1.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (B3Text.equals("cross") && B2Text.equals("cross") && B1.isEnabled()) {
            computerClick(B1);
            return false;
        }
        if (C3Text.equals("cross") && C2Text.equals("cross") && C1.isEnabled()) {
            computerClick(C1);
            return false;
        }
        if (A1Text.equals("cross") && A3Text.equals("cross") && A2.isEnabled()) {
            computerClick(A2);
            return false;
        }
        if (A1Text.equals("cross") && C3Text.equals("cross") && B2.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (A1Text.equals("cross") && C1Text.equals("cross") && B1.isEnabled()) {
            computerClick(B1);
            return false;
        }
        if (A2Text.equals("cross") && C2Text.equals("cross") && B2.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (A3Text.equals("cross") && C1Text.equals("cross") && B2.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (A3Text.equals("cross") && C3Text.equals("cross") && B3.isEnabled()) {
            computerClick(B3);
            return false;
        }
        if (B1Text.equals("cross") && B3Text.equals("cross") && B2.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (C1Text.equals("cross") && C3Text.equals("cross") && C2.isEnabled()) {
            computerClick(C2);
            return false;
        }
        return true;

    }

    private boolean semiOffensiveComputer() {

        String A1Text = A1.getText();
        String B1Text = B1.getText();
        String C1Text = C1.getText();
        String A2Text = A2.getText();
        String B2Text = B2.getText();
        String C2Text = C2.getText();
        String A3Text = A3.getText();
        String B3Text = B3.getText();
        String C3Text = C3.getText();

        if (A1Text.equals("circle") && A2.isEnabled() && A3.isEnabled()) {
            computerClick(A2);
            return false;
        }
        if (A1Text.equals("circle") && B1.isEnabled() && C1.isEnabled()) {
            computerClick(B1);
            return false;
        }
        if (A1Text.equals("circle") && B2.isEnabled() && C3.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (A2Text.equals("circle") && A1.isEnabled() && A3.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (A2Text.equals("circle") && B2.isEnabled() && C2.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (A3Text.equals("circle") && A1.isEnabled() && A2.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (A3Text.equals("circle") && B3.isEnabled() && C3.isEnabled()) {
            computerClick(B3);
            return false;
        }
        if (A3Text.equals("circle") && B2.isEnabled() && C1.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (B1Text.equals("circle") && B2.isEnabled() && B3.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (B1Text.equals("circle") && A1.isEnabled() && C1.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (B2Text.equals("circle") && B1.isEnabled() && B3.isEnabled()) {
            computerClick(B1);
            return false;
        }
        if (B2Text.equals("circle") && A2.isEnabled() && C2.isEnabled()) {
            computerClick(A2);
            return false;
        }
        if (B2Text.equals("circle") && A1.isEnabled() && C3.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (B2Text.equals("circle") && A3.isEnabled() && C1.isEnabled()) {
            computerClick(A3);
            return false;
        }
        if (B3Text.equals("circle") && B2.isEnabled() && B1.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (B3Text.equals("circle") && A3.isEnabled() && C3.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (C1Text.equals("circle") && A1.isEnabled() && B1.isEnabled()) {
            computerClick(A1);
            return false;
        }
        if (C1Text.equals("circle") && C2.isEnabled() && C3.isEnabled()) {
            computerClick(C2);
            return false;
        }
        if (C1Text.equals("circle") && B2.isEnabled() && A3.isEnabled()) {
            computerClick(B2);
            return false;
        }
        if (C2Text.equals("circle") && C1.isEnabled() && C3.isEnabled()) {
            computerClick(C1);
            return false;
        }
        if (C2Text.equals("circle") && B2.isEnabled() && A2.isEnabled()) {
            computerClick(A2);
            return false;
        }
        if (C3Text.equals("circle") && C2.isEnabled() && C1.isEnabled()) {
            computerClick(C1);
            return false;
        }
        if (C3Text.equals("circle") && A3.isEnabled() && B3.isEnabled()) {
            computerClick(A3);
            return false;
        }
        if (C3Text.equals("circle") && B2.isEnabled() && A1.isEnabled()) {
            computerClick(A1);
            return false;
        }
        return true;
    }

    private boolean randomComputer() {
        if (B2.isEnabled()) {
            computerClick(B2);
            return false;
        } else {
            boolean losuj = true;
            int random;
            Random rand = new Random();
            long start = System.currentTimeMillis();
            long end = start + 500;
            while (losuj) {
                random = rand.nextInt(8) + 1;
                System.out.println(random);
                if (System.currentTimeMillis() > end) {
                    losuj = false;
                }
                switch (random) {
                    case 1:
                        if (A1.isEnabled()) {
                            computerClick(A1);
                            losuj = false;
                            break;
                        }
                    case 2:
                        if (C1.isEnabled()) {
                            computerClick(C1);
                            losuj = false;
                            break;
                        }
                    case 3:
                        if (A3.isEnabled()) {
                            computerClick(A3);
                            losuj = false;
                            break;
                        }
                    case 4:
                        if (C3.isEnabled()) {
                            computerClick(C3);
                            losuj = false;
                            break;
                        }
                    case 5:
                        if (A2.isEnabled()) {
                            computerClick(A2);
                            losuj = false;
                            break;
                        }
                    case 6:
                        if (B1.isEnabled()) {
                            computerClick(B1);
                            losuj = false;
                            break;
                        }
                    case 7:
                        if (B3.isEnabled()) {
                            computerClick(B3);
                            losuj = false;
                            break;
                        }
                    case 8:
                        if (C2.isEnabled()) {
                            computerClick(C2);
                            losuj = false;
                            break;
                        }
                    default:
                        break;
                }
            }
        }
        return true;
    }

    private void computerMove() {
        if (boardFull()) {
            if (offensiveComputer()) {
                if (defensiveComputer()) {
                    if (semiOffensiveComputer()) {    
                    }
                }
            }
        } else {
            if (offensiveComputer()) {
                if (defensiveComputer()) {
                    if (semiOffensiveComputer()) {
                        randomComputer();
                    }
                }
            }
        }
    }

    private boolean boardFull() {

        return !(A1.isEnabled() || A2.isEnabled() || A3.isEnabled() || B1.isEnabled() || B2.isEnabled() || B3.isEnabled() || C1.isEnabled() || C2.isEnabled() || C3.isEnabled());
    }

    private boolean playerWinCondition() {
        String A1Text = A1.getText();
        String B1Text = B1.getText();
        String C1Text = C1.getText();
        String A2Text = A2.getText();
        String B2Text = B2.getText();
        String C2Text = C2.getText();
        String A3Text = A3.getText();
        String B3Text = B3.getText();
        String C3Text = C3.getText();

        if (A1Text.equals("cross") && A2Text.equals("cross") && A3Text.equals("cross")) {
            return true;
        }
        if (B1Text.equals("cross") && B2Text.equals("cross") && B3Text.equals("cross")) {
            return true;
        }
        if (C1Text.equals("cross") && C2Text.equals("cross") && C3Text.equals("cross")) {
            return true;
        }
        if (A1Text.equals("cross") && B1Text.equals("cross") && C1Text.equals("cross")) {
            return true;
        }
        if (A2Text.equals("cross") && B2Text.equals("cross") && C2Text.equals("cross")) {
            return true;
        }
        if (A3Text.equals("cross") && B3Text.equals("cross") && C3Text.equals("cross")) {
            return true;
        }
        if (A1Text.equals("cross") && B2Text.equals("cross") && C3Text.equals("cross")) {
            return true;
        }
        return A3Text.equals("cross") && B2Text.equals("cross") && C1Text.equals("cross");
    }

    private boolean computerWinCondition() {
        String A1Text = A1.getText();
        String B1Text = B1.getText();
        String C1Text = C1.getText();
        String A2Text = A2.getText();
        String B2Text = B2.getText();
        String C2Text = C2.getText();
        String A3Text = A3.getText();
        String B3Text = B3.getText();
        String C3Text = C3.getText();
        if (A1Text.equals("circle") && A2Text.equals("circle") && A3Text.equals("circle")) {
            return true;
        }
        if (B1Text.equals("circle") && B2Text.equals("circle") && B3Text.equals("circle")) {
            return true;
        }
        if (C1Text.equals("circle") && C2Text.equals("circle") && C3Text.equals("circle")) {
            return true;
        }
        if (A1Text.equals("circle") && B1Text.equals("circle") && C1Text.equals("circle")) {
            return true;
        }
        if (A2Text.equals("circle") && B2Text.equals("circle") && C2Text.equals("circle")) {
            return true;
        }
        if (A3Text.equals("circle") && B3Text.equals("circle") && C3Text.equals("circle")) {
            return true;
        }
        if (A1Text.equals("circle") && B2Text.equals("circle") && C3Text.equals("circle")) {
            return true;
        }
        return A3Text.equals("circle") && B2Text.equals("circle") && C1Text.equals("circle");
    }

    public void checker() {
        if (playerWinCondition()) {
            gameScoreLabel.setText("You've won! Congratulations!");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (computerWinCondition()) {
            gameScoreLabel.setText("You've lost! Better luck next time!");
            for (JButton button : buttons) {
                button.setEnabled(false);
            }
        } else if (playerWinCondition() == false && computerWinCondition() == false && A1.isEnabled() == false && A2.isEnabled() == false && A3.isEnabled() == false && C1.isEnabled() == false && C2.isEnabled() == false && C3.isEnabled() == false && B1.isEnabled() == false && B2.isEnabled() == false && B3.isEnabled() == false) {
            gameScoreLabel.setText("It's a draw! Better luck next time!");
        }
    }

}
