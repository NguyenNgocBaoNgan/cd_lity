package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//An array A consisting of N integers is given. Our goal is to obtain an array in which every value occurs a unique number of times. We only consider integers that appear at least once in the resulting array. To achieve the goal, we can delete some integers from A. What is the minimum number of integers at must be deleted from A so that every remaining value occurs a unique number of times?
//
//Write a function:
//
//function solution(A);
//
//that, given an array A consisting of N integers, returns the minimum number of integers that must be deleted from it so that every remaining value occurs a unique number of times.
//
//Examples:
//
//1. Given A = [1, 1, 1, 2, 2, 2], the function should return 1. We can delete one occurrence of 1 or one occurrence of 2. After this operation, one value will occur three times and the other one two times.
//
//2. Given A = [5, 3, 3, 2, 5, 2, 3, 2], the function should return 2. After deleting number 3 twice, the remaining elements of the array are [5, 2, 5, 2, 3, 2). In this array no two numbers occur the same number of times.
//
//3. Given A-[127, 15, 3, 8, 10), the function should return 4. All elements of the array occur exactly once. We have to delete all but one element.
//
//4. Given A = [10000000, 10000000, 5, 5, 5, 2, 2, 2, 0, 0), the function should return 4.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range (1..200,000);
//
//each element of array A is an integer within the range [0..1,000,000,000).
public class ex4 {

 public static int solution (int[] array) {
	 int rs =0;
	 
	 HashMap<Integer, Integer> map = new HashMap<>();
	 for(int i : array) {
		 if(map.containsKey(i)) {
			 map.put(i,map.get(i)+1);
		 }
		 else {
		 map.put(i,1);
	 }
	 }
	 
//hashset không cho phép phần tử trùng lặp
	 HashSet<Integer> set = new HashSet<>();
	 for(int i : map.values()) {
			
		 while(set.contains(i) && i>0) {
			 i--;
			 rs++;
		 }
		 	if(i >0) {
		 		set.add(i);
		 	}
	 			}
	 return rs;
 }
 public static void main(String[] args) {
	int [] test = {10000000, 10000000, 5, 5, 5, 2, 2, 2, 0, 0};
	System.out.println(solution(test));
}
}
