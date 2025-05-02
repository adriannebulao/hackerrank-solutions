package com.adriannebulao.corejava.loops;

import java.util.Scanner;

public class LoopsSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        int[][] arr = new int[q][3];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < q; i++) {
            int total = arr[i][0];
            for (int j = 0; j < arr[i][2]; j++) {
                total += (int) (Math.pow(2, j) * arr[i][1]);
                System.out.print(total + " ");
            }
            System.out.println();
        }
    }
}
