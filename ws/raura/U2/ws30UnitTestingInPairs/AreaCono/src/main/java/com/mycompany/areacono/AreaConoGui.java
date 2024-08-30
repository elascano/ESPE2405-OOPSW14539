package com.mycompany.areacono;

import ec.edu.espe.areacono.model.Cono;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GUI for calculating the area of a cone and saving the data to MongoDB.
 * Author: Andrea Raura, Paradigm Pioneers Squad, DCCO-ESPE
 */
public class AreaConoGui extends JFrame {
    private JTextField txtRadio;
    private JTextField txtAltura;
    private JTextField txtResultado;
    private JButton btnCalcular;

    public AreaConoGui() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Cálculo de Área de un Cono");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        JLabel lblRadio = new JLabel("Radio:");
        txtRadio = new JTextField();
        JLabel lblAltura = new JLabel("Altura:");
        txtAltura = new JTextField();
        JLabel lblResultado = new JLabel("Área Total:");
        txtResultado = new JTextField();
        txtResultado.setEditable(false);
        btnCalcular = new JButton("Calcular");

        add(lblRadio);
        add(txtRadio);
        add(lblAltura);
        add(txtAltura);
        add(lblResultado);
        add(txtResultado);
        add(new JLabel()); // Empty cell for spacing
        add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularAreaYGuardar();
            }
        });
    }

    private void calcularAreaYGuardar() {
        try {
            double radio = Double.parseDouble(txtRadio.getText());
            double altura = Double.parseDouble(txtAltura.getText());

            Cono cono = new Cono(radio, altura);
            double areaTotal = cono.calcularAreaTotal();

            txtResultado.setText(String.valueOf(areaTotal));

            guardarEnMongoDB(radio, altura, areaTotal);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor ingrese valores válidos para el radio y la altura.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void guardarEnMongoDB(double radio, double altura, double areaTotal) {
    String uri = "mongodb+srv://rauraandrea:rauraandrea@cluster0.izygxtz.mongodb.net/?retryWrites=true&w=majority";
    try (MongoClient mongoClient = MongoClients.create(uri)) {
        MongoDatabase database = mongoClient.getDatabase("oop");
        MongoCollection<Document> collection = database.getCollection("conos");

        Document document = new Document("radio", radio)
                .append("altura", altura)
                .append("areaTotal", areaTotal);

        collection.insertOne(document);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al conectar con la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AreaConoGui().setVisible(true);
            }
        });
    }
}
