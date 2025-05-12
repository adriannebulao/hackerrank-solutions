package com.adriannebulao.algorithms.birthdaycakecandles;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class BirthdayCakeCandlesSolution {

    public static int birthdayCakeCandles(List<Integer> candles) {
        int tallest = 0;
        int count = 0;

        for (int candle : candles) {
            if (candle > tallest) {
                tallest = candle;
                count = 1;
            } else if (candle == tallest) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Integer> candles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            candles.add(scan.nextInt());
        }

        System.out.println(birthdayCakeCandles(candles));
    }
}
