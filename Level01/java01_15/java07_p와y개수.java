package Programmers.Level01.java01_15;

public class java07_p와y개수 {
}
class Solution_07 {
    boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;

        String str = s.toUpperCase();

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'Y') {
                y++;
            } else if(str.charAt(i) == 'P') {
                p++;
            }
        }

        if (p == y || (p == 0) && (y == 0)) {
            return answer;
        } else{
            answer = false;
            return answer;
        }
    }
}
