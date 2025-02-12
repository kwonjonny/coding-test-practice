package string_solve;

import java.util.Scanner;

/**
 * 문장 속 단어
 *
 * 설명: 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 *
 * 조건:
 * 1. 첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다.
 * 2. 문장은 영어 알파벳으로만 구성되어 있습니다.
 *
 * 출력:
 * - 첫 줄에 가장 긴 단어를 출력한다.
 *  가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어를 답으로 합니다.
 *
 * 예제:
 * 입력:
 *   it is time to study
 * 출력:
 *   study
 */
public class A3_String {

    /**
     * 재 복습: 2025-02-01
     */
    public static class A3String9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            A3String9.solution(str);
        }
        public static void solution(String str) {
            String[] splitString = str.split(" ");
            int length = 0;
            String answer = "";
            for(String x : splitString) {
                if(x.length() > length) {
                    length = x.length();
                    answer = x;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-14
     */
    public static class A3String8 {
        public static void main(String[] args) {
            A3String8 a3String8 = new A3String8();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            a3String8.solution(str);
        }
        public void solution(String str) {
            String[] splitStr = str.split(" ");
            String answer = "";
            int max = 0;
            for(String x : splitStr) {
                if(x.length() > max) {
                    max = x.length();
                    answer = x;
                }
            }
            System.out.println(answer);
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String solution = solution(str);
        System.out.println(solution);
    }

    public static String solution(String str) {
        String answer = "";
        Integer answerCount = Integer.MIN_VALUE;

        String[] strArray = str.split(" ");

        for(String s : strArray) {
            Integer len = s.length();
            if(len > answerCount) {
                answerCount = len;
                answer = s;
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2024-12-04
     */
    public static class A3String {
        public static void main(String[] args) {
            A3String a3String = new A3String();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String solution = a3String.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            String answer = "";
            Integer answerCount = Integer.MIN_VALUE;
            String[] array = str.split(" ");

            for(String x : array) {
                Integer solutionLen = x.length();
                if(solutionLen > answerCount) {
                    answer = x;
                    solutionLen = answerCount;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-06
     */
    public static class A3String1 {
        public static void main(String[] args) {
            A3String1 a3String1 = new A3String1();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String solution = a3String1.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            Integer count = 0;
            String solution = "";
            String[] strings = str.split(" ");

            for(String s : strings) {
                Integer forCount = s.length();
                if(forCount > count) {
                    count = forCount;
                    solution = s;
                }
            }
            return str;
        }
    }

    /**
     * 재 복습: 2024-12-11
     */
    public static class A3String2 {
        public static void main(String[] args) {
            A3String2 a3String2 = new A3String2();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String solution = a3String2.solution(str);
            System.out.println(solution);
        }

        public String solution(String str) {
            String[] words  = str.split(" ");
            String solutionWord = "";
            for(String x : words) {
                if(solutionWord.length() < x.length()) {
                    solutionWord = x;
                }
            }
            return solutionWord;
        }
    }

    /**
     * 재 복습: 2024-12-15
     */
    public static class A3String3 {
        public static void main(String[] args) {
            A3String3 a3String3 = new A3String3();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            System.out.println(a3String3.solution(str));
        }

        public String solution(String str) {
            Integer maxLength = 0;
            String newStrWord = "";

            String[] newStr = str.split(" ");
            for(int i = 0; i <newStr.length; i++) {
                if(maxLength < newStr[i].length()) {
                    maxLength = newStr[i].length();
                    newStrWord = newStr[i];
                }
            }
            return newStrWord;
        }
    }

    /**
     * 재 복습: 2024-12-18 오답
     */
    public static class A3String4 {
        public static void main(String[] args) {
            A3String4 a3String4 = new A3String4();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            System.out.println(a3String4.solution(str));
        }
        public String solution(String str) {
            String answer = "";
            String[] strArray = str.split(" ");
            for(String x : strArray) {
                if(x.length() > answer.length()) {
                    answer = x;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static class A3String5 {
        public static void main(String[] args) {
            A3String5 a3String5 = new A3String5();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            System.out.println(a3String5.solution(str));
        }
        public String solution(String str) {
            String[] stringArray = str.split(" ");
            int max = 0;
            String answer = "";
            for(String x : stringArray) {
                if (x.length() > max) {
                    max = x.length();
                    answer = x;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2024-12-31
     */
    public static class A3String6 {
        public static void main(String[] args) {
            A3String6 a3String6 = new A3String6();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            a3String6.solution(str);
        }
        public void solution(String str) {
            String[] stringArray = str.split(" ");
            int max = 0;
            String answer = "";
            for(String x : stringArray) {
                if(x.length() > max) {
                    max = x.length();
                    answer = x;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A3String7 {
        public static void main(String[] args) {
            A3String7 a3String7 = new A3String7();
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            a3String7.solution(str);
        }
        public void solution(String str) {
            String[] splitArray = str.split(" ");
            int maxLength = 0;
            String answer = "";
            for(String x : splitArray) {
                if(x.length() > maxLength) {
                    maxLength = x.length();
                    answer = x;
                }
            }
            System.out.println(answer);
        }
    }
}
