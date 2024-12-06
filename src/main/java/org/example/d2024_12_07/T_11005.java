package org.example.d2024_12_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        String s = Integer.toString(N,B).toUpperCase();

        System.out.println(s);
    }
}
