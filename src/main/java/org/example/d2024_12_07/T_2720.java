package org.example.d2024_12_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        short quarter = 25;
        short dime = 10;
        short nickel = 5;
        short penny = 1;
        int cnt = Integer.parseInt(reader.readLine());
        for(int i = 0; i < cnt; i++) {
            int[] arr = new int[4];
            int price = Integer.parseInt(reader.readLine());
            while(price > 0) {
                if (price >= quarter) {
                    arr[0] += 1;
                    price -= quarter;
                    continue;
                }

                if (price >= dime) {
                    arr[1] += 1;
                    price -= dime;
                    continue;
                }

                if (price >= nickel) {
                    arr[2] += 1;
                    price -= nickel;
                    continue;
                }

                arr[3] += 1;
                price -= penny;
            }

            System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        }
    }
}
