package exam;

import java.util.Arrays;

//A group of friends is going on holiday together. They have come to a meeting point (the start of the journey) using N cars. There are P[K] people and S[K] seats in the K-th car for K in range [0..N-1]. Some of the seats in the cars may be free, so it is possible for some of the friends to change the car they are in. The friends have decided that, in order to be ecological, they will leave some cars parked at the meeting point and travel with as few cars as possible.
//
//Write a function:
//
//int solution(int P[], int S[], int N);
//
//that, given two arrays P and S, consisting of N integers each, returns the minimum number of cars needed to take all of the friends on holiday.
//
//Examples:
//
//1. Given P = [1, 4, 1] and S = [1, 5, 1] the function should return 2. A person from car number 0 can travel in car number 1 instead. This way, car number 0 can be left parked at the meeting point.
//
//2. Given P = [4, 4, 2, 4] and S = [5, 5, 2, 5] the function should return 3. One person from car number 2 can travel in car number 0 and the other person from car number 2 can travel in car number 3.
//
//3. Given P = [2, 3, 4, 2] and S = [2, 5, 7, 2] the function should return 2. Passengers from car number 0 can travel in car number 1 and passengers from car number 3 can travel in car number 2.
//chat gpt bảo chưa đạt hiệu suất?
public class ex16 {
	public static int solution (int P[], int S[], int N) {
		int count =0, sum =0;
		for(int i =0; i <P.length; i++) {
			 sum += P[i];
		}
		Arrays.sort(S);
		while (sum >0) {
			int num = S[N-1];
			sum-=num;
			N--;
			count ++;
		}
		return count;
	}
	public static void main(String[] args) {
		//int[] P = {1, 4, 1}; int[] S = {1, 5, 1};
		int [] P = {4, 2, 5}; int [] S = {6, 4, 6};
		int[] P1 = {4, 4, 2,4}; int[] S1 = {5, 5, 2, 5};
		int[] P2 = {2,3, 4, 2};int[] S2 = {2,5,7,2};
		System.out.println(solution(P,S,3));
		System.out.println(solution(P1,S1,4));
		System.out.println(solution(P2,S2,4));


	}
}
