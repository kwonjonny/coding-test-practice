package string_solve;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 유효한 팰린드롬
 *
 * 설명: 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 *
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 *
 * 알파벳 이외의 문자들의 무시합니다.
 *
 * 조건:
 * 1. 첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.
 *
 * 출력:
 * - 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 *
 * 예제:
 * 입력:
 *  found7, time: study; Yduts; emit, 7Dnuof
 *
 * 출력:
 *   YES
 */
public class A8_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        List<Character> list = new ArrayList<>();

        for(char x : str.toCharArray()) {
            if(Character.isLetter(x)) {
                list.add(Character.toLowerCase(x));
            }
        }

        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return "NO";
            }
            left++;
            right--;
        }
        return "YES";
    }

    /**
     * 2024-12-06 복습
     */
    public static class A8String {
        public static void main(String[] args) {
            A8String a8String = new A8String();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String solution = a8String.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            List<Character> list = new LinkedList<>();
            for(char x : str.toCharArray()) {
                if(Character.isLetter(x)) {
                    list.add(Character.toUpperCase(x));
                }
            }

            Integer left = 0;
            Integer right = list.size() - 1;

            while (left < right) {
                if(!list.get(left).equals(list.get(right))) {
                    return "NO";
                }
                left++;
                right--;
            }
            return "YES";
        }
    }

    /**
     * 2024-12-06 복습
     */
    public static class A8String1 {
        public static void main(String[] args) {
            A8String1 a8String1 = new A8String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String solution = a8String1.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            LinkedList<Character> linkedList = new LinkedList<>();
            for(char x : str.toCharArray()) {
                if(Character.isLetter(x)) {
                    linkedList.add(x);
                }
            }

            Integer left = 0;
            Integer right = linkedList.size() - 1;

            while (left > right) {
                if(!linkedList.get(left).equals(linkedList.get(right))) {
                    return "NO";
                }
                left ++ ;
                right -- ;
            }
            return "YES";
        }
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A8String2 {
        public static void main(String[] args) {
            A8String2 a8String2 = new A8String2();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String solution = a8String2.solution(str);
            System.out.println(solution);
        }


        public String solution(String str) {
            List<Character> arrayList = new ArrayList<>();

            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    arrayList.add(x);
                }
            }

            int left = 0;
            int right = str.length() - 1;
            while (left > right) {
                if(!arrayList.get(left).equals(arrayList.get(right))) {
                    return "NO";
                }
                left++;
                right--;
            }
            return "YES";
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A8String3 {
        public static void main(String[] args) {
            A8String3 a8String3 = new A8String3();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            System.out.println(a8String3.solution(str));
        }
        public String solution(String str) {
            List<Character> newArrayList = new ArrayList<>();
            for(char x : str.toCharArray()) {
                if(Character.isLetter(x)) {
                    newArrayList.add(Character.toLowerCase(x));
                }
            }

            int right = 0;
            int left = str.length() - 1;
            while(right > left) {
                if(!newArrayList.get(left).equals(newArrayList.get(right))) {
                    return "NO";
                }
                right++;
                left--;
            }
            return "YES";
        }
    }

    /**
     * 재 복습: 2024-12-18 오답
     */
    public static class A8String4 {
        public static void main(String[] args) {
            A8String4 a8String4 = new A8String4();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            System.out.println(a8String4.solution(str));
        }
        public String solution(String str) {
            str = str.toLowerCase();
            List<Character> arrayList = new ArrayList<>();
            for(char c : str.toCharArray()) {
                if(Character.isLetter(c)) {
                    arrayList.add(c);
                }
            }
            int left = 0;
            int right = arrayList.size() -1;
            while(right > left) {
                if(!arrayList.get(left).equals(arrayList.get(right))) {
                    return "NO";
                }
                left++;
                right--;
            }
            return "YES";
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class A9String5 {
        public static void main(String[] args) {
            A9String5 a9String5 = new A9String5();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            System.out.println(a9String5.solution(str));
        }
        public String solution(String str) {
            List<Character> list = new ArrayList<>();

            for(char x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    list.add(x);
                }
            }

            int left =  list.size() - 1;
            int right = 0;

            while(left < right) {
                if(!list.get(right).equals(list.get(left))) {
                    return "NO";
                }
                right++;
                left--;
            }
            return "YES";
        }
    }

    /**
     * 재 복습: 정규식 풀이 2024-12-28
     */
    public static class A8String5 {
        public static void main(String[] args) {
            A8String5 a8String5 = new A8String5();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String answer = a8String5.solution(str);
            System.out.println(answer);
        }
        public String solution(String str) {
            str = str.toLowerCase().replaceAll("[^A-Z]", "");
            String reverseString = new StringBuilder(str).reverse().toString();
            if(reverseString.equals(str)) return "YES";
            return "NO";
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A8String6 {
        public static void main(String[] args) {
            A8String6 a8String6 = new A8String6();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            a8String6.solution(str);
        }
        public void solution(String str) {
            String answer = "YES";
            List<Character> list = new ArrayList<>();
            for(Character x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) {
                    list.add(Character.toLowerCase(x));
                }
            }
            int left = 0;
            int right = list.size() - 1;
            while(right > 0) {
                if(!list.get(left).equals(list.get(right))) {
                    answer = "NO";
                }
                left++;
                right--;
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A8String7 {
        public static void main(String[] args) {
            A8String7 a8String7 = new A8String7();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            a8String7.solution(str);
        }
        public void solution(String str) {
            List<Character> list = new ArrayList<>();
            for(Character x : str.toCharArray()) {
                if(Character.isAlphabetic(x)) list.add(x);
            }
            String answer = "YES";
            int left = 0;
            int right = list.size() - 1;
            if(right > left) {
                if(!list.get(right).equals(list.get(left))) {
                    answer = "NO";
                }
                left++;
                right--;
            }
            System.out.println(answer);
        }
    }
}
