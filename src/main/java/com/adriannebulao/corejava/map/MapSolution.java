package com.adriannebulao.corejava.map;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class MapSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        Map<String, String> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            phoneBook.put(scan.nextLine(), scan.nextLine());
        }

        while (scan.hasNext()) {
            String query = scan.nextLine();
            System.out.println((phoneBook.get(query) != null) ? query + "=" + phoneBook.get(query) : "Not found");
        }
    }
}
