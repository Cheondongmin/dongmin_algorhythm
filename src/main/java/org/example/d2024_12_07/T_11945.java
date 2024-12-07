package org.example.d2024_12_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_11945 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        int y = Integer.parseInt(s.split(" ")[0]);
        int x = Integer.parseInt(s.split(" ")[1]);

        for(int i = 0; i < y; i++) {
            char[] arr = bufferedReader.readLine().toCharArray();
            char[] resArr = new char[x];
            int cnt = 0;
            for(int j = x-1; j >= 0; j--) {
                resArr[cnt] = arr[j];
                cnt++;
            }
            System.out.println(new String(resArr));
        }
    }
}
