package z_baekjoon.스택.실버.실버4;

import java.util.*;

public class 스택_실버4_10828 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine();
        Stack<Integer> stack = new Stack<>();
        StringBuilder ret = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String str = scan.nextLine();
            if(str.startsWith("push")) {
                String[] splitArray = str.split(" ");
                int push = Integer.parseInt(splitArray[1]);
                stack.push(push);
            }
            else if (str.equals("pop")) {
                if(stack.isEmpty()) ret.append(-1).append("\n");
                else ret.append(stack.pop()).append("\n");
            }
            else if (str.equals("size")) {
                ret.append(stack.size()).append("\n");
            }
            else if (str.equals("empty")) {
                if(stack.isEmpty()) ret.append(1).append("\n");
                else ret.append(0).append("\n");
            }
            else if (str.equals("top")) {
                if(stack.isEmpty()) ret.append(-1).append("\n");
                else ret.append(stack.peek()).append("\n");
            }
        }
        System.out.println(ret.toString());
    }
}
