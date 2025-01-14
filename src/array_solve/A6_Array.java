package array_solve;

import java.util.*;

/**
 * 뒤집은 소수
 * <p>
 * 설명:
 * <p>
 * N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 * <p>
 * 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * <p>
 * 첫 자리부터의 연속된 0은 무시한다.
 * <p>
 * 입력:
 * - 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
 * <p>
 * - 각 자연수의 크기는 100,000를 넘지 않는다.
 * <p>
 * 출력:
 * - 첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.
 * <p>
 * 예제:
 * 입력:
    9
    32 55 62 20 250 370 200 30 100
 * <p>
 * 출력:
 * 23 2 73 2 3
 */
public class A6_Array {

    /**
     * 재 복습: 2025-01-14
     */
    public static class A6Array8 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            A6Array8.solution(length, intArray);
        }
        public static void solution(Integer length, Integer[] intArray) {
            List<Integer> answer = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                int temp = intArray[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                if(A6Array8.isPrime(res)) answer.add(res);
            }
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
        public static Boolean isPrime(Integer num) {
            if(num == 1) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }

    /**
     * 재 복습: 2025-01-10
     */
    public static class A6Array9 {
        public static void main(String[] args) {
            A6Array9 a6Array9 = new A6Array9();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a6Array9.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            List<Integer> answer = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                int temp = intArray[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                A6Array9 A = new A6Array9();
                if(A.isPrime(res)) answer.add(res);
            }
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
        public Boolean isPrime(Integer num) {
            if(num == 1) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }

    /**
     * 재 복습: 2025-01-09
     */
    public static class A6Array7 {
        public static void main(String[] args) {
            A6Array7 a6Array7 = new A6Array7();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a6Array7.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            List<Integer> answer = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                int temp = intArray[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                A6Array7 a6Array7 = new A6Array7();
                if(a6Array7.isPrime(res)) answer.add(res);
            }
            for(Integer x : answer) {
                System.out.print(x + " ");
            }
        }
        public Boolean isPrime(Integer num) {
            if(num == 1) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        Integer[] intArray = new Integer[count];
        for (int i = 0; i < count; i++) {
            intArray[i] = scan.nextInt();
        }

        for (Integer x : solution(count, intArray)) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> solution(Integer count, Integer[] intArray) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int temp = intArray[i];
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp = temp / 10;
            }
            if (isPrime(res)) {
                arrayList.add(res);
            }
        }

        return arrayList;
    }

    public static Boolean isPrime(Integer num) {
        if (num == 1) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 재 복습: 2024-12-12
     */
    public static class A6Array {
        public static void main(String[] args) {
            A6Array a6Array = new A6Array();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a6Array.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }

        public List<Integer> solution(Integer count, Integer[] intArray) {
            List<Integer> arrayList = new ArrayList<>();

            for(int i = 0; i < count; i++) {
                int temp = intArray[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                if(isPrime(res)) {
                    arrayList.add(res);
                }
            }
            return arrayList;
        }

        public static Boolean isPrime(Integer num) {
            if(num == 1) {
                return false;
            }
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A6Array1 {
        public static void main(String[] args) {
            A6Array1 a6Array1 = new A6Array1();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a6Array1.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer count, Integer[] intArray) {
            List<Integer> intArrayList = new ArrayList<>();
            for(int i = 0; i < count; i++) {
                int temp = intArray[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                A6Array1 a6Array1 = new A6Array1();
                if(a6Array1.isPrime(res)) {
                    intArrayList.add(res);
                }
            }
            return intArrayList;
        }
        public Boolean isPrime(Integer num) {
            if(num == 1) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 재 복습: 2024-12-17
     */
    public static class A6Array2 {
        public static void main(String[] args) {
            A6Array2 a6Array2 = new A6Array2();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a6Array2.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer count, Integer[] intArray) {
            List<Integer> arrayList = new ArrayList<>();
            for(int i = 0; i < count; i++) {
                int temp = intArray[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                A6Array2 a6Array2 = new A6Array2();
                if(a6Array2.isPrime(res)) arrayList.add(res);
            }
            return arrayList;
        }
        public Boolean isPrime(Integer num) {
            if(num == 1) {
                return false;
            }
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class A6Array3 {
        public static void main(String[] args) {
            A6Array3 a6Array3 = new A6Array3();
            Scanner scan = new Scanner(System.in);
            Integer num = scan.nextInt();
            Integer[] intArray = new Integer[num];
            for(int i = 0; i < num; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a6Array3.solution(num, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer count, Integer[] intArray) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < count; i++) {
                int temp = intArray[i];
                int res = 0;
                while (temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                if(isPrime(res)) list.add(res);
            }
            return list;
        }
        public Boolean isPrime(Integer num) {
            if(num == 1) {
                return false;
            }
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class A6Array4 {
        public static void main(String[] args) {
            A6Array4 a6Array4 = new A6Array4();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            Integer[] intArray = new Integer[count];
            for(int i = 0 ; i < count; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a6Array4.solution(count, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer count, Integer[] intArray) {
            List<Integer> list = new ArrayList<>();

            for(int i = 0; i < count; i++) {
                int temp = intArray[i];
                int res = 0;
                while (temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                A6Array4 a6Array4 = new A6Array4();
                if(a6Array4.isPrime(res)) {
                    list.add(res);
                }
            }
            return list;
        }
        public Boolean isPrime(Integer num) {
            if(num == 1) {
                return false;
            }
            for(int i = 2; i < num; i++) {
                if(num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A6Array5 {
        public static void main(String[] args) {
            A6Array5 a6Array5 = new A6Array5();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            for(Integer x : a6Array5.solution(length, intArray)) {
                System.out.print(x + " ");
            }
        }
        public List<Integer> solution(Integer length, Integer[] intArray) {
            List<Integer> answerList = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                int temp = intArray[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                A6Array5 a6Array5 = new A6Array5();
                if(a6Array5.isPrime(res)) answerList.add(res);
            }
            return answerList;
        }
        public Boolean isPrime(Integer num) {
            if(num == 1) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A6Array6 {
        public static void main(String[] args) {
            A6Array6 a6Array6 = new A6Array6();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer[] intArray = new Integer[length];
            for(int i = 0; i < length; i++) {
                intArray[i] = scan.nextInt();
            }
            a6Array6.solution(length, intArray);
        }
        public void solution(Integer length, Integer[] intArray) {
            List<Integer> answerList = new ArrayList<>();
            for(int i = 0; i < length; i++) {
                int temp = intArray[i];
                int res = 0;
                while(temp > 0) {
                    int t = temp % 10;
                    res = res * 10 + t;
                    temp = temp / 10;
                }
                A6Array6 a6Array6 = new A6Array6();
                if(a6Array6.isPrime(res)) answerList.add(res);
            }
            for(Integer x : answerList) {
                System.out.print(x + " ");
            }
        }
        public Boolean isPrime(Integer num) {
            if(num == 1) return false;
            for(int i = 2; i < num; i++) {
                if(num % i == 0) return false;
            }
            return true;
        }
    }
}