package hash_solve;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 학급 회장(해쉬)
 * 설명
 *
 * 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
 *
 * 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 *
 * 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
 *
 * 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
 *
 *
 * 입력
 * 첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
 * 두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
 *
 * 출력
 * 학급 회장으로 선택된 기호를 출력합니다.
 *
 * 예시 입력
   15
   BACBACCACCBDEDE
 *
 * 예시 출력
 * C
 */
public class A1_Hash {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String str = scan.next();
        System.out.println(solution(a, str));
    }
    public static char solution(int a, String str) {
        char answer = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c : str.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
                if(entry.getValue() > max) {
                    max = entry.getValue();
                    answer = entry.getKey();
                }
        }
        return answer;
    }


    /**
     * 재 복습: 2024-12-26
     */
    public static class A1Hash {
        public static void main(String[] args) {
            A1Hash a1Hash = new A1Hash();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            String str = scan.next();
            System.out.println(a1Hash.solution(length, str));
        }
        public Character solution(Integer length, String str) {
            Character answer = null;
            HashMap<Character, Integer> hashMap = new HashMap<>();

            for(char x : str.toCharArray()) {
                hashMap.put(x, hashMap.getOrDefault(x, 0) +1);
            }

            int max = Integer.MIN_VALUE;
            for(Map.Entry<Character, Integer> x : hashMap.entrySet()) {
                if(max < x.getValue()) {
                    max = x.getValue();
                    answer = x.getKey();
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-27
     */
    public static class A1Hash2 {
        public static void main(String[] args) {
            A1Hash2 a1Hash2 = new A1Hash2();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            String str = scan.next();
            Character answer = a1Hash2.solution(length, str);
            System.out.println(answer);
        }
        public Character solution(Integer length, String str) {
            Character answer = null;
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(Character x : str.toCharArray()) {
                hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
            }
            int count = 0;
            for(Map.Entry<Character, Integer> list : hashMap.entrySet()) {
                if(list.getValue() > count) {
                    count = list.getValue();
                    answer = list.getKey();
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A1Hash3 {
        public static void main(String[] args) {
            A1Hash3 a1Hash3 = new A1Hash3();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            String str = scan.next();
            Character answer = a1Hash3.solution(length, str);
            System.out.println(answer);
        }
        public Character solution(Integer length, String str) {
            Character answer = null;
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(Character x : str.toCharArray()) {
                hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
            }
            int max = 0;
            for(Map.Entry<Character, Integer> map : hashMap.entrySet()) {
                if(map.getValue() > max) {
                    max = map.getValue();
                    answer = map.getKey();
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A1Hash1 {
        public static void main(String[] args) {
            A1Hash1 a1Hash1 = new A1Hash1();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            String str = scan.next();
            Character answer = a1Hash1.solution(length, str);
            System.out.println(answer);
        }
        public Character solution(Integer length, String str) {
            Character answer = null;
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(Character x : str.toCharArray()) {
                hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
            }
            Integer max = 0;
            for(Map.Entry<Character, Integer> map : hashMap.entrySet()) {
                if(map.getValue() > max) {
                    max = map.getValue();
                    answer = map.getKey();
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A1Hash4 {
        public static void main(String[] args) {
            A1Hash4 a1Hash4 = new A1Hash4();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            String str = scan.next();
            Character answer = a1Hash4.solution(length, str);
            System.out.println(answer);
        }
        public Character solution(Integer length, String str) {
            Character answer = null;
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(char x : str.toCharArray()) {
                hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
            }
            Integer cnt = 0;
            for(Map.Entry<Character, Integer> x : hashMap.entrySet()) {
                if(x.getValue() > cnt) {
                    cnt = x.getValue();
                    answer = x.getKey();
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A1Hash5 {
        public static void main(String[] args) {
            A1Hash5 a1Hash5 = new A1Hash5();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            String str = scan.next();
            a1Hash5.solution(length, str);
        }
        public void solution(Integer length, String str) {
            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(Character x : str.toCharArray()) {
                hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
            }
            int max = 0;
            Character answer = null;
            for(Map.Entry<Character, Integer> x : hashMap.entrySet()) {
                if(x.getValue() > max) {
                    max = x.getValue();
                    answer = x.getKey();
                }
            }
            System.out.println(answer);
        }
    }
}
