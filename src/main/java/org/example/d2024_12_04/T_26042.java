package org.example.d2024_12_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class T_26042 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(reader.readLine());

        List<Integer> queue = new LinkedList<>();
        int maxSize = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < cnt; i++){
            String[] input = reader.readLine().split(" ");

            int type = Integer.parseInt(input[0]);
            if(type == 1) {
                int student = Integer.parseInt(input[1]);
                queue.add(student);

                if(maxSize < queue.size()) {
                    maxSize = queue.size();
                    min = student;  // 새로운 최대 크기일 때는 현재 학생이 마지막
                } else if(maxSize == queue.size() && student < min) {
                    min = student;  // 같은 크기일 때는 더 작은 번호만 저장
                }
            } else {
                queue.remove(0);
            }
        }

        System.out.println(maxSize + " " + min);
    }
}
