package Programmers.Level01.java01_15;
import java.util.ArrayList;

public class java02_약수의합 {
}
class Solution_02 {
    public int solution(int n) {
        int answer = 0;

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i=1; i<=n; i++) {
            if(n % i == 0) {
                arr.add(i);
            }
        }

        for (int i=0; i<arr.size(); i++) {
            answer += arr.get(i);
        }


        return answer;
    }
}