package org.example.d2024_12_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int i = Integer.parseInt(input[0]);

        int k = 2;
        for(int j = 0; j < i; j++){
            k += k-1;
        }

        System.out.println(k*k);
    }
}
