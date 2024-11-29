package org.example.d2024_11_29;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] white = new int[6];
        for(int i = 0; i < 6; i++){
            white[i] = scanner.nextInt();
        }
        scanner.close();

        int[] black = {1,1,2,2,2,8};
        String result = "";

        for(int i = 0; i < 6; i++){
            result += black[i] - white[i] + " ";
        }

        System.out.println(result);
    }
}
