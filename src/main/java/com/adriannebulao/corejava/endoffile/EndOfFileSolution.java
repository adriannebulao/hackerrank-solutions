package com.adriannebulao.corejava.endoffile;

import java.util.*;

public class EndOfFileSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> arr = new ArrayList<>();
        while(scan.hasNext()) {
            arr.add(scan.nextLine());
        }

        for (int i = 1; i <= arr.size(); i++) {
            System.out.println(i + " " + arr.get(i - 1));
        }
    }
}
