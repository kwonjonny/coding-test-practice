package array_solve;

import java.util.Scanner;

/**
 * 멘토링
 * 설명
 *
 * 현수네 반 선생님은 반 학생들의 수학점수를 향상시키기 위해 멘토링 시스템을 만들려고 합니다.
 *
 * 멘토링은 멘토(도와주는 학생)와 멘티(도움을 받는 학생)가 한 짝이 되어 멘토가 멘티의 수학공부를 도와주는 것입니다.
 *
 * 선생님은 M번의 수학테스트 등수를 가지고 멘토와 멘티를 정합니다.
 *
 * 만약 A학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 합니다.
 *
 * M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇 가지 인지 출력하는 프로그램을 작성하세요.
 *
 * 입력
 * 첫 번째 줄에 반 학생 수 N(1<=N<=20)과 M(1<=M<=10)이 주어진다.
 *
 * 두 번째 줄부터 M개의 줄에 걸쳐 수학테스트 결과가 학생번호로 주어진다. 학생번호가 제일 앞에서부터 1등, 2등, ...N등 순으로 표현된다.
 *
 * 만약 한 줄에 N=4이고, 테스트 결과가 3 4 1 2로 입력되었다면 3번 학생이 1등, 4번 학생이 2등, 1번 학생이 3등, 2번 학생이 4등을 의미합니다.
 *
 * 출력
 * 첫 번째 줄에 짝을 만들 수 있는 총 경우를 출력합니다.
 *
 *
 * 예시 입력
    4 3
    3 4 1 2
    4 3 2 1
    3 1 4 2
 *
 * 예시 출력
 * 3
 */
public class B3_Array {

