package com.adriannebulao.datastructures.lonelyinteger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LonelyIntegerSolution {

    public static int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int lonelyInteger = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            lonelyInteger = (entry.getValue() == 1) ? entry.getKey() : lonelyInteger;
        }

        return lonelyInteger;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        System.out.println(lonelyInteger(arr));
    }
}
