package exam;

//You are given a string S consisting of N lowercase English letters. In how many ways can we split S into two non-empty parts, such that in at least one part the letter 'x' and the letter 'y occur the same number of times?
//
//Write a function.
//
//class Solution (public int solution(String 5); }
//
//that, given a string S of length N, returns the number of splits S satisfying the condition above.
//
//Examples:
//
//1. Given S = "ayxbx", the function should return 3. There are four possible splits of S: "a/yxbx", "ay/xbx", "ayx/bx" and "ayxb/x" Only "ay/xbx" does not fulfill the condition, so the answer is 3. Note that in "a/yxbx the left part has D occurrences of 'x' and 'y, so it counts as correct split.
//
//2. Given Sxzzzy", the function should return 0.
//
//3. Given Stoyxmy", the function should return 5.
//
//4 Given S "apple", the function should return 4.
//
//Wine an efficient algorithm for the following assumptions:
//
//tis an integer within the range 12. 200,000) string S is made only of lowercase letters (a-2)
public class ex8 {
public static int solution (String S) {
	int rs = 0, leftX =0, rightX=0, leftY=0, rightY=0;
	
	for(int i =0; i < S.length(); i++) {
		if (S.charAt(i)== 'x' ) {
			rightX ++;
		} else if (S.charAt(i)== 'y' ){
			rightY ++;
		}
	}
	for(int i =0; i < S.length() -1; i ++) {
		switch (S.charAt(i)) {
		case 'x':
			leftX ++; rightX --;
			break;
		case 'y':
			leftY ++; rightY --;
			break;
		}

		if(leftX==leftY || rightX == rightY) {
			rs++;
		}
	}
	return rs;
	
}
public static void main(String[] args) {
	String s = "apple";
	System.out.println(solution(s));
}
}
