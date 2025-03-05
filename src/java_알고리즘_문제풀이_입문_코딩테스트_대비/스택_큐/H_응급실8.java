package java_알고리즘_문제풀이_입문_코딩테스트_대비.스택_큐;

/**
 * 8. 응급실
 * 설명
 * <p>
 * 메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.
 * <p>
 * 응급실은 환자가 도착한 순서대로 진료를 합니다. 하지만 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 합니다.
 * <p>
 * 이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의 진료순서를 정합니다.
 * <p>
 * • 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
 * <p>
 * • 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다.
 * <p>
 * 즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.
 * <p>
 * 현재 N명의 환자가 대기목록에 있습니다.
 * <p>
 * N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.
 * <p>
 * 대기목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것입니다.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수 N(5<=N<=100)과 M(0<=M<N) 주어집니다.
 * <p>
 * 두 번째 줄에 접수한 순서대로 환자의 위험도(50<=위험도<=100)가 주어집니다.
 * <p>
 * 위험도는 값이 높을 수록 더 위험하다는 뜻입니다. 같은 값의 위험도가 존재할 수 있습니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * M번째 환자의 몇 번째로 진료받는지 출력하세요.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    5 2
    60 50 70 80 90
 * 예시 출력 1
 * <p>
 * 3
 * 예시 입력 2
 * <p>
    6 3
    70 60 90 60 60 60
 * 예시 출력 2
 * <p>
 * 4
 */

import java.util.*;

public class H_응급실8 {

    /**
     * 재 복습: 2025-03-05
     */
    public static class H_응급실8_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int T = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            int answer = solution(N, T, array);
            System.out.println(answer);
        }
        public static int solution(int N, int T, int[] array) {
            Queue<Person> Q = new LinkedList<>();
            for(int i = 0; i < N; i++) {
                Q.offer(new Person(i, array[i]));
            }
            int answer = 0;
            while(!Q.isEmpty()) {
                Person temp = Q.poll();
                for(Person x : Q) {
                    if(temp.data < x.data) {
                        Q.offer(temp);
                        temp = null;
                        break;
                    }
                }
                if(temp != null) {
                    answer++;
                    if(temp.index == T) return answer;
                }
            }
            return answer;
        }
        public static class Person {
            int index;
            int data;
            public Person(int index, int data) {
                this.index = index;
                this.data = data;
            }
            public String toString() {
                return "index: " + index + " " + "data: " + data;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] array = new int[N];
        for(int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int answer = solution(N, T, array);
        System.out.println(answer);
    }
    public static int solution(int N, int T, int[] array) {
        Queue<Person> personQ = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            personQ.offer(new Person(i, array[i]));
        }
        int answer = 0;
        while(!personQ.isEmpty()) {
            Person temp = personQ.poll();
            for(Person x : personQ) {
                if(x.score > temp.score) {
                    personQ.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp != null) {
                answer++;
                if(temp.index == T) {
                    break;
                }
            }
        }
        return answer;
    }
    public static class Person {
        int index;
        int score;
        public Person(int index, int score) {
            this.index = index;
            this.score = score;
        }
        public String toString() {
            return "index: " + index + " " + "score: " + score;
        }
    }
}
