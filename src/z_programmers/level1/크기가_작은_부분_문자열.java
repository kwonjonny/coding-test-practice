package z_programmers.level1;

public class 크기가_작은_부분_문자열 {
    public static void main(String[] args) {
        String str = "3141592";
        String p = "271";
        int answer = solution(str, p);
        System.out.println(answer);
    }
    public static int solution(String str, String p) {
        int answer = 0;
        int pLength = p.length();
        for(int i = 0; i < str.length() - pLength + 1; i++) {
            String subString = str.substring(i, pLength + i);
            if(subString.compareTo(p) <= 0) {
                answer++;
            }
        }
        return answer;
    }
}
