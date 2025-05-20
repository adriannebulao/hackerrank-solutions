package com.adriannebulao.corejava.timeconversion;

import java.util.Scanner;

public class TimeConversionSolution {

    public static String timeConversion(String s) {

        String[] units = s.split(":");

        int hour = Integer.parseInt(units[0]);

        if (units[2].contains("PM") && hour != 12) {
            hour += 12;
        } else if (units[2].contains("AM") && hour == 12) {
            hour = 0;
        }

        units[0] = String.format("%02d", hour);
        units[2] = units[2].replaceAll("[^0-9]", "");

        return String.join(":", units);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();

        System.out.println(timeConversion(s));
    }
}
