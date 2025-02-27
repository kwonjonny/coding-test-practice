package z_baekjoon.스택.브론즈;

import java.util.*;

public class Port_Robot_브론즈1_30614 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str = scan.next();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < N; i++) {
            char findChar = str.charAt(i);
            if(Character.isLowerCase(findChar)) stack.push(findChar);
            else if (Character.isUpperCase(findChar) && !stack.isEmpty()) stack.pop();
        }

        if(stack.isEmpty()) System.out.println(1);
        else System.out.println(0);
    }
}
