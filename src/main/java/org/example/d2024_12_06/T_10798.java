package org.example.d2024_12_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        short x = 5;
        short y = 15;
        String[][] arr = new String[x][y];

        for(short i = 0; i < x; i++) {
            String word = reader.readLine();
            String[] wArr = word.split("");
            for(short j = 0; j < wArr.length; j++) {
                String s = wArr[j];
                arr[i][j] = s;
            }
        }

        String res = "";
        for(short i = 0; i < y; i++) {
            for(short j = 0; j < x; j++) {
                if(arr[j][i] != null) {
                    if(!arr[j][i].equals(" ") && !arr[j][i].isEmpty()) {
                        res += arr[j][i];
                    }
                }

            }
        }
        System.out.println(res);
    }
}
