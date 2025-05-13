package java_알고리즘_문제풀이_입문_코딩테스트_대비.정렬_이분검색과_결정알고리즘;

/**
 * 6. 장난꾸러기
 * 설명
 * <p>
 * 새 학기가 시작되었습니다. 철수는 새 짝꿍을 만나 너무 신이 났습니다.
 * <p>
 * 철수네 반에는 N명의 학생들이 있습니다.
 * <p>
 * 선생님은 반 학생들에게 반 번호를 정해 주기 위해 운동장에 반 학생들을 키가 가장 작은 학생부터 일렬로 키순으로 세웠습니다.
 * <p>
 * 제일 앞에 가장 작은 학생부터 반 번호를 1번부터 N번까지 부여합니다. 철수는 짝꿍보다 키가 큽니다.
 * <p>
 * 그런데 철수가 앞 번호를 받고 싶어 짝꿍과 자리를 바꿨습니다.
 * <p>
 * 선생님은 이 사실을 모르고 학생들에게 서있는 순서대로 번호를 부여했습니다.
 * <p>
 * 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때 철수가 받은 번호와 철수 짝꿍이 받은 번호를
 * <p>
 * 차례로 출력하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 번째 줄에 자연수 N(5<=N<=100)이 주어진다.
 * <p>
 * 두 번째 줄에 제일 앞에부터 일렬로 서있는 학생들의 키가 주어진다.
 * <p>
 * 키(높이) 값 H는 (120<=H<=180)의 자연수 입니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 번째 줄에 철수의 반 번호와 짝꿍의 반 번호를 차례로 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    9
    120 125 152 130 135 135 143 127 160
 * 예시 출력 1
 * <p>
 * 3 8
 * 힌트
 * 출력해설 : 키 정보 152가 철수이고, 127이 철수 짝꿍입니다.
 */

import java.util.*;

public class F_장난꾸러기6 {

    /**
     * 재 복습: 2025-05-13
     */
    public static class F_장난꾸러기6_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            solution(N, array);
        }
        public static void solution(int N, int[] array) {
            List<Integer> answer = new ArrayList<>();
            int[] cloneArray = array.clone();
            Arrays.sort(array);
            for(int i = 0; i < N; i++) {
                if(array[i] != cloneArray[i]) {
                    answer.add(i + 1);
                }
            }
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class F_장난꾸러기6_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[] array = new int[N];
            for(int i = 0; i < N; i++) {
                array[i] = scan.nextInt();
            }
            int[] answer = solution(N, array);
            for(int x : answer) {
                System.out.print(x + " ");
            }
        }
        public static int[] solution(int N, int[] array) {
            int[] cloneArray = array.clone();
            List<Integer> answer = new ArrayList<>();
            Arrays.sort(array);
            for(int i = 0; i < N; i++) {
                if(cloneArray[i] != array[i]) {
                    answer.add(i + 1);
                }
            }
            return answer.stream().mapToInt(e -> e).toArray();
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scan.nextInt();
        }
        int[] answer = solution(N, array);
        for (int x : answer) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int N, int[] array) {
        List<Integer> answer = new ArrayList<>();
        int[] cloneArray = array.clone();
        Arrays.sort(array);
        for (int i = 0; i < N; i++) {
            if (cloneArray[i] != array[i]) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(e -> e).toArray();
    }
}
