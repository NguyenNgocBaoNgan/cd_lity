package exam;

import java.util.HashSet;

//Write a function solution that, given an array A of N Integers, retums the largest Integer K > 0 such that both values K and -K (the opposite number) exist in array A. If there is no such integer, the function should retum 0.

//Examples:
//
//1. Given A = [3, 2, - 2, 5, - 3] the function should return 3 (both 3 and -3 exist in arraу А).
//
//2. Given A = [1, 1, 2, - 1, 2, - 1] the function should return 1 (both 1 and -1 exist in array A).
//
//3. Given A = [1, 2, 3, - 4] the function should return 0 (there is no such K for which both values K and -K exist in array A).
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1..100,000);
//
//each element of array A is an integer within the range [-1,000,000,000..1,000,000,000).
public class ex41 {
public static int solution (int[] A) {
	int rs =0;
	HashSet<Integer> set = new HashSet<>();
	for(int i =0; i< A.length; i++) {
		if(set.contains(-A[i]) && Math.abs(A[i]) > rs) {
			rs = Math.abs(A[i]);
		}
		set.add(A[i]);
	}
	return rs;
}
public static void main(String[] args) {
	int[] A = {3, 2, - 2, 5, - 3}; 
	int[] A1 = {1, 1, 2, - 1, 2, - 1}; 
	int[] A2 = {1, 2, 3, - 4}; 
	System.out.println(solution(A));
	System.out.println(solution(A1));
	System.out.println(solution(A2));


}
}
