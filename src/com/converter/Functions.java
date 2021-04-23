package com.converter;

import java.util.Arrays;

public class Functions {

    public String[] tempConvert(Double inputValue, String inputUnit, String outputUnit) {
        String[] result = new String[2];
        Double outputValue = inputValue;

        switch (inputUnit) {
            case "°C":

                switch (outputUnit) {
                    case "°F":
                        outputValue = (Double) (inputValue * 9.0 / 5.0) + 32;
                        break;
                    case "°K":
                        outputValue = (Double) (inputValue + 273.15);
                        break;
                    case "°C":
                        outputValue = inputValue;
                        break;
                }
                break;

            case "°F":
                switch (outputUnit) {
                    case "°F":
                        outputValue = inputValue;
                        break;
                    case "°K":
                        outputValue = (Double) ((inputValue - 32 * 5.0 / 9.0 + 273.15));
                        break;
                    case "°C":
                        outputValue = (Double) ((inputValue - 32) * (5.0 / 9.0));
                        break;
                }
                break;
            case "°K":
                switch (outputUnit) {
                    case "°F":
                        outputValue = (Double) (inputValue - 273.15) * 9.0 / 5.0 + 32;
                        break;
                    case "°K":
                        outputValue = inputValue;
                        break;
                    case "°C":
                        outputValue = (Double) (inputValue - 273.15);
                        break;
                }
                break;
            default:
                break;
        }
        result[0] = String.valueOf(outputValue);
        result[1] = outputUnit;
        return result;
    }


    public String[] weightConvert(Double inputValue, String inputUnit, String outputUnit) {
        String[] result = new String[2];
        Double outputValue = inputValue;

        switch (inputUnit) {
            case "kg":

                switch (outputUnit) {
                    case "gm":
                        outputValue = (Double) (inputValue * 1000);
                        break;
                    case "lb":
                        outputValue = (Double) (inputValue * 2.205);
                        break;
                    case "kg":
                        outputValue = inputValue;
                        break;
                }
                break;

            case "gm":
                switch (outputUnit) {
                    case "°gm":
                        outputValue = inputValue;
                        break;
                    case "lb":
                        outputValue = (Double) (inputValue / 454);
                        break;
                    case "kg":
                        outputValue = (Double) (inputValue / 1000);
                        break;
                }
                break;
            case "lb":
                switch (outputUnit) {
                    case "gm":
                        outputValue = (Double) (inputValue * 454);
                        break;
                    case "lb":
                        outputValue = inputValue;
                        break;
                    case "kg":
                        outputValue = (Double) (inputValue / 2.205);
                        break;
                }
                break;
            default:
                break;
        }
        result[0] = String.valueOf(outputValue);
        result[1] = outputUnit;
        return result;
    }

    public String[] distanceConvert(Double inputValue, String inputUnit, String outputUnit) {
        String[] result = new String[2];
        Double outputValue = inputValue;

        switch (inputUnit) {
            case "Km":

                switch (outputUnit) {
                    case "Km":
                        outputValue = inputValue;
                        break;
                    case "m":
                        outputValue = (Double) (inputValue * 1000);
                        break;
                    case "ft":
                        outputValue = (Double) (inputValue * 3281);
                        break;
                    case "mi":
                        outputValue = (Double) (inputValue / 1.609);
                        break;
                    case "cm":
                        outputValue = inputValue * 100000;
                        break;

                }
                break;

            case "m":

                switch (outputUnit) {
                    case "Km":
                        outputValue = (Double) (inputValue / 1000);
                        break;
                    case "m":
                        outputValue = inputValue;
                        break;
                    case "ft":
                        outputValue = (Double) (inputValue * 3.281);
                        break;
                    case "mi":
                        outputValue = (Double) (inputValue / 1609);
                        break;
                    case "cm":
                        outputValue = (Double) (inputValue * 100);
                        break;

                }
                break;
            case "ft":

                switch (outputUnit) {
                    case "Km":
                        outputValue = (Double) (inputValue / 3281);
                        break;
                    case "m":
                        outputValue = (Double) (inputValue / 3.281);
                        break;
                    case "ft":
                        outputValue = inputValue;
                        break;
                    case "mi":
                        outputValue = (Double) (inputValue / 5280);
                        break;
                    case "cm":
                        outputValue = (Double) (inputValue * 30.48);
                        break;

                }
                break;
            case "mi":

                switch (outputUnit) {
                    case "Km":
                        outputValue = (Double) (inputValue * 1.609);
                        break;
                    case "m":
                        outputValue = (Double) (inputValue * 1609);
                        break;
                    case "ft":
                        outputValue = (Double) (inputValue * 5280);
                        break;
                    case "mi":
                        outputValue = (Double) inputValue;
                        break;
                    case "cm":
                        outputValue = (Double) (inputValue * 160934);
                        break;

                }
                break;
            case "cm":

                switch (outputUnit) {
                    case "Km":
                        outputValue = (Double) (inputValue / 100000);
                        break;
                    case "m":
                        outputValue = (Double) (inputValue / 100);
                        break;
                    case "ft":
                        outputValue = (Double) (inputValue / 30.48);
                        break;
                    case "mi":
                        outputValue = (Double) (inputValue / 160934);
                        break;
                    case "cm":
                        outputValue = inputValue;
                        break;

                }
                break;
            default:
                break;
        }
        result[0] = String.valueOf(outputValue);
        result[1] = outputUnit;
        return result;
    }