    /**
     * 재 복습: 2025-02-03
     */
    public static class B3Array8 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer testCount = scan.nextInt();
            Integer[][] intArray = new Integer[length + 1][length + 1];
            for(int i = 1; i <= testCount; i++) {
                for(int j = 1; j <= length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            B3Array8.solution(length, testCount, intArray);
        }
        public static void solution(Integer length, Integer testCount, Integer[][] intArray) {
            int answer = 0;
            for(int mentor = 1; mentor <= length; mentor++) {
                for(int mentee = 1; mentee <= length; mentee++) {
                    if(mentor == mentee) continue;
                    boolean canMentor = true;
                    for(int t = 1; t <= testCount; t++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int j = 1; j <= length; j++) {
                            if(intArray[t][j] == mentor) mentorScore = j;
                            if(intArray[t][j] == mentee) menteeScore = j;
                        }
                        if(mentorScore > menteeScore) {
                            canMentor = false;
                            break;
                        }
                    }
                    if(canMentor) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2025-02-01
     */
    public static class B3Array7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer testCount = scan.nextInt();
            Integer[][] intArray = new Integer[testCount + 1][length + 1];
            for(int i = 1; i <= testCount; i++) {
                for(int j = 1; j <= length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            B3Array7.solution(length, testCount, intArray);
        }
        public static void solution(Integer length, Integer testCount, Integer[][] intArray) {
            int answer = 0 ;
            for(int mentor = 1; mentor <= length; mentor++) {
                for(int mentee = 1; mentee <= length; mentee++) {
                    if(mentor == mentee) continue;
                    boolean canMentor = true;

                    for(int i = 1; i <= testCount; i++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int j = 1; j <= length; j++) {
                            if(intArray[i][j] == mentor) mentorScore = j;
                            if(intArray[i][j] == mentee) menteeScore = j;
                        }
                        if(mentorScore > menteeScore) {
                            canMentor = false;
                            break;
                        }
                    }
                    if(canMentor) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    /**
     * 재 복습: 2024-01-14
     * 왜 index 를 1부터 시작하는지 생각해보자 
     */
    public static class B3Array6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer testCount = scan.nextInt();
            Integer[][] intArray = new Integer[testCount + 1][length + 1];
            for(int i = 1; i <= testCount; i++) {
                for(int j = 1; j <= length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            B3Array6.solution(length, testCount, intArray);
        }
        public static void solution(Integer length, Integer testCount, Integer[][] intArray) {
            int ansewr = 0;
            for(int mentor = 1; mentor <= length; mentor++) {
                for(int mentee = 1; mentee <= length; mentee++) {
                    if(mentor == mentee) continue;
                    boolean canMentor = true;
                    for(int t = 1; t <= testCount; t++) {
                        int menteeScore = 0;
                        int mentorScore = 0;
                        for(int i = 1; i <= length; i++) {
                            if(intArray[t][i] == mentor) mentorScore = i;
                            if(intArray[t][i] == mentee) menteeScore = i;
                        }
                        if(mentorScore > menteeScore) {
                            canMentor = false;
                            break;
                        }
                    }
                    if(canMentor) ansewr++;
                }
            }
            System.out.println(ansewr);
        }
    }

    /**
     * 재 복습: 2025-01-10
     */
    public static class B3Array5 {
        public static void main(String[] args) {
            B3Array5 b3Array5 = new B3Array5();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer testCount = scan.nextInt();
            Integer[][] intArray = new Integer[testCount + 1][length + 1];
            for(int i = 1; i <= testCount; i++) {
                for(int j = 1; j <= length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            b3Array5.solution(length, testCount, intArray);
        }
        public void solution(Integer length, Integer testCount, Integer[][] intArray) {
            int answer = 0;
            for(int mentor = 1; mentor <= length; mentor++) {
                for(int mentee = 1; mentee <= length; mentee++) {
                    if(mentor == mentee) continue;
                    boolean isPossible = true;
                    for(int t = 1; t <= testCount; t++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int score = 1; score <= length; score++) {
                           if(intArray[t][score] == mentor) mentorScore = score;
                           if(intArray[t][score] == mentee) menteeScore = score;
                        }
                        if(mentorScore > menteeScore) {
                            isPossible = false;
                            break;
                        }
                    }
                    if(isPossible) answer++;
                }
            }
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer length = scan.nextInt();
        Integer testCount = scan.nextInt();
        Integer[][] intArray = new Integer[testCount][length];
        for (int i = 0; i < testCount; i++) {
            for (int j = 0; j < length; j++) {
                intArray[i][j] = scan.nextInt();
            }
        }
        Integer answer = solution(length, testCount, intArray);
        System.out.println(answer);
    }
    public static Integer solution(Integer length, Integer testCount, Integer[][] intArray) {
        Integer answer = 0;
        for (int mentor = 1; mentor <= length; mentor++) {
            for (int mentee = 1; mentee <= length; mentee++) {
                if (mentor == mentee) continue;

                boolean isPossible = true;

                for (int k = 0; k < testCount; k++) {
                    int mentorRank = 0;
                    int menteeRank = 0;

                    for (int rank = 0; rank < length; rank++) {
                        if (intArray[k][rank] == mentor) mentorRank = rank;
                        if (intArray[k][rank] == mentee) menteeRank = rank;
                    }

                    if (mentorRank >= menteeRank) {
                        isPossible = false;
                        break;
                    }
                }
                if (isPossible) answer++;
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2025-01-01
     */
    public static class B3Array1 {
        public static void main(String[] args) {
            B3Array1 b3Array1 = new B3Array1();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer testCount = scan.nextInt();
            Integer[][] intArray = new Integer[testCount][length];
            for(int i = 0; i < testCount; i++) {
                for(int j = 0; j < length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            Integer answer = b3Array1.solution(length, testCount, intArray);
            System.out.println(answer);
        }
        public Integer solution(Integer length, Integer testCount, Integer[][] intArray) {
            Integer answer = 0;
            for(int mentor = 1; mentor <= length; mentor++) {
                for(int mentee = 1; mentee <= length; mentee++) {
                    boolean isPossible = true;
                    for(int k = 0; k < testCount; k++) {
                        int mentorRank = 0, menteeRank = 0;
                        for(int rank = 0; rank < length; rank++) {
                            if(intArray[k][rank] == mentor) mentorRank = rank;
                            if(intArray[k][rank] == mentee) menteeRank = rank;
                        }
                        if(mentorRank >= menteeRank) {
                            isPossible = false;
                            break;
                        }
                    }
                    if(isPossible) answer++;
                }
            }
            return answer;
        }
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class B3Array4 {
        public static void main(String[] args) {
            B3Array4 b3Array4 = new B3Array4();
            Scanner scan = new Scanner(System.in);
            Integer length = scan.nextInt();
            Integer testCount = scan.nextInt();
            Integer[][] intArray = new Integer[testCount][length];
            for (int i = 0; i < testCount; i++) {
                for (int j = 0; j < length; j++) {
                    intArray[i][j] = scan.nextInt();
                }
            }
            b3Array4.solution(length, testCount, intArray);
        }
        public void solution(Integer length, Integer testCount, Integer[][] intArray) {
            int answer = 0;
            for(int mentor = 1; mentor <= length; mentor++) {
                for(int mentee = 1; mentee <= length; mentee++) {
                    if(mentor == mentee) continue;
                    boolean can = true;
                    for(int i = 0; i < testCount; i++) {
                        int mentorScore = 0;
                        int menteeScore = 0;
                        for(int j = 0; j < length; j++) {
                            if(intArray[i][j] == mentor) mentorScore = j;
                            if(intArray[i][j] == mentee) menteeScore = j;
                        }
                        if(mentorScore > menteeScore) {
                            can = false;
                            break;
                        }
                    }
                    if(can) answer++;
                }
            }
            System.out.println(answer);
        }
    }
}