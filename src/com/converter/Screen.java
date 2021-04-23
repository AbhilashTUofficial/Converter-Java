package com.converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame implements ActionListener {

    JTabbedPane tabs = new JTabbedPane();

    // JPanels
    JPanel tempConvertor = new JPanel();
    JPanel weightConvertor = new JPanel();
    JPanel distanceConvertor = new JPanel();
    JPanel currencyConvertor = new JPanel();
    JPanel digitalStorageConvertor = new JPanel();

    // Fonts
    Font font1 = new Font("Arial", Font.BOLD, 20);
    Font font2 = new Font("Arial", Font.BOLD, 16);


    // tempConverter
    JTextField inputTemp = new JTextField("0");
    JTextField outputTemp = new JTextField();
    String[] tempUnits = {"°K", "°C", "°F"};
    JComboBox inputTempUnit = new JComboBox(tempUnits);
    JComboBox outputTempUnit = new JComboBox(tempUnits);
    JButton convertTempBtn = new JButton();

    // weightConverter
    JTextField inputWeight = new JTextField("0");
    JTextField outputWeight = new JTextField();
    String[] weightUnits = {"kg", "gm", "lb"};
    JComboBox inputWeightUnit = new JComboBox(weightUnits);
    JComboBox outputWeightUnit = new JComboBox(weightUnits);
    JButton convertWeightBtn = new JButton();

    // distanceConverter
    JButton convertDistanceBtn = new JButton();
    JTextField inputDistance = new JTextField("0");
    JTextField outputDistance = new JTextField();
    String[] distanceUnits = {"Km", "m", "ft", "mi", "cm"};
    JComboBox inputDistanceUnit = new JComboBox(distanceUnits);
    JComboBox outputDistanceUnit = new JComboBox(distanceUnits);

    // currencyConverter
    JButton convertCurrencyBtn = new JButton();
    JTextField inputCurrency = new JTextField("0");
    JTextField outputCurrency = new JTextField();
    String[] currencyUnits = {"EUR", "GBP", "USD", "INR"};
    JComboBox inputCurrencyUnit = new JComboBox(currencyUnits);
    JComboBox outputCurrencyUnit = new JComboBox(currencyUnits);

    // Digital storage
    JButton convertDigitalStorageBtn = new JButton();
    JTextField inputDigitalStorage = new JTextField("0");
    JTextField outputDigitalStorage = new JTextField();
    String[] digitalStorageUnits = {"KB", "MB", "GB", "TB"};
    JComboBox inputDigitalStorageUnit = new JComboBox(digitalStorageUnits);
    JComboBox outputDigitalStorageUnit = new JComboBox(digitalStorageUnits);

    Screen() {
        // Window setups
        setBounds(200, 100, 500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setTitle("Converter");
        setResizable(false);
        setBackground(Color.DARK_GRAY);
        add(BorderLayout.CENTER, tabs);

        tabs.addTab("  Temperature  ", tempConvertor());
        tabs.addTab("  Weight  ", weightConvertor());
        tabs.addTab("  Distance  ", distanceConvertor());
        tabs.addTab("  Currency  ", currencyConvertor());
        tabs.addTab("  Digital  ", digitalStorageConvertor());

        setVisible(true);
    }

    public JPanel tempConvertor() {

        JLabel heading = new JLabel();

        tempConvertor.setBackground(Color.darkGray);
        tempConvertor.setForeground(Color.white);
        tempConvertor.setLayout(null);

        heading.setText("Temperature Converter");
        heading.setBounds(140, 10, 300, 30);
        heading.setForeground(Color.white);
        heading.setFont(font1);

        inputTemp.setBounds(50, 80, 70, 40);
        inputTemp.setFont(font2);
        inputTemp.setHorizontalAlignment(JTextField.CENTER);

        inputTempUnit.setBounds(120, 80, 60, 40);
        outputTempUnit.setBounds(375, 80, 60, 40);

        outputTemp.setBounds(305, 80, 70, 40);
        outputTemp.setFont(font2);
        outputTemp.setEditable(false);
        outputTemp.setHorizontalAlignment(JTextField.CENTER);

        convertTempBtn.setText("CONVERT");
        convertTempBtn.setBounds(190, 160, 100, 40);
        convertTempBtn.setFocusable(false);
        convertTempBtn.addActionListener(this);

        tempConvertor.add(heading);
        tempConvertor.add(inputTemp);
        tempConvertor.add(inputTempUnit);
        tempConvertor.add(outputTempUnit);
        tempConvertor.add(outputTemp);
        tempConvertor.add(convertTempBtn);

        return tempConvertor;
    }

    public JPanel weightConvertor() {
        JLabel heading = new JLabel();

        weightConvertor.setBackground(Color.darkGray);
        weightConvertor.setForeground(Color.white);
        weightConvertor.setLayout(null);

        heading.setText("Weight Converter");
        heading.setBounds(160, 10, 300, 30);
        heading.setForeground(Color.white);
        heading.setFont(font1);

        inputWeight.setBounds(50, 80, 70, 40);
        inputWeight.setFont(font2);
        inputWeight.setHorizontalAlignment(JTextField.CENTER);

        inputWeightUnit.setBounds(120, 80, 60, 40);
        outputWeightUnit.setBounds(375, 80, 60, 40);

        outputWeight.setBounds(305, 80, 70, 40);
        outputWeight.setFont(font2);
        outputWeight.setEditable(false);
        outputWeight.setHorizontalAlignment(JTextField.CENTER);

        convertWeightBtn.setText("CONVERT");
        convertWeightBtn.setBounds(190, 160, 100, 40);
        convertWeightBtn.setFocusable(false);
        convertWeightBtn.addActionListener(this);

        weightConvertor.add(heading);
        weightConvertor.add(inputWeight);
        weightConvertor.add(inputWeightUnit);
        weightConvertor.add(outputWeight);
        weightConvertor.add(outputWeightUnit);
        weightConvertor.add(convertWeightBtn);

        return weightConvertor;
    }

    public JPanel distanceConvertor() {
        JLabel heading = new JLabel();

        distanceConvertor.setBackground(Color.darkGray);
        distanceConvertor.setForeground(Color.white);
        distanceConvertor.setLayout(null);

        heading.setText("Distance Converter");
        heading.setBounds(160, 10, 300, 30);
        heading.setForeground(Color.white);
        heading.setFont(font1);

        inputDistance.setBounds(50, 80, 70, 40);
        inputDistance.setFont(font2);
        inputDistance.setHorizontalAlignment(JTextField.CENTER);

        inputDistanceUnit.setBounds(120, 80, 60, 40);
        outputDistanceUnit.setBounds(375, 80, 60, 40);

        outputDistance.setBounds(305, 80, 70, 40);
        outputDistance.setFont(font2);
        outputDistance.setEditable(false);
        outputDistance.setHorizontalAlignment(JTextField.CENTER);

        convertDistanceBtn.setText("CONVERT");
        convertDistanceBtn.setBounds(190, 160, 100, 40);
        convertDistanceBtn.setFocusable(false);
        convertDistanceBtn.addActionListener(this);

        distanceConvertor.add(heading);
        distanceConvertor.add(inputDistance);
        distanceConvertor.add(inputDistanceUnit);
        distanceConvertor.add(outputDistance);
        distanceConvertor.add(outputDistanceUnit);
        distanceConvertor.add(convertDistanceBtn);

        return distanceConvertor;
    }

    public JPanel currencyConvertor() {
        JLabel heading = new JLabel();

        currencyConvertor.setBackground(Color.darkGray);
        currencyConvertor.setForeground(Color.white);
        currencyConvertor.setLayout(null);

        heading.setText("Currency Converter");
        heading.setBounds(160, 10, 300, 30);
        heading.setForeground(Color.white);
        heading.setFont(font1);

        inputCurrency.setBounds(50, 80, 70, 40);
        inputCurrency.setFont(font2);
        inputCurrency.setHorizontalAlignment(JTextField.CENTER);

        inputCurrencyUnit.setBounds(120, 80, 60, 40);
        outputCurrencyUnit.setBounds(375, 80, 60, 40);

        outputCurrency.setBounds(305, 80, 70, 40);
        outputCurrency.setFont(font2);
        outputCurrency.setEditable(false);
        outputCurrency.setHorizontalAlignment(JTextField.CENTER);

        convertCurrencyBtn.setText("CONVERT");
        convertCurrencyBtn.setBounds(190, 160, 100, 40);
        convertCurrencyBtn.setFocusable(false);
        convertCurrencyBtn.addActionListener(this);

        currencyConvertor.add(heading);
        currencyConvertor.add(inputCurrency);
        currencyConvertor.add(inputCurrencyUnit);
        currencyConvertor.add(outputCurrency);
        currencyConvertor.add(outputCurrencyUnit);
        currencyConvertor.add(convertCurrencyBtn);

        return currencyConvertor;
    }

    public JPanel digitalStorageConvertor() {
        JLabel heading = new JLabel();

        digitalStorageConvertor.setBackground(Color.darkGray);
        digitalStorageConvertor.setForeground(Color.white);
        digitalStorageConvertor.setLayout(null);

        heading.setText("Data Converter");
        heading.setBounds(170, 10, 300, 30);
        heading.setForeground(Color.white);
        heading.setFont(font1);

        inputDigitalStorage.setBounds(50, 80, 70, 40);
        inputDigitalStorage.setFont(font2);
        inputDigitalStorage.setHorizontalAlignment(JTextField.CENTER);

        inputDigitalStorageUnit.setBounds(120, 80, 60, 40);
        outputDigitalStorageUnit.setBounds(375, 80, 60, 40);

        outputDigitalStorage.setBounds(305, 80, 70, 40);
        outputDigitalStorage.setFont(font2);
        outputDigitalStorage.setEditable(false);
        outputDigitalStorage.setHorizontalAlignment(JTextField.CENTER);

        convertDigitalStorageBtn.setText("CONVERT");
        convertDigitalStorageBtn.setBounds(190, 160, 100, 40);
        convertDigitalStorageBtn.setFocusable(false);
        convertDigitalStorageBtn.addActionListener(this);

        digitalStorageConvertor.add(heading);
        digitalStorageConvertor.add(inputDigitalStorage);
        digitalStorageConvertor.add(inputDigitalStorageUnit);
        digitalStorageConvertor.add(outputDigitalStorage);
        digitalStorageConvertor.add(outputDigitalStorageUnit);
        digitalStorageConvertor.add(convertDigitalStorageBtn);

        return digitalStorageConvertor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Functions obj = new Functions();
        if (e.getSource() == convertTempBtn) {
            Double inputValue = Double.parseDouble(inputTemp.getText());
            String inputUnit = (String) inputTempUnit.getSelectedItem();
            String outputUnit = (String) outputTempUnit.getSelectedItem();

            String[] result = new String[2];

            assert inputUnit != null;
            result = obj.tempConvert(inputValue, inputUnit, outputUnit);
            outputTemp.setText(String.valueOf(result[0]));

        }
        if (e.getSource() == convertWeightBtn) {
            Double inputValue = Double.parseDouble(inputWeight.getText());
            String inputUnit = (String) inputWeightUnit.getSelectedItem();
            String outputUnit = (String) outputWeightUnit.getSelectedItem();

            String[] result = new String[2];

            assert inputUnit != null;
            result = obj.weightConvert(inputValue, inputUnit, outputUnit);
            outputWeight.setText(String.valueOf(result[0]));
        }
        if (e.getSource() == convertDistanceBtn) {
            Double inputValue = Double.parseDouble(inputDistance.getText());
            String inputUnit = (String) inputDistanceUnit.getSelectedItem();
            String outputUnit = (String) outputDistanceUnit.getSelectedItem();

            String[] result = new String[2];

            assert inputUnit != null;
            result = obj.distanceConvert(inputValue, inputUnit, outputUnit);
            outputDistance.setText(String.valueOf(result[0]));
        }
        if (e.getSource() == convertCurrencyBtn) {
            Double inputValue = Double.parseDouble(inputCurrency.getText());
            String inputUnit = (String) inputCurrencyUnit.getSelectedItem();
            String outputUnit = (String) outputCurrencyUnit.getSelectedItem();

            String[] result = new String[2];

            assert inputUnit != null;
            result = obj.currencyConvert(inputValue, inputUnit, outputUnit);
            outputCurrency.setText(String.valueOf(result[0]));
        }
        if (e.getSource() == convertDigitalStorageBtn) {
            Double inputValue = Double.parseDouble(inputDigitalStorage.getText());
            String inputUnit = (String) inputDigitalStorageUnit.getSelectedItem();
            String outputUnit = (String) outputDigitalStorageUnit.getSelectedItem();

            String[] result = new String[2];

            assert inputUnit != null;
            result = obj.digitalStorageConvert(inputValue, inputUnit, outputUnit);
            outputDigitalStorage.setText(String.valueOf(result[0]));
        }
    }
}
