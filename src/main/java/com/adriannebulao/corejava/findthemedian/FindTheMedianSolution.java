package com.adriannebulao.corejava.findthemedian;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindTheMedianSolution {

    public static int findMedian(List<Integer> arr) {
        arr.sort(null);

        int medianIndex = arr.size() / 2;

        return arr.get(medianIndex);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(scan.nextInt());
        }

        System.out.println(findMedian(arr));
    }
}