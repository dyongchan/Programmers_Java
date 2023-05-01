package Programmers.Level01.java01_15;

public class java08_자연수뒤집어배열 {
}
class Solution_08 {
    public int[] solution(long n) {
        String str = String.valueOf(n);

        int[] answer = new int[str.length()];

        for (int i=0; i<str.length(); i++) {
            long m = n % 10;
            answer[i] = (int) m;
            n /= 10;
        }

        return answer;
    }
}

