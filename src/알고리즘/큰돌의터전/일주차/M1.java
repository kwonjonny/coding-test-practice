package 알고리즘.큰돌의터전.일주차;

import java.util.*;

public class M1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int answer = 0;
        for(int i = 0; i < N; i++) {
            Stack<Character> stack = new Stack<>();
            String str = scan.next();
            for(char x : str.toCharArray()) {
                if(!stack.isEmpty() && stack.peek() == x) {
                    stack.pop();
                } else {
                    stack.push(x);
                }
            }

            if(stack.isEmpty()) answer++;
        }
        System.out.println(answer);
    }
}
