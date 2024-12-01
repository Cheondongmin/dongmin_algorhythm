package org.example.d2024_12_01;

import java.util.Scanner;

public class T_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        int res = 0;

        for (int i = 0; i < input.length(); i++) {
            // d로 시작하는 경우 처리
            if (input.charAt(i) == 'd' && i < input.length() - 1) {
                if (input.charAt(i + 1) == 'z' && i < input.length() - 2 && input.charAt(i + 2) == '=') {
                    res++; // dz= 처리
                    i += 2; // 3글자 처리했으므로 i를 2 증가
                    continue;
                } else if (input.charAt(i + 1) == '-') {
                    res++; // d- 처리
                    i++; // 2글자 처리했으므로 i를 1 증가
                    continue;
                }
            }

            // c=, c- 처리
            if (input.charAt(i) == 'c' && i < input.length() - 1) {
                if (input.charAt(i + 1) == '=' || input.charAt(i + 1) == '-') {
                    res++;
                    i++; // 2글자 처리했으므로 i를 1 증가
                    continue;
                }
            }

            // lj, nj 처리
            if ((input.charAt(i) == 'l' || input.charAt(i) == 'n') && i < input.length() - 1) {
                if (input.charAt(i + 1) == 'j') {
                    res++;
                    i++; // 2글자 처리했으므로 i를 1 증가
                    continue;
                }
            }

            // s=, z= 처리
            if ((input.charAt(i) == 's' || input.charAt(i) == 'z') && i < input.length() - 1) {
                if (input.charAt(i + 1) == '=') {
                    res++;
                    i++; // 2글자 처리했으므로 i를 1 증가
                    continue;
                }
            }

            // 나머지 문자 처리
            res++;
        }

        System.out.println(res);
    }
}
