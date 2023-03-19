package Programmers.Level01;

import java.util.Arrays;
public class java_최댓값과최솟값 {
}
class Solution {
    public String solution(String s) {

        int min = 0;
        int max = 0;

        String answer = "";
        String[] ans = s.split(" ");

        int[] arr = new int[ans.length];

        for (int i = 0; i<ans.length; i++) {
            arr[i] = Integer.valueOf(ans[i]);
        }

        Arrays.sort(arr);

        min = arr[0];
        max = arr[arr.length-1];

        answer = String.valueOf(min)+" "+String.valueOf(max);

        return answer;
    }
}
