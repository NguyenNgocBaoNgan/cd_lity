package exam;

import java.util.HashSet;

//A storeroom is used to organize items stored in it on N shelves. Shelves are numbered from 0 to N-1. The K-th shelf is dedicated to items of only one type, denoted by a positive integer A[K]
//Recently it was decided that it is necessary to free R consecutive shelves. Shelves cannot be reordered. What is the maximum number of types of items which still can be stored in the storeroom after freeing R consecutive shelves?
//chưa tối ưu, tối ưu không biết làm :)
public class ex14 {
	public static int solution(int[] A, int R) {
		int max = 0;
		for(int i =0; i <= A.length - R; i++) {
			HashSet<Integer> set = new HashSet<>();
			for(int j = 0; j < i; j++) {
				set.add(A[j]);
			}
			for(int j = i+R; j < A.length; j++ ) {
				set.add(A[j]);
			}
			max = Math.max(max, set.size());
		}
		return max;
	}
	public static void main(String[] args) {
		int[] A1 = {2,1,2,3,2,2};
		int[] A2 = {2,3,1,1,2};
		int[] A3 = {20,10,10,10,30,20};
		int[] A4 = {1,10000000,1};


		System.out.println(solution(A1, 3));
		System.out.println(solution(A2, 2));
		System.out.println(solution(A3, 3));
		System.out.println(solution(A4, 3));

	}
}
