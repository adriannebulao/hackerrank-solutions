package com.adriannebulao.algorithms.caesarcipher;

import java.util.Scanner;

public class CaesarCipherSolution {

    public static String caesarCipher(String s, int k) {
        StringBuilder result = new StringBuilder();
        k %= 26;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                int ascii = (int) Character.toLowerCase(c) + k;

                while (ascii > 122) {
                    ascii -= 26;
                }

                result.append((char) Character.toUpperCase(ascii));
            } else if (Character.isLowerCase(c)) {
                int ascii = (int) c + k;

                while (ascii > 122) {
                    ascii -= 26;
                }

                result.append((char) ascii);
            } else {
                result.append(c);
            }
        }

        return  result.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        String s = scan.nextLine();
        int k = scan.nextInt();

        System.out.println(caesarCipher(s, k));
    }
}
