package string_solve;

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

    /**
     * 재 복습: 2024-01-14
     */
    public static class B1String11 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            Character c = scan.next().charAt(0);
            B1String11.solution(str, c);
        }
        public static void solution(String str, Character c) {
            int distance = 1000;
            int[] distances = new int[str.length()];
            for(int i = 0; i < str.length(); i++) {
                if(c.equals(str.charAt(i))) {
                    distance = 0;
                } else distance++;
                distances[i] = distance;
            }

            for(int i = str.length() - 1; i >= 0; i--) {
                if(c.equals(str.charAt(i))) {
                    distance = 0;
                } else distance++;
                distances[i] = Math.min(distances[i], distance);
            }
            for(Integer x : distances) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-01-13
     */
    public static class B1String10 {
        public static void main(String[] args) {
            B1String10 b1String10 = new B1String10();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            b1String10.solution(str, c);
        }
        public void solution(String str, char c) {
            int distance = 1000;
            int[] distances = new int[str.length()];
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == c) {
                    distance = 0;
                }
                else {
                    distance++;
                }
                distances[i] = distance;
            }
            for(int i = str.length() -1; i >= 0; i--) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance++;
                }
                distances[i] = Math.min(distances[i], distance);
            }
            for(Integer x : distances) {
                System.out.print(x + " ");
            }
        }
    }

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

    /**
     * 재 복습: 2024-12-15
     */
    public static class B1String3  {
        public static void main(String[] args) {
            B1String3 b1String3 = new B1String3();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            for(Integer x : b1String3.solution(str, c)) {
                System.out.print(x + " ");
            }
        }
        public int[] solution(String str, char c) {
            int distance = 1000;
            int[] distances = new int[str.length()];

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance ++;
                }
                distances[i] = distance;
            }

            for(int i = str.length() -1; i >= 0; i--) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance ++;
                }
                distances[i] = Math.min(distances[i], distance);
            }
            return distances;
        }
    }

    /**
     * 재 복습: 2024-12-18
     */
    public static class B1String4 {
        public static void main(String[] args) {
            B1String4 b1String4 = new B1String4();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            for(Integer x : b1String4.solution(str, c)) {
                System.out.print(x + " ");
            }
        }
        public int[] solution(String str, char c) {
            int distance = 1000;
            int[] distances = new int[str.length()];

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance++;
                }
                distances[i] = distance;
            }

            for(int i = str.length() -1; i >= 0; i--) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance++;
                }
                distances[i] = Math.min(distances[i], distance);
            }
            return distances;
        }
    }

    /**
     * 재 복습: 2024-12-20
     */
    public static class B1String5 {
        public static void main(String[] args) {
            B1String5 b1String5 = new B1String5();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            for(Integer x : b1String5.solution(str, c)) {
                System.out.print(x + " ");
            }
        }
        public int[] solution(String str, char c) {
            int distance = Integer.MAX_VALUE;
            int[] distances = new int[str.length()];

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance++;
                }
                distances[i] = distance;
            }

            for(int i = str.length() -1; i >= 0; i--) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance++;
                }
                distances[i] = Math.min(distances[i], distance);
            }
            return distances;
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class B1String6 {
        public static void main(String[] args) {
            B1String6 b1String6 = new B1String6();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            for(int x : b1String6.solution(str, c)) {
                System.out.print(x + " ");
            }
        }

        public int[] solution(String str, char c) {
            int distance = 1000;
            int[] distances = new int[str.length()];

            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance ++;
                }
                distances[i] = distance;
            }

            for(int i = str.length() -1; i >= 0; i--) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance ++;
                }
                distances[i] = Math.min(distances[i], distance);
            }
            return distances;
        }
    }

    /**
     * 재 복습: 2024-12-28
     */
    public static class B1String7 {
        public static void main(String[] args) {
            B1String7 b1string7 = new B1String7();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            Integer[] array = b1string7.solution(str, c);
            for(int x : array) {
                System.out.print(x + " ");
            }
        }
        public Integer[] solution(String str, char target) {
            Integer[] distances = new Integer[str.length()];
            Integer distance = 1000;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == target) {
                    distance = 0;
                } else {
                    distance++;
                }
                distances[i] = distance;
            }

            for(int i = str.length() - 1; i >= 0; i--) {
                if(str.charAt(i) == target) {
                    distance = 0;
                } else {
                    distance++;
                }
                distances[i] = Math.min(distances[i], distance);
            }
            return distances;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class B1String8 {
        public static void main(String[] args) {
            B1String8 b1String8 = new B1String8();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            b1String8.solution(str, c);
        }
        public void solution(String str, char c) {
            int[] distances = new int[str.length()];
            int distance = 1000;
            for(int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance++;
                }
                distances[i] = distance;
            }
            for(int i = str.length() - 1; i >= 0; i--) {
                if(str.charAt(i) == c) {
                    distance = 0;
                } else {
                    distance++;
                }
                distances[i] = Math.min(distances[i], distance);
            }
            for(Integer x : distances) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class B1String9 {
        public static void main(String[] args) {
            B1String9 b1String9 = new B1String9();
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            char c = scan.next().charAt(0);
            b1String9.solution(str, c);
        }
        public void solution(String str, Character c) {
            int[] distances = new int[str.length()];
            int distance = 1000;
            for (int i = 0; i < str.length(); i++) {
                Character findChar = str.charAt(i);
                if (findChar.equals(c)) distance = 0;
                else distance++;
                distances[i] = distance;
            }

            distance = 1000;
            for (int i = str.length() - 1; i >= 0; i--) {
                Character findChar = str.charAt(i);
                if (findChar.equals(c)) distance = 0;
                else distance++;
                distances[i] = Math.min(distances[i], distance);
            }
            for (Integer x : distances) {
                System.out.print(x + " ");
            }
        }
    }
}