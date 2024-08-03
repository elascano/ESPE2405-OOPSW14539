/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.stores_exam2.view;

import ec.edu.espe.stores_exam2.controller.StoreDAO;
import ec.edu.espe.stores_exam2.model.Store;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Leidy Saraguro,Paradigm Pioneers Squad, DCCO-ESPE
 */
public class StoreView extends JFrame {
    // Componentes de la GUI
    private JTextField idField, nameField, locationField;
    private JSpinner revenueSpinner, numberOfEmployeesSpinner;
    private JComboBox<String> storeTypeCombo;
    private JButton addButton, updateButton, deleteButton, readAllButton, saveButton, logOutButton;
    private JTable storeTable;
    private StoreDAO model;

    public StoreView() {
        model = new StoreDAO();
        
        setTitle("Store Management System");
        setLayout(new BorderLayout());

        // Panel de entrada de datos
        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        idField = new JTextField();
        nameField = new JTextField();
        locationField = new JTextField();
        revenueSpinner = new JSpinner(new SpinnerNumberModel(0.0, 0.0, Double.MAX_VALUE, 1.0));
        numberOfEmployeesSpinner = new JSpinner(new SpinnerNumberModel(0, 0, Integer.MAX_VALUE, 1));
        storeTypeCombo = new JComboBox<>(new String[]{"Retail", "Wholesale", "Online"});

        inputPanel.add(new JLabel("id:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Location:"));
        inputPanel.add(locationField);
        inputPanel.add(new JLabel("Revenue:"));
        inputPanel.add(revenueSpinner);
        inputPanel.add(new JLabel("Number of Employees:"));
        inputPanel.add(numberOfEmployeesSpinner);
        inputPanel.add(new JLabel("Store Type:"));
        inputPanel.add(storeTypeCombo);

        // Panel de botones
        JPanel buttonPanel = new JPanel(new FlowLayout());
        addButton = new JButton("Add");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");
        readAllButton = new JButton("Read All");
        logOutButton = new JButton("Log Out");

        buttonPanel.add(addButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(readAllButton);
        buttonPanel.add(logOutButton);

        // Añadir listeners a los botones
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addStore();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateStore();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteStore();
            }
        });

        readAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                readAllStores();
            }
        });
        
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Tabla
        storeTable = new JTable(new DefaultTableModel(new Object[]{"Id", "Name", "Location", "Revenue", "Number of Employees", "Store Type"}, 0));
        JScrollPane tableScrollPane = new JScrollPane(storeTable);

        // Añadir paneles al frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);
        add(tableScrollPane, BorderLayout.SOUTH);

        // Configuraciones finales del frame
        setSize(200, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addStore() {
        String id = idField.getText();
        String name = nameField.getText();
        String location = locationField.getText();
        double revenue = (double) revenueSpinner.getValue();
        int numberOfEmployees = (int) numberOfEmployeesSpinner.getValue();
        String storeType = (String) storeTypeCombo.getSelectedItem();

        Store store = new Store(id, name, location, revenue, numberOfEmployees, storeType);
        model.addStore(store);

        // Actualizar la tabla o realizar otras acciones necesarias
        readAllStores();
    }

    private void updateStore() {
        String id = idField.getText();
        String name = nameField.getText();
        String location = locationField.getText();
        double revenue = (double) revenueSpinner.getValue();
        int numberOfEmployees = (int) numberOfEmployeesSpinner.getValue();
        String storeType = (String) storeTypeCombo.getSelectedItem();

        Store store = new Store(id, name, location, revenue, numberOfEmployees, storeType);
        model.updateStore(store);

        // Actualizar la tabla o realizar otras acciones necesarias
        readAllStores();
    }

    private void deleteStore() {
        String id = idField.getText();
        model.deleteStore(id);

        // Actualizar la tabla o realizar otras acciones necesarias
        readAllStores();
    }

    private void readAllStores() {
        List<Store> stores = model.getAllStores();
        DefaultTableModel tableModel = (DefaultTableModel) storeTable.getModel();
        tableModel.setRowCount(0); // Limpiar la tabla

        for (Store store : stores) {
            tableModel.addRow(new Object[]{
                store.getId(),
                store.getName(),
                store.getLocation(),
                store.getRevenue(),
                store.getNumberOfEmployees(),
                store.getStoreType()
            });
        }
    }

    public static void main(String[] args) {
        new StoreView();
    }
}
