/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3sw;

import java.awt.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author chauvo
 */
public class TheThao extends javax.swing.JFrame {

    /**
     * Creates new form TheThao
     */
    public TheThao() {
        initComponents();
    }
    DefaultListModel Phai = new DefaultListModel();
    DefaultListModel Trai = new DefaultListModel();
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listL = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listR = new javax.swing.JList<>();
        btnThem1 = new javax.swing.JButton();
        btnThemHet = new javax.swing.JButton();
        btnTVe1 = new javax.swing.JButton();
        btnTVeHet = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Danh sách môn thể thao");

        jLabel2.setText("Danh sách môn yêu thích");

        jScrollPane1.setViewportView(listL);

        jScrollPane2.setViewportView(listR);

        btnThem1.setText(">");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });

        btnThemHet.setText(">>");
        btnThemHet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemHetActionPerformed(evt);
            }
        });

        btnTVe1.setText("<");
        btnTVe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTVe1ActionPerformed(evt);
            }
        });

        btnTVeHet.setText("<<");
        btnTVeHet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTVeHetActionPerformed(evt);
            }
        });

        btnThem.setText("+");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTVeHet)
                            .addComponent(btnThemHet)
                            .addComponent(btnTVe1)
                            .addComponent(btnThem1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnThem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnThem1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThemHet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTVe1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTVeHet))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThem)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
        /*ListModel lsDS = listL.getModel();
        ListModel lsDSYT = listR.getModel();*/
        int[] indexs = listL.getSelectedIndices();
        for (int i = indexs.length - 1; i >= 0; i--) {
            Phai.addElement(Trai.get(indexs[i]));
            Trai.remove(indexs[i]);
        }

        
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        // ----- Danh sach chon cac mon the thao -----
        /*Object[] hopthoai ={"Cầu lông","Bóng chuyền ", "Bóng đá", "Điền kinh", "Nhảy xa", "Nhảy cao"};
        String s = (String) JOptionPane.showInputDialog(null, "Nhap mon the thao", "", JOptionPane.PLAIN_MESSAGE, null, hopthoai, null);*/
        // --- Nhập danh sách các môn thể 
        listR.setModel(Phai);
        listL.setModel(Trai);
         Trai.addElement("Bóng chuyền");
        Trai.addElement("Bóng đá");
        Trai.addElement("Bóng bay");
        String s =JOptionPane.showInputDialog( "Nhap mon the thao");
        /*String dst= JOptionPane.showInputDialog(null,"Nhap mon the thao" , null, JOptionPane.PLAIN_MESSAGE);
        ListModel DanhSach = listL.getModel();
        String [] nTen = new String [DanhSach.getSize()+1];
        int i = 0;
            for ( i = 0; i < DanhSach.getSize(); i++)
                nTen[i] = DanhSach.getElementAt(i).toString();
            //them cuoi
            nTen[i] = dst;
            // cap nhat
            listL.setListData(nTen);*/
         Trai.addElement(s);
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnThemHetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemHetActionPerformed
        // TODO add your handling code here:
        int m = Trai.getSize();
        for (int i = 0; i < m; i++) {
            Phai.addElement(Trai.get(i));
        }
            Trai.clear();
    }//GEN-LAST:event_btnThemHetActionPerformed

    private void btnTVe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVe1ActionPerformed
        // TODO add your handling code here:
        int[] indexs = listR.getSelectedIndices();
        for (int i = indexs.length - 1; i >= 0; i--) {
            Trai.addElement(Phai.get(indexs[i]));
            Phai.remove(indexs[i]);
        }
    }//GEN-LAST:event_btnTVe1ActionPerformed
    
    private void btnTVeHetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTVeHetActionPerformed
        // TODO add your handling code here:
        int n = Phai.getSize();
        for(int i = 0; i < n; i++){
           Trai.addElement(Phai.get(i));
        }
        Phai.clear();
    }//GEN-LAST:event_btnTVeHetActionPerformed

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
            java.util.logging.Logger.getLogger(TheThao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheThao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheThao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheThao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheThao().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTVe1;
    private javax.swing.JButton btnTVeHet;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnThemHet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listL;
    private javax.swing.JList<String> listR;
    // End of variables declaration//GEN-END:variables
}
