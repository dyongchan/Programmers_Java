package Programmers.Level01.java01_15;
import java.util.*;
import java.lang.StringBuilder;
public class java11_정수내림차순변환 {
}
class Solution_11 {
    public long solution(long n) {
        long answer = 0;

        ArrayList<Integer> arr = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            arr.add((int) (n % 10));
            n /= 10;
        }

        Collections.sort(arr, Collections.reverseOrder());

        for (int i=0; i<arr.size(); i++) {
            sb.append(arr.get(i));
        }

        answer = Long.parseLong(sb.toString());

        return answer;

    }
}