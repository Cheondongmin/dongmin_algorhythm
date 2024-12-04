package org.example.d2024_12_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class T_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        String a = reader.readLine();
        String[] aStringArr = a.split(" ");
        Integer[] aArr = new Integer[n];

        for (int i = 0; i < n; i++) {
            aArr[i] = Integer.parseInt(aStringArr[i]);
        }

        String b = reader.readLine();
        String[] bStringArr = b.split(" ");
        Integer[] bArr = new Integer[n];
        for (int i = 0; i < n; i++) {
            bArr[i] = Integer.parseInt(bStringArr[i]);
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr, Comparator.reverseOrder());

        int result = 0;

        for(int i = 0; i < n; i++){
            result += (aArr[i] * bArr[i]);
        }

        System.out.println(result);
    }
}