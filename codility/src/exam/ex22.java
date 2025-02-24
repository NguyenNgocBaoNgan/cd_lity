package exam;

import java.util.HashMap;
import java.util.HashSet;

//There is an array A consisting of N integers. How many distinct values can be obtained by calculating the absolute difference between two consecutive elements?
//
//For example, given A = (2, 5, 2, 7, 4), pairs of consecutive elements are: 2 and 5 (difference 3), 5 and 2 (difference 3), 2 and 7 (differenc S), and 7 and 4 (difference 3). There are two distinct absolute differences between elements (3 and 5).
//
//Write a function:
//
//class Solution public int solution(int[] A) >
//
//that, given an array A, returns the number of distinct values that can be obtained by calculating the absolute difference between two consecutive elements of A.
//
//Examples:
//
//1. Given A [2, 5, 2, 7, 4], the function should retum 2, as explained above.
//
//2. Given A= [0, 1, -2, 3, 4, 51, the function should return 5. The absolute differences between consecutive pairs of elements are 1,3,5 and 9.
//
//3. Given A= [0, 0], the function should retum 1. The absolute difference between the only two elements is 0.
//
//Write an efficient algorithm for the following assumptions:
//
//•N is an Integer within the range [2..100,000)
//
//• each element of array A is an integer within the range [-1,000,000,000..1,000,000,000).
public class ex22 {
	public static int solution (int[] A) {
		HashSet<Integer> set = new HashSet<>();
		for(int i =0; i < A.length-1; i++) {
			int num = Math.abs(A[i] - A[i+1]);
			set.add(num);
		}
		return set.size();
	}
	public static void main(String[] args) {
		int[] test = {2,5,2,7,4};
		int[] test1 = {0,1,-2,3,-4,5};
		int[] test2 = {0,0};


		System.out.println(solution(test));
		System.out.println(solution(test1));
		System.out.println(solution(test2));


		
	}
}
