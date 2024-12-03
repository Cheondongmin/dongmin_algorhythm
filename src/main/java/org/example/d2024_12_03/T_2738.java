package org.example.d2024_12_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader reder = new BufferedReader(new InputStreamReader(System.in));
        String cnt = reder.readLine();
        String[] xyArr = cnt.split(" ");
        int y = Integer.parseInt(xyArr[0]);
        int x = Integer.parseInt(xyArr[1]);

        int[][] arr1 = new int[y][x];
        int[][] arr2 = new int[y][x];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < y; j++) {
                String number = reder.readLine();
                String[] stringArr = number.split(" ");
                for (int k = 0; k < x; k++) {
                    if (i == 0) {
                        arr1[j][k] = Integer.parseInt(stringArr[k]);
                    } else {
                        arr2[j][k] = Integer.parseInt(stringArr[k]);
                    }
                }
            }
        }

        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                System.out.print((arr1[i][j] + arr2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
