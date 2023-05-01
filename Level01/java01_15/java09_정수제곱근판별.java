package Programmers.Level01.java01_15;
import java.lang.Math;

public class java09_정수제곱근판별 {
}
class Solution_09 {
    public long solution(long n) {
        long answer = 0;

        if (Math.sqrt(n) % 1 == 0) { // 1로 나눈 나머지 = 0 : 정수
            answer =  (long)((Math.sqrt(n)+1) * (Math.sqrt(n)+1));
        } else {
            answer = -1;
        }

        return answer;
    }
}