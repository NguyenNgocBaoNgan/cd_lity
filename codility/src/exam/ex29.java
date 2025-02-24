package exam;
//Write a function solution that, given integer N, returns the smallest non-negative integer whose individual digits sum to N.
//
//Examples:
//
//1. Given N = 16 the function should return 79. There are many numbers whose digits sum to 16 (for example: 79, 97, 808, 5551, 22822, etc.). The smallest such number is 79.
//
//2. Given N = 19 the function should return 199 (the sum of digits is 1 + 9 + 9 = 19 )
//
//3. Given N = 7 the function should return 7.
//
//Assume that:
//
//• N is an integer within the range [0..50].
//
//In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
public class ex29 {
	public static int solution (int N) {
		String s ="";
		if(N <= 9) {
			return N;
		} else {
			while (N>9) {
				s+= "9";
				N-=9;
			}
		}
		s = N+s;
		
		return Integer.valueOf(s);
	}
	public static void main(String[] args) {
		 	System.out.println(solution(16)); // Expected output: 79
	        System.out.println(solution(19)); // Expected output: 199
	        System.out.println(solution(49));  // Expected output: 7
	}
}
