package java_알고리즘_문제풀이_입문_코딩테스트_대비.스택_큐;

/**
 * 4. 후위식 연산(postfix)
 * 설명
 * <p>
 * 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
 * <p>
 * 식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 연산한 결과를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    352+*9-
 * 예시 출력 1
 * <p>
 * 12
 */

import java.util.*;

public class D_후위식_연산_postfix4 {

    /**
     * 재 복습: 2025-03-05
     */
    public static class D_후위식_연산_postfix4_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            int answer = solution(str);
            System.out.println(answer);
        }
        public static int solution(String str) {
            Stack<Integer> stack = new Stack<>();
            for(int i = 0; i < str.length(); i++) {
                char findChar = str.charAt(i);
                if(Character.isDigit(findChar)) stack.push(findChar - '0');
                else {
                    int answer = 0;
                    int lt = stack.pop();
                    int rt = stack.pop();
                    if(findChar == '-') answer = rt - lt;
                    else if(findChar == '+') answer = rt + lt;
                    else if(findChar == '/') answer = rt / lt;
                    else if(findChar == '*') answer = rt * lt;
                    stack.push(answer);
                }
            }
            return stack.pop();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int answer = solution(str);
        System.out.println(answer);
    }
    public static int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if(Character.isDigit(findChar)) stack.push(Character.getNumericValue(findChar));
            else {
                if(!stack.isEmpty()) {
                    int prefix = stack.pop();
                    int suffix = stack.pop();
                    if(findChar == '+') answer = suffix + prefix;
                    else if(findChar == '-') answer = suffix - prefix;
                    else if(findChar == '*') answer = (suffix * prefix);
                    else if(findChar == '/') answer = suffix / prefix;
                    stack.push(answer);
                }
            }
        }
        return answer;
    }
}
