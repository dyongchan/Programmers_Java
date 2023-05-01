package Programmers.Level01.java01_15;
import java.lang.StringBuilder;
public class java10_문자열정수변환 {
}
class Solution_10 {
    public int solution(String s) {
        int answer = 0;

        StringBuilder sb = new StringBuilder(s);

        if(s.charAt(0) == '-') {
            answer = Integer.parseInt(sb.toString());
            return answer;
        } else {
            answer = Integer.parseInt(sb.toString());
        }

        return answer;
    }
}
