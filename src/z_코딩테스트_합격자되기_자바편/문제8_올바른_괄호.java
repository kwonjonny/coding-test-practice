package z_코딩테스트_합격자되기_자바편;

import java.util.Stack;

public class 문제8_올바른_괄호 {
    public static void main(String[] args) {
        String s = "()()";
        boolean answer = solution(s);
        System.out.println(answer);
    }
    public static boolean solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') stack.push(str.charAt(i));
            else {
                while(stack.pop() != '(');
            }
        }
        return stack.isEmpty();
    }
}
