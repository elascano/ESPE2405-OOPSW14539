/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espe.bakerysystemmockup.view;

/**
 *
 * @author Damian Toscano
 */

import ec.edu.espe.SystemForBakery.model.Stock;

public class MainFrame extends javax.swing.JFrame {

    private Stock stock;

    public MainFrame() {
        stock = new Stock();
        initComponents();
    }

    private void initComponents() {
        // Inicializa componentes manualmente
        jButtonAddProduct = new javax.swing.JButton();
        jButtonCreateBill = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddProduct.setText("Añadir Producto");
        jButtonAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openAddProductFrame(evt);
            }
        });

        jButtonCreateBill.setText("Crear Factura");
        jButtonCreateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openCreateBillFrame(evt);
            }
        });

        // Layout para organizar los componentes
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().set
