package Programmers.Level01.java01_15;

public class java12_하샤드수 {
}
class Solution_12 {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        int local = x;

        while(local != 0) {
            sum += (local % 10);
            local /= 10;
        }


        if (x % sum == 0) {
            return answer;
        } else {
            answer = false;
            return answer;
        }
    }
}
