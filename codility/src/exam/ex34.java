package exam;
//Task description
//
//A garden is divided into N sections numbered from 0 to N-1. It is described by an array A where A[K] denotes the number of trees in the K-th section. To make the garden look more organized, we want the number of trees in every section to be the same. As we don't want to cut any trees down, we can perform either of the following actions:
//
//planting a new tree in one of the sections;
//
//replanting an existing tree, moving it from one section to another.
//
//We want to minimize the number of actions performed.
//
//Write a function:
//
//function solution(A);
//
//that, given an array A consisting of N integers describing the garden, returns the minimum number of actions we need to perform in order to make all sections of the garden contain the same number of trees.
//
//Examples:
//
//1. Given A = [1, 2, 2, 4] the function should return 4. We can move one tree from A[3] to A[1] and obtain A = [1, 3, 2, 3] Then we can plant two trees in A[0] and one tree in A[2] to make every section contain three trees.
//
//2. Given A = [4, 2, 4, 6] the function should return 2. We can move two trees from A[3] to A[1] This way, every section in the garden will contain four trees.
//
//3. Given A = [1, 1, 2, 1] the function should return 3. We can plant one tree in A[0] A[1] and A[3] so that each section in the garden contains two trees.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range [1.100,000);
//
//each element of array A is an integer within the range [1..1,000,000,000); the answer is always less than or equal to 2,000,000,000.
public class ex34 {
	public static int solution (int[] A) {
		int rs =0; int sum =0; int total =0;
		for(int i =0; i < A.length; i++) {
			sum+= A[i];
		}
		//System.out.println(sum);
		if(sum%A.length !=0) {
			total = sum/A.length + 1;
		}else {
			total = sum/A.length;
		}
		//System.out.println(total);
				
		for(int j =0; j < A.length; j++) {
			if(A[j] < total) {
			rs+= Math.abs(total - A[j]);
			}
			
		}
		return rs;
	}
	public static void main(String[] args) {
		 	System.out.println(solution(new int[]{1, 2, 2, 4})); // Expected output: 4
	        System.out.println(solution(new int[]{4, 2, 4, 6})); // Expected output: 2
	        System.out.println(solution(new int[]{1, 1, 2, 1})); // Expected output: 3
	        System.out.println(solution(new int[]{3, 3, 3, 3})); // Expected output: 0
	        System.out.println(solution(new int[]{0, 0, 0, 12})); // Expected output: 9
	        System.out.println(solution(new int[]{10, 2, 2, 2})); // Expected output: 6
	        System.out.println(solution(new int[]{3, 6, 9, 12})); // Expected output: 7



	}
}
