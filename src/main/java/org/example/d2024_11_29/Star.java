package org.example.d2024_11_29;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = 1;
        int num2 = n*2-1;

        for (int i = 0; i < n; i++) {
            for(int j = n-1; j > i; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < num; k++) {
                System.out.print("*");
            }
            num = num + 2;
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            if(i != 0) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = num2; k > 0; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            num2 = num2 - 2;
        }
    }
}
