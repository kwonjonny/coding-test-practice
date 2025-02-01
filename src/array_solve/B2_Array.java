package array_solve;

import java.util.Objects;
import java.util.Scanner;

/**
 * 임시반장 정하기
 * <p>
 * 설명:
 * 김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.
 * <p>
 * 김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.
 * <p>
 * 그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
 * <p>
 * 그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표를 만들었다.
 * <p>
 * 예를 들어 학생 수가 5명일 때의 표를 살펴보자.
 * <p>
 *         1학년 | 2학년 | 3학년 | 4학년 | 5학년
 * 1번 학생   2      3      1      7      3
 * 2번 학생   4      1      9      6      8
 * 3번 학생   5      5      2      4      4
 * 4번 학생   6      5      2      6      7
 * 5번 학생   8      4      2      2      2
 * <p>
 * 위 경우에 4번 학생을 보면 3번 학생과 2학년 때 같은 반이었고, 3번 학생 및 5번 학생과 3학년 때 같은 반이었으며,
 * <p>
 * 2번 학생과는 4학년 때 같은 반이었음을 알 수 있다. 그러므로 이 학급에서 4번 학생과 한번이라도
 * <p>
 * 같은 반이었던 사람은 2번 학생, 3번 학생과 5번 학생으로 모두 3명이다.
 * <p>
 * 이 예에서 4번 학생이 전체 학생 중에서 같은 반이었던 학생 수가 제일 많으므로 임시 반장이 된다.
 * <p>
 * 각 학생들이 1학년부터 5학년까지 속했던 반이 주어질 때, 임시 반장을 정하는 프로그램을 작성하시오.
 * <p>
 * <p>
 * 입력:
 * - 첫째 줄에는 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다.
 * - 둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.
 * - 주어지는 정수는 모두 1 이상 9 이하의 정수이다.
 * <p>
 * 출력:
 * - 첫 줄에 임시 반장으로 정해진 학생의 번호를 출력한다.
 * - 단, 임시 반장이 될 수 있는 학생이 여러 명인 경우에는 그 중 가장 작은 번호만 출력한다.
 * <p>
 * 예제:
 * 입력:
     5
     2 3 1 7 3
     4 1 9 6 8
     5 5 2 4 4
     6 5 2 6 7
     8 4 2 2 2
 * <p>
 * 출력:
 * 4
 */
public class B2_Array {

