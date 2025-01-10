package array_solve;

import java.util.Scanner;

/**
 *  격자판 최대합
 *
 * 설명:
 * 5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
 *
 * N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 *
 * 입력:
 *  - 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 *  - 두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 *
 * 출력:
 * - 최대합을 출력합니다.
 *
 * 예제:
 * 입력:
  5
  10 13 10 12 15
  12 39 30 23 11
  11 25 50 53 15
  19 27 29 37 27
  19 13 30 13 19
 *
 * 출력:
 *  155
 */
public class A9_Array {

    /*
     * 재복습: 2025-01-10
     */
    public static class A9Array9 {
        public static void main(String[] args) {
            A9Array9 a9Array9 = new A9Array9();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length][length];
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            a9Array9.solution(length, intArray);
        }
        public void solution(Integer length, Integer[][] intArray) {
            int sum1, sum2;
            int max = 0;
            for(int i = 0; i < length; i++) {
                sum1 = 0;
                sum2 = 0;
                for(int j = 0; j < length; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][j];
                }
                max = Math.max(max, sum1);
                max = Math.max(max, sum2);
            }
            sum1 = 0;
            sum2 = 0;
            for(int i = 0; i < length; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][length - i - 1];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
            System.out.println(max);
        }
    }

    /**
     * 재 복습: 2025-01-09
     */
    public static class A9Array8 {
        public static void main(String[] args) {
            A9Array8 a9Array8 = new A9Array8();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length][length];
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            a9Array8.solution(length, intArray);
        }
        public void solution(Integer length, Integer[][] intArray) {
            int max = 0;
            for(int i = 0; i < length; i++) {
                int sum1 = 0, sum2 = 0;
                for(int j = 0; j < length; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][i];
                }
                max = Math.max(max, sum1);
                max = Math.max(max, sum2);
            }
            int sum1 = 0, sum2 = 0;
            for(int i = 0; i < length; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][length - i - 1];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
            System.out.println(max);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer[][] intArray = new Integer[count][count];
        for(int i = 0; i < count; i++) {
            for(int j = 0; j < count; j++) {
                intArray[i][j] = scan.nextInt();
            }
        }
        System.out.println(solution(count, intArray));
    }

    public static Integer solution(Integer count, Integer[][] intArray) {
        Integer answer = 0;
        Integer sum1, sum2;
        for(int i = 0; i < count; i++) {
            sum1 = 0;
            sum2 = 0;
            for(int j = 0; j < count; j++) {
                sum1 = sum1 + intArray[i][j];
                sum2 = sum2 + intArray[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = 0;
        sum2 = 0;
        for(int i = 0; i < count; i++) {
            sum1 = sum1 + intArray[i][count - i - 1];
            sum2 = sum2 + intArray[i][i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);
        return answer;
    }

    /**
     * 재 복습: 2024-12-17
     */
    public static class A9Array {
        public static void main(String[] args) {
            A9Array a9Array = new A9Array();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(a9Array.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            Integer answer = 0;
            Integer sum1;
            Integer sum2;
            for(int i = 0; i < count; i++) {
                sum1 = 0;
                sum2 = 0;
                for(int j = 0; j < count; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][i];
                }
                answer = Math.max(answer, sum1);
                answer = Math.max(answer, sum2);
            }
            sum1 = 0;
            sum2 = 0;
            for(int i = 0; i < count; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][count - 1 - i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
            return answer;
        }
    }
    
    /**
     * 재 복습: 2024-12-17
     */
    public static class A9Array1 {
        public static void main(String[] args) {
            A9Array1 a9Array1 = new A9Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(a9Array1.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            int sum1, sum2;
            int answer = 0;
            for(int i = 0; i < count; i++) {
                sum1 = 0;
                sum2 = 0;
                for(int j = 0; j < count; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][i];
                }
                answer = Math.max(answer, sum1);
                answer = Math.max(answer, sum2);
            }
            sum1 = 0;
            sum2 = 0;
            for(int i = 0; i < count; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][count -1 -i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A9Array2 {
        public static void main(String[] args) {
            A9Array2 a9Array2 = new A9Array2();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(a9Array2.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            int answer = 0;
            int sum1, sum2;
            for(int i = 0; i < count; i++) {
                sum1 = 0;
                sum2 = 0;
                for(int j = 0; j < count; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][i];
                }
                answer = Math.max(answer, sum1);
                answer = Math.max(answer, sum2);
            }

            sum1 = 0;
            sum2 = 0;
            for(int i = 0; i < count; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][count -1 -i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
            return answer;
        }
    }

    /**
     * 왜 틀렷을까? 변수 초기화 조심해
     * 재 복습: 2024-12-20
     */
    public static class A9Array3 {
        public static void main(String[] args) {
            A9Array3 a9Array3 = new A9Array3();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for(int i = 0; i < count; i++) {
                for(int j =0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(a9Array3.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            int sum1 = 0, sum2 = 0;
            int answer = 0;

            for(int i = 0; i < count; i++) {
                sum1 = 0;
                sum2 = 0;
                for(int j = 0; j < count; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][i];
                }
                answer = Math.max(answer, sum1);
                answer = Math.max(answer, sum2);
            }

            sum1 = 0;
            sum2 = 0;
            for(int i = 0; i < count; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][count - 1 - i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-23
     */
    public static class A9Array4 {
        public static void main(String[] args) {
            A9Array4 a9Array4 = new A9Array4();
            Scanner scan = new Scanner(System.in);
            int count = scan.nextInt();
            int[][] intArray = new int[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(a9Array4.solution(count, intArray));
        }
        public Integer solution(int a, int[][] intArray) {
            int answer = 0;

            int sum1 = 0, sum2 = 0;
            for(int i = 0; i < a; i++) {
                for(int j = 0; j < a; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][i];
                }
                answer = Math.max(answer, sum1);
                answer = Math.max(answer, sum2);
                sum1 = 0;
                sum2 = 0;
            }

            sum1 = 0;
            sum2 = 0;
            for(int i = 0; i < a; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][a - 1 - i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class A9Array5 {
        public static void main(String[] args) {
            A9Array5 a9Array5 = new A9Array5();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[][] intArray = new Integer[count][count];
            for(int i = 0; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            System.out.println(a9Array5.solution(count, intArray));
        }
        public Integer solution(Integer count, Integer[][] intArray) {
            Integer answer = 0;
            Integer sum1 = 0;
            Integer sum2 = 0;

            for(int i = 0 ; i < count; i++) {
                for(int j = 0; j < count; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][j];
                }
                answer = Math.max(answer, sum1);
                answer = Math.max(answer, sum2);
                sum1 = 0;
                sum2 = 0;
            }

            sum1 = 0;
            sum2 = 0;
            for(int i = 0; i < count; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][count - i - 1];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A9Array6 {
        public static void main(String[] args) {
            A9Array6 a9Array6 = new A9Array6();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length][length];
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            Integer answer = a9Array6.solution(length, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer[][] intArray) {
            int answer = 0;

            for(int i = 0; i < length; i++) {
                int sum1 = 0, sum2 = 0;
                for(int j = 0; j < length; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][i];
                }
                answer = Math.max(answer, sum1);
                answer = Math.max(answer, sum2);
            }
            int sum1 = 0, sum2 = 0;
            for(int i = 0; i < length; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][length - 1 - i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
            return answer;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A9Array7 {
        public static void main(String[] args) {
            A9Array7 a9Array7 = new A9Array7();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[][] intArray = new Integer[length][length];
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            a9Array7.solution(length, intArray);
        }
        public void solution(Integer length, Integer[][] intArray) {
            int max = 0;
            for(int i = 0; i < length; i++) {
                int sum1 = 0;
                int sum2 = 0;
                for(int j = 0; j < length; j++) {
                    sum1 = sum1 + intArray[i][j];
                    sum2 = sum2 + intArray[j][i];
                }
                max = Math.max(max, sum1);
                max = Math.max(max, sum2);
            }
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i < length; i++) {
                sum1 = sum1 + intArray[i][i];
                sum2 = sum2 + intArray[i][length - i - 1];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
            System.out.println(max);
        }
    }
}
