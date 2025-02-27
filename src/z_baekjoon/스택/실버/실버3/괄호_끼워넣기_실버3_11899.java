package z_baekjoon.스택.실버.실버3;

import java.util.*;

public class 괄호_끼워넣기_실버3_11899 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int answer = solution(str);
        System.out.println(answer);
    }
    public static int solution(String str) {
        Stack<Character> stack = new Stack<>();
        int add = 0;
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if(findChar == '(') stack.push(findChar);
            else if(!stack.isEmpty()) stack.pop();
            else add++;
        }
       return stack.size() + add;
    }
}
