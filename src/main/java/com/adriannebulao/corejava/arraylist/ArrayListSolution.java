package com.adriannebulao.corejava.arraylist;

import java.util.*;

public class ArrayListSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<List<Integer>> numArr = new ArrayList<>();
        List<List<Integer>> querArr = new ArrayList<>();

        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int d = scan.nextInt();
            numArr.add(new ArrayList<>());

            for (int j = 0; j < d; j++) {
                numArr.get(i).add(scan.nextInt());
            }
        }

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            querArr.add(new ArrayList<>());

            for (int j = 0; j < 2; j++) {
                querArr.get(i).add(scan.nextInt());
            }
        }

        querArr.forEach( (quer) -> {
            try {
                System.out.println(numArr.get(quer.get(0) - 1).get(quer.get(1) - 1));
            } catch (IndexOutOfBoundsException ioobe) {
                System.out.println("ERROR!");
            }
        });
    }
}
