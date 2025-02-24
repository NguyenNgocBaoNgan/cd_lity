package exam;

import java.util.HashMap;
import java.util.Map;

//You are given a string S containing lowercase English letters. Your task is to calculate the minimum number of letters that need to be removed in order to make it possible to build a palindrome from the remaining letters. When building the palindrome, you can rearrange the remaining letters in any way.
//
//A palindrome is a string that reads the same both forwards and backwards. Some examples of palindromes are: "kayak", "radar", "mom"
//
//Write a function:
//
//class Solution { public int solution(String 5);)
//
//which, given a string of length N, retums the minimum number of letters that need to be removed.
//
//Examples:
//
//1. Given Servervige", your function should return 2. After removing the letter "g" and one "s", we may create a word "reviver", which is a palindrome.
//
//2. Given S "aaabab", your function should return 0. We may create a word "sabbaa", which is a palindrome and uses all of the letters.
//
//3. Given S"X", your function should return 0. String "x" is a palindrome Itself, so we do not have to delete any letter.
//
//Write an efficient algorithm for the following assumptions:
//
//•N is an integer within the range [1.200,000); S contains only lowercase English letters.

public class ex17 {
	public static int solution (String S) {
		int count =0; 
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i =0 ; i < S.length(); i++) {
	            char c = S.charAt(i);
	            map.put(c, map.getOrDefault(c, 0) + 1);
	            
	            if (map.get(c) % 2 != 0) {
	                count++;
	            } else {
	                count--;
	            }
	        }
			
//			if(map.containsKey(S.charAt(i))) {
//				int fre = map.get(S.charAt(i)) +1;
//				map.put(S.charAt(i), fre);
//			
//				if(fre%2 != 0) {
//					count++;
//				} else {
//					count --;
//				}
//			}else {
//				map.put(S.charAt(i), 1);
//				count++;
//		}
		
		 return (count > 1) ? count - 1 : 0;
		 
		
	}
	public static void main(String[] args) {
		String s = "aaabab";
		String s1 = "x";
		String s2 = "ervervige";
		String s3 ="abab";
		System.out.println(solution(s3));
	}
}
