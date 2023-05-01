package Programmers.Level01.java01_15;

public class java14_콜라츠추측 {
}
class Solution_14 {
    public int solution(int num) {
        int repeat = 0;
        long n = num ;

        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = (n * 3) + 1;
            }
            repeat++;

            if (repeat > 500) {
                break;
            }
        }

        System.out.print(repeat);

        if (repeat > 500) {
            return -1;
        } else {
            return repeat;
        }

    }
}