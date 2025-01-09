package stack_solve;

import java.util.Scanner;
import java.util.Stack;

/**
 * 크레인 인형뽑기(카카오)
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
 * 첫 줄에 터트려져 사라진 인형의 개수를 출력합니다.
 * <p>
 * <p>
 * 예시 입력 1
     5
     0 0 0 0 0
     0 0 1 0 3
     0 2 5 0 1
     4 2 4 4 2
     3 5 1 3 1
     8
     1 5 3 5 1 2 1 4
 * <p>
 * 예시 출력
 * 4
 */
public class A3_Stack {

    /**
     * 재 복습: 2025-01-10
     */
    public static class A3Stack4 {
        public static void main(String[] args) {
            A3Stack4 a3Stack4 = new A3Stack4();
            Scanner scan = new Scanner(System.in);
            Integer boardLength = scan.nextInt();
            Integer[][] boardArray = new Integer[boardLength][boardLength];
            for (int i = 0; i < boardLength; i++) {
                for (int j = 0; j < boardLength; j++) {
                    boardArray[i][j] = scan.nextInt();
                }
            }
            Integer moves = scan.nextInt();
            Integer[] movesArray = new Integer[moves];
            for (int i = 0; i < moves; i++) {
                movesArray[i] = scan.nextInt();
            }
            a3Stack4.solution(boardLength, boardArray, moves, movesArray);
        }

        public void solution(Integer boardLength, Integer[][] boardArray, Integer moves, Integer[] movesArray) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;

            for (Integer x : movesArray) {
                int pickup = x - 1;
                for (int i = 0; i < boardLength; i++) {
                    int doll = boardArray[i][pickup];
                    if (doll != 0) {
                        boardArray[i][pickup] = 0;
                        if (!stack.isEmpty() && stack.peek().equals(doll)) {
                            stack.pop();
                            answer = answer + 2;
                        } else {
                            stack.push(doll);
                        }
                        break;
                    }
                }
            }
            System.out.println(answer);
        }
    }


    /**
     * 재 복습: 2025-01-09
     */
    public static class A3Stack3 {
        public static void main(String[] args) {
            A3Stack3 a3Stack3 = new A3Stack3();
            Scanner scan = new Scanner(System.in);
            Integer boardLength = scan.nextInt();
            Integer[][] boards = new Integer[boardLength][boardLength];
            for (int i = 0; i < boardLength; i++) {
                for (int j = 0; j < boardLength; j++) {
                    boards[i][j] = scan.nextInt();
                }
            }
            Integer moves = scan.nextInt();
            Integer[] movesArray = new Integer[moves];
            for (int i = 0; i < moves; i++) {
                movesArray[i] = scan.nextInt();
            }
            a3Stack3.solution(boardLength, boards, moves, movesArray);
        }

        public void solution(Integer boardLength, Integer[][] boardArray, Integer moves, Integer[] movesArray) {
            Stack<Integer> stack = new Stack<>();
            int answer = 0;

            for (Integer x : movesArray) {
                int pickUp = x - 1;
                for (int i = 0; i < boardLength; i++) {
                    if (boardArray[i][pickUp] != 0) {
                        int doll = boardArray[i][pickUp];
                        boardArray[i][pickUp] = 0;
                        stack.push(doll);
                        if (!stack.isEmpty() && stack.peek().equals(doll)) {
                            answer = answer + 2;
                            stack.pop();
                        } else stack.push(doll);
                    }
                }
            }
            for (Integer x : stack) {
                System.out.print(x + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer boardLength = scan.nextInt();
        Integer[][] boardArray = new Integer[boardLength][boardLength];
        for (int i = 0; i < boardLength; i++) {
            for (int j = 0; j < boardLength; j++) {
                boardArray[i][j] = scan.nextInt();
            }
        }
        Integer movesLength = scan.nextInt();
        Integer[] movesArray = new Integer[movesLength];
        for (int i = 0; i < movesLength; i++) {
            movesArray[i] = scan.nextInt();
        }
        Integer answer = solution(boardLength, boardArray, movesLength, movesArray);
        System.out.println(answer);
    }

    public static Integer solution(Integer boardLength, Integer[][] boardArray, Integer movesLength, Integer[] movesArray) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (Integer pos : movesArray) {
            for (int i = 0; i < boardArray.length; i++) {
                if (boardArray[i][pos - 1] != 0) {
                    int temp = boardArray[i][pos - 1];
                    boardArray[i][pos - 1] = 0;
                    if (!stack.isEmpty() && stack.peek().equals(temp)) {
                        stack.pop();
                        answer = answer + 2;
                    } else stack.push(temp);
                    break;
                }
            }
        }
        return answer;
    }

    /**
     * 재 복습: 2025-01-08
     */
    public static class A3Stack2 {
        public static void main(String[] args) {
            A3Stack2 a3Stack2 = new A3Stack2();
            Scanner scan = new Scanner(System.in);
            Integer boardLength = scan.nextInt();
            Integer[][] boardArray = new Integer[boardLength][boardLength];
            for (int i = 0; i < boardLength; i++) {
                for (int j = 0; j < boardLength; j++) {
                    boardArray[i][j] = scan.nextInt();
                }
            }
            Integer movesLength = scan.nextInt();
            Integer[] movesArray = new Integer[movesLength];
            for (int i = 0; i < movesLength; i++) {
                movesArray[i] = scan.nextInt();
            }
            a3Stack2.solution(boardLength, boardArray, movesLength, movesArray);
        }

        public void solution(Integer boardLength, Integer[][] boardArray, Integer movesLength, Integer[] movesArray) {
            Stack<Integer> stack = new Stack<>();
            int removeDolls = 0;
            for (Integer x : movesArray) {
                int pos = x - 1;
                for (int i = 0; i < boardLength; i++) {
                    if (boardArray[i][pos] != 0) {
                        int doll = boardArray[i][pos];
                        if (!stack.isEmpty() && stack.peek().equals(doll)) {
                            removeDolls = removeDolls + 2;
                            stack.pop();
                        } else stack.push(doll);
                        boardArray[i][pos] = 0;
                        break;
                    }
                }
            }
            System.out.println(removeDolls);
        }
    }

}
