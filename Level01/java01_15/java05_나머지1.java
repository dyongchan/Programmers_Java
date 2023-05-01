package Programmers.Level01.java01_15;

public class java05_나머지1 {
}
class Solution_05 {
    public int solution(int n) {
        int answer = 0;

        for (int i=2; i<n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}