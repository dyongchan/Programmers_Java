package Programmers.Level01;

public class java_문자열나누기 {

}
class Solution_str {
    public int solution(String s) {

        int cnt = 0;
        int re_cnt = 0;
        int answer = 0;

        char box = s.charAt(0);

        for(int i=0; i<s.length(); i++) {
            if (cnt == re_cnt) {
                answer++;
                box = s.charAt(i);
            }
            if(box == s.charAt(i)) {
                cnt++;
            } else {
                re_cnt++;
            }
        }
        return answer;
    }

}