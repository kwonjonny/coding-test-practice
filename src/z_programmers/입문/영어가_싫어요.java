package z_programmers.입문;

import java.util.*;

public class 영어가_싫어요 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int answer = solution(str);
        System.out.println(answer);
    }
    public static int solution(String str) {
        String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < str.length(); i++) {
            str = str.replace(words[i], String.valueOf(i));
        }
        return Integer.parseInt(str);
     }
}
