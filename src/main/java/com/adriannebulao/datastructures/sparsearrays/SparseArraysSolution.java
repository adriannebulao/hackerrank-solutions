package com.adriannebulao.datastructures.sparsearrays;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SparseArraysSolution {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            result.add(0);
            for (String s : stringList) {
                if (queries.get(i).equals(s)) {
                    result.set(i, result.get(i) + 1);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            stringList.add(scan.nextLine());
        }

        int q = scan.nextInt();
        scan.nextLine();
        List<String> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            queries.add(scan.nextLine());
        }

        List<Integer> result = matchingStrings(stringList, queries);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
