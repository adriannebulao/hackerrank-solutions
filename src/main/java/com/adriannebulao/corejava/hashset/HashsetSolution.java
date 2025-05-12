package com.adriannebulao.corejava.hashset;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class HashsetSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        scan.nextLine();

        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            set.add(scan.nextLine());
            System.out.println(set.size());
        }
    }
}
