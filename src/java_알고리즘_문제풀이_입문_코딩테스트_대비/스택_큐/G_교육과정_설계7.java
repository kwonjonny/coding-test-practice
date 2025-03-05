package java_알고리즘_문제풀이_입문_코딩테스트_대비.스택_큐;

/**
 * 7. 교육과정 설계
 * 설명
 * <p>
 * 현수는 1년 과정의 수업계획을 짜야 합니다.
 * <p>
 * 수업중에는 필수과목이 있습니다. 이 필수과목은 반드시 이수해야 하며, 그 순서도 정해져 있습니다.
 * <p>
 * 만약 총 과목이 A, B, C, D, E, F, G가 있고, 여기서 필수과목이 CBA로 주어지면 필수과목은 C, B, A과목이며 이 순서대로 꼭 수업계획을 짜야 합니다.
 * <p>
 * 여기서 순서란 B과목은 C과목을 이수한 후에 들어야 하고, A과목은 C와 B를 이수한 후에 들어야 한다는 것입니다.
 * <p>
 * 현수가 C, B, D, A, G, E로 수업계획을 짜면 제대로 된 설계이지만
 * <p>
 * C, G, E, A, D, B 순서로 짰다면 잘 못 설계된 수업계획이 됩니다.
 * <p>
 * 수업계획은 그 순서대로 앞에 수업이 이수되면 다음 수업을 시작하다는 것으로 해석합니다.
 * <p>
 * 수업계획서상의 각 과목은 무조건 이수된다고 가정합니다.
 * <p>
 * 필수과목순서가 주어지면 현수가 짠 N개의 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 한 줄에 필수과목의 순서가 주어집니다. 모든 과목은 영문 대문자입니다.
 * <p>
 * 두 번 째 줄부터 현수가 짠 수업설계가 주어집니다.(수업설계의 길이는 30이하이다)
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    CBA
    CBDAGE
 * 예시 출력 1
 * <p>
 * YES
 */

import java.util.*;

public class G_교육과정_설계7 {

    /**
     * 재 복습: 2025-03-05
     */
    public static class G_교육과정_설계7_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String first = scan.next();
            String second = scan.next();
            String answer = solution(first, second);
            System.out.println(answer);
        }
        public static String solution(String first, String second) {
            Queue<Character> Q = new LinkedList<>();
            for(int i = 0; i < second.length(); i++) {
                Q.offer(second.charAt(i));
            }
            StringBuilder ret = new StringBuilder();
            while(!Q.isEmpty()) {
                char pollChar = Q.poll();
                for(int i = 0; i < first.length(); i++) {
                    char findChar = first.charAt(i);
                    if(findChar == pollChar) {
                        ret.append(pollChar);
                    }
                }
            }
            if(ret.toString().equals(first)) {
                return "YES";
            }
            return "NO";
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstStr = scan.next();
        String secondStr = scan.next();
        String answer = solution(firstStr, secondStr);
        System.out.println(answer);
    }

    public static String solution(String firstStr, String secondStr) {
        Queue<Character> Q = new LinkedList<>();
        for (char x : secondStr.toCharArray()) {
            Q.offer(x);
        }

        StringBuilder ret = new StringBuilder();
        while (!Q.isEmpty()) {
            char x = Q.poll();
            for (char y : firstStr.toCharArray()) {
                if (x == y) ret.append(x);
            }
        }
        if (ret.toString().equals(firstStr)) return "YES";
        return "NO";
    }
}
