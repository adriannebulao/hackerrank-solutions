package com.adriannebulao.datastructures.leftrotation;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LeftRotationSolution {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        for (int i = 0; i < d; i++) {

//            For Java 21 and later
//            arr.add(arr.getFirst());
//            arr.removeFirst();

            arr.add(arr.get(0));
            arr.remove(0);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int d = scan.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        List<Integer> rotated = rotateLeft(d, arr);
        for (int r : rotated) {
            System.out.print(r + " ");
        }
    }
}
