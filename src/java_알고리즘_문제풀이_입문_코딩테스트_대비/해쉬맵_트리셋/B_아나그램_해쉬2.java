package java_알고리즘_문제풀이_입문_코딩테스트_대비.해쉬맵_트리셋;

/**
 * 2. 아나그램(해쉬)
 * 설명
 * <p>
 * Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
 * <p>
 * 예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
 * <p>
 * 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
 * <p>
 * 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
 * <p>
 * 단어의 길이는 100을 넘지 않습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     AbaAeCe
     baeeACA
 * 예시 출력 1
 * <p>
 * YES
 * 예시 입력 2
 * <p>
     abaCC
     Caaab
 * 예시 출력 2
 * <p>
 * NO
 */

import java.util.*;

public class B_아나그램_해쉬2 {

    /**
     * 재 복습: 2025-06-04
     */
    public static class B_아나그램해쉬2_4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String first = scan.next();
            String second = scan.next();
            solution(first, second);
        }
        public static void solution(String first, String second) {
            Map<Character, Integer> firstMap = new HashMap<>();
            Map<Character, Integer> secondMap = new HashMap<>();
            for(char x : first.toCharArray()) firstMap.put(x, firstMap.getOrDefault(x, 0) + 1);
            for(char x : second.toCharArray()) secondMap.put(x, secondMap.getOrDefault(x, 0) + 1);
            String answer = "NO";
            if(firstMap.equals(secondMap)) answer = "YES";
            System.out.println(answer);
        }
    }

    
    /**
     * 재 복습: 2025-05-09
     */
    public static class B_아나그램해쉬2_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstStr = scan.next();
            String secondStr = scan.next();
            solution(firstStr, secondStr);
        }
        public static void solution(String firstStr, String secondStr) {
            Map<Character, Integer> fisrtMap = new HashMap<>();
            Map<Character, Integer> secondMap = new HashMap<>();

            for(char x : firstStr.toCharArray()) {
                fisrtMap.put(x, fisrtMap.getOrDefault(x, 0) + 1);
            }
            for(char x : secondStr.toCharArray()) {
                secondMap.put(x, secondMap.getOrDefault(x, 0) + 1);
            }
            if(fisrtMap.equals(secondMap)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    
    /**
     * 재 복습: 2025-03-28
     */
    public static class B_아나그램_해쉬2_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstStr = scan.next();
            String secondStr = scan.next();
            solution(firstStr, secondStr);
        }
        public static void solution(String firstStr, String secondStr) {
            Map<Character, Integer> firstMap = new HashMap<>();
            Map<Character, Integer> secondMap = new HashMap<>();
            for(int i = 0; i < firstStr.length(); i++) {
                firstMap.put(firstStr.charAt(i), firstMap.getOrDefault(firstStr.charAt(i), 0) + 1);
            }
            for(int i = 0; i < secondStr.length(); i++) {
                secondMap.put(secondStr.charAt(i), secondMap.getOrDefault(secondStr.charAt(i), 0) + 1);
            }
            if(firstMap.equals(secondMap)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    
    /**
     * 재 복습: 2025-03-05
     */
    public static class B_아나그램_해쉬2_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String first = scan.next();
            String second = scan.next();
            String answer = solution(first, second);
            System.out.println(answer);
        }
        public static String solution(String first, String second) {
            Map<Character, Integer> firstMap = new HashMap<>();
            Map<Character, Integer> secondMap = new HashMap<>();
            for(int i = 0; i < first.length(); i++) {
                char findChar = first.charAt(i);
                firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) + 1);
            }
            for(int i = 0; i < second.length(); i++) {
                char findChar = second.charAt(i);
                secondMap.put(findChar, secondMap.getOrDefault(findChar, 0) + 1);
            }
            if(firstMap.equals(secondMap)) return "YES";
            return "NO";
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstStr = scan.next();
        String secondStr = scan.next();
        String answer = solution(firstStr, secondStr);
        System.out.println(answer);
    }
    public static String solution(String firstStr, String secondStr) {
        Map<Character, Integer> firstMap = new HashMap<>();
        Map<Character, Integer> secondMap = new HashMap<>();
        for(int i = 0; i < firstStr.length(); i++) {
            char findChar = firstStr.charAt(i);
            firstMap.put(findChar, firstMap.getOrDefault(findChar, 0) +  1);
        }
        for(int i = 0; i < secondStr.length(); i++) {
            char findChar = secondStr.charAt(i);
            secondMap.put(findChar, secondMap.getOrDefault(findChar, 0) + 1);
        }

        StringBuilder ret = new StringBuilder();
        if(firstMap.equals(secondMap)) ret.append("YES");
        else ret.append("NO");
        return ret.toString();
    }
}
