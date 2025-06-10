package java_알고리즘_문제풀이_입문_코딩테스트_대비.스택_큐;

/**
 * 3. 크레인 인형뽑기(카카오)
 * 설명
 * <p>
 * 게임개발자인 죠르디는 크레인 인형뽑기 기계를 모바일 게임으로 만들려고 합니다.
 * <p>
 * 죠르디는 게임의 재미를 높이기 위해 화면 구성과 규칙을 다음과 같이 게임 로직에 반영하려고 합니다.
 * <p>
 * 게임 화면은 1 x 1 크기의 칸들로 이루어진 N x N 크기의 정사각 격자이며 위쪽에는 크레인이 있고 오른쪽에는 바구니가 있습니다.
 * <p>
 * (위 그림은 5 x 5 크기의 예시입니다). 각 격자 칸에는 다양한 인형이 들어 있으며 인형이 없는 칸은 빈칸입니다.
 * <p>
 * 모든 인형은 1 x 1 크기의 격자 한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다.
 * <p>
 * 게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다. 집어 올린 인형은 바구니에 쌓이게 되는 데,
 * <p>
 * 이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩니다.
 * <p>
 * 다음 그림은 [1번, 5번, 3번] 위치에서 순서대로 인형을 집어 올려 바구니에 담은 모습입니다.
 * <p>
 * 만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면 두 인형은 터뜨려지면서 바구니에서 사라지게 됩니다.
 * <p>
 * 위 상태에서 이어서 [5번] 위치에서 인형을 집어 바구니에 쌓으면 같은 모양 인형 두 개가 없어집니다.
 * <p>
 * 크레인 작동 시 인형이 집어지지 않는 경우는 없으나 만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다.
 * <p>
 * 또한 바구니는 모든 인형이 들어갈 수 있을 만큼 충분히 크다고 가정합니다. (그림에서는 화면표시 제약으로 5칸만으로 표현하였음)
 * <p>
 * 게임 화면의 격자의 상태가 담긴 2차원 배열 board와 인형을 집기 위해 크레인을 작동시킨 위치가 담긴 배열 moves가 매개변수로 주어질 때,
 * <p>
 * 크레인을 모두 작동시킨 후 터트려져 사라진 인형의 개수를 구하는 프로그램을 작성하세요.
 * <p>
 * <p>
 * 입력
 * <p>
 * 첫 줄에 자연수 N(5<=N<=30)이 주어집니다.
 * <p>
 * 두 번째 줄부터 N*N board 배열이 주어집니다.
 * <p>
 * board의 각 칸에는 0 이상 100 이하인 정수가 담겨있습니다.
 * <p>
 * 0은 빈 칸을 나타냅니다.
 * <p>
 * 1 ~ 100의 각 숫자는 각기 다른 인형의 모양을 의미하며 같은 숫자는 같은 모양의 인형을 나타냅니다.
 * <p>
 * board배열이 끝난 다음줄에 moves 배열의 길이 M이 주어집니다.
 * <p>
 * 마지막 줄에는 moves 배열이 주어집니다.
 * <p>
 * moves 배열의 크기는 1 이상 1,000 이하입니다.
 * <p>
 * moves 배열 각 원소들의 값은 1 이상이며 board 배열의 가로 크기 이하인 자연수입니다.
 * <p>
 * <p>
 * 출력
 * <p>
 * 첫 줄에 터트려져 사라진 인형의 개수를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
 * <p>
    5
    0 0 0 0 0
    0 0 1 0 3
    0 2 5 0 1
    4 2 4 4 2
    3 5 1 3 1
    8
    1 5 3 5 1 2 1 4
 * 예시 출력 1
 * <p>
 * 4
 */

import java.util.*;

public class C_크레인_인형뽑기_카카오3 {

