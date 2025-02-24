package exam;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

//An industrial company has N factories, each producing some pollution every month. The company has decided to reduce its total fume emissions by equipping some of the factories with one or more filters.
//
//Every such filter reduces the pollution of a factory by half. When a second (or subsequent) filter is applied, it again reduces by half the remaining pollution emitted after fitting the existing filter(s). For example, a factory that initially produces 6 units of pollution will generate 3 units with one filter, 1.5 units with two filters and 0.75 units with three filters.
//
//You are given an array of N integers describing the amount of pollution produced by the factories. Your task is to find the minimum number of filters needed to decrease the total sum of pollution by at least half.
//
//Write a function:
//
//class Solution { public int solution(int[] A); )
//
//which, given an array of integers A of length N, returns the minimum number of filters needed to reduce the total pollution by at least half.
//
//Examples:
//
//1. Given A=[ 5, 19, 8, 1L your function should return 3. The initial total pollution is 5 + 19 + 8 + 1 =33.y install two filters at the factory producing 19 units and one filter at the factory producing 8 units. Then the total pollution will be 5 + ((19/2) / 2) + (8/2) + 1 = 5 + 4.75 + 4 + 1 = 14.75 which is less than so we have achieved our goal 33/2 = 16.5
//
//2. Given A=[ 10, 10L your function should return 2. because we may install one filter at each factory
//
//3. Given A = 13, 0.5L your function should return 2. because it is sufficient to install one fifter at each factory producing a non-zero amount of pollution
//
//Write an efficient algorithm for the following assumptions
public class ex19 {
	public static int solution (int[] A) {
		int rs = 0; double total =0; double newTotal =0;
        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i =0; i < A.length; i++) {
        	total += A[i];
        	queue.add((double) A[i]);
        }
        while (newTotal < total/2) {
        	double i = queue.poll()/2;
        	newTotal +=i ;
        	queue.add(i);
        	rs++;
        	
        }
		return rs;
	}
	public static void main(String[] args) {
		int[] A = {5, 19, 8, 1};
		int[] A1 = {10,10};
		int[] A2 = {3,0,5};
		System.out.println(solution(A2));
	}
}
