package exam;
//A string S made of uppercase English letters is given. In one move, six letters forming the word "BANANA" (one 'B', three 'A's and two 'N's) can be deleted from S. What is the maximum number times such a move can be applied to S?
//
//Write a function:
//
//int solution(char *S);
//
//that, given a string S of length N, returns the maximum number of moves that can be applied.
//
//Examples:
//
//1. Given S="NAABXXAN", the function should retum 1.
//
//NAABXXAN
//
//XX
//
//2. Given S = "NΑΑΝΑΑΧΝΑΒΑBYNNBZ", the function should return 2.
//
//NAANAAXNABABYNNBZ
//
//NAAXNABYNBZ
//
//XBYNZ
//
//a
//
//3. Given S="QABAAAWOBL", the function should return 0.
//
//QABAAAWOBL
//
//Write an efficient algorithm for the following assumptions:
//
//• N is an integer within the range [1..100,000); string S is made only of uppercase letters (A-Z).
public class ex38 {
	public static int solution (String S) {
		int countA =0, countB =0, countN =0;
		for(int i =0; i < S.length(); i++) {
			if(S.charAt(i )== 'A') { countA ++;} 
			if(S.charAt(i )== 'B') { countB ++;} 
			if(S.charAt(i )== 'N') { countN ++;} 

		}
	
		return  Math.min(countB, Math.min(countN/2, countA/3));
	}
	public static void main(String[] args) {
		String S1 = "NAABXXAN";
		String S2 = "NAANAAXNABABYNNBZ";
		String S3 =  "QABAAAWOBL";
		
		System.out.println(solution(S1));
		System.out.println(solution(S2));
		System.out.println(solution(S3));

	}
}
