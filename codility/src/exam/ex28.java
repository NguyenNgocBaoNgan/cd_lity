package exam;

import java.util.ArrayList;
import java.util.HashMap;

//You are given a list of all the transactions on a bank account during the year 2020. The account was empty at the beginning of the year (the balance was 0).

//Each transaction specifies the amount and the date it was executed. If the amount is negative (less than 0) then it was a card payment, otherwise it was an
//
//Incoming transfer (amount at least 0). The date of each transaction is in YYYY-MM-DD format: for example, 2020-05-20 represents 20th May 2020.
//
//Additionally, there is a fee for having a card (omitted in the given transaction list), which is 5 per month. This fee is deducted from the account balance at the end of each month unless there were at least three payments made by card for a total cost of at least 100 within that month.
//
//Your task is to compute the final balance of the account at the end of the year 2020.
//
//Write a function:
//
//class Solution (public int solution(int[] A, String[] D); }
//
//that, given an array A of N integers representing transaction amounts and an array D of N strings representing transaction dates, returns the final balance of the account at the end of the year 2020. Transaction number K (for K within the range [0..N-1]) was executed on the date represented by D[K) for amount A[K]
//
//Examples:
//
//1. Given A = [100, 100, 100, - 10] and D =["2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"], the function should return 230. Total income was equal
//
//to 100 + 100 + 100 - 10 = 290 and the fee was paid every month, so 290-(5*12) = 230.
//
//2. Given A = [180, - 50, - 25, - 25] and D = ['2020-01-01", "2020-01-01", "2020-01-01", "2020-01-311, the function should return 25. The income was equal to 180, the expenditure was equal to 100 and the fee was applied in every month except January: 180-100-(511) = 25.
//
//3. Given A = [1, - 1, 0, - 105, 1] and D =["2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"), the function should return -164. The fee is paid every month. 1 - 1 + 0 - 105 + 1 - (5 * 12) = - 164 Note that in April, even though the total cost of card payments was 106 (more than 100), there were only two payments made by card, so the fee was still applied. A transaction of value 0 is considered a positive, incoming transfer.
//
//4. Given and D = ['2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"), the function should return 60. A = [100, 100, - 10, - 20, - 30]
//
//5. Given A = [- 60, 60, - 40, - 20] and D = ['2020-10-01", "2020-02-02", "2020-10-10", "2020-10-30'), the function should returm-115.
//
//Assume that:
//N is an integer within the range [1..100];
//
//each element of array A is an integer within the range [-1,000..1,000];
//
//• D contains strings s in YYYY-MM-DD format, representing dates in the range 2020-01-01 to 2020-12-31.
//
//In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
public class ex28 {
	public static int solution (int[] A, String[] D) {
		int rs =0;
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		for(int i =0; i < A.length; i++) {
			String[] list = D[i].split("-");
			String month = list[1];
			rs+= A[i];
			
			if(A[i]<0) {
			map.putIfAbsent(month, new ArrayList<>());
	        map.get(month).add(A[i]);
			}
			
		}
		int fee =60;
		//int sum =0;
		for(String s: map.keySet()) {
			 int sum = 0;
			for(int i =0; i < map.get(s).size(); i++) {
				
				sum+= Math.abs(map.get(s).get(i));
			}
			
			if(map.get(s).size() >=3 && sum >=100) {
				fee-=5;
			}
		}
		
		return rs-fee;
	}
	public static void main(String[] args) {
		// Test case 1
        int[] A1 = {100, 100, 100, -10};
        String[] D1 = {"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};
        System.out.println(solution(A1, D1));  // Expected output: 230

       // Test case 2
        int[] A2 = {180, -50, -25, -25};
        String[] D2 = {"2020-01-01", "2020-01-01", "2020-01-01", "2020-01-31"};
        System.out.println(solution(A2, D2));  // Expected output: 25

        // Test case 3
        int[] A3 = {1, -1, 0, -105, 1};
        String[] D3 = {"2020-12-31", "2020-04-04", "2020-04-04", "2020-04-14", "2020-07-12"};
        System.out.println(solution(A3, D3));  // Expected output: -164

        // Test case 4
        int[] A4 = {100, 100, -10, -20, -30};
        String[] D4 = {"2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"};
        System.out.println(solution(A4, D4));  // Expected output: 80

//        // Test case 5
        int[] A5 = {-60, 60, -40, -20};
        String[] D5 = {"2020-10-01", "2020-02-02", "2020-10-10", "2020-10-30"};
        System.out.println(solution(A5, D5));  // Expected output: -115
    
	}
}
