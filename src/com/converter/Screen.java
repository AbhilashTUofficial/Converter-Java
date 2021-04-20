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

    // Fonts
    Font font1 = new Font("Arial", Font.BOLD, 20);
    Font font2 = new Font("Arial", Font.BOLD, 16);

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

        setVisible(true);
    }

    public JPanel tempConvertor() {

        JLabel heading = new JLabel();
        JTextField inputTemp = new JTextField();
        JTextField outputTemp = new JTextField();
        String[] units = {"  °K", "  °C", "  °F"};
        JComboBox inputTempUnit = new JComboBox(units);
        JComboBox outputTempUnit = new JComboBox(units);
        JButton convertTempBtn = new JButton();

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
        JTextField inputWeight = new JTextField();
        JTextField outputWeight = new JTextField();
        String[] units = {"  kg", "  gm", "  lb"};
        JComboBox inputWeightUnit = new JComboBox(units);
        JComboBox outputWeightUnit = new JComboBox(units);
        JButton convertWeightBtn = new JButton();

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
        JButton convertDistanceBtn = new JButton();
        JTextField inputDistance = new JTextField();
        JTextField outputDistance = new JTextField();
        String[] units = {"  Km", "  m", "  ft", "  mi", "  Cm", "  ly"};
        JComboBox inputDistanceUnit = new JComboBox(units);
        JComboBox outputDistanceUnit = new JComboBox(units);


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
        JButton convertCurrencyBtn = new JButton();
        JTextField inputCurrency = new JTextField();
        JTextField outputCurrency = new JTextField();
        String[] units = {"EUR", "GBP", "USD", "INR"};
        JComboBox inputCurrencyUnit = new JComboBox(units);
        JComboBox outputCurrencyUnit = new JComboBox(units);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == tempConvertor) {
            // Temperature conversion
        }
        if (e.getSource() == weightConvertor) {
            // Weight conversion
        }
        if (e.getSource() == distanceConvertor) {
            // Distance conversion
        }
        if (e.getSource() == currencyConvertor) {
            // Currency conversion
        }
    }
}
