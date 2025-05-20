package com.adriannebulao.algorithms.countingsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountingSortSolution {

    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> sortedArr = new ArrayList<>(Collections.nCopies(100, 0));

        for (int num : arr) {
            sortedArr.set(num, sortedArr.get(num) + 1);
        }

        return sortedArr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        List<Integer> sortedArr = countingSort(arr);
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}