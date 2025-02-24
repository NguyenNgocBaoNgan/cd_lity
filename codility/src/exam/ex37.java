package exam;

import java.util.Arrays;

//You are given an array S consisting of N strings. Every string is of the same length M. Your task is to find a pair of strings in array S, such that there exists a position in which both of the strings have the same letter. Both the index in array S and the positions in the strings are numbered from zero.
//
//For example, given S = ["abc", "bca", "dbe"], string 0 ("abc") and string 2 ("dbe") have the same letter 'b' in position 1. On the other hand, for strings "abc" and "bca" there does not exist a position in which they have the same letter.
//
//Write a function:
//
//class Solution { public int[] solution(String[] S); }
//
//that, given a zero-indexed array S of N strings, returns an array describing a pair of strings from S which share a common letter at some index. If there is no such pair, the function should return an empty array. If there is more than one correct answer, the function can return any of them.
//
//The result should be represented as an array containing three integers. The first two integers are the indexes in S of the strings belonging to the pair. The third integer is the position of the common letter.
//
//For S = ["abc", "bca", "dbe"], as above, the result array should be represented as: [0, 2, 11. Another correct answer is [2, 0, 1], as the order of indexes of strings does not matter.
public class ex37 {
	public static int[] solution (String[] S) {
		//int[] rs = new int[3];
		int i =0;
		while (i < S.length -1) {
			for(int j =i +1; j < S.length; j++) {
				for(int z =0; z < S[0].length(); z++) {
					if(S[i].charAt(z) == S[j].charAt(z)) {
						return new int[] {i,j,z};
					}
				}
			}
			i++;
		}
		return new int[] {};
	}
	public static void main(String[] args) {
		String [] S1 = {"abc", "bca", "dbe"};
		String [] S2 = {"zzzz", "ferz","zdsr"," fgtd"};
		String [] S3 = {"gr","sd", "rg"};
		String [] S4 = {"bdafg", "ceagi"};
		
		System.out.println(Arrays.toString(solution(S1)));
		System.out.println(Arrays.toString(solution(S2)));
		System.out.println(Arrays.toString(solution(S3)));
		System.out.println(Arrays.toString(solution(S4)));

		

	}
}
