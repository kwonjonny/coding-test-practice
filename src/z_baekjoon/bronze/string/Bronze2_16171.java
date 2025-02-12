package z_baekjoon.bronze.string;

import java.util.Scanner;

/**
 * 문제
 * 나는 친구가 적다 (Small)
 * 문제
 * 친구가 적은 성민이는 수업에 결석해도 시험이나 과제에 대한 정보를 제대로 얻을 수 없었다. F 학점을 받을 위기까지 아슬아슬하게 결석일 수를 유지하던 성민이는, 어느 날 갑자기 영문도 모른 채 쪽지시험을 보게 되었다!
 *
 * 갑작스러운 쪽지 시험으로 마음이 급해진 성민이는 매직아이를 사용해 벼락치기를 하기로 한다.
 *
 * 성민이가 듣는 과목의 교과서는, 알파벳 소문자(a-z)와 알파벳 대문자(A-Z)로만 이루어져 있다. 성민이가 교과서에서 찾고자 하는 키워드도 역시 알파벳 소문자와 대문자로만 이루어져 있다. 하지만, 성민이에겐 큰 문제가 생겼다. 결석한 날의 수업 내용을 친구에게 빌려 필기를 하던 중, 교과서에 숫자(0-9)를 적어버린 것이다.
 *
 * 키워드를 찾기 힘들어 패닉에 빠진 성민이는 몇 안 되는 친구인 당신에게 도움을 요청했다. 성민이를 도와, 교과서에서 성민이가 찾고자 하는 키워드의 존재 여부를 알려주자.
 *
 * 입력
 * 첫 번째 줄에는 알파벳 소문자, 대문자, 숫자로 이루어진 문자열 S가 주어진다. (1 ≤ |S| ≤ 100) 두 번째 줄에는 성민이가 찾고자 하는 알파벳 소문자, 대문자로만 이루어진 키워드 문자열 K가 주어진다. (1 ≤ |K| ≤ 100).
 *
 * 단, 입력으로 들어오는 키워드 문자열 K의 길이는, 교과서의 문자열 S보다 짧거나 같다.
 *
 * 출력
 * 첫 번째 줄에 성민이가 찾고자 하는 키워드가 문자열 내에 존재하면 1, 존재하지 않으면 0을 출력한다.
 *
 * 예제 입력 1
 * 1q2w3e4r5t6y
 * qwerty
 * 예제 출력 1
 * 1
 * "1q2w3e4r5t6y" 라는 문자열에서 "qwerty"라는 문자열을 찾을 수 있다.
 *
 * > 2,4,6,8,10,12번째의 q,w,e,r,t,y를 보면 존재한다는 것을 알 수 있다.
 *
 * 예제 입력 2
 * 1ovey0uS2
 * veS
 * 예제 출력 2
 * 0
 *
 * "1ovey0uS2"라는 문자열 에서 "veS"라는 문자열의 구성 요소인 v,e,S는 각각 원래 문자열의 3,4,8번째 위치에 존재하지만
 *
 * 연속된 문자열이 아니기때문에 찾고자 하는 키워드는 원래 문장에 존재하지 않는다.
 *
 *  >> veyu, eyu, uS, ovey는 문자열 내에 존재하는 키워드이다.
 */
public class Bronze2_16171 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(solution(str1, str2));
    }
    public static Integer solution(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        for(char c: str1.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                stringBuilder.append(c);
            }
        }
        if(stringBuilder.toString().contains(str2)) {
            return 1;
        }
        return 0;
    }
}
