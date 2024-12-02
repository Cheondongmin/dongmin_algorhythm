package org.example.d2024_12_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        float totalCredits = 0; // 총 학점
        float weightedSum = 0;  // (학점 * 평점)의 총합

        for (int i = 0; i < 20; i++) {
            String text = br.readLine();
            String[] arr = text.split(" "); // 한 번에 split으로 배열 생성
            float credits = Float.parseFloat(arr[1]); // 학점
            String grade = arr[2]; // 평점

            // Pass(P) 과목은 계산에서 제외
            if (grade.equals("P")) {
                continue;
            }

            // 평점에 따른 점수 계산
            float score;
            switch (grade) {
                case "A+":
                    score = 4.5f;
                    break;
                case "A0":
                    score = 4.0f;
                    break;
                case "B+":
                    score = 3.5f;
                    break;
                case "B0":
                    score = 3.0f;
                    break;
                case "C+":
                    score = 2.5f;
                    break;
                case "C0":
                    score = 2.0f;
                    break;
                case "D+":
                    score = 1.5f;
                    break;
                case "D0":
                    score = 1.0f;
                    break;
                default:
                    score = 0.0f;
                    break;
            }

            weightedSum += (credits * score); // (학점 * 평점) 누적
            totalCredits += credits;         // 총 학점 누적
        }

        // 학점 총합이 0이 아니면 결과 계산
        System.out.println(weightedSum / totalCredits);
    }
}
