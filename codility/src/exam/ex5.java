package exam;

import java.util.Arrays;

//You are given a list of N transfers (numbered from 0 to N-1) between two banks: bank A and bank B. The K-th A transfer is described by two values:
//
//• R[K] (either "A" or "B") representing the
//
//recipient (the bank the transfer is sent to);
//
//• V[K] denoting the value sent via the transfer.
//
//All transfers are completed in the order they appear on the list. The banks do not want to go into debt (in other words, their account balance may not drop below 0). What minimum initial account balance in each bank is necessary in order to complete the transfers?
//
//Write a function:
//
//class Solution { public int[]
//
//solution(String R, int[] V); }
//
//that, given a string R and an array of integers V, both of length N, returns an array of two integers. The integers should represent the minimum initial account balances for banks A and B in the following order: [bank A, bank B).
//
//Result array should be returned as an array of integers.
public class ex5 {
public static int [] solution (String R, int[] V) {
	int [] rs = new int[2];
	int A=0, B=0, minA=0, minB=0;
	for(int i=0; i < R.length(); i++) {
		switch (R.charAt(i)) {
		case 'B':
			A-= V[i];
			if(A <0) {
				minA += Math.abs(A);
				A=0;
			}
				B+= V[i];
			
			break;	
			case 'A':	
				B-=V[i];
				if(B <0) {
					minB += Math.abs(B);
					B=0;
				} 
					A+= V[i];
				
				break;
		}
	}
	rs[0] = minA; rs[1]= minB;
	return rs;
}
public static void main(String[] args) {
	int [] test = {100};
	String s = "B";
	System.out.println(Arrays.toString(solution(s, test)));
}
}
