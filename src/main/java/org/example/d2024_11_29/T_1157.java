package org.example.d2024_11_29;

import java.util.*;

public class T_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.next().toCharArray();
        scanner.close();

        Map<String, Integer> map = new HashMap<>();
        for (char c : charArray) {
            String s = String.valueOf(c).toUpperCase();

            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int maxCount = 0;
        String result = "?";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();

            if (value > maxCount) {
                maxCount = value;
                result = entry.getKey();
            } else if (value == maxCount) {
                result = "?";
            }
        }

        System.out.println(result);
    }
}
