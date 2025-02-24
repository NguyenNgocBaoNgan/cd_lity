package exam;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//A retail store chain wants to expand into a new neighborhood. To maximize the number of clients, the new branch should be at a distance of no more than K from all the houses in the neighborhood. A is a matrix of size N x M, representing the neighborhood as a rectangular grid, in which each cell is either an integer 0 (an empty plot) or 1 (a house). The distance between two cells is calculated as the minimum number of cell borders (regardless of whether the cells on the way are empty or occupied) that one has to cross to move from the source to the target cell (without moving through corners). A store can be only built on an empty plot. How many suitable locations are there?
//
//For example, given K = 2 and matrix A = [[0, 0, 0, 0], [0, 0, 1, 0], [1, 0, 0, 1]], houses are located in cells with coordinates (2, 3), (3, 1) and (3, 4). We can build a new store on two empty plots that are close enough to all the houses. The first possible empty plot is located at (3, 2). The distance to the first house at (2,3) is 2, the distance to the second house at (3, 1) is 1, and the third house at (3, 4) is at a distance of 2. The second possible empty plot is located at (3, 3). The distances to the first, second and third houses are respectively, 1, 2 and 1.

public class ex25 {
	public static int solution(int K, int[][] A) {
		int rs =0;
		ArrayList<int[]> list = new ArrayList<>();
		for(int i =0; i< A.length; i++) {
			for(int j=0; j< A[0].length; j++) {
				if(A[i][j] ==1) {
					list.add(new int[] {i,j});
				}
			}
		}
		for(int r =0; r<A.length;r++) {
			for(int c=0; c< A[0].length; c++) {
				if(A[r][c] == 0) {
					int count =0;	

					for(int[] i : list) {
					
						if(Math.abs(r-i[0]) + Math.abs(c-i[1]) <= K) {
							count++;
						}
					}
					if(count == list.size()) {
						rs++;
					}
					
					}
				}
			}
		
		return rs;
	}

	
	public static void main(String[] args) {
		 // Ví dụ 1
        int[][] A1 = {
            {0, 0, 0, 0},
            {0, 0, 1, 0},
            {1, 0, 0, 1}
        };
        int K1 = 2;
        System.out.println("Example 1: " + solution(K1, A1)); // Expected: 2

        // Ví dụ 2
        int[][] A2 = {
            {0, 1},
            {0, 0}
        };
        int K2 = 1;
        System.out.println("Example 2: " + solution(K2, A2)); // Expected: 2

        // Ví dụ 3
        int[][] A3 = {
            {0, 0, 0, 1},
            {0, 1, 0, 0},
            {0, 0, 1, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 0}
        };
        int K3 = 4;
        System.out.println("Example 3: " + solution(K3, A3)); // Expected: 8
	}
}