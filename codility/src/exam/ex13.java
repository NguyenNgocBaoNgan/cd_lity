package exam;

import java.util.ArrayList;
import java.util.HashMap;

//You are given a string S. Deletion of the Kith letter of S costs CIKI. After deleting a letter, the costs of deleting a deletion of b will still cost 3. deleting other letters do not change. For example for Sab' and C = [1.3] af
//
//You want to delete some letters from S to obtain a string without two identical letters next to each other. What is the minimum total cost of deletions to achieve such a string?
//
//Write a function
//
//class Solution (polic int solution(String S, int[] ();)
//
//that, given string S and array C of integers, both of length N. returns the minimum cost of all necessary deletions
//
//Examples:
//
//1. Given S = "abccbd" and C = 10.1.2.3.4.5], the function should return 2. You can delete the first occurrence of o to achieve "abcbd"
//
//2. Given Saabbcc and C= [1, 2, 1, 2, 1, 2], the function should return 3. By deleting all letters with a cost of 1, you can achieve string "abc"
//
//3. Given S = "aaaa" and C = [3, 4, 5, 61, the function should return 12. You need to delete all but one letter 'a', and the lowest cost of deletions is 3+4+5-12
//
//4. Given Sababa' and C-110,5, 10, 5, 101, the function should retum 0. There is no need to delete any letter
//
//Write an efficient algorithm for the following assumptions
//
//string S and array C have length equal to N N is an integer within the range [1..100,000),
//
//string S is made only of lowercase letters (a-z): each element of array C is an integer within the range [0..1,000]
public class ex13 {
	//chỉ khi nào có giá trị mới get trong hashmap dc
	// khi nào cần lưu vị trí mới dùng hash map, đứng cạnh nhau thì so charAt
	public static int solution (String S, int[] C) {
		int rs =0;
		for(int i =0; i < S.length()-1; i ++){
			if(S.charAt(i) == S.charAt(i+1)) {
				rs+= Math.min(C[i], C[i+1]);
				 
			}
		}
		return rs;
	}
	public static void main(String[] args) {
		String s = "aabbb";
		int[] C = {1,2,3,4,5};
		System.out.println(solution(s, C));
	}
}
