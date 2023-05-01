package Programmers.Level01.java01_15;

public class java13_두정수사이의합 {
}
class Solution_13 {
    public long solution(int a, int b) {

        if (a == b) {
            return a;
        } else {
            long sum = 0;
            if(a < b) {
                for (int i = a; i<=b; i++) {
                    sum += i;
                }
            } else {
                for (int i = b; i<=a; i++) {
                    sum += i;
                }
            }
            return sum;
        }
    }
}