    /**
     * 재 복습: 2025-06-10
     */
    public static class C_크레인_인형뽑기_카카오3_4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int first = scan.nextInt();
            int[][] firstArray = new int[first][first];
            for(int i = 0; i < first; i++) {
                for(int j = 0; j < first; j++) {
                    firstArray[i][j] = scan.nextInt();
                }
            }
            int moves = scan.nextInt();
            int[] movesArray = new int[moves];
            for(int i = 0; i < moves; i++) {
                movesArray[i] = scan.nextInt();
            }
            solution(first, firstArray, moves, movesArray);
        }
        public static void solution(int first, int[][] firstArray, int moves, int[] movesArray) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;
            for(int x : movesArray) {
                int pickUp = x - 1;
                for(int i = 0; i < first; i++) {
                    if(firstArray[i][pickUp] != 0) {
                        int pickUpDoll = firstArray[i][pickUp];
                        firstArray[i][pickUp] = 0;
                        if(!stack.isEmpty() && stack.peek() == pickUpDoll) {
                            stack.pop();
                            answer += 2;
                        }
                        else {
                            stack.push(pickUpDoll);
                        }
                        break;
                    }
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-05-12
     */
    public static class C_크레인_인형뽑기_카카오3_3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int board = scan.nextInt();
            int[][] boardArray = new int[board][board];
            for(int i = 0; i < board; i++) {
                for(int j = 0; j < board; j++) {
                    boardArray[i][j] = scan.nextInt();
                }
            }
            int moves = scan.nextInt();
            int[] movesArray = new int[moves];
            for(int i = 0; i < moves; i++) {
                movesArray[i] = scan.nextInt();
            }
            solution(board, boardArray, moves, movesArray);
        }
        public static void solution(int board, int[][] boardArray, int moves, int[] movesArray) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;
            for(int x : movesArray) {
                int pick = x - 1;
                for(int i = 0; i < board; i++) {
                    if(boardArray[i][pick] != 0) {
                        int doll = boardArray[i][pick];
                        boardArray[i][pick] = 0;
                        if(!stack.isEmpty() && stack.peek() == doll) {
                            stack.pop();
                            answer += 2;
                            break;
                        }
                        else {
                            stack.push(doll);
                            break;
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-03-28
     */
    public static class C_크레인_인형뽑기_카카오3_2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int dollLength = scan.nextInt();
            int[][] dollArray = new int[dollLength][dollLength];
            for(int i = 0; i < dollLength; i++) {
                for(int j = 0; j < dollLength; j++) {
                    dollArray[i][j] = scan.nextInt();
                }
            }
            int movesLength = scan.nextInt();
            int[] movesArray = new int[movesLength];
            for(int i = 0; i < movesLength; i++) {
                movesArray[i] = scan.nextInt();
            }
            solution(dollLength, dollArray, movesLength, movesArray);
        }
        public static void solution(int dollLength, int[][] dollArray, int movesLength, int[] movesArray) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;
            for(int i = 0; i < movesLength; i++) {
                int pickUp = (movesArray[i] - 1);
                for(int j = 0; j < dollLength; j++) {
                    int pickDoll = dollArray[j][pickUp];
                    if(pickDoll != 0) {
                        if(!stack.isEmpty() && pickDoll == stack.peek()) {
                           answer += 2;
                           stack.pop();
                           dollArray[j][pickUp] = 0;
                           break;
                        }
                        else {
                            stack.push(pickDoll);
                            dollArray[j][pickUp] = 0;
                            break;
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-03-05
     */
    public static class C_크레인_인형뽑기_카카오3_1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int[][] dolls = new int[N][N];
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    dolls[i][j] = scan.nextInt();
                }
            }
            int T = scan.nextInt();
            int[] moves = new int[T];
            for(int i = 0; i < T; i++) {
                moves[i] = scan.nextInt();
            }
            int answer = solution(N, dolls, T, moves);
            System.out.println(answer);
        }
        public static int solution(int N, int[][] dolls, int T, int[] moves) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;
            for(int i = 0; i < T; i++) {
                int pick = (moves[i] - 1);
                for(int j = 0; j < N; j++) {
                   if(dolls[j][pick] != 0) {
                       int pickUpDoll = dolls[j][pick];
                       dolls[j][pick] = 0;
                       if(!stack.isEmpty() && stack.peek() == pickUpDoll) {
                           answer = answer + 2;
                           stack.pop();
                           break;
                       }
                       else {
                           stack.push(pickUpDoll);
                           break;
                       }
                   }
                }
            }
            return answer;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[][] dolls = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                dolls[i][j] = scan.nextInt();
            }
        }
        int T = scan.nextInt();
        int[] moves = new int[T];
        for (int i = 0; i < T; i++) {
            moves[i] = scan.nextInt();
        }
        int answer = solution(N, dolls, T, moves);
        System.out.println(answer);
    }

    public static int solution(int N, int[][] dolls, int T, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < T; i++) {
            int move = (moves[i] - 1);
            for (int j = 0; j < N; j++) {
                if (dolls[j][move] != 0) {
                    int pickUpDoll = dolls[j][move];
                    dolls[j][move] = 0;
                    if (!stack.isEmpty() && stack.peek() == pickUpDoll) {
                        answer = answer + 2;
                        stack.pop();
                        break;
                    } else {
                        stack.push(pickUpDoll);
                        break;
                    }
                }
            }
        }
        return answer;
    }
}
