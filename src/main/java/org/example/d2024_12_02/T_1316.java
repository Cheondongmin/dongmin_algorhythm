package org.example.d2024_12_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class T_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        short cnt = Short.parseShort(reader.readLine());
        String[] array = new String[cnt];
        short res = 0;

        for (int i = 0; i < cnt; i++) {
            array[i] = reader.readLine();
        }

        reader.close();

        // 배열의 각 단어를 하나씩 확인
        for (String s : array) {
            // 그룹 단어 여부를 나타내는 플래그 변수, 초기값은 true
            boolean flag = true;

            // 이전에 등장했던 문자를 저장할 리스트
            List<Character> charList = new ArrayList<>();

            // 현재 확인 중인 문자 저장용 변수, 초기값은 0
            char temp = 0;

            // 단어의 각 문자를 순회
            for (int j = 0; j < s.length(); j++) {
                // 현재 문자가 이전 문자와 다르다면
                if (temp != s.charAt(j)) {

                    // 이미 등장한 문자라면 그룹 단어가 아니므로 종료
                    if (charList.contains(s.charAt(j))) {
                        flag = false;
                        break; // 반복문 삐져나오기
                    }

                    // 새로 등장한 문자를 리스트에 추가
                    charList.add(s.charAt(j));

                    // 현재 문자를 temp에 저장
                    temp = s.charAt(j);
                }
            }

            // 플래그가 true라면 그룹 단어로 판단
            if (flag) {
                res++; // 그룹 단어 개수 증가
            }
        }

        // 결과 출력
        System.out.println(res);
    }
}
