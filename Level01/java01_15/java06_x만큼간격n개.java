package Programmers.Level01.java01_15;

public class java06_x만큼간격n개 {
}
class Solution_06 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++) {
            answer[i] = (long) x * (i+1);
        }

        return answer;
    }
}
