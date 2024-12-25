package string_solve;

import java.util.Scanner;

/**
 * 암호
 *
 * 설명: 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보냅니다.
 *
 * 비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있습니다.
 *
 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
 *
 * 만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
 *
 * 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
 *
 * 2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
 *
 * 3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
 *
 * 참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
 *
 * 현수가 4개의 문자를 다음과 같이 신호로 보냈다면
 *
 * #****###**#####**#####**##**
 *
 * 이 신호를 4개의 문자신호로 구분하면
 *
 * #****## --> 'C'
 *
 * #**#### --> 'O'
 *
 * #**#### --> 'O'
 *
 * #**##** --> 'L'
 *
 * 최종적으로 “COOL"로 해석됩니다.
 *
 * 현수가 보낸 신호를 해석해주는 프로그램을 작성해서 영희를 도와주세요.
 *
 * 조건:
 * 1. 첫 줄에는 보낸 문자의 개수(10을 넘지 안습니다)가 입력된다. 다음 줄에는 문자의 개수의 일곱 배 만큼의 #또는 * 신호가 입력됩니다.
 *
 * 2. 현수는 항상 대문자로 해석할 수 있는 신호를 보낸다고 가정합니다.
 *
 * 출력:
 * - 영희가 해석한 문자열을 출력합니다.
 *
 * 예제:
 * 입력:
4
#****###**#####**#####**##**
 *
 * 출력:
 *   COOL
 */
public class B3_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer count = scan.nextInt();
        String str = scan.next();
        System.out.println(solution(str, count));
    }

    public static String solution(String str, Integer count) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < count; i++) {
            String temp = str.substring(0, 7)
                    .replace('#', '1')
                    .replace('*', '0');
            int num = Integer.parseInt(temp, 2);
            str = str.substring(7);
            char c = (char) num;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    /**
     * 왜 또 틀렸을까? --> subString, char int 캐스팅 등등 부족한점이 있어
     * 재 복습: 2024-12-20
     */
    public static class B3String {
        public static void main(String[] args) {
            B3String b3String = new B3String();
            Scanner scan = new Scanner(System.in);
            Integer count = scan.nextInt();
            String str = scan.next();
            System.out.println(b3String.solution(count, str));
        }
        public String solution(Integer count, String str) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < count; i++) {
                String code = str.substring(0, 7)
                        .replace('#', '1')
                        .replace('*', '0');
                int temp = Integer.parseInt(code, 2);
                str = str.substring(7);
                char c = (char) temp;
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }
    }

    /**
     * 재 복습: 2024-12-25
     */
    public static  class B3String3 {
        public static void main(String[] args) {
            B3String3 b3String3 = new B3String3();
            Scanner scan = new Scanner(System.in);
            int count = scan.nextInt();
            String str = scan.next();
            System.out.println(b3String3.solution(count, str));
        }
        public String solution(int count, String str) {
            StringBuilder stringBuilder = new StringBuilder();

            for(int i = 0; i < str.length(); i++) {
                String subString = str.substring(0, 7).replace('#', '1').replace('*', '0');
                int replaceCount = Integer.parseInt(subString, 2);
                char c = (char) replaceCount;
                str = str.substring(7);
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }
    }
}
