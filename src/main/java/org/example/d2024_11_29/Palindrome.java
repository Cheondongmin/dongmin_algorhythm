package org.example.d2024_11_29;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder revStr = new StringBuilder();
        scanner.close();

        char[] chars = str.toCharArray();

        for(int i = chars.length-1; i >= 0; i--){
            revStr.append(chars[i]);
        }

        if(str.contentEquals(revStr)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
