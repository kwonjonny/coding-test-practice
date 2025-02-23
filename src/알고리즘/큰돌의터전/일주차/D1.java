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
}
