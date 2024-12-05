package org.example.d2024_12_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        short count = 9;
        short max = Short.MIN_VALUE;
        short x = 0;
        short y = 0;

        for (short i = 0; i < count; i++) {
            String s = reader.readLine();
            for (short j = 0; j < count; j++) {
                short num = Short.parseShort(s.split(" ")[j]);
                if(max < num) {
                    max = num;
                    x = (short)(i+1);
                    y = (short)(j+1);
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }
}
