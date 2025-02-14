package z_programmers.기초;

import java.util.*;

public class 문자열_잘라서_정렬하기 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] answer = solution(str);
        System.out.println(Arrays.toString(answer));
    }
    public static String[] solution(String myString) {
        List<String> answer = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < myString.length(); i++) {
            char findChar = myString.charAt(i);
            if(findChar == 'x') {
                if(stringBuilder.length() > 0) {
                    answer.add(stringBuilder.toString());
                    stringBuilder.setLength(0);
                }
            }
            else stringBuilder.append(findChar);
        }

        if(stringBuilder.length() > 0) answer.add(stringBuilder.toString());

        String[] realAnswer = answer.toArray(new String[0]);
        Arrays.sort(realAnswer);

        return realAnswer;
    }
}
