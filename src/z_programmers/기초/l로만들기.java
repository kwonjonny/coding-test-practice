package z_programmers.기초;

public class l로만들기 {
    public static void main(String[] args) {
        String str = "abcdevwxyz";
        String answer = solution(str);
        System.out.println(answer);
    }
    public static String solution(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char findChar = str.charAt(i);
            if(findChar > 'l') stringBuilder.append(findChar);
            else stringBuilder.append("l");
        }
        return stringBuilder.toString();
    }
}
