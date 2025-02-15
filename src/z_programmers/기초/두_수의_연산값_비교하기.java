package z_programmers.기초;

/**
 * 문제 설명
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
 *
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
 *
 * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 *
 * 제한사항
 * 1 ≤ a, b < 10,000
 * 입출력 예
 * a	b	result
 * 2	91	364
 * 91	2	912
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * a ⊕ b = 291 이고, 2 * a * b = 364 입니다. 둘 중 더 큰 값은 364 이므로 364를 return 합니다.
 * 입출력 예 #2
 *
 * a ⊕ b = 912 이고, 2 * a * b = 364 입니다. 둘 중 더 큰 값은 912 이므로 912를 return 합니다.
 * ※ 2023년 04월 27일 입출력 예 설명이 수정되었습니다.
 */
public class 두_수의_연산값_비교하기 {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        int answer = solution(a, b);
        System.out.println(answer);
    }
    public static int solution(int a, int b) {
        String valueOf = String.valueOf(a) + String.valueOf(b);
        int plus = Integer.valueOf(valueOf);
        int col = 2 * a * b;
        if(plus > col) return plus;
        else return col;
    }
}
