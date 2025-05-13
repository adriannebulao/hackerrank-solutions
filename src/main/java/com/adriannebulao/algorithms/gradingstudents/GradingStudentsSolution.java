package com.adriannebulao.algorithms.gradingstudents;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class GradingStudentsSolution {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<>();

        for (int g : grades) {
            int r = g % 5;
            if (g < 38) {
                result.add(g);
            } else {
                if (r > 2) {
                    result.add(g + (5 - r));
                } else {
                    result.add(g);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            grades.add(scan.nextInt());
        }

        List<Integer> result = gradingStudents(grades);
        for (int r : result) {
            System.out.println(r);
        }
    }
}
