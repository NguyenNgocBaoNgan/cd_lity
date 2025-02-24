package exam;
//You are given a string S, consisting of N digits, that represents a number. You can change at most one digit in the string to any other digit. How many different numbers divisible by 3 can be obtained in this way?
//
//Write a function
//
//class Solution (public int solution(String 5); }
//
//that, given a string S of length N. returns an integer specifying how many numbers divisible by 3 can be obtained with at most one change of a digit.
//chưa biết là tối ưu chưa?
public class ex15 {
	public static int solution (String S) {
		int count =0; int sum =0; int newSum=0;
		for(int j =0; j < S.length(); j++) {
			sum+= S.charAt(j) - '0';
		}
		
		if(sum % 3 ==0) count ++;
		
		for(int z = 0; z <S.length(); z++) {
			int oldigit = S.charAt(z) -'0';
		for(int i =0; i <= 9; i++) {
				if(oldigit != i) {
					newSum = sum - oldigit + i;
					if(newSum %3 ==0) {
						count++;
					}
				}
		}	
		}
		
		return count;
	}
	public static void main(String[] args) {
		String S1 = "23";
		String S2 ="0081";
		String S3 = "022";
		System.out.println(solution(S1));
		System.out.println(solution(S2));
		System.out.println(solution(S3));

	}
}
