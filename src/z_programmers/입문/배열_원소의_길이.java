package z_programmers.입문;

/**
 * 문제 설명
 * 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ strlist 원소의 길이 ≤ 100
 * strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
 * 입출력 예
 * strlist	result
 * ["We", "are", "the", "world!"]	[2, 3, 3, 6]
 * ["I", "Love", "Programmers."]	[1, 4, 12]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * ["We", "are", "the", "world!"]의 각 원소의 길이인 [2, 3, 3, 6]을 return합니다.
 * 입출력 예 #2
 *
 * ["I", "Love", "Programmers."]의 각 원소의 길이인 [1, 4, 12]을 return합니다.
 */
public class 배열_원소의_길이 {
    public static int[] solution(String[] array) {
        int[] answer = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            int count = array[i].length();
            answer[i] = count;
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] array1 = {"We", "are", "the", "world!"};
        String[] array2 = {"I", "Love", "Programmers."};
        int[] anser1 = solution(array1);
        for(int x : anser1) {
            System.out.print(x + " ");
        }
        int[] answer2 = solution(array2);
        for(int x : answer2) {
            System.out.print(x + " ");
        }
    }
}
