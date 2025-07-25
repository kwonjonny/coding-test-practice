package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 5. 특정 문자 뒤집기
 * 설명
 * <p>
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * <p>
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
   a#b!GE*T@S
 * 예시 출력 1
 * <p>
 * S#T!EG*b@a
 */

import java.util.*;

public class E_특정_문자_뒤집기5 {

    /**
     * 재 복습: 2025-07-25
     */
    public static class E_특정_문자_뒤집기5_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            solution(str);
        }
        public static void solution(String str) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < str.length(); i++) {
                if(Character.isAlphabetic(str.charAt(i))) stack.push(str.charAt(i));
            }
            StringBuilder ret = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                if(Character.isAlphabetic(str.charAt(i))) ret.append(stack.pop());
                else if(!Character.isAlphabetic(str.charAt(i))) ret.append(str.charAt(i));
            }
            System.out.println(ret);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        StringBuilder ret = new StringBuilder();
        char[] charArray = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(charArray[lt])) lt++;
            else if(!Character.isAlphabetic(charArray[rt])) rt--;
            else {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }
        return ret.append(String.valueOf(charArray)).toString();
    }
}
