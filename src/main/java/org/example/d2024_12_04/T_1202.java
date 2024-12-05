package org.example.d2024_12_04;

import java.io.*;
import java.util.*;

public class T_1202 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gemAndBags = reader.readLine();
        String[] gemAndBagsArray = gemAndBags.split(" ");

        int gemCnt = Integer.parseInt(gemAndBagsArray[0]);
        int bagCnt = Integer.parseInt(gemAndBagsArray[1]);

        // 보석 정보 저장 (무게, 가격)
        int[][] gems = new int[gemCnt][2];
        for (int i = 0; i < gemCnt; i++) {
            String gemType = reader.readLine();
            String[] gemTypeArray = gemType.split(" ");
            gems[i][0] = Integer.parseInt(gemTypeArray[0]);
            gems[i][1] = Integer.parseInt(gemTypeArray[1]);
        }

        // 가방 무게 저장
        int[] backWeightArray = new int[bagCnt];
        for (int i = 0; i < bagCnt; i++) {
            backWeightArray[i] = Integer.parseInt(reader.readLine());
        }

        // 무게순 정렬
        Arrays.sort(backWeightArray);
        Arrays.sort(gems, Comparator.comparingInt(a -> a[0]));

        // 가격 높은순 저장
        long result = getResult(backWeightArray, gemCnt, gems);

        System.out.println(result);
    }

    private static long getResult(int[] backWeightArray, int gemCnt, int[][] gems) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        long result = 0;
        int gemIdx = 0;

        // 작은 가방부터 처리
        for (int backWeight : backWeightArray) {
            // 현재 가방에 들어갈 수 있는 보석들 추가
            while (gemIdx < gemCnt && gems[gemIdx][0] <= backWeight) {
                pq.add(gems[gemIdx][1]);
                gemIdx++;
            }
            // 가능한 보석 중 최고가 선택
            if (!pq.isEmpty()) {
                result += pq.poll();
            }
        }
        return result;
    }
}