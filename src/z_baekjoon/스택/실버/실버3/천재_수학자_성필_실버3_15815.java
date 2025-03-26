package z_baekjoon.스택.실버.실버3;

import java.util.*;

public class 천재_수학자_성필_실버3_15815 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        solution(str);
    }
    public static void solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if(Character.isDigit(findChar)) stack.push(findChar - '0');
            else {
                if(!stack.isEmpty()) {
                    int answer = 0;
                    int b = stack.pop();
                    int a = stack.pop();
                    if(findChar == '*') answer = a * b;
                    else if(findChar == '+') answer = a + b;
                    else if(findChar == '/') answer = a / b;
                    else if(findChar == '-') answer = a - b;
                    stack.push(answer);
                }
            }
        }
        if(!stack.isEmpty()) System.out.println(stack.pop());
    }
}