    /**
     * 재 복습: 2025-02-01
     */
    public static class B2Array8 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length + 1][length + 1];
            for(int i = 1; i <= length; i++) {
                for(int j = 1; j <= length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            B2Array8.solution(length, intArray);
        }
        public static void solution(Integer length, Integer[][] intArray) {
            int student = 0;
            int max = 0;
            for(int i = 1; i <= length; i++) {
                int cnt = 0;
                for(int j = 1; j <= length; j++) {
                    for(int k = 1; k <= length; k++) {
                        if(intArray[i][k].equals(intArray[j][k])){
                            cnt++;
                            break;
                        }
                    }
                }
                if(cnt > max) {
                    max = cnt;
                    student = i;
                }
            }
            System.out.println(student);
        }
    }

    /**
     * 재 복습: 2024-01-14
     * 이건 다시 생각하고 풀어보자 
     */
    public static class B2Array7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length + 1][length + 1];
            for(int i = 1; i <= length; i++) {
                for(int j = 1; j <= length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            B2Array7.solution(length, intArray);
        }
        public static void solution(Integer length, Integer[][] intArray) {
            int answer = 0;
            int max = 0;
            for(int i = 1; i <= length; i++) {
                int cnt = 0;
                for(int j = 1; j <= length; j++) {
                    for(int t = 1; t <= length; t++) {
                        if(intArray[i][t].equals(intArray[j][t])) {
                           cnt++;
                        }
                    }
                    if(cnt > max) {
                        max = cnt;
                        answer = i;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-10
     */
    public static class B2Array4 {
        public static void main(String[] args) {
            B2Array4 b2Array4 = new B2Array4();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length][length];
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            b2Array4.solution(length, intArray);
        }
        public void solution(Integer length, Integer[][] intArray) {
            int max = 0;
            int ansewr = 0;
            for(int i = 0; i < length; i++) {
                int cnt = 0;
                for(int j = 0; j < length; j++) {
                    for(int t = 0; t < length; t++) {
                        if(intArray[i][j].equals(intArray[i][t])) {
                            cnt++;
                        }
                    }
                }
                if(cnt > max) {
                    max = cnt;
                    ansewr = i;
                }
            }
            System.out.println(ansewr);
        }
    }

    /**
     * 재 복습: 2025-01-09
     */
    public static class B2Array3 {
        public static void main(String[] args) {
            B2Array3 b2Array3 = new B2Array3();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length + 1][length + 1];
            for(int i = 1; i <= length; i++) {
                for(int j = 1; j <= length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            b2Array3.solution(length, intArray);
        }
        public void solution(Integer length, Integer[][] intArray) {
            int max = 0;
            int answer = 0;
            for(int i = 1; i <= length; i++) {
                int cnt = 0;
                for(int j = 1; j <= length; j++) {
                    for(int k = 1; k <= length; k++) {
                        if(intArray[i][j].equals(intArray[j][k])) {
                            cnt++;
                            break;
                        }
                    }
                }
                if(cnt > max) {
                    max = cnt;
                    answer = i;
                }
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer[][] intArray = new Integer[count + 1][count + 1];
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= 5; j++) {
                intArray[i][j] = scan.nextInt();
            }
        }
        System.out.println(solution(count, intArray));
    }

    public static Integer solution(Integer count, Integer[][] intArray) {
        int answer = 0;
        int max = 0;

        for(int i = 1; i <= count; i++) {
            int cnt = 0;
            for(int j = 1; j <= count; j++) {
                if(i == j) continue;
                for(int k = 1; k <= 5; k++) {
                    if(Objects.equals(intArray[i][k], intArray[j][k])) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class B2Array1 {
        public static void main(String[] args) {
            B2Array1 b2Array1 = new B2Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count + 1][count + 1];
            for(int i = 1; i <= count; i++) {
                for(int j = 1; j <= count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(b2Array1.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            int answer = 0;
            int max = 0;
            for(int i = 1; i <= count; i++) {
                int cnt = 0;
                for(int j = 1; j <= count; j++) {
                    if(i == j) continue;
                    for(int k = 1; k <= 5; k++) {
                        if(Objects.equals(intArray[i][k], intArray[j][k])) {
                            cnt++;
                            break;
                        }
                    }
                }
                if(cnt > max) {
                    max = cnt;
                    answer = i;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-19
     */
    public static class B2Array {
        public static void main(String[] args) {
            B2Array b2Array = new B2Array();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count + 1][count +1];
            for(int i = 1; i <= count; i++) {
                for(int j = 1; j <= count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(b2Array.solution(count, intArray));
        }

        public Integer solution(Integer count, Integer[][] intArray) {
            int answer = 0;
            int max = 0;

            for(int i = 1; i <= count; i++) {
                int cnt = 0;
                for(int j = 1; j <= count; j++) {
                    if(i == j) continue;
                    for(int k = 1; k <= 5; k++) {
                        if(Objects.equals(intArray[i][k], intArray[j][k])) {
                            cnt++;
                            break;
                        }
                    }
                }
                if(cnt > max) {
                    max = cnt;
                    answer = i;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class B2Array2 {
        public static void main(String[] args) {
            B2Array2 b2Array2 = new B2Array2();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length + 1][length + 1];
            for(int i = 1; i <= length; i++) {
                for(int j = 1; j <= length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            Integer answer = b2Array2.solution(length, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer[][] intArray) {
            Integer answer = 0;
            int max = 0;
            for(int i = 1; i <= length; i++) {
                int cnt = 0;
                for(int j = 1; j <= length; j++) {
                    for(int k = 1; k <= length; k++) {
                        if(Objects.equals(intArray[i][k], intArray[j][k])) {
                            cnt++;
                            break;
                        }
                    }
                }
                if(max < cnt) {
                    max = cnt;
                    answer = i;
                }
            }
            return answer;
        }
    }
}