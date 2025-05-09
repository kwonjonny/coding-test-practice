package java_알고리즘_문제풀이_입문_코딩테스트_대비.해쉬맵_트리셋;

/**
 * 1. 학급 회장(해쉬)
 * 설명
 * <p>
 * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
 * <p>
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 * <p>
 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
 * <p>
 * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
 * <p>
 * 두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 학급 회장으로 선택된 기호를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
     15
     BACBACCACCBDEDE
 * 예시 출력 1
 * <p>
 * C
 */

import java.util.*;

public class A_학급_회장_해쉬1 {

    /**
     * 재 복습: 2025-05-09
     */
    public static class A_학급_회장_해쉬1_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            String str = scan.next();
            solution(N, str);
        }
        public static void solution(int N, String str) {
            Map<Character, Integer> map = new HashMap<>();
            for(char x : str.toCharArray()) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
            char answer = ' ';
            int max = 0;
            for(Map.Entry<Character, Integer> set : map.entrySet()) {
                if(set.getValue() > max) {
                    max = set.getValue();
                    answer = set.getKey();
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-03-28
     */
    public static class A_학급_회장_해쉬1_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            String str = scan.next();
            solution(N, str);
        }
        public static void solution(int N, String str) {
            Map<Character, Integer> map = new HashMap<>();
            for(int i = 0; i < N; i++) {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
            Character answer = null;
            int max = 0;
            for(Map.Entry<Character, Integer> set : map.entrySet()) {
                if(set.getValue() > max) {
                    max = set.getValue();
                    answer = set.getKey();
                }
            }
            if(answer != null) System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class A_학급_회장_해쉬1_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            String str = scan.next();
            char answer = solution(N, str);
            System.out.println(answer);
        }
        public static char solution(int N, String str) {
            Map<Character, Integer> map = new HashMap<>();
            Character answer = null;
            for(int i = 0; i < N; i++) {
                char findChar = str.charAt(i);
                map.put(findChar, map.getOrDefault(findChar, 0) + 1);
            }
            int max = 0;
            for(Map.Entry<Character, Integer> set : map.entrySet()) {
                if(max < set.getValue()) {
                    max = set.getValue();
                    answer = set.getKey();
                }
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        char answer = solution(N, str);
        System.out.println(answer);
    }
    public static char solution(int N, String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++) {
            char findChar = str.charAt(i);
            map.put(findChar, map.getOrDefault(findChar, 0) + 1);
        }
        char answer = ' ';
        int max = 0;
        for(Map.Entry<Character, Integer> set : map.entrySet()) {
            if(set.getValue() > max) {
                max = set.getValue();
                answer = set.getKey();
            }
        }
        return answer;
    }
}
