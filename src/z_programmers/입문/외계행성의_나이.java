package z_programmers.입문;

import java.util.*;

/**
 * 문제 설명
 * 우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 입국심사에서 나이를 말해야 하는데,
 * PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다. a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
 * 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * age는 자연수입니다.
 * age ≤ 1,000
 * PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.
 * 입출력 예
 * age	    result
 * 23	    "cd"
 * 51	    "fb"
 * 100	    "baa"
 *
 * 입출력 예 설명
 * 입출력 예 #1
 * age가 23이므로 "cd"를 return합니다.
 *
 * 입출력 예 #2
 * age가 51이므로 "fb"를 return합니다.
 * 
 * 입출력 예 #3
 * age가 100이므로 "baa"를 return합니다.
 */
public class 외계행성의_나이 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        String answer = solution(age);
        System.out.println(answer);
    }
    public static String solution(int age) {
        String answer = "";
        String str = String.valueOf(age);
        for(char x : str.toCharArray()) {
            char parseChar = (char) ('a' + (x - '0'));
            answer += parseChar;
        }

        return answer;
    }
}
