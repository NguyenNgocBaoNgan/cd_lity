package exam;

import java.util.ArrayList;

//Write a function solution that, given a string S of length N, returns any palindrome which can be obtained by replacing all of the question marks in S by lowercase letters ('a'-'z'). If no palindrome can be obtained, the function should return the string "NO".
//
//A palindrome is a string that reads the same both forwards and backwards. Some examples of palindromes are: "kayak", "radar", "mom".
//
//Examples:
//
//1. Given S = "?ab??a", the function should return "aabbaa".
//
//2. Given S = "bab??a", the function should return "NO",
//
//3. Given S = "?a?", the function may return "aaa", It may also return "zaz", among other possible answers.
//
//Assume that:
//
//N is an integer within the range [1 1,000):
//
//string S consists only of lowercases letters ('a'z) or ?
//
//In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
public class ex32 {
	public static String solution (String s) {
		String rs = "";
		int mid = s.length()/2;
		char[] list = new char[s.length()];
		
		if(s.charAt(mid)=='?' && mid%2 !=0) {
			list[mid] ='a';
			
		}
		for(int i =0; i < mid; i++) {
			int j = s.length() - i -1;
				
				if(s.charAt(i) == '?' && s.charAt(j)== '?') {
					list[i] = 'a';
					list[j] = 'a';
				}
				else if(s.charAt(i) == '?') {
					list[i] = s.charAt(j);
				}else if(s.charAt(j) == '?') {
					list[j] = s.charAt(i);
				} else if (s.charAt(i) != s.charAt(j)) {
	                return "NO";
	            } else {
	                list[i] = s.charAt(i);
	                list[j] = s.charAt(j);
	            }
			}
		
		for(int z =0; z<list.length; z++) {
			if(list[z] != '\0') {
				rs += list[z];
			} else
			rs+= s.charAt(z);
		}
		return rs;
	}
	public static void main(String[] args) {
		 System.out.println(solution("?ab??a"));  // Expected output: "aabbaa"
	        System.out.println(solution("bab??a"));  // Expected output: "NO"
	        System.out.println(solution("?a?"));     // Expected output: "aaa" or "zaz"
	}
}
