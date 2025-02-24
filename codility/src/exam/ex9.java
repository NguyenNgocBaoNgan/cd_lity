package exam;

import java.util.HashMap;

//We are given a string S consisting of N lowercase letters. A sequence of two adjacent letters inside a string is called a digram. The distance between two digrams is the distance between the first letter of the first digram and the first letter of the second digram. For example, in string S = "akcmz" the distance between digrams "ke" and "mz" is 2.
//
//We want to find the distance between the furthest identical digrams inside string S.
//
//Write a function:
//
//class Solution (public int solution(String 5); }
//
//that, given a string S consisting of N letters, returns the distance between the two identical digrams in the string that lie furthest away from each other. If there are no two identical digrams inside S, your function should return-1.
//
//Examples:
//
//1. Given Saakmaakmakda" your function should return 7. The furthest identical digrams are 'ak's, starting in positions 2 and 9 (enumerating from 1): "aakmaakmakda
//
//2. Given S'aaa' your function should retum 1. The furthest identical digrams are "aa's starting at positions 1 and 2.
//
//3. Given Scodility your function should return-1. There are no two identical digrams in S.
//
//Write an efficient algorithm for the following assumptions:
//
//N is an integer within the range 12. 300,000) string S is made only of lowercase letters (a-2)
public class ex9 {
	public static int solution(String S) {
		int dist = -1;
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0; i < S.length() -1; i++) {
			String digram = S.substring(i, i+2);
			if(!map.containsKey(digram)) {
				int firstPos = i;
				map.put(digram, firstPos);
			}else {
				if(Math.abs(i- map.get(digram)) > dist) {
					dist = Math.abs(i- map.get(digram));
				}
			}
		}
		return dist;
	}
	public static void main(String[] args) {
		String s = "codility";
		System.out.println(solution(s));
	}
}
