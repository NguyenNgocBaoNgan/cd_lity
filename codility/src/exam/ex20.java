package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//You are given a task to fix potholes in a road. The road is described by a string S consisting of N characters. Each character represents a single fragment of the road. Character'' denotes a smooth surface and 'x' denotes a pothole. For example, S = "...xxx..x" means that the road starts with three smooth fragments, followed by three potholes, followed by two smooth fragments and ending with one pothole.
//
//You can choose any number of consecutive potholes and fix all of them. Fixing a segment consisting of K consecutive potholes costs K + 1. In the example above, fixing the first two consecutive potholes costs 2 + 1 = 3 and fixing the last pothole costs 1+1=2. After these fixes, the road would look like this: ".........".
//
//You are given a budget B. You can fix multiple segments containing potholes as long as you fit in the budget. What is the maximum number of potholes you can fix?
//
//Write a function:
//
//class Solution { public int solution(String S, int B); }
//
//that, given the string S of length N and the integer B, returns the maximum number of potholes that can be fixed.
//
//Examples:
//
//1. Given S = "...xxx..x....xxx." and B = 7, the function should return 5. You can start by fixing the first three consecutive potholes for a cost of 4, obtaining the road: ".............xxx.". Then, you can fix the last two potholes for a cost of 3, obtaining the road:
//Examples:
//
//1. Given S = "...xxx..x....xxx." and B = 7 the function should return 5. You can start by fixing the first three consecutive potholes for a cost of 4, obtaining the road: ".............xxx.". Then, you can fix the last two potholes for a cost of 3, obtaining the road: ..................". The total cost is 7, which fits in the budget, and you fix 5 potholes in total.
//
//2. Given S = "..xxxxx" and B = 4 the function should return 3. One way is to fix the middle three potholes, which costs the whole budget and makes the road look as follows: "..x...x". Alternatively, you could fix the first three potholes or the last three potholes.
//
//3. Given S = "x.x.xxx...x" and B = 14 the function should return 6. You can fix all the potholes, which costs 2 + 2 + 4 + 2 = 10 leaving you with the spare budget of 4. This fixes the entire road.
//
//4. Given S = ".." and B = 5 the function should return 0. There are no potholes to fix.
//
//Write an efficient algorithm for the following assumptions:
//
//• N is an integer within the range [1..100,000];
//
//• B is an integer within the range [0..200,000];
//
//• string S consists only of characters', and 'x'.
public class ex20 {
public static int solution (String S, int B) {
	int rs =0;
	int count =0; int index =0;
	ArrayList<Integer> holeFee = new ArrayList<>();
	for(int i =0; i < S.length(); i++) {
		if(S.charAt(i)== 'x'){
			  count++;
		}else {
			if(count >0) {
				holeFee.add(count +1);
				count =0;
			}
		}
	}
	 if(count >0) {
		 holeFee.add(count+1);
	 }
	 holeFee.sort(Collections.reverseOrder());
	 while (B > 0 && index < holeFee.size()) {
         int cost = holeFee.get(index); 

         if (B >= cost) {
             rs += cost - 1;
             B -= cost; 
         } else {
             rs += B - 1; 
             B = 0; 
         }

         index++; 
     }

     return rs;
	
	
}
public static void main(String[] args) {
//	String s = "...xxx..x....xxx.";//7 kq:5
//	String s1= "..xxxxx";//4 kq:3
//	String s2 = "x.x.xxx...x";//14 kq:6
//	String s3 ="...";//5 kq:0
//	String s4 = "x.x.xxx.x";
	
	//System.out.println(solution(s3, 5));
	
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < 100000; i++) {
	    sb.append('x');
	}
	String s = sb.toString();
	    int B1 = 150000; // Ngân sách lớn
	    int B2 = 500; // Ngân sách nhỏ

	    System.out.println(solution("x", 12)); // Kỳ vọng: 
	   // System.out.println(solution(s, B2)); // Kỳ vọng: 250

}
}
