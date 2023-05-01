package Programmers.Level01.java01_15;

public class java04_자릿수더하기 {
}
class Solution_04 {
    public int solution(int n) {
        int answer = 0;

        while(true) {
            answer += n % 10;
            n /= 10;
            if(n < 10) {
                answer += n % 10;
                break;
            }
        }
        return answer;
    }
}
