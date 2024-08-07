/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.systembakery;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import ec.edu.espe.systembakery.model.Bills;
import ec.edu.espe.systembakery.model.Consumer;
import ec.edu.espe.systembakery.model.Product;
import ec.edu.espe.utils.BsonDownloadDocument;
import ec.edu.espe.utils.Methods;
import ec.edu.espe.utils.Conection;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

/**
 *
 * @author CodeCrafting Engineers
 */
public class FrmCreateBillConsumer extends javax.swing.JFrame implements Printable {

 
    private static MongoDatabase database;
    private DefaultTableModel dtmProductList;
    private String[] productPurchaseList = new String[5];
    private MongoCollection productCollection;
    private MongoCollection consumerCollection;
    private MongoCollection billCollection;
    private ArrayList<Consumer> consumers = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private Bills consumerBill = new Bills();
    
    public FrmCreateBillConsumer(MongoDatabase database) {
        initComponents();
        this.database = database;
        InitializeDatabase(this.database);
    }
    
    public void InitializeDatabase(MongoDatabase database){
        dtmProductList = (DefaultTableModel) tblProductList.getModel();
        
        consumerCollection = BsonDownloadDocument.ObtainCollection(database,"Products");
        productCollection = BsonDownloadDocument.ObtainCollection(database, "Consumers");
        billCollection = BsonDownloadDocument.ObtainCollection(database, "Bills");
        
        Methods.ComboBoxInsertItems(consumerCollection, "Nombres", cmbConsumerName);
        Methods.ComboBoxInsertItems(productCollection, "Id", "Nombre", cmbProductId);
        btnEditProductList.setVisible(false);
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblPurchaseOrderNumber = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtOrderDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRucCi = new javax.swing.JTextField();
        cmbConsumerName = new javax.swing.JComboBox<>();
        lblErrorConsumer = new javax.swing.JLabel();
        lblErrorCI = new javax.swing.JLabel();
        lblErrorEmitionDate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProductAmount = new javax.swing.JTextField();
        cmbProductId = new javax.swing.JComboBox<>();
        btnEditProductList = new javax.swing.JButton();
        btnDeleteProductInTheList = new javax.swing.JButton();
        lblErrorProductAmount = new javax.swing.JLabel();
        lblErrorProductId = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnEnterToOrderList = new javax.swing.JButton();
        btnPrintBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));
        jPanel6.setPreferredSize(new java.awt.Dimension(780, 372));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Panadería: El Trigo de Oro");

        jLabel2.setText("RTN: 00121-00");

        jLabel11.setText("FACTURA:");

        lblPurchaseOrderNumber.setText("No. 000-000-000000000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPurchaseOrderNumber)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(lblPurchaseOrderNumber))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel3.setText("Cliente:");

        jLabel4.setText("Fecha de Emisión:");

        txtOrderDate.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setText("RUC / CI:");

        txtRucCi.setBackground(new java.awt.Color(204, 204, 204));

        cmbConsumerName.setBackground(new java.awt.Color(204, 204, 204));
        cmbConsumerName.setEditable(true);
        cmbConsumerName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        lblErrorConsumer.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorCI.setForeground(new java.awt.Color(255, 0, 0));

        lblErrorEmitionDate.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbConsumerName, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorConsumer, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRucCi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrorCI, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrderDate))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblErrorEmitionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblErrorConsumer, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                    .addComponent(lblErrorEmitionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblErrorCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbConsumerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRucCi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel7.setText("Id:");

        jLabel8.setText("Cantidad:");

        txtProductAmount.setBackground(new java.awt.Color(204, 204, 204));

        cmbProductId.setBackground(new java.awt.Color(204, 204, 204));
        cmbProductId.setEditable(true);
        cmbProductId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        btnEditProductList.setBackground(new java.awt.Color(255, 204, 153));
        btnEditProductList.setText("Editar Lista");
        btnEditProductList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductListActionPerformed(evt);
            }
        });

        btnDeleteProductInTheList.setBackground(new java.awt.Color(255, 204, 153));
        btnDeleteProductInTheList.setText("Borrar Producto Seleccionado");
        btnDeleteProductInTheList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductInTheListActionPerformed(evt);
            }
        });

        lblErrorProductAmount.setForeground(new java.awt.Color(255, 0, 51));

        lblErrorProductId.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtProductAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnDeleteProductInTheList)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnEditProductList)))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblErrorProductId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblErrorProductAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblErrorProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorProductAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtProductAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEditProductList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteProductInTheList)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        tblProductList.setBackground(new java.awt.Color(155, 155, 124));
        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Artículo", "Cantidad", "Precio U.", "Precio Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProductList);

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));

        btnEnterToOrderList.setBackground(new java.awt.Color(255, 204, 153));
        btnEnterToOrderList.setText("Ingresar a la Lista de Compras");
        btnEnterToOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterToOrderListActionPerformed(evt);
            }
        });

        btnPrintBill.setBackground(new java.awt.Color(255, 204, 153));
        btnPrintBill.setText("Imprimir");
        btnPrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnEnterToOrderList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrintBill)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnterToOrderList)
                    .addComponent(btnPrintBill))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterToOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterToOrderListActionPerformed
        boolean verificationConsumerName, verificationRucCi, verificationEmitionDate, verificationProductId, verificationProductAmount;
        String firstPartCmbProductId;
        
        verificationConsumerName = cmbConsumerName.getSelectedItem().toString().matches("^[A-Z][a-z]+ [A-Z][a-z]+$");
        verificationRucCi = txtRucCi.getText().matches("^\\d{10}$");
        verificationEmitionDate = true;
        //split and take the first of cmbProductId
        firstPartCmbProductId = cmbProductId.getSelectedItem().toString().split(" --> ")[0];
        verificationProductId = firstPartCmbProductId.matches("^[A-Z]\\d{3}$");
        verificationProductAmount = txtProductAmount.getText().matches("^\\d{1,2}$");
        
        try {

            if (verificationConsumerName && verificationRucCi && verificationEmitionDate && verificationProductId && verificationProductAmount) {
                lblErrorConsumer.setText("");
                lblErrorCI.setText("");
                lblErrorEmitionDate.setText("");
                lblErrorProductId.setText("");
                lblErrorProductAmount.setText("");
                Methods.addElemenToTable(getDatabase(), productCollection, firstPartCmbProductId, txtProductAmount, productPurchaseList, dtmProductList);
            } else {
                if(!verificationConsumerName){
                    lblErrorConsumer.setText("Elija un cliente de la lista");
                    cmbConsumerName.requestFocus();
                }
                if(!verificationRucCi){
                    lblErrorCI.setText("Escriba correctamente el C.I.");
                    txtRucCi.requestFocus();
                }
                if(!verificationEmitionDate){
                    lblErrorEmitionDate.setText("Ingrese una fecha correcta");
                    txtOrderDate.requestFocus();
                }
                if(!verificationProductId){
                    lblErrorProductId.setText("Elija una opción no vacía de la lista");
                    cmbProductId.requestFocus();
                }
                if(!verificationProductAmount){
                    lblErrorProductAmount.setText("Debe ser menos de 99 objetos");
                    txtProductAmount.requestFocus();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
    }//GEN-LAST:event_btnEnterToOrderListActionPerformed

    private void btnPrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintBillActionPerformed
        try {
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPrintable(this);
            boolean top = printerJob.printDialog();
            if(top){
                printerJob.print();
            }
            
            txtOrderDate.setText("");
            txtProductAmount.setText("");
            txtRucCi.setText("");
            cmbConsumerName.setSelectedIndex(0);
            cmbProductId.setSelectedIndex(0);
            dtmProductList.getDataVector().removeAllElements();
            tblProductList.updateUI();
            
            
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Error de Impresión","Error: \n" + e,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnPrintBillActionPerformed

    private void btnDeleteProductInTheListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductInTheListActionPerformed
        if(tblProductList.getSelectedRow() != -1)
            dtmProductList.removeRow(tblProductList.getSelectedRow());
    }//GEN-LAST:event_btnDeleteProductInTheListActionPerformed

    private void btnEditProductListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductListActionPerformed
        
        
        
    }//GEN-LAST:event_btnEditProductListActionPerformed

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
            java.util.logging.Logger.getLogger(FrmCreateBillConsumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCreateBillConsumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCreateBillConsumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCreateBillConsumer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new FrmCreateBillConsumer(database).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteProductInTheList;
    private javax.swing.JButton btnEditProductList;
    private javax.swing.JButton btnEnterToOrderList;
    private javax.swing.JButton btnPrintBill;
    private javax.swing.JComboBox<String> cmbConsumerName;
    private javax.swing.JComboBox<String> cmbProductId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorCI;
    private javax.swing.JLabel lblErrorConsumer;
    private javax.swing.JLabel lblErrorEmitionDate;
    private javax.swing.JLabel lblErrorProductAmount;
    private javax.swing.JLabel lblErrorProductId;
    private javax.swing.JLabel lblPurchaseOrderNumber;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTextField txtOrderDate;
    private javax.swing.JTextField txtProductAmount;
    private javax.swing.JTextField txtRucCi;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D gd = (Graphics2D)graphics;
        gd.translate(pageFormat.getImageableX() + 30, pageFormat.getImageableY() + 30);
        gd.scale(1.0, 1.0);
        
        jPanel3.printAll(graphics);
        return PAGE_EXISTS;
    }

    

    /**
     * @return the products
     */
    public ArrayList<Product> getProducts() {
        return products;
    }

    /**
     * @param products the products to set
     */
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /**
     * @return the consumerBill
     */
    public Bills getConsumerBill() {
        return consumerBill;
    }

    /**
     * @param consumerBill the consumerBill to set
     */
    public void setConsumerBill(Bills consumerBill) {
        this.consumerBill = consumerBill;
    }

    /**
     * @return the consumers
     */
    public ArrayList<Consumer> getConsumers() {
        return consumers;
    }

    /**
     * @param consumers the consumers to set
     */
    public void setConsumers(ArrayList<Consumer> consumers) {
        this.consumers = consumers;
    }

    /**
     * @return the database
     */
    public MongoDatabase getDatabase() {
        return database;
    }

    /**
     * @param database the database to set
     */
    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }
}
