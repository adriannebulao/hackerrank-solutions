package com.adriannebulao.corejava.datatypes;

import java.util.*;

public class DataTypesSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        String[] arr = new String[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scan.next();
        }

        for (String s : arr) {
            try {
                long n = Long.parseLong(s);
                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                System.out.println("* long");
            } catch (NumberFormatException nfe) {
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
    }
}
