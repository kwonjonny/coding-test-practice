package z_programmers.기초;

import java.util.*;

/**
 * 문제 설명
 * 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때, my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 *
 * 제한사항
 * my_string은 영소문자와 공백으로만 이루어져 있습니다.
 * 1 ≤ my_string의 길이 ≤ 1,000
 * my_string의 맨 앞과 맨 뒤에도 공백이 있을 수 있습니다.
 * my_string에는 단어가 하나 이상 존재합니다.
 *
 * 입출력 예
 * my_string	            result
 * " i    love  you"	    ["i", "love", "you"]
 * "    programmers  "	    ["programmers"]
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * 예제 1번의 my_string은 " i    love  you"로 공백을 기준으로 단어를 나누면 "i", "love", "you" 3개의 단어가 있습니다. 따라서 ["i", "love", "you"]를 return 합니다.
 *
 * 입출력 예 #2
 * 예제 2번의 my_string은 "    programmers  "로 단어는 "programmers" 하나만 있습니다. 따라서 ["programmers"]를 return 합니다.
 */
public class 공백으로_구분하기2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] answer = solution(str);
        System.out.println(Arrays.toString(answer));
    }
    public static String[] solution(String str) {
        String[] split = str.trim().split("\\s+");
        String[] answer = new String[split.length];
        for(int i = 0; i < split.length; i++) {
            answer[i] = split[i];
        }
        return answer;
    }
}