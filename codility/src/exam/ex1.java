package exam;

import java.util.ArrayList;

public class ex1 {
// write a function that given a string S consisting of N
//	letters 'a' and/or 'b' returns true when all occurrences of letter 'a'
//  are before all occurrences of letter 'b' and returns false otherwise.
	
// Examples:
// 1. Given S= 'aabbb', the function should return true.
// 2. Given S= 'ba', the function should return false.	
// 3. Given S= 'aaa', the function should return true. Note that 'b' does not need to occur in S
// 4. Given S = 'b', the function should return true. Note that 'a' does not need to occur in S
// 5. Given S = 'abba', the function should return false.
	
	public static boolean solution(String s) {
		boolean foundB = false;
		for(int i =0; i <s.length(); i++) {
			char current = s.charAt(i);
			if(current == 'b') {
				foundB = true;
			}
			if(current == 'a' && foundB) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println(solution("aaa"));   // true
        System.out.println(solution("aabbb")); // true
        System.out.println(solution("ba"));    // false
        System.out.println(solution("b"));     // true
        System.out.println(solution("abba"));  // false
		
	}
}
