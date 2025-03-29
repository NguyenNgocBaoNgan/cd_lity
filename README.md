# cd_lity
ex 1: //write a function that given a string S consisting of N
//	letters 'a' and/or 'b' returns true when all occurrences of letter 'a'
//  are before all occurrences of letter 'b' and returns false otherwise.
	
// Examples:
// 1. Given S= 'aabbb', the function should return true.
// 2. Given S= 'ba', the function should return false.	
// 3. Given S= 'aaa', the function should return true. Note that 'b' does not need to occur in S
// 4. Given S = 'b', the function should return true. Note that 'a' does not need to occur in S
// 5. Given S = 'abba', the function should return false.

ex2://	Task description
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
