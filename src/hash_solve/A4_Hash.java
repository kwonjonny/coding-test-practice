package hash_solve;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 모든 아나그램 찾기
 * 설명
 *
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 *
 * 입력
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 *
 * 출력
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 *
 * 예시 입력
    bacaAacba
    abc
 *
 * 예시 출력
 * 3
 * 힌트
 * 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 */
public class A4_Hash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String findStr = scan.next();
        Integer answer = solution(str, findStr);
        System.out.println(answer);
    }
    public static Integer solution(String str, String findStr) {
        int answer = 0;
        HashMap<Character, Integer> strMap = new HashMap<>();
        HashMap<Character, Integer> findStrMap = new HashMap<>();

        for(char x : findStr.toCharArray()) {
            findStrMap.put(x, findStrMap.getOrDefault(x, 0) + 1);
        }

        for(int i = 0; i < findStr.length(); i++) {
            strMap.put(str.charAt(i), strMap.getOrDefault(str.charAt(i), 0) + 1);
        }

        if(strMap.equals(findStrMap)) answer++;

        for(int rigth = findStr.length(); rigth < str.length(); rigth++) {
            char addChar = str.charAt(rigth);
            strMap.put(addChar, strMap.getOrDefault(addChar, 0) + 1);

            char removeChar = str.charAt(rigth - findStr.length());
            if(strMap.get(removeChar) == 1) {
                strMap.remove(removeChar);
            } else {
                strMap.put(removeChar, strMap.getOrDefault(removeChar, 0) - 1);
            }

            if(strMap.equals(findStrMap)) answer++;
        }
        return answer;
    }
}
