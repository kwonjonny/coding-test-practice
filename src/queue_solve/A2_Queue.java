package queue_solve;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 교육과정 설계
 * 설명
 *
 * 현수는 1년 과정의 수업계획을 짜야 합니다.
 *
 * 수업중에는 필수과목이 있습니다. 이 필수과목은 반드시 이수해야 하며, 그 순서도 정해져 있습니다.
 *
 * 만약 총 과목이 A, B, C, D, E, F, G가 있고, 여기서 필수과목이 CBA로 주어지면 필수과목은 C, B, A과목이며 이 순서대로 꼭 수업계획을 짜야 합니다.
 *
 * 여기서 순서란 B과목은 C과목을 이수한 후에 들어야 하고, A과목은 C와 B를 이수한 후에 들어야 한다는 것입니다.
 *
 * 현수가 C, B, D, A, G, E로 수업계획을 짜면 제대로 된 설계이지만
 *
 * C, G, E, A, D, B 순서로 짰다면 잘 못 설계된 수업계획이 됩니다.
 *
 * 수업계획은 그 순서대로 앞에 수업이 이수되면 다음 수업을 시작하다는 것으로 해석합니다.
 *
 * 수업계획서상의 각 과목은 무조건 이수된다고 가정합니다.
 *
 * 필수과목순서가 주어지면 현수가 짠 N개의 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력하는 프로그램을 작성하세요.
 *
 *
 * 입력
 * 첫 줄에 한 줄에 필수과목의 순서가 주어집니다. 모든 과목은 영문 대문자입니다.
 *
 * 두 번 째 줄부터 현수가 짠 수업설계가 주어집니다.(수업설계의 길이는 30이하이다)
 *
 *
 * 출력
 * 첫 줄에 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력합니다.
 *
 * 예시 입력 1
     CBA
     CBDAGE
 *
 * 예시 출력 1
 * YES
 */
public class A2_Queue {

    /**
     * 재 복습: 2025-01-10
     */
    public static class A2Queue2 {
        public static void main(String[] args) {
            A2Queue2 a2Queue2 = new A2Queue2();
            Scanner scan = new Scanner(System.in);
            String first = scan.next();
            String second = scan.next();
            a2Queue2.solution(first, second);
        }
        public void solution(String first, String second) {
            Queue<Character> queue = new LinkedList<>();
            for(int i = 0; i < first.length(); i++) {
                queue.offer(first.charAt(i));
            }
            for(int i = 0; i < second.length(); i++) {
                if(queue.contains(second.charAt(i))) queue.poll();
            }
            String answer = "NO";
            if(queue.isEmpty()) {
                answer = "YES";
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-09
     */
    public static class A2Queue1 {
        public static void main(String[] args) {
            A2Queue1 a2Queue1 = new A2Queue1();
            Scanner scan = new Scanner(System.in);
            String first =  scan.next();
            String second = scan.next();
            a2Queue1.solution(first, second);
        }
        public void solution(String first, String second) {
            Queue<Character> queue = new LinkedList<>();
            String answer = "NO";
            for(Character x : first.toCharArray()) {
                queue.offer(x);
            }
            for(Character x : second.toCharArray()) {
                if(queue.contains(x)) {
                    if(!queue.poll().equals(x)) answer = "NO";
                }
            }
            if(queue.isEmpty()) answer = "YES";
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstStr = scan.next();
        String secondStr = scan.next();
        String answer = solution(firstStr, secondStr);
        System.out.println(answer);
    }
    public static String solution(String first, String second) {
        Queue<Character> findQ = new LinkedList<>();
        for(Character x : first.toCharArray()) {
            findQ.offer(x);
        }
        for(Character x : second.toCharArray()) {
            if(findQ.contains(x)) {
                if(!x.equals(findQ.poll())) return "NO";
            }
        }
        return findQ.isEmpty() ? "YES" : "NO";
    }

    /**
     * 재 복습: 2025-01-02
     */
    public static class A2Queue {
        public static void main(String[] args) {
            A2Queue a2Queue = new A2Queue();
            Scanner scan = new Scanner(System.in);
            String firstStr = scan.next();
            String secondStr = scan.next();
            String answer = a2Queue.solution(firstStr, secondStr);
            System.out.println(answer);
        }
        public String solution(String firstStr, String secondStr) {
            Queue<Character> firstQueue = new LinkedList<>();
            for(Character x : firstStr.toCharArray()) {
                firstQueue.offer(x);
            }
            for(Character x : secondStr.toCharArray()) {
                if(firstQueue.contains(x)) {
                    if(firstQueue.poll() != x) return "NO";
                }
            }
            return firstQueue.isEmpty() ? "YES" : "NO";
        }
    }
}
