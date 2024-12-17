package bsu.rfe.java.group6.lab3.Kurochkin.varA2;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class GornerTableModel extends AbstractTableModel {
    private Double[] coefficients;
    private Double from;
    private Double to;
    private Double step;

    public GornerTableModel(Double from, Double to, Double step, Double[] coefficients) {
        this.from = from;
        this.to = to;
        this.step = step;
        this.coefficients = coefficients;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }

    public Double getStep() {
        return step;
    }

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        return (int) Math.ceil((to - from) / step) + 1;
    }
    public Object getValueAt(int row, int col) {
        double x = from + step * row;
        if (col == 0) {
            return roundToTwoDecimalPlaces(x);
        } else {
            double result = 0.0;
            for (int i = 0; i < coefficients.length; ++i) {
                result += coefficients[i] * Math.pow(x, coefficients.length - i - 1);
            }

            // Округляем результат
            double roundedResult = roundToTwoDecimalPlaces(result);

            if (col == 1) {
                return roundedResult;
            } else {
                // Извлекаем целую часть числа
                long integerPart = (long) Math.floor(roundedResult); // Берем целую часть результата

                // Проверяем, является ли целая часть квадратом
                long sqrt = (long) Math.sqrt(integerPart); // Целая часть квадратного корня
                return (sqrt * sqrt == integerPart); // true, если квадратный корень в целых числах
            }
        }
    }

    private double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Значение X";
            case 1:
                return "Значение многочлена";
            default:
                return "Целая часть это квадрат?";
        }
    }

    public Class<?> getColumnClass(int col) {  return col == 2 ? Boolean.class : Double.class;
    }
}
