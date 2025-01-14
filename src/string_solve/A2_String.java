package string_solve;

import java.util.Scanner;

/**
 * 대소문자 변환
 *
 * 설명: 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요
 *
 * 조건:
 * 1. 첫 줄에 문자열이 입력된다.
 * 2. 문자열의 길이는 100자를 넘지 않습니다.
 * 3. 문자열은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 입력:
 * - 첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
 *
 * 예제:
 * 입력:
 *   StuDY
 * 출력:
 *   sTUdy
 */
public class A2_String {

    /**
     * 재 복습: 2024-01-14
     */
    public static class A2String8 {
        public static void main(String[] args) {
            A2String8 a2String8 = new A2String8();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a2String8.solution(str);
        }
        public void solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(Character x : str.toCharArray()) {
                if(Character.isLowerCase(x)) stringBuilder.append(Character.toUpperCase(x));
                else stringBuilder.append(Character.toLowerCase(x));
            }
            System.out.println(stringBuilder);
        }
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        String scan = "";
        for(char x : str.toCharArray()) {
            if(Character.isLowerCase(x)) {
                scan += Character.toUpperCase(x);
            } else {
                scan += Character.toLowerCase(x);
            }
        }
        return scan;
    }


    /**
     * 재 복습: 2024-12-04
     * 다른 방법으로도 풀어보자 StringBuilder 사용
     */
    public static class A2String {
        public static void main(String [] args) {
            A2String a2String = new A2String();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a2String.solution(str);
            System.out.println(solution);
        }

        public String solution(final String str) {
            StringBuilder stringBuilder = new StringBuilder();

            for(char x : str.toCharArray()) {
                if(Character.isLowerCase(x)) {
                    stringBuilder.append(Character.toUpperCase(x));
                } else {
                    stringBuilder.append(Character.toLowerCase(x));
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-06
     */
    public static class A2String1 {
        public static void main(String[] args) {
            A2String1 a2String1 = new A2String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            String solution = a2String1.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isUpperCase(x)) {
                    stringBuilder.append(Character.toLowerCase(x));
                } else {
                    stringBuilder.append(Character.toUpperCase(x));
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A2String2 {
        public static void main(String[] args) {
            A2String2 a2String2 = new A2String2();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String solution = a2String2.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isUpperCase(x)) {
                    stringBuilder.append(Character.toLowerCase(x));
                } else {
                    stringBuilder.append(Character.toUpperCase(x));
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A2String3 {
        public static void main(String[] args) {
            A2String3 a2String3 = new A2String3();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a2String3.solution(str));
        }

        public String solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0; i < str.length(); i++) {
                if(Character.isLowerCase(str.charAt(i))) {
                    stringBuilder.append(Character.toUpperCase(str.charAt(i)));
                } else {
                    stringBuilder.append(Character.toLowerCase(str.charAt(i)));
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A2String4 {
        public static void main(String[] args) {
            A2String4 a2String4 = new A2String4();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a2String4.solution(str));
        }
        public String solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(char x : str.toCharArray()) {
                if(Character.isUpperCase(x)) {
                    stringBuilder.append(Character.toLowerCase(x));
                } else {
                    stringBuilder.append(Character.toUpperCase(x));
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class A2String5 {
        public static void main(String[] args) {
            A2String5 a2String5 = new A2String5();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            System.out.println(a2String5.solution(str));
        }
        public String solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(char x: str.toCharArray()) {
                if(Character.isLowerCase(x)) {
                    stringBuilder.append(Character.toUpperCase(x));
                } else {
                    stringBuilder.append(Character.toLowerCase(x));
                }
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A2String6 {
        public static void main(String[] args) {
            A2String6 a2String6 = new A2String6();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a2String6.solution(str);
        }
        public void solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(Character x : str.toCharArray()) {
                if(Character.isLowerCase(x)) {
                    stringBuilder.append(Character.toUpperCase(x));
                } else {
                    stringBuilder.append(Character.toLowerCase(x));
                }
            }
            System.out.println(stringBuilder);
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A2String7 {
        public static void main(String[] args) {
            A2String7 a2String7 = new A2String7();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a2String7.solution(str);
        }
        public void solution(String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(Character x : str.toCharArray()) {
                if(Character.isLowerCase(x)) stringBuilder.append(Character.toUpperCase(x));
                else stringBuilder.append(Character.toLowerCase(x));
            }
            System.out.println(stringBuilder);
        }
    }
}