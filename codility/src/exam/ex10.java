package exam;
//We are given an array A consisting of N distinct integers. We would like to sort array A into ascending order using a simple algorith First, we divide it into one or more slices (a slice is a contiguous subarray). Then we sort each slice. After that, we join the sorted si in the same order. Write a function solution that returns the maximum number of slices for which the algorithm will retum a corre sorted array
//
//Examples:
//
//1. Given A = (2,4, 1, 6,5,9, 7} the function should return 3. The array can be split into three slices: [2, 4, 11, 16, 5] and [9, 7]. Then, after sorting each slice and joining them together, the whole array will be sorted into ascending order.
public class ex10 {
public static int solution (int[] A) {
	int count =1;
	int[] leftMax = new int[A.length];
	int[] rightMin = new int[A.length];
	leftMax[0] = A[0];
	rightMin[A.length -1] = A[A.length -1];
	for(int i =1; i < A.length; i ++) {
		if(A[i] >= leftMax [i-1]) {
			leftMax[i] = A[i];
		} else {
		leftMax[i] = leftMax [i-1];
		}
	}
	for(int i =A.length -2; i >=0; i --) {
		if(A[i] <= rightMin [i+1]) {
			rightMin[i] = A[i];
		}else {
		rightMin[i]=rightMin [i+1];
		}
	}
	for(int i =0; i < A.length-1; i++) {
		if(leftMax[i] <=rightMin[i+1]) {
			count ++;
		}
	}
	return count;
	
}
public static void main(String[] args) {
	int [] test = {2,4, 1, 6,5,9,7};//3
	int [] test1 = {4,3,2,6,1};//1
	int[] test2 = {2,1,6,4,3,7}; //3
	System.out.println(solution(test1));
	
}
}
