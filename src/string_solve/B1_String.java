package string_solve;

import java.util.List;
import java.util.Scanner;

/**
 * 가장 짧은 문자거리
 *
 * 설명: 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 *
 * 조건:
 * 1. 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
 * 2. 문자열의 길이는 100을 넘지 않는다.
 *
 * 출력:
 * - 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 *
 * 예제:
 * 입력:
 *  teachermode e
 *
 * 출력:
 *   1 0 1 2 1 0 1 2 2 1 0
 */
public class B1_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char c = scan.next().charAt(0);
        int[] array = solution(str, c);
        for(int x : array) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(String str, char c) {
        Integer n = str.length();
        int[] distance = new int[n];
        int p = 1000;

        for(int i = 0; i < n; i++) {
            if(str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
            }
            distance[i] = p;
        }

        for(int i = n - 1; i >=0; i--) {
            if(str.charAt(i) == c) {
                p = 0;
            } else {
                p++;
            }
            distance[i] = Math.min(distance[i], p);
        }
        return distance;
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class B1String2 {
        public static void main(String[] args) {
            B1String2 b1String2 = new B1String2();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            Integer[] solution = b1String2.solution(str, c);
            for(Integer x : solution) {
                System.out.print(x + " ");
            }
        }


        public Integer[] solution(String str, char c) {
            Integer length = str.length();
            Integer distance = Integer.MAX_VALUE;
            Integer[] distances = new Integer[length];

            for(int i = 0; i < length; i++) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else if (distance != Integer.MAX_VALUE) {
                    distance++;
                }
                distances[i] = distance;
            }

            for(int i = length - 1; i >= 0; i--) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else if (distance != Integer.MAX_VALUE) {
                    distance++;
                }
                distances[i] = Math.min(distances[i], distance);
            }
            return distances;
        }
    }
}