package z_baekjoon.silver.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * 균형잡힌 세상 
 *
 * 시간 제한	메모리 제한	제출	    정답	    맞힌 사람	정답 비율
 * 1 초	    128 MB	    158330	54148	41716	    32.883%
 * 문제
 * 세계는 균형이 잘 잡혀있어야 한다. 양과 음, 빛과 어둠 그리고 왼쪽 괄호와 오른쪽 괄호처럼 말이다.
 *
 * 정민이의 임무는 어떤 문자열이 주어졌을 때, 괄호들의 균형이 잘 맞춰져 있는지 판단하는 프로그램을 짜는 것이다.
 *
 * 문자열에 포함되는 괄호는 소괄호("()") 와 대괄호("[]")로 2종류이고, 문자열이 균형을 이루는 조건은 아래와 같다.
 *
 * 모든 왼쪽 소괄호("(")는 오른쪽 소괄호(")")와만 짝을 이뤄야 한다.
 *
 * 모든 왼쪽 대괄호("[")는 오른쪽 대괄호("]")와만 짝을 이뤄야 한다.
 *
 * 모든 오른쪽 괄호들은 자신과 짝을 이룰 수 있는 왼쪽 괄호가 존재한다.
 *
 * 모든 괄호들의 짝은 1:1 매칭만 가능하다. 즉, 괄호 하나가 둘 이상의 괄호와 짝지어지지 않는다.
 *
 * 짝을 이루는 두 괄호가 있을 때, 그 사이에 있는 문자열도 균형이 잡혀야 한다.
 *
 * 정민이를 도와 문자열이 주어졌을 때 균형잡힌 문자열인지 아닌지를 판단해보자.
 *
 * 입력
 * 각 문자열은 마지막 글자를 제외하고 영문 알파벳, 공백, 소괄호("( )"), 대괄호("[ ]")로 이루어져 있으며, 온점(".")으로 끝나고, 길이는 100글자보다 작거나 같다.
 *
 * 입력의 종료조건으로 맨 마지막에 온점 하나(".")가 들어온다.
 * 출력
 * 각 줄마다 해당 문자열이 균형을 이루고 있으면 "yes"를, 아니면 "no"를 출력한다.
 *
 * 예제 입력 1
 * So when I die (the [first] I will see in (heaven) is a score list).
 * [ first in ] ( first out ).
 * Half Moon tonight (At least it is better than no Moon at all].
 * A rope may form )( a trail in a maze.
 * Help( I[m being held prisoner in a fortune cookie factory)].
 * ([ (([( [ ] ) ( ) (( ))] )) ]).
 *  .
 * .
 * 예제 출력 1
 * yes
 * yes
 * no
 * no
 * no
 * yes
 * yes
 *
 * 힌트
 * 7번째의 " ."와 같이 괄호가 하나도 없는 경우도 균형잡힌 문자열로 간주할 수 있다.
 */
public class Silver4_4949 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            String str = scan.nextLine();
            if(str.equals(".")) {
                break;
            }
            solution(str);
        }
    }
    public static void solution(String str) {
        Stack<Character> stack = new Stack<>();
        for(Character x : str.toCharArray()) {
            if(x.equals('(') || x.equals('[')) {
                stack.push(x);
            }
            else if (x.equals(')')) {
                if(stack.isEmpty() || stack.pop() != '(') {
                    System.out.println("no");
                    return;
                }
            }
            else if (x.equals(']')) {
                if(stack.isEmpty() || stack.pop() != '[') {
                    System.out.println("no");
                    return;
                }
            }
         }
        System.out.println(stack.isEmpty() ? "yes" : "no");
    }
}
