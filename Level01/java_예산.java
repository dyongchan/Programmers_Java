package Programmers.Level01;

import java.util.Arrays;

public class java_예산 {
}
class Solution_budget {
    public int solution(int[] d, int budget) {

        int answer = 0;

        Arrays.sort(d);

        for(int i=0; i<d.length; i++) {
            if(d[i] <= budget) {
                budget = budget - d[i];
                answer++;
            } else {
                break;
            }
        }
        return answer;

    }
}
