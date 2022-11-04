/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apriori;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author pc
 */
public class JFrameApriori extends javax.swing.JFrame {

    /**
     * Creates new form JFrameApriori
     */
    public JFrameApriori() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Séparateur = new javax.swing.JTextField();
        SupportMin = new javax.swing.JTextField();
        ConfianceMin = new javax.swing.JTextField();
        Affichage1 = new javax.swing.JButton();
        Affichage2 = new javax.swing.JButton();
        Affichage3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jAffichage1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jAffichage3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jAffichage2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jAffichage4 = new javax.swing.JTextArea();
        Affichage4 = new javax.swing.JButton();
        Affichage5 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jAffichage5 = new javax.swing.JTextArea();
        NomFichier = new javax.swing.JTextField();
        OpenFile = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Les règles d'association, implémentataion de l'algorithme Apriori ");

        jLabel1.setText(" Séparateur");

        jLabel2.setText("Support minimum");

        jLabel3.setText("Confiance minimal en (%)");

        Séparateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SéparateurActionPerformed(evt);
            }
        });

        SupportMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupportMinActionPerformed(evt);
            }
        });

        ConfianceMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfianceMinActionPerformed(evt);
            }
        });

        Affichage1.setText("Les transactions");
        Affichage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affichage1ActionPerformed(evt);
            }
        });

        Affichage2.setText("Les articles uniques");
        Affichage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affichage2ActionPerformed(evt);
            }
        });

        Affichage3.setText("Les ensembles des élèments fréquents (FI)");
        Affichage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affichage3ActionPerformed(evt);
            }
        });

        jAffichage1.setColumns(20);
        jAffichage1.setRows(5);
        jScrollPane1.setViewportView(jAffichage1);

        jAffichage3.setColumns(20);
        jAffichage3.setRows(5);
        jScrollPane2.setViewportView(jAffichage3);

        jAffichage2.setColumns(20);
        jAffichage2.setRows(5);
        jScrollPane3.setViewportView(jAffichage2);

        jAffichage4.setColumns(20);
        jAffichage4.setRows(5);
        jScrollPane4.setViewportView(jAffichage4);

        Affichage4.setText("Nbrs d'article/transaction,Supp et conf min");
        Affichage4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affichage4ActionPerformed(evt);
            }
        });

        Affichage5.setText("Générer les règles d'association");
        Affichage5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Affichage5ActionPerformed(evt);
            }
        });

        jAffichage5.setColumns(20);
        jAffichage5.setRows(5);
        jScrollPane5.setViewportView(jAffichage5);

        OpenFile.setText("Ouvrir un fichier");
        OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(OpenFile)
                        .addGap(18, 18, 18)
                        .addComponent(NomFichier, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Séparateur, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SupportMin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(ConfianceMin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Affichage2)
                                    .addComponent(Affichage5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Affichage4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Affichage3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(313, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Affichage1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomFichier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OpenFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfianceMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupportMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Séparateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(Affichage1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Affichage2)
                    .addComponent(Affichage4)
                    .addComponent(Affichage3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Affichage5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SupportMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupportMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SupportMinActionPerformed

    private void ConfianceMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfianceMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfianceMinActionPerformed
   
    //traitement du bouton les transactions
    private void Affichage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affichage1ActionPerformed
        try {
            List <String> transactions= new ArrayList<>();
            List <Transaction> DataSet ;
            String nameFile = NomFichier.getText();
            String Sép = Séparateur.getText();
            String Supp = SupportMin.getText();
            int minimumSupport = Integer.parseInt(Supp);
            String Conf = ConfianceMin.getText();
            double minimumConfiance = Integer.parseInt(Conf);
            minimumConfiance = minimumConfiance/100;
            File f = new File(nameFile);
            
            DataSet = Transaction.transformerfichier(f);
            List<String> affichage1= new ArrayList();
            affichage1.add("L'ensemble des transactions est :\n");
            affichage1.add("\n");
            for (Transaction transaction : DataSet) {
                affichage1.add("Transaction " + transaction.id + ": " + transaction.Item);
                affichage1.add("\n");
            }
            String aff1= affichage1.toString();
            jAffichage1.setText(aff1);
            
            for (Transaction transaction : DataSet) {
                transactions.add(transaction.Item);
            }
            int noOfTransactions=transactions.size();
            List <String> itemSet = Transaction.uniqueItems(Sép, noOfTransactions, transactions);
            FrequentItem.firstFrequentItemSet(itemSet,noOfTransactions,transactions,minimumSupport);
            FrequentItem.aprioriStart(noOfTransactions,transactions,minimumSupport,minimumConfiance);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameApriori.class.getName()).log(Level.SEVERE, null, ex);
        }


        
    }//GEN-LAST:event_Affichage1ActionPerformed

    //traitement du bouton les articles uniques
    private void Affichage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affichage2ActionPerformed
        try{    
            List <String> transactions= new ArrayList<>();
            List <Transaction> DataSet ;
            String nameFile = NomFichier.getText();
            String Sép = Séparateur.getText();
            String Supp = SupportMin.getText();
            int minimumSupport = Integer.parseInt(Supp);
            String Conf = ConfianceMin.getText();
            double minimumConfiance = Integer.parseInt(Conf);
            minimumConfiance = minimumConfiance/100;
            File f = new File(nameFile);
            
            DataSet = Transaction.transformerfichier(f);
            
             for (Transaction transaction : DataSet) {
            transactions.add(transaction.Item);
              }
       
            int noOfTransactions=transactions.size();
            
            List <String> itemSet =  Transaction.uniqueItems(Sép, noOfTransactions, transactions);
            String aff2 = itemSet.toString();
            jAffichage2.setText(aff2);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameApriori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Affichage2ActionPerformed

    //traitement du bouton les ensembles des éléments fréquents (FI)
    private void Affichage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affichage3ActionPerformed
        try{    
            List <String> transactions= new ArrayList<>();
            List <Transaction> DataSet ;
            String nameFile = NomFichier.getText();
            String Sép = Séparateur.getText();
            String Supp = SupportMin.getText();
            int minimumSupport = Integer.parseInt(Supp);
            String Conf = ConfianceMin.getText();
            double minimumConfiance = Integer.parseInt(Conf);
            minimumConfiance = minimumConfiance/100;
            File f = new File(nameFile);
            
            DataSet = Transaction.transformerfichier(f);
            for (Transaction transaction : DataSet) {
            transactions.add(transaction.Item);
              }
       
            int noOfTransactions=transactions.size();
            List <String> itemSet = Transaction.uniqueItems(Sép, noOfTransactions, transactions);
           
            List<String> aff3 = FrequentItem.firstFrequentItemSet(itemSet,noOfTransactions,transactions,minimumSupport);
            List<String> aff33 = FrequentItem.AllFrequentItem(noOfTransactions,transactions,minimumSupport);
            String Aff33 = aff33.toString();
            aff3.add(Aff33);
            String Aff3 = aff3.toString();
            jAffichage3.setText(Aff3);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameApriori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Affichage3ActionPerformed

    private void SéparateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SéparateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SéparateurActionPerformed

    //traitement du bouton Nbrs article/transaction...
    private void Affichage4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affichage4ActionPerformed
        try{    
            List <String> transactions= new ArrayList<>();
            List <Transaction> DataSet ;
            String nameFile = NomFichier.getText();
            String Sép = Séparateur.getText();
            String Supp = SupportMin.getText();
            int minimumSupport = Integer.parseInt(Supp);
            String Conf = ConfianceMin.getText();
            double minimumConfiance = Integer.parseInt(Conf);
            minimumConfiance = minimumConfiance/100;
            File f = new File(nameFile);
            
            DataSet = Transaction.transformerfichier(f);
            
             for (Transaction transaction : DataSet) {
            transactions.add(transaction.Item);
              }
       
            int noOfTransactions=transactions.size();
            
            List <String> Rés = Transaction.InforTransactions(Sép, noOfTransactions, transactions, minimumSupport, minimumConfiance);
            String aff2 = Rés.toString();
            jAffichage4.setText(aff2);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameApriori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Affichage4ActionPerformed

    //traitement du bouton Générer les règles d'association
    private void Affichage5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Affichage5ActionPerformed
        try{    
            List <String> transactions= new ArrayList<>();
            List <Transaction> DataSet ;
            String nameFile = NomFichier.getText();
            String Sép = Séparateur.getText();
            String Supp = SupportMin.getText();
            int minimumSupport = Integer.parseInt(Supp);
            String Conf = ConfianceMin.getText();
            double minimumConfiance = Integer.parseInt(Conf);
            minimumConfiance = minimumConfiance/100;
            File f = new File(nameFile);
            
            DataSet = Transaction.transformerfichier(f);
            for (Transaction transaction : DataSet) {
            transactions.add(transaction.Item);
              }
       
            int noOfTransactions=transactions.size();
            List <String> itemSet = Transaction.uniqueItems(Sép, noOfTransactions, transactions);
            FrequentItem.firstFrequentItemSet(itemSet,noOfTransactions,transactions,minimumSupport);
            List<String> aff5 = FrequentItem.aprioriStart(noOfTransactions,transactions,minimumSupport,minimumConfiance);
            String Aff5 = aff5.toString();
            jAffichage5.setText(Aff5);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(JFrameApriori.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Affichage5ActionPerformed

    //traitement du bouton ouvrir fichier
    private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed
        JFileChooser file_choose = new JFileChooser();
        file_choose.showOpenDialog(null);
        File file = file_choose.getSelectedFile();
       String path_file = file.getAbsolutePath();
        NomFichier.setText(path_file);
    }//GEN-LAST:event_OpenFileActionPerformed

   
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
            java.util.logging.Logger.getLogger(JFrameApriori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameApriori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameApriori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameApriori.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameApriori().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Affichage1;
    private javax.swing.JButton Affichage2;
    private javax.swing.JButton Affichage3;
    private javax.swing.JButton Affichage4;
    private javax.swing.JButton Affichage5;
    private javax.swing.JTextField ConfianceMin;
    private javax.swing.JTextField NomFichier;
    private javax.swing.JButton OpenFile;
    private javax.swing.JTextField SupportMin;
    private javax.swing.JTextField Séparateur;
    private javax.swing.JTextArea jAffichage1;
    private javax.swing.JTextArea jAffichage2;
    private javax.swing.JTextArea jAffichage3;
    private javax.swing.JTextArea jAffichage4;
    private javax.swing.JTextArea jAffichage5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
