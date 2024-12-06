package org.example.d2024_12_07;

import java.io.*;

public class T_3085 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");

        String N = input[0];
        int B = Integer.parseInt(input[1]);

        int result = Integer.parseInt(N,B);

        System.out.println(result);
    }
}
