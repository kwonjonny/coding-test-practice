package string_solve;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 문자 뒤집기
 *
 * 설명: N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 *
 * 조건:
 * 1. 첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
 * 2. 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력:
 * - N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.
 *
 * 예제:
 * 입력:
 *   3
 *   good
 *   Time
 *   Big
 * 출력:
 *   doog
 *   emiT
 *   giB
 */
public class A4_String {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        Integer scanner = scan.nextInt();
        String[] strings = new String[scanner];
        for(int i=0; i<strings.length; i++) {
            strings[i] = scan.next();
        }
        solution(strings);
    }

    public static void solution(String[] strings) {
        for(String str : strings) {
            StringBuilder stringBuilder = new StringBuilder(str).reverse();
            System.out.println(stringBuilder);
        }
    }

    /**
     * 2024-12-05 복습
     */
    public static class A4String {
        public static void main(String[] args) {
            A4String a4String = new A4String();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            String[] strings = new String[count];
            for(int i = 0; i < strings.length; i++) {
                strings[i] = scan.next();
            }
            a4String.solution(strings);
        }

        public void solution(String[] str) {
            for(String s : str) {
                StringBuilder stringBuilder = new StringBuilder().append(s).reverse();
                System.out.println(stringBuilder);
            }
        }
    }

    /**
     * 2024-12-06 복습
     */
    public static class A4String1 {
        public static void main(String[] args) {
            A4String1 a4String1 = new A4String1();
            Scanner scan = new Scanner(System.in);
            Integer scanCount = scan.nextInt();
            String[] strings = new String[scanCount];
            for(int i = 0; i < strings.length; i++) {
                strings[i] = scan.next();
            }
            a4String1.solution(strings);
        }

        public void solution(String[] strings) {
            for(String s : strings) {
                String stringBuilder = new StringBuilder(s).reverse().toString();
                System.out.println(stringBuilder);
            }
        }
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A4String2 {
        public static void main(String[] args) {
            A4String2 a4String2 = new A4String2();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            String[] strArray = new String[count];
            for(int i = 0; i < count; i++) {
                strArray[i] = scan.next();
            }
            List<String> solution = a4String2.solution(count, strArray);
            for(String x : solution) {
                System.out.println(x);
            }
        }

        public List<String> solution(Integer count, String[] str) {
            List<String> arrayList = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            for(String x : str) {
                String reverse = new StringBuilder(x).reverse().toString();
                arrayList.add(reverse);
            }
            return arrayList;
        }
    }
}
