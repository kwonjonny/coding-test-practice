package z_programmers.level2;

import java.util.*;

public class 전화번호_목록 {
    public static void main(String[] args) {
        String[] phoneBook = {"119", "97674223", "1195524421"};
        boolean answer = solution(phoneBook);
        System.out.println(answer);

        String[] phoneBook1 = {"123","456","789"};
        boolean answer1 = solution(phoneBook1);
        System.out.println(answer1);

        String[] phoneBook2 = {"12","123","1235","567","88"};
        boolean answer2 = solution(phoneBook2);
        System.out.println(answer2);
    }
    public static boolean solution(String[] phoneBook) {
        boolean answer = true;

        Arrays.sort(phoneBook);
        for(int i = 0; i < phoneBook.length - 1; i++) {
            String suffix = phoneBook[i];
            if(phoneBook[i + 1].startsWith(suffix)) {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
