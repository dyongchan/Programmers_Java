package Programmers.Level01.java01_15;

public class java03_평균구하기 {
}
class Solution_03 {
    public double solution(int[] arr) {
        double answer = 0;

        double sum = 0;

        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }

        answer = sum / arr.length;


        return answer;
    }
}