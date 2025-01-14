package array_solve;

import java.util.Scanner;

/**
 *  점수계산
 *
 * 설명:
 * OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다.
 *
 * 여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을 주기 위해서 다음과 같이 점수 계산을 하기로 하였다.
 *
 * 1번 문제가 맞는 경우에는 1점으로 계산한다. 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점으로 계산한다.
 *
 * 또한, 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점, 세 번째 문제는 3점, ..., K번째 문제는 K점으로 계산한다. 틀린 문제는 0점으로 계산한다.
 *
 * 예를 들어, 아래와 같이 10 개의 OX 문제에서 답이 맞은 문제의 경우에는 1로 표시하고, 틀린 경우에는 0으로 표시하였을 때,
 *
 * 점수 계산은 아래 표와 같이 계산되어, 총 점수는 1+1+2+3+1+2=10 점이다.
 *
 * 1 0 1 1 1 0 0 1 1 0
 *
 * 채점 1 0 1 1 1 0 0 1 1 0
 * 점수 1 0 1 2 3 0 0 1 2 0
 *
 * 입력:
 *  - 첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.
 *
 *  - 0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우이다.
 *
 * 출력:
 * - 첫째 줄에 입력에서 주어진 채점 결과에 대하여 가산점을 고려한 총 점수를 출력한다.
 *
 * 예제:
 * 입력:
    10
    1 0 1 1 1 0 0 1 1 0
 *
 * 출력:
 *  10
 */
public class A7_Array {

    /**
     * 재 복습: 2025-01-14
     */
    public static class A7Array10 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            A7Array10.solution(length, intArray);
        }
        public static void solution(Integer length, Integer[] intArray) {
            int answer = 0;
            int cnt = 0;
            for(int i = 0; i < length; i++) {
                if(intArray[i] != 0) {
                    cnt++;
                    answer = answer + cnt;
                } else cnt = 0;
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-10
     */
    public static class A7Array9 {
        public static void main(String[] args) {
            A7Array9 a7Array9 = new A7Array9();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a7Array9.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            int answer = 0;
            int score = 0;
            for(int i = 0; i < length; i++) {
                if(intArray[i] == 0) {
                    score = 0;
                }
                else {
                    score++;
                    answer = answer + score;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-09
     */
    public static class A7Array8 {
        public static void main(String[] args) {
            A7Array8 a7Array8 = new A7Array8();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a7Array8.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            int cnt = 0;
            int answer = 0;
            for(int i = 0; i < length; i++) {
                if(intArray[i] == 0) cnt = 0;
                else {
                    cnt++;
                    answer = answer + cnt;
                }
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer[] intArray = new Integer[count];
        for(int i = 0; i < count; i++) {
            intArray[i] = scan.nextInt();
        }
        Integer solution = solution(count, intArray);
        System.out.println(solution);
    }

    public static Integer solution(Integer count, Integer[] intArray) {
        Integer score = 0;
        Integer answer = 0;

        for(int i = 0; i < count; i++) {
            if(intArray[i] == 1) {
                score++;
                answer = answer + score;
            } else {
                score = 0;
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A7Array1 {
        public static void main(String[] args) {
            A7Array1 a7Array1 = new A7Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(a7Array1.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[] intArray) {
            Integer score = 0;
            Integer answer = 0;
            for(int i = 0; i < count; i++) {
                if(intArray[i] == 1) {
                    score++;
                    answer = answer + score;
                } else {
                    score = 0;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-17
     */
    public static class A7Array2 {
        public static void main(String[] args) {
            A7Array2 a7Array2 = new A7Array2();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(a7Array2.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[] intArray) {
            int answer = 0;
            int score = 0;

            for(int i = 0; i < count; i++) {
                if(intArray[i] == 1) {
                    score ++;
                    answer = answer + score;
                } else {
                    score = 0;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A7Array3 {
        public static void main(String[] args) {
            A7Array3 a7Array3 = new A7Array3();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(a7Array3.solution(count, intArray));
        }

        public Integer solution(Integer count, Integer[] intArray) {
            int score = 0;
            int answer = 0;
            for(int i = 0; i < count; i++) {
                if(intArray[i] == 1) {
                    score++;
                    answer = answer + score;
                } else if(intArray[i] == 0) {
                    score = 0;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class A7Array4 {
        public static void main(String[] args) {
            A7Array4 a7Array4 = new A7Array4();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            System.out.println(a7Array4.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[] intArray) {
            int answer = 0;
            int sum  = 0;

            for(int i = 0 ; i < count; i++) {
                if(intArray[i] == 1) {
                    sum++;
                    answer = answer + sum;
                } else if(intArray[i] == 0) {
                    sum = 0;
                }
            }

            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class A7Array5 {
        public static void main(String[] args) {
            A7Array5 a7Array5 = new A7Array5();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            Integer answer = a7Array5.solution(length, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer[] intArray) {
            Integer answer = 0;
            Integer sum = 0;
            for(int i = 0; i < length; i++) {
                if(intArray[i] != 0) {
                    sum++;
                    answer = answer + sum;
                } else {
                    sum = 0;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A7Array6 {
        public static void main(String[] args) {
            A7Array6 a7Array6 = new A7Array6();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            Integer answer = a7Array6.solution(length, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer[] intArray) {
            int answer = 0;
            int score = 0;
            for(int i = 0; i < length; i++) {
                if(intArray[i].equals(0)) {
                    score = 0;
                } else {
                    score++;
                }
                answer = answer + score;
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A7Array7 {
        public static void main(String[] args) {
            A7Array7 a7Array7 = new A7Array7();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a7Array7.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            int score = 0;
            int answer = 0;
            for(int i = 0; i < length; i++) {
                if(intArray[i] == 1) {
                    score++;
                    answer = answer + score;
                } else score = 0;
            }
            System.out.println(answer);
        }
    }
}
