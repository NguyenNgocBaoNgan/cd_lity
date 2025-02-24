package exam;
import java.util.*;
public class ex2 {
//	Task description
//
//	You are given an undirected graph consisting of N vertices, numbered from 1 to N, and M edges.
//
//	The graph is described by two arrays, A and B, both of length M. A pair (A[K], B[K]), for K from 0 to M-1, describes an edge between vertex A[K] and vertex B[K].
//
//	Your task is to check whether the given graph contains a path from vertex 1 to vertex N going through all of the vertices, one by one, in increasing order of their numbers. All connections on the path should be direct.
//
//	Write a function:
//
//	class Solution { public boolean solution (int N, int[] A, int[] B); }
//
//	that, given an integer N and two arrays A and B of M integers each, returns true if there exists a path from vertex 1 to N going through all vertices, one by one, in increasing order, or false otherwise.
//
//	Examples:
//
//	1. Given N 4, A[1, 2, 4, 4, 3] and B = [2, 3, 1, 3, 11, the function should return true. There is a path (1-2-3-4) using edges (1, 2), (2, 3) and (4,3).

//Note: những thuật toán tìm max, min => có thể dùng greedy algo
// có hàm array.uitls, và Collections. reverse
	 public static boolean solution (int N, int[] A, int[] B) {
		 HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		 for(int i =0; i < A.length; i++) {
			 map.putIfAbsent(A[i], new HashSet<>());
			 map.putIfAbsent(B[i], new HashSet<>());
			 
			 map.get(A[i]).add(B[i]);
			 map.get(B[i]).add(A[i]);
		 }
		 for (int i = 1; i < N; i++) {
	            if (!map.containsKey(i) || !map.get(i).contains(i + 1)) {
	                return false;  
	            }
	        }
		 return true;

		   }
	public static void main(String[] args) {
		int[] A = {1,2,3,4,3}; int[] B= {2,3,1,3,1};
		int[] A1 = {1,2,1,3}; int[] B1= {2,4,3,4};
		int[] A2 = {2,4,5,3}; int[] B2= {3,5,6,4};
		int[] A3 = {1,3}; int[] B3= {2,2};
		
		
		System.out.println(solution(4,A,B));
		System.out.println(solution(4, A1, B1));
		System.out.println(solution(6, A2, B2));
		System.out.println(solution(3, A3, B3));
	}
		


		

		


	


		}





		
	

		
		
	
	
	
	

