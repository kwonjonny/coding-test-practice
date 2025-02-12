package string_solve;

import java.util.Scanner;

/**
 * 문자 찾기
 *
 * 설명: 주어진 문자열에서 특정 문자가 몇 번 등장하는지 알아내는 프로그램을 작성하시오.
 *
 * 조건:
 * 1. 대소문자를 구분하지 않습니다.
 * 2. 문자열의 길이는 100자를 넘지 않습니다.
 * 3. 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 입력:
 * - 첫 줄에 문자열이 주어집니다.
 * - 두 번째 줄에 특정 문자가 주어집니다.
 *
 * 출력:
 * - 첫 줄에 해당 문자의 개수를 출력합니다.
 *
 * 예제:
 * 입력:
 *   ComputerCooler
 *   c
 * 출력:
 *   3
 */
public class A1_String {

    /**
     * 재 복습: 2025-02-01
     */
    public static class A1String10 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            Character c = scan.next().charAt(0);
            A1String10.solution(str, c);
        }
        public static void solution(String str, Character c) {
            int answer = 0;
            for(Character x : str.toCharArray()) {
                Character y = Character.toLowerCase(x);
                if(y.equals(c)) answer++;
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-14
     */
    public static class A1String9 {
        public static void main(String[] args) {
            A1String9 a1String9 = new A1String9();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            Character c = scan.next().charAt(0);
            a1String9.solution(str, c);
        }
        public void solution(String str, Character c) {
            int answer = 0;
            str = str.toLowerCase();
            for(Character x : str.toCharArray()) {
                if(c.equals(x)) {
                    answer++;
                }
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        Integer sol = solution(str, c);
        System.out.println(sol);
    }

    public static Integer solution(final String str,
                                   char c) {
        Integer solution = 0;
        String lower = str.toLowerCase();
        for(int i=0; i<str.length(); i++) {
            if(lower.charAt(i) == c) {
                solution++;
            }
        }
        return solution;
    }

    /**
     * 재 복습: 2024-12-04
     * 다른 방법으로도 풀어보자 forEach 사용
     */
    public static class A1String {
        public static void main(String[] args) {
            A1String a1String = new A1String();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            Integer solution = a1String.solution(str, c);
            System.out.println(solution);
        }

        public Integer solution(String str,
                               char c) {
            Integer solution = 0;
            String lowerCase = str.toLowerCase();

            for(char x : lowerCase.toCharArray()) {
                if(x == c) {
                    solution++;
                }
            }
            return solution;
        }
    }

    /**
     * 재 복습: 2024-12-06
     */
    public static class A1String1 {
        public static void main(String[] args) {
            A1String1 a1String2 = new A1String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            Integer solution = a1String2.solution(str, c);
            System.out.println(solution);
        }

        public Integer solution(String str, char c) {
            Integer count = 0;
            String lowerCase = str.toLowerCase();
            for(char x : lowerCase.toCharArray()) {
                if(x == c) {
                    count++;
                }
            }
            return count;
        }
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A1String2 {
        public static void main(String[] args) {
            A1String2 a1String2 = new A1String2();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            Integer solution = a1String2.solution(str, c);
            System.out.println(solution);
        }

        public Integer solution(String str, char c) {
            Integer count = 0;

            c = Character.toLowerCase(c);
            for(char x : str.toCharArray()) {
                if(c == Character.toLowerCase(x)) {
                    count++;
                }
            }
            return count;
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A1String3 {
        public static void main(String[] args) {
            A1String3 a1String3 = new A1String3();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            System.out.println(a1String3.solution(str, c));
        }

        public Integer solution(String str, char c) {
            str = str.toLowerCase();
            Integer count = 0;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == c) {
                    count++;
                }
            }
            return count;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A1String4 {
        public static void main(String[] args) {
            A1String4 a1String4 = new A1String4();
            Scanner scanner = new Scanner(System.in);
            String str = scanner.next();
            char c = scanner.next().charAt(0);
            System.out.println(a1String4.solution(str, c));
        }
        public Integer solution(String str, char c) {
            int answer = 0;
            str = str.toLowerCase();
            for(char x : str.toCharArray()) {
                if(x == c) {
                    answer++;
                }
            }
            return answer;
        }
    }

    /*
     * 재 복습: 2024-12-25
     */
    public static class A1String5 {
        public static void main(String[] args) {
            A1String5 a1String5 = new A1String5();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            System.out.println(a1String5.solution(str, c));
        }
        public Integer solution(String str, char c) {
            int answer = 0;
            for(char x : str.toCharArray()) {
                if(Character.toLowerCase(x) == c) {
                    answer++;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A1String6 {
        public static void main(String[] args) {
            A1String6 a1String6 = new A1String6();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            a1String6.solution(str, c);
        }
        public void solution(String str, char c) {
            str = str.toLowerCase();
            int cnt = 0;
            for(Character x : str.toCharArray()) {
                if(x.equals(c)) cnt++;
            }
            System.out.println(cnt);
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A1String7 {
        public static void main(String[] args) {
            A1String7 a1String7 = new A1String7();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            a1String7.solution(str, c);
        }
        public void solution(String str, char c) {
            str = str.toLowerCase();
            int answer = 0;
            for(Character x : str.toCharArray()) {
                if(x.equals(c)) answer++;
            }
            System.out.println(answer);
        }
    }
}