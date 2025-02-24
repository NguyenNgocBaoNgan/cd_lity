package exam;
import java.util.HashMap;
import java.util.HashSet;

//There are N hospitals, numbered from 0 to N-1. You are given a schedule of work in each of the hospitals for the following M days. The schedule is provided in the form of a two-dimensional array A containing N rows, each row representing the schedule of one hospital, and M columns, each column representing one day. Integer A[K][L] (for K within the range [0..N-1] and L within the range [0..M-1]) represents the ID of the doctor working at hospital K on day L. Note that sometimes an individual doctor may work at more than one hospital even on the same day.
//
//Write a function:
//
//class Solution { public int solution(int[][] A); }
//
//that, given a matrix A consisting of N rows and M columns representing the hospitals' schedules, finds the number of doctors working at more than one hospital.
//
//Examples:
//
//1. Given A = [[1, 2, 2], [3, 1, 4]], the function should return 1.
public class ex21 {
    public static int solution (int[][] A) {
        int rs = 0;
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int i =0; i < A.length; i++) {
        	for(int j =0; j < A[0].length; j++) {
        		if(map.containsKey(A[i][j])) {
        			if(map.get(A[i][j]).size() == 1 && !map.get(A[i][j]).contains(i)) {
        				rs++;
        			}
        			map.get(A[i][j]).add(i);
        		} else {
        		HashSet<Integer> set = new HashSet<>();
        		set.add(i);
        		map.put(A[i][j], set);
        		}
        		
        	}
        }
       
        return rs;
    }
    public static void main(String[] args) {
        int[][] A1 = {
            {1, 2, 2},
            {3, 1, 4}
        };
        System.out.println(solution(A1));
        int[][] A2 = {
                {1, 1, 5, 2, 3},
                {4, 5, 6, 4, 3},
                {9, 4, 4, 1, 5}
            };
            System.out.println(solution(A2));  // Kết quả mong đợi: 4
            
            int[][] A3 = {
                    {4,3},
                    {5,5},
                    {6,2}
                };
                System.out.println(solution(A3));  // Kết quả mong đợi: 0

}
}