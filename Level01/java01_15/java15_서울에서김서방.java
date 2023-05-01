package Programmers.Level01.java01_15;

public class java15_서울에서김서방 {
}
class Solution_15 {
    public String solution(String[] seoul) {
        String answer = "";

        for (int i=0; i<seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은"+" "+i+"에 있다";
            }
        }

        return answer;
    }
}