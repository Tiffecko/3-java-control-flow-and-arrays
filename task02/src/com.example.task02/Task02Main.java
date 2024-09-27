package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        System.out.println(getSeason(7));
    }

    static String getSeason(int monthNumber) {
        if(monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            return "зима";
        }

        if(monthNumber == 3 || monthNumber == 4 || monthNumber == 5) {
            return "весна";
        }

        if(monthNumber == 6 || monthNumber == 7 || monthNumber == 8) {
            return "лето";
        }

        if(monthNumber == 9 || monthNumber == 10 || monthNumber == 11) {
            return "осень";
        }
        return "0 и 12 не можеи ьыит чисорм месяца";
    }
}