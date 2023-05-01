package Programmers.Level01.java01_15;

public class java01_짝수와홀수 {
}

class Solution_01 {
    public String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}
