package stack_solve;

import java.util.Scanner;
import java.util.Stack;

/**
 * 후위식 연산(postfix)
 * 설명
 *
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 *
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 *
 *
 * 입력
 * 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
 * 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
 *
 *
 * 출력
 * 연산한 결과를 출력합니다.
 *
 * 예시 입력
    352+*9-
 * 
 * 예시 출력
 * 12
 */
public class A4_Stack {

    /**
     * 재 복습: 2025-01-09
     */
    public static class A4Stack3 {
        public static void main(String[] args) {
            A4Stack3 a4Stack3 = new A4Stack3();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a4Stack3.solution(str);
        }
        public void solution(String str) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;

            for(Character x : str.toCharArray()) {
                if(Character.isDigit(x)) stack.push(x - '0');
                else {
                    int left = stack.pop();
                    int right = stack.pop();
                    if (x.equals('*')) answer = right * left;
                    else if (x.equals('+')) answer = right + left;
                    else if (x.equals('-')) answer = right - left;
                    else if (x.equals('/')) answer = right / left;
                    stack.push(answer);
                }
            }
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        Integer answer = solution(str);
        System.out.println(answer);
    }
    public static Integer solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for(Character x : str.toCharArray()) {
            if(Character.isDigit(x)) {
                stack.push(x - '0');
            }
            else {
                int lt = stack.pop();
                int rt = stack.pop();
                int result = 0;
                if(x.equals('*')) result = rt * lt;
                else if(x.equals('+')) result = rt + lt;
                else if(x.equals('-')) result = rt - lt;
                else if(x.equals('/')) result = rt / lt;
                stack.push(result);
            }
        }
        return stack.peek();
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A4Stack1 {
        public static void main(String[] args) {
            A4Stack1 a4Stack1 = new A4Stack1();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            a4Stack1.solution(str);
        }
        public void solution(String str) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            for(Character x : str.toCharArray()) {
                if(Character.isDigit(x)) stack.push(x - '0');
                else {
                    int left = stack.pop();
                    int right = stack.pop();
                    if(x.equals('*')) answer = right * left;
                    else if(x.equals('+')) answer = right + left;
                    else if(x.equals('-')) answer = right - left;
                    else if(x.equals('/')) answer = right / left;
                    stack.push(answer);
                }
            }
            System.out.println(stack.pop());
        }
    }
}
