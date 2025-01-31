package hash_solve;

import java.util.HashMap;
import java.util.LinkedHashMap;
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

    /**
     * 재 복습: 2025-01-31
     */
    public static class A4Hash4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstStr = scan.next();
            String secondStr = scan.next();
            A4Hash4.solution(firstStr, secondStr);
        }
        public static void solution(String firstStr, String secondStr) {
            HashMap<Character, Integer> firstMap = new LinkedHashMap<>();
            HashMap<Character, Integer> secondMap = new LinkedHashMap<>();
            for(int i = 0; i < secondStr.length(); i++) {
                char findChar = firstStr.charAt(i);
                secondMap.put(findChar, secondMap.getOrDefault(findChar, 0) + 1);
            }
            for(int i = 0; i < secondStr.length(); i++) {
                char findChar = firstStr.charAt(i);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);
            }
            int answer = 0;
            if(firstMap.equals(secondMap)) answer++;
            for(int right = secondStr.length(); right < firstStr.length(); right++) {
                char rightChar = firstStr.charAt(right);
                firstMap.put(rightChar, firstMap.getOrDefault(rightChar, 0) + 1);

                char leftChar = firstStr.charAt(right - secondStr.length());
                if(firstMap.get(leftChar) == 1) firstMap.remove(leftChar);
                else firstMap.put(leftChar, firstMap.get(leftChar) - 1);
                if(firstMap.equals(secondMap)) answer++;
            }
            System.out.println(answer);
        }
    }
    
    /*
     * 재 복습: 2025-01-14
     */
    public static class A4Hash3 {
        public static void main(String[] args) {
            A4Hash3 a4Hash3 = new A4Hash3();
            Scanner scan = new Scanner(System.in);
            String first = scan.next();
            String second = scan.next();
            a4Hash3.solution(first, second);
        }
        public void solution(String firstStr, String secondStr) {
            HashMap<Character, Integer> firstMap = new LinkedHashMap<>();
            HashMap<Character, Integer> secondMap = new LinkedHashMap<>();
            int answer = 0;

            for(int i = 0; i < secondStr.length(); i++) {
                char findChar = firstStr.charAt(i);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);
            }
            for(int i = 0; i < secondStr.length(); i++) {
                char findChar = secondStr.charAt(i);
                secondMap.put(findChar, secondMap.getOrDefault(findChar, 0) + 1);
            }
            if(firstMap.equals(secondMap)) answer++;
            for(int right = secondStr.length(); right < firstStr.length(); right++) {
                char findChar = firstStr.charAt(right);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);

                char leftChar = firstStr.charAt(right - secondStr.length());
                firstMap.put(leftChar, firstMap.get(leftChar) - 1);
                if(firstMap.get(leftChar) == 0) firstMap.remove(leftChar);

                if(firstMap.equals(secondMap)) answer++;
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-09
     */
    public static class A4Hash2 {
        public void solution(String firstStr, String secondStr) {
            HashMap<Character, Integer> firstMap = new LinkedHashMap<>();
            HashMap<Character, Integer> secondMap = new LinkedHashMap<>();
            int answer = 0;

            for(Character x : secondStr.toCharArray()) {
                firstMap.put(x, firstMap.getOrDefault(x, 0) + 1);
            }
            for(Character x : secondStr.toCharArray()) {
                secondMap.put(x, secondMap.getOrDefault(x, 0) + 1);
            }
            if(firstMap.equals(secondMap)) answer++;
            for(int right = secondStr.length(); right < firstStr.length(); right++) {
                char rightChar = firstStr.charAt(right);
                firstMap.put(rightChar, firstMap.getOrDefault(rightChar, 0) + 1);

                char leftChar = firstStr.charAt(right - secondStr.length());
                if(firstMap.get(leftChar) == 1) firstMap.remove(leftChar);
                else firstMap.put(leftChar, firstMap.get(leftChar) - 1);
                if(firstMap.equals(secondMap)) answer++;
            }
        }
    }

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
            if(strMap.get(removeChar) == 1) strMap.remove(removeChar);
            else strMap.put(removeChar, strMap.getOrDefault(removeChar, 0) - 1);
            if(strMap.equals(findStrMap)) answer++;
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A4Hash {
        public static void main(String[] args) {
            A4Hash a4Hash = new A4Hash();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String findStr = scan.next();
            Integer answer = a4Hash.solution(str, findStr);
            System.out.println(answer);
        }
        public Integer solution(String str, String findStr) {
            Integer answer = 0;
            HashMap<Character, Integer> strMap = new HashMap<>();
            HashMap<Character, Integer> findStrMap = new HashMap<>();
            for(int i = 0; i < findStr.length(); i++) {
                findStrMap.put(findStr.charAt(i), findStrMap.getOrDefault(findStr.charAt(i), 0) + 1);
            }

            for(int i = 0; i < findStr.length(); i++) {
                strMap.put(str.charAt(i), strMap.getOrDefault(str.charAt(i), 0) + 1);
            }

            if(strMap.equals(findStrMap)) answer++;

            for(int right = findStr.length(); right < str.length(); right++) {
                char findChar = str.charAt(right);
                strMap.put(findChar, strMap.getOrDefault(findChar, 0) + 1);

                int left = right - findStr.length();
                char removeChar = str.charAt(left);
                if(strMap.get(removeChar) == 1) strMap.remove(removeChar);
                else strMap.put(removeChar, strMap.getOrDefault(removeChar, 0) - 1);
                if(strMap.equals(findStrMap)) answer++;
            }
            return answer;
        }
    }

    /*
     * 재 복습: 2024-12-28
     */
    public static class A4Hash1 {
        public static void main(String[] args) {
            A4Hash1 a4Hash1 = new A4Hash1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String findStr = scan.next();
            Integer answer = a4Hash1.solution(str, findStr);
            System.out.println(answer);
        }
        public Integer solution(String str, String findStr) {
            Integer answer = 0;
            HashMap<Character, Integer> strMap = new HashMap<>();
            HashMap<Character, Integer> findMap = new HashMap<>();
            for(int i = 0; i < findStr.length(); i++) {
                char findChar = str.charAt(i);
                strMap.put(findChar, strMap.getOrDefault(findChar, 0) + 1);
            }
            for(int i = 0; i < findStr.length(); i++) {
                char findChar = findStr.charAt(i);
                findMap.put(findChar, findMap.getOrDefault(findChar, 0) + 1);
            }
            if(strMap.equals(findMap)) answer++;
            for(int right = findStr.length(); right < str.length(); right++) {
                char findChar = str.charAt(right);
                strMap.put(findChar, strMap.getOrDefault(findChar, 0) + 1);
                int left = right - findStr.length();
                char removeChar = str.charAt(left);
                if(strMap.get(removeChar) == 1) strMap.remove(removeChar);
                else strMap.put(removeChar, strMap.getOrDefault(removeChar, 0) - 1);
                if(strMap.equals(findMap)) answer++;
            }
            return answer;
        }
    }
}