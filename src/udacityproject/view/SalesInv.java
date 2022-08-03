/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package udacityproject.view;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import udacityproject.controller.Controller;
import udacityproject.model.Inv;
import udacityproject.model.InvModel;

/**
 *
 * @author Barry Allen
 */
public class SalesInv extends javax.swing.JFrame {

    /**
     * Creates new form SalesInv
     */
    public SalesInv() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Invtab = new javax.swing.JTable();
        Invtab.getSelectionModel().addListSelectionListener(controller);
        Invtab.setModel(getInvoicesTableModel());

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invnum = new javax.swing.JLabel();
        invdate = new javax.swing.JLabel();
        invtotal = new javax.swing.JLabel();
        custname = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        linetab = new javax.swing.JTable();
        createline = new javax.swing.JButton();
        createline.addActionListener(controller);
        createinv = new javax.swing.JButton();
        createinv.addActionListener(controller);
        DelInv = new javax.swing.JButton();
        DelInv.addActionListener(controller);
        delline = new javax.swing.JButton();
        delline.addActionListener(controller);
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadfile = new javax.swing.JMenuItem();
        loadfile.addActionListener(controller);
        Savefile = new javax.swing.JMenuItem();
        Savefile.addActionListener(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Invtab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Invtab);

        jLabel1.setText("Invoice Number");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        invnum.setText("jLabel5");

        invdate.setText("jLabel6");

        invtotal.setText("jLabel8");

        custname.setText("jLabel7");

        linetab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(linetab);

        createline.setText("Create Line");
        createline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createlineActionPerformed(evt);
            }
        });

        createinv.setText("Create Invoice");
        createinv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createinvActionPerformed(evt);
            }
        });

        DelInv.setText("Delete Invoice");
        DelInv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelInvActionPerformed(evt);
            }
        });

        delline.setText("Delete Line");
        delline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dellineActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        loadfile.setText("Load File");
        loadfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadfileActionPerformed(evt);
            }
        });
        jMenu1.add(loadfile);

        Savefile.setText("Save File");
        jMenu1.add(Savefile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invdate, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invnum, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custname, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(createinv)
                .addGap(32, 32, 32)
                .addComponent(DelInv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createline)
                .addGap(87, 87, 87)
                .addComponent(delline)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invnum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(invdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(custname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(invtotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DelInv)
                    .addComponent(createline)
                    .addComponent(createinv)
                    .addComponent(delline))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createlineActionPerformed

    private void createinvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createinvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createinvActionPerformed

    private void DelInvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelInvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DelInvActionPerformed

    private void dellineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dellineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dellineActionPerformed

    private void loadfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadfileActionPerformed

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
            java.util.logging.Logger.getLogger(SalesInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesInv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesInv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DelInv;
    private javax.swing.JTable Invtab;
    private javax.swing.JMenuItem Savefile;
    private javax.swing.JButton createinv;
    private javax.swing.JButton createline;
    private javax.swing.JLabel custname;
    private javax.swing.JButton delline;
    private javax.swing.JLabel invdate;
    private javax.swing.JLabel invnum;
    private javax.swing.JLabel invtotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable linetab;
    private javax.swing.JMenuItem loadfile;
    // End of variables declaration//GEN-END:variables


 private ArrayList<Inv> invoices;
    private final Controller controller = new Controller(this);
    private InvModel invoicesTableModel;

    public ArrayList<Inv> getInvoices() {
        if (invoices == null) invoices = new ArrayList<>();
        return invoices;
    }

    public void setInvoices(ArrayList<Inv> invoices) {
        this.invoices = invoices;
    }

    public InvModel getInvoicesTableModel() {
        if (invoicesTableModel == null) {
            invoicesTableModel = new InvModel(getInvoices());
        }
        return invoicesTableModel;
    }

    public void setInvoicesTableModel(InvModel invoicesTableModel) {
        this.invoicesTableModel = invoicesTableModel;
    }

    public JLabel getCustomerNameLabel() {
        return custname;
    }

    public JLabel getInvoiceDateLabel() {
        return invdate;
    }

    public JLabel getInvoiceNumLabel() {
        return invnum;
    }

    public JTable getInvoiceTable() {
        return Invtab;
    }

    public JLabel getInvoiceTotalLabel() {
        return invtotal;
    }

    public JTable getLineTable() {
        return linetab;
    }

    public Controller getController() {
        return controller;
    }
    
    public int getNextInvoiceNum() {
        int num = 0;
        
        for (Inv invoice : getInvoices()) {
            if (invoice.getNum() > num) 
                num = invoice.getNum();
        }
        
        return ++num;
    }










}
