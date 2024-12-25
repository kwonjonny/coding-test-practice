package array_solve;

import java.util.Scanner;

/**
 * 소수(에라토스테네스 체)
 * <p>
 * 설명:
 * 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * <p>
 * 입력:
 * - 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * <p>
 * 출력:
 * - 첫 줄에 소수의 개수를 출력합니다.
 * <p>
 * 예제:
 * 입력:
 * 20
 * <p>
 * 출력:
 * 8
 */
public class A5_Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer solution = solution(count);
        System.out.println(solution);
    }

    public static Integer solution(Integer count) {
        int answer = 0;
        int[] ch = new int[count + 1];

        for (int i = 2; i <= count; i++) {
            if (ch[i] == 0) {
                answer++;
                for (int j = i; j <= count; j = j + i) {
                    ch[j] = 1;
                }
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-12
     */
    public static class A5Array {
        public static void main(String[] args) {
            A5Array a5Array = new A5Array();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer solution = a5Array.solution(count);
            System.out.println(solution);
        }

        public Integer solution(Integer count) {
            int answer = 0;
            int[] array = new int[count + 1];

            for(int i = 2; i <= count; i++) {
                if(array[i] == 0) {
                    answer++;
                    for(int j = i; j <= count; j = j + i) {
                        array[j] = 1;
                    }
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A5Array1 {
        public static void main(String[] args) {
            A5Array1 a5Array1 = new A5Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            System.out.println(a5Array1.solution(count));
        }
        public Integer solution(Integer count) {
            int[] arrayInt = new int[count +1];
            Integer primeCount = 0;

            for(int i = 2; i <= count; i++) {
                if(arrayInt[i] == 0) {
                    primeCount++;
                    for(int j = i; j <= count; j = j + i) {
                        arrayInt[j] = 1;
                    }
                }
            }
            return primeCount;
        }
    }

    /**
     * 재 복습: 2024-12-17
     */
    public static class A5Array2 {
        public static void main(String[] args) {
            A5Array2 a5Array2 = new A5Array2();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            System.out.println(a5Array2.solution(count));
        }
        public Integer solution(Integer count) {
            Integer answer = 0;
            int[] intArray = new int[count + 1];
            for(int i = 2; i <= count; i++) {
                if(intArray[i] == 0) {
                    answer++;
                    for(int j = i; j <= count; j = j + i) {
                        intArray[j] = 1;
                    }
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A5Array3 {
        public static void main(String[] args) {
            A5Array3 a5Array3 = new A5Array3();
            Scanner scan = new Scanner(System.in);
            Integer num = scan.nextInt();
            System.out.println(a5Array3.solution(num));
        }
        public Integer solution(Integer num) {
            int answer = 0;
            int[] array = new int[num +1];
            for(int i = 2; i <= num; i++) {
                if(array[i] == 0) {
                    answer ++;
                    for(int j = i; j <= num; j = j +i) {
                        array[j] = 1;
                    }
                }
            }
            return answer;
        }
    }
    
    /**
     * 재 복습: 2024-12-25
     */
    public static class A5Array4 {
        public static void main(String[] args) {
            A5Array4 a5Array4 = new A5Array4();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            System.out.println(a5Array4.solution(count));
        }
        public Integer solution(Integer count) {
            int[] intArray = new int[count +1];
            int answer = 0;
            for(int i = 2; i <= count; i++) {
                if(intArray[i] == 0) answer++;
                for(int j = i * i; j <= count; j = j + i) {
                    intArray[j] = 1;
                }
            }
            return answer;
        }
    }
}