    public String[] currencyConvert(Double inputValue, String inputUnit, String outputUnit) {
        String[] result = new String[2];
        Double outputValue = inputValue;

        switch (inputUnit) {
            case "EUR":

                switch (outputUnit) {
                    case "EUR":
                        outputValue = (Double) inputValue;
                        break;
                    case "GBP":
                        outputValue = (Double) (inputValue * 0.87);
                        break;
                    case "USD":
                        outputValue = (Double) (inputValue * 1.21);
                        break;
                    case "INR":
                        outputValue = (Double) (inputValue * 90.42);
                        break;
                }
                break;

            case "GBP":

                switch (outputUnit) {
                    case "°EUR":
                        outputValue = (Double) (inputValue * 1.15);
                        break;
                    case "GBP":
                        outputValue = (Double) inputValue;
                        break;
                    case "USD":
                        outputValue = (Double) (inputValue * 1.39);
                        break;
                    case "INR":
                        outputValue = (Double) (inputValue * 103.89);
                        break;
                }
                break;
            case "USD":

                switch (outputUnit) {
                    case "°EUR":
                        outputValue = (Double) (inputValue * 0.83);
                        break;
                    case "GBP":
                        outputValue = (Double) (inputValue * 0.72);
                        break;
                    case "USD":
                        outputValue = inputValue;
                        break;
                    case "INR":
                        outputValue = (Double) (inputValue * 74.99);
                        break;
                }
                break;
            case "INR":

                switch (outputUnit) {
                    case "°EUR":
                        outputValue = (Double) (inputValue * 0.011);
                        break;
                    case "GBP":
                        outputValue = (Double) (inputValue * 0.0096);
                        break;
                    case "USD":
                        outputValue = (Double) (inputValue * 0.013);
                        break;
                    case "INR":
                        outputValue = inputValue;
                        break;
                }
                break;
        }
        result[0] = String.valueOf(outputValue);
        result[1] = outputUnit;
        return result;
    }

    public String[] digitalStorageConvert(Double inputValue, String inputUnit, String outputUnit) {
        String[] result = new String[2];
        Double outputValue = inputValue;

        switch (inputUnit) {
            case "KB":

                switch (outputUnit) {
                    case "KB":
                        outputValue = (Double) inputValue;
                        break;
                    case "MB":
                        outputValue = (Double) (inputValue / 125);
                        break;
                    case "GB":
                        outputValue = (Double) (inputValue / 125000);
                        break;
                    case "TB":
                        outputValue = (Double) (inputValue / 1.2500000000);
                        break;

                }
                break;

            case "MB":

                switch (outputUnit) {
                    case "KB":
                        outputValue = (Double) (inputValue * 1000);
                        break;
                    case "MB":
                        outputValue = (Double) (inputValue);
                        break;
                    case "GB":
                        outputValue = (Double) (inputValue / 1000);
                        break;
                    case "TB":
                        outputValue = (Double) (inputValue / 10000000);
                        break;
                }
                break;
            case "GB":

                switch (outputUnit) {
                    case "KB":
                        outputValue = (Double) (inputValue * 10000000);
                        break;
                    case "MB":
                        outputValue = (Double) (inputValue * 1000);
                        break;
                    case "GB":
                        outputValue = (Double) (inputValue);
                        break;
                    case "TB":
                        outputValue = (Double) (inputValue / 1000);
                        break;

                }
                break;
            case "TB":

                switch (outputUnit) {
                    case "KB":
                        outputValue = (Double) inputValue;
                        break;
                    case "MB":
                        outputValue = (Double) (inputValue * 10000000);
                        break;
                    case "GB":
                        outputValue = (Double) (inputValue * 1000);
                        break;
                    case "TB":
                        outputValue = (Double) (inputValue);
                        break;

                }

                break;


        }
        result[0] = String.valueOf(outputValue);
        result[1] = outputUnit;
        return result;
    }

}