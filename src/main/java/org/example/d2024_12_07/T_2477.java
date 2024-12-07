package org.example.d2024_12_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(bufferedReader.readLine());

        int[] direction = new int[6];
        int[] length = new int[6];

        for (int i = 0; i < 6; i++) {
            String str = bufferedReader.readLine();
            direction[i] = Integer.parseInt(str.split(" ")[0]);
            length[i] = Integer.parseInt(str.split(" ")[1]);
        }

        int maxX = 0;
        int maxXIdx = 0;
        int maxY = 0;
        int maxYIdx = 0;

        // 가장 긴 가로변, 세로변 찾기
        for (int i = 0; i < 6; i++) {
            if (direction[i] == 1 || direction[i] == 2) {
                if (length[i] > maxX) {
                    maxX = length[i];
                    maxXIdx = i;
                }
            } else {
                if (length[i] > maxY) {
                    maxY = length[i];
                    maxYIdx = i;
                }
            }
        }

        // 작은 사각형의 변 구하기
        int smallX = length[(maxXIdx + 3) % 6];
        int smallY = length[(maxYIdx + 3) % 6];

        int area = (maxX * maxY - smallX * smallY) * cnt;
        System.out.println(area);
    }
}
