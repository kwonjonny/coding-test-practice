package java_알고리즘_문제풀이_입문_코딩테스트_대비.해쉬맵_트리셋;

/**
 * 4. 모든 아나그램 찾기
 * 설명
 * <p>
 * S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
 * <p>
 * 아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
 * <p>
 * S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    bacaAacba
    abc
 * 예시 출력 1
 * <p>
 * 3
 * 힌트
 * <p>
 * 출력설명: {bac}, {acb}, {cba} 3개의 부분문자열이 "abc"문자열과 아나그램입니다.
 */

import java.util.*;

public class D_모든_아나그램_찾기4 {

    /**
     * 재 복습: 2025-05-10
     */
    public static class D_모든_아나그램_찾기4_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstStr = scan.next();
            String secondStr = scan.next();
            solution(firstStr, secondStr);
        }
        public static void solution(String firstStr, String secondStr) {
            Map<Character, Integer> secondMap = new HashMap<>();
            for(char x : secondStr.toCharArray()) {
                secondMap.put(x, secondMap.getOrDefault(x, 0) + 1);
            }
            Map<Character, Integer> firstMap = new HashMap<>();
            for(int i = 0; i < secondStr.length(); i++) {
                char findChar = firstStr.charAt(i);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);
            }
            int answer = 0;
            if(secondMap.equals(firstMap)) answer++;
            int left = 0;
            for(int right = secondStr.length(); right < firstStr.length(); right++) {
                char findChar = firstStr.charAt(right);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);

                char leftChar = firstStr.charAt(left);
                firstMap.put(leftChar, firstMap.get(leftChar) - 1);
                if(firstMap.get(leftChar) == 0) firstMap.remove(leftChar);
                left++;
                if(firstMap.equals(secondMap)) answer++;
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-03-28
     */
    public static class D_모든_아나그램_찾기4_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstStr = scan.next();
            String secondStr = scan.next();
            solution(firstStr, secondStr);
        }
        public static void solution(String firstStr, String secondStr) {
            Map<Character, Integer> secondMap = new HashMap<>();
            for(int i = 0; i < secondStr.length(); i++) {
                char findChar = secondStr.charAt(i);
                secondMap.put(findChar, secondMap.getOrDefault(findChar, 0) + 1);
            }

            Map<Character, Integer> firstMap = new HashMap<>();
            for(int i = 0; i < secondStr.length(); i++) {
                char findChar = firstStr.charAt(i);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);
            }
            int answer = 0;
            int left = 0;
            if(firstMap.equals(secondMap)) answer++;
            for(int right = secondStr.length(); right < firstStr.length(); right++) {
                char findChar = firstStr.charAt(right);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);

                char leftChar = firstStr.charAt(left);
                firstMap.put(leftChar, firstMap.get(leftChar) - 1);
                if(firstMap.get(leftChar) == 0) {
                    firstMap.remove(leftChar);
                }
                left++;
                if(firstMap.equals(secondMap)) answer++;
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class D_모든_아나그램_찾기4_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String first = scan.next();
            String second = scan.next();
            int answer = solution(first, second);
            System.out.println(answer);
        }
        public static int solution(String first, String second) {
            Map<Character, Integer> firstMap = new HashMap<>();
            Map<Character, Integer> secondMap = new HashMap<>();

            for(int i = 0; i < second.length(); i++) {
                char findChar = first.charAt(i);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);
            }
            for(int i = 0; i < second.length(); i++) {
                char findChar = second.charAt(i);
                secondMap.put(findChar, secondMap.getOrDefault(findChar, 0) + 1);
            }

            int answer = 0;
            int left = 0;
            if(firstMap.equals(secondMap)) answer++;
            for(int right = second.length(); right < first.length(); right++) {
                char findChar = first.charAt(right);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);

                char leftChar = first.charAt(left);
                firstMap.put(leftChar, firstMap.get(leftChar) - 1);
                if(firstMap.get(leftChar) == 0) firstMap.remove(leftChar);
                left++;
                if(firstMap.equals(secondMap)) answer++;
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();
        int answer = solution(first, second);
        System.out.println(answer);
    }
    public static int solution(String first, String second) {
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        for (int i = 0; i < second.length(); i++) {
            char findChar = first.charAt(i);
            firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);
        }
        for (int i = 0; i < second.length(); i++) {
            char findChar = second.charAt(i);
            secondMap.put(findChar, secondMap.getOrDefault(findChar, 0) + 1);
        }
        int answer = 0;
        if (firstMap.equals(secondMap)) answer++;

        int left = 0;
        for (int right = second.length(); right < first.length(); right++) {
            char findChar = first.charAt(right);
            firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);

            char leftChar = first.charAt(left);
            firstMap.put(leftChar, firstMap.get(leftChar) - 1);
            if (firstMap.get(leftChar) == 0) firstMap.remove(leftChar);
            left++;
            if (firstMap.equals(secondMap)) answer++;
        }
        return answer;
    }
}
