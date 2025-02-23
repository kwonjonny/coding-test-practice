package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class B1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        solution(str);
    }
    public static void solution(String str) {
        int[] array = new int[26];
        for(char x : str.toCharArray()) {
            array[x - 'a']++;
        }
        for(int x : array) {
            System.out.print(x + " ");
        }
    }
}
