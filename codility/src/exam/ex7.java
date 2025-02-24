package exam;
//You are given N numbers on a circle, described by an array A. Find the maximum number of neighbouring pairs whose sums are even. One element can belong to only one pair.
//
//Write a function:
//
//class Solution { public int solution (int[] A); }
//
//that, given an array A consisting of N integers, 
//returns the maximum number of neighbouring pairs whose sums are even.
//
//Examples:
//
//1. Given A = [4, 2, 5, 8, 7, 3, 7], the function should return 2. 
//We can create two pairs with even sums: (A[0], A[1]) and (A[4], A[5]). 
//Another way to choose two pairs is: (A[0], A[1]) and (A[5], A[6]).
public class ex7 {
	public static int solution (int[] A) {
		int count =0;
		int [] mark = new int[A.length];
		for(int i =0; i < A.length-1; i++) {
			if((A[i]+A[i+1])%2 ==0 && mark[i] !=1 && mark[i+1] !=1 ) {
				count ++;
				mark[i]=1; mark[i+1]=1;
			}
		}
		if((A[0]+A[A.length-1])%2 ==0 && mark[0] !=1 && mark[A.length-1] !=1 ) {
			count ++;
		}
		return count;
	}
	public static void main(String[] args) {
		int [] test =  {5,5,5,5,5,5};
		System.out.println(solution(test));
	}
}
