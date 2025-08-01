package java_알고리즘_문제풀이_입문_코딩테스트_대비.문자열;

/**
 * 8. 유효한 팰린드롬
 * 설명
 * <p>
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
 * <p>
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 * <p>
 * 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
 * <p>
 * 알파벳 이외의 문자들의 무시합니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 길이 100을 넘지 않는 공백이 있는 문자열이 주어집니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    found7, time: study; Yduts; emit, 7Dnuof
 * 예시 출력 1
 * <p>
 * YES
 */
import java.util.*;

public class H_유효한_팰린드롬8 {

    /**
     * 재 복습: 2025-07-26
     */
    public static class H_유효한_팰린드롬8_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            solution(str);
        }
        public static void solution(String str) {
            List<Character> list = new ArrayList<>();
            for(int i = 0; i < str.length(); i++) {
                char findChar = str.charAt(i);
                if(Character.isAlphabetic(findChar)) list.add(Character.toLowerCase(findChar));
            }
            int left = 0;
            int right = list.size() - 1;
            String answer = "NO";
            while(right > left) {
                if(!list.get(left).equals(list.get(right))) break;
                else answer = "YES";
                left++;
                right--;
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        List<Character> list = new ArrayList<>();
        for(char x : str.toLowerCase().toCharArray()) {
            if(Character.isAlphabetic(x)) list.add(x);
        }
        int lt = 0;
        int rt = list.size() - 1;
        while(lt < rt) {
            if(!list.get(lt).equals(list.get(rt))) {
                return "NO";
            }
            lt++;
            rt--;
        }
        return "YES";
    }
}
