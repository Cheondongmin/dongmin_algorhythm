package org.example.d2024_12_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] paper = new boolean[100][100];
        short cnt = Short.parseShort(reader.readLine());
        short black = 0;

        for(int i = 0; i < cnt; i++){
            String s = reader.readLine();
            short x = Short.parseShort(s.split(" ")[0]);
            short y = Short.parseShort(s.split(" ")[1]);

            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++){
                    if(!paper[j][k]){
                        paper[j][k] = true;
                        black += 1;
                    }
                }
            }
        }

        System.out.println(black);
    }
}
