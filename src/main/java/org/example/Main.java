package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] stringArr = new String[N];

        for (int i = 0; i < N; i++) {
            stringArr[i] = br.readLine();
        }

        for (String s : stringArr) {
            StringBuilder builder = new StringBuilder(s).reverse();
            System.out.println(builder);
        }
    }
}