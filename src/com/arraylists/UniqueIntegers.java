package com.arraylists;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class UniqueIntegers {

    public static void main(String[] args) {

        ArrayList<Integer> unique = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = scn.nextInt();
        System.out.println("Enter 5 integer values");
        for (int i = 0; i < n; i++) {
            int m = scn.nextInt();

            if (!unique.contains(m)) {
                unique.add(m);
            }
        }

            Collections.sort(unique);
            System.out.println(unique);


    }
}