package exam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;
import java.util.Stack;

//In order to finish a game, a player has to complete N missions. The missions are numbered from 0 to N-1. The Kith mission has an Integer D[K] assigned, representing its difficulty level.
//
//During a day, you can perform any number of missions given the two following rules:
//
//missions should be performed in the specified order, in other words, a mission can be undertaken only if all of the missions preceding It have already been completed,
//
//⚫ the difference between the difficulty levels of any two missions performed on the same day should not be greater than an integer X.
//
//Write a function:
//
//int solution(int D[], int N, int X);
//
//that, given an array D of N integers and an integer X, returns the minimum number of days required to complete all of the missions in the game.
//
//Examples:
//
//1. Given D =[5, 8, 2, 7] and X = 3, your function should return 3. The first two missions can be performed or the first day, the third mission on the second day and the last mission on the third day. It is not possible to complete all I of the missions in fewer day
//
//2. Given D=(12, 5, 9, 2, 1, 4) and X = 4, your action should return 3. The first two missions can be performed on the first day, the third mission on the second day and all of the remaining missions on the third day. Note that it is possible to perform the first mission on the first day and the next two missions on the second day. In both of these cases, the minimum number of days required to complete all of the missions is 3.
//
//3. Given D=(11, 12, 10, 4, 5, 2) and X=2, your function should return 4. The first mission can be performed on the first day, the next two missions on the second day, the fourth and fifth missions on the third day and the last remaining mission on the fourth day. It is not possible to complete all of the missions in fewer
//
//Write an efficient algorithm for the following assumptions:
//
//is an integer within the range [1-200,000)
//
//Xis an integer within the range 101,000,000,000)
//
//sach plement of array is en integer within the range (1-1,000,000,000)
public class ex24 {
	public static int solution(int D[], int N, int X) {
        int day = 1;  
        int min = D[0];  
        int max = D[0];  

        for (int i = 1; i < N; i++) {
            if (Math.abs(D[i] - min) > X || Math.abs(D[i] - max) > X) {
                day++;  
                min = D[i];  
                max = D[i];
            } else {
              
                min = Math.min(min, D[i]);
                max = Math.max(max, D[i]);
            }
        }

        return day;
    }
	public static void main(String[] args) {
		 int[] D = {5, 8, 2, 7};
	        int[] D1 = {2, 5, 9, 2, 1, 4};
	        int[] D2 = {1, 12, 10, 4, 5, 2};

	        System.out.println(solution(D, D.length, 3));  // Kết quả mong đợi: 3
	        System.out.println(solution(D1, D1.length, 4)); // Kết quả mong đợi: 3
	        System.out.println(solution(D2, D2.length, 2)); // Kết quả mong đợi: 4

	}
}
