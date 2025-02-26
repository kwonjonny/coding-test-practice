package 알고리즘.큰돌의터전.일주차;

import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int answer = solution(str);
        System.out.println(answer);
    }
    public static int solution(String str) {
        return str.equals(new StringBuilder(str).reverse().toString()) ? 1 : 0;
    }

    /**
     * 재 복습: 2025-02-25
     */
    public static class D12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            solution(str);
        }
        public static void solution(String str) {
            int answer = 0;
            String reverse = new StringBuilder(str).reverse().toString();
            if(reverse.equals(str)) answer = 1;
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-02-26
     */
    public static class D12_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();

            String reverse = new StringBuilder(str).reverse().toString();
            if(reverse.equals(str)) {
                System.out.println(1);
            } else System.out.println(0);
        }
    }
}
