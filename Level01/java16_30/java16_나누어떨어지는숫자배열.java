package Programmers.Level01.java16_30;
import java.util.*;

public class java16_나누어떨어지는숫자배열 {
}
class Solution {
    public int[] solution(int[] arr, int divisor) {

        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
                cnt ++;
            }
        }
        if (cnt == 0) {
            list.add(-1);
        }
        Collections.sort(list);

        System.out.print(list);

        int[] answer = new int[list.size()];

        if (cnt == 0) {
            answer[cnt] = list.get(cnt);
            return answer;
        } else {
            int size = 0;
            for (int i : list) {
                answer[size++] = i;
            }
            return answer;
        }
    }
}