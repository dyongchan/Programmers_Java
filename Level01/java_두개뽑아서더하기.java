package Programmers.Level01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class java_두개뽑아서더하기 {
}
class Solution_two {
    public int[] solution(int[] numbers) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                hs.add(numbers[i] + numbers[j]);

            }
        }
        ArrayList<Integer> arr = new ArrayList<>(hs);

        int[] answer = new int[arr.size()];

        Collections.sort(arr);

        System.out.print(arr);


        for(int i=0; i<arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;

    }

}
