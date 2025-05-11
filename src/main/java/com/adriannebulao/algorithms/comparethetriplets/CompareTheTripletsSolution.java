package com.adriannebulao.algorithms.comparethetriplets;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CompareTheTripletsSolution {

    public static List<Integer> compareTriples(List<Integer> a, List<Integer> b) {
        List<Integer> scores = new ArrayList<>(Arrays.asList(0, 0));

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                scores.set(0, scores.get(0) + 1);
            } else if (a.get(i) < b.get(i)) {
                scores.set(1, scores.get(1) + 1);
            }
        }

        return scores;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            a.add(scan.nextInt());
        }

        for (int j = 0; j < 3; j++) {
            b.add(scan.nextInt());
        }

        List<Integer> scores = compareTriples(a, b);

        System.out.println(scores.getFirst() + " " + scores.getLast());
    }
}
