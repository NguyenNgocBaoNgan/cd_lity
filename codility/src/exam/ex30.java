package exam;

import java.util.HashSet;

//We are given a string S consisting of N letters. We want to find the alphabetically largest letter that occurs in both lowercase and uppercase in S, or decide that there is no such letter.
//
//Note: One letter is alphabetically larger than another if it occurs later in English alphabetical order. For example, "E" is alphabetically larger than "B".
//
//Write a function:
//
//class Solution { public String solution(String s); }
//
//that, given a string S, returns a string consisting of one letter - the alphabetically largest of all letters that occur in both lowercase and uppercase in S. The returned letter should be in uppercase.
//
//If there is no such letter, the function should return "NO".
//
//Examples:
//
//1. Given S = "aaBabcDaA", your function should return "B". Letters occurring in both lowercase and uppercase are: "A", "B" ("B" is alphabetically largest).
//
//2. Given S = "Codility", your function should return "NO". There is no letter that occurs in both lowercase and uppercase.
//
//3. Given S = "WeTestCodErs", your function should return "T". Letters occurring in both lowercase and uppercase are: "E", "T"
public class ex30 {
public static String solution (String s) {

	HashSet<Character> lowerCase = new HashSet<>();
	HashSet<Character> upperCase = new HashSet<>();
	char max = 'A' -1;
	for(int i =0; i < s.length(); i++) {
		if(Character.isLowerCase(s.charAt(i))) {
			lowerCase.add(s.charAt(i));
			if(upperCase.contains(Character.toUpperCase(s.charAt(i)))) {
				max = (char)Math.max(max, Character.toUpperCase(s.charAt(i)));
			}
		}
		else {
			upperCase.add(s.charAt(i));
			if(lowerCase.contains(Character.toLowerCase(s.charAt(i)))) {
				max = (char)Math.max(max, s.charAt(i));
			}
		}
	}
	
	
	if(max == 'A' -1)  return "NO";

	return String.valueOf(max);
}
public static void main(String[] args) {
	 System.out.println(solution("aaBabcDaA")); // Expected output: "B"
     System.out.println(solution("Codility"));  // Expected output: "NO"
     System.out.println(solution("WeTestCodErs")); // Expected output: "T"
}
}
