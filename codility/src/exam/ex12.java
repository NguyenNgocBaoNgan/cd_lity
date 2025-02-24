package exam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ex12 {
	
    public static void main(String[] args) {
        String[] B1 = {".##.#", "#.#..", "#...#", "#.##."};
        System.out.println(Arrays.toString(getCounts(B1)));
//        Arrays.stream(getCounts(B1)).forEach(e -> System.out.print(e + ","));
//        System.out.println();

        String[] B2 = {".#..#", "##..#", "...#."};
        System.out.println(Arrays.toString(getCounts(B2)));

//        Arrays.stream(getCounts(B2)).forEach(e -> System.out.print(e + ","));
//        System.out.println();

        String[] B3 = {"##.", "#.#", ".##"};
        System.out.println(Arrays.toString(getCounts(B3)));

//        Arrays.stream(getCounts(B3)).forEach(e -> System.out.print(e + ","));
//        System.out.println();

        String[] B4 = {"...", "...", "..."};
        System.out.println(Arrays.toString(getCounts(B4)));

//        Arrays.stream(getCounts(B4)).forEach(e -> System.out.print(e + ","));
//        System.out.println();
    }

    public static int[] getCounts(String[] B) {
        int[] result = new int[3];  // The result array for the counts of different ship types

        // Create a 2D character array (matrix) from the input string array
        char[][] map = new char[B.length][B[0].length()];
        for (int row = 0; row < B.length; row++) {
                map[row] = B[row].toCharArray(); 
            
        }

        // Traverse the map to find ships
        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[0].length; col++) {
                if (map[row][col] == '#') { // Check if there is a ship part
                    map[row][col] = '.';   // Mark this part as visited
                    int count = getSizeOfShip(map, row, col); // Get the size of the ship using BFS
                    if (count ==1) {
                        result[0]++;  // Update the count in the corresponding index
                    } else if (count ==2) {
                    	result [1] ++;
                    }else if (count == 3) {
                    	result [2] ++;
                    }
                }
            }
        }
        return result; // Return the counts of each ship type
    }
// BFS
//  Queue<int[]> queue = new LinkedList<>(); // Initialize the queue for BFS
//  queue.add(new int[]{row, col});
//  int count = 1; // Initial size of the ship
//
//  while (!queue.isEmpty()) {
//      int size = queue.size(); // Current size of the queue
//      for (int i = 0; i < size; i++) {
//          int[] position = queue.remove(); // Remove the front of the queue
//          for (int[] dir : dirs) {
//              int x = dir[0] + position[0]; // New row index
//              int y = dir[1] + position[1]; // New column index
//              // Check bounds and if the new position is part of the ship
//              if (x >= 0 && x < map.length && y >= 0 && y < map[0].length && map[x][y] == '#') {
//                  map[x][y] = '.'; // Mark the ship part as visited
//                  count++; // Increase the count of the ship size
//                  queue.add(new int[]{x, y}); // Add the new position to the queue
//              }
//          }
//      }
//  }

    // DFS 
    public static int getSizeOfShip(char[][] map, int row, int col) {
        // Directions for moving right, left, down, and up
        int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        
         Stack<int[]> stack = new Stack<>();
         stack.push(new int[] {row, col});
         int count =1;
         while (!stack.isEmpty()) {
        	 int size  = stack.size();
        	 for(int i =0; i < size; i ++) {
        		 int[] pos = stack.pop();
        		 for(int[] d :dirs) {
        			 int x = d[0] + pos[0];
        			 int y = d[1] +pos[1];
        			 if (x >= 0 && x < map.length && y >= 0 && y < map[0].length && map[x][y] == '#') {
        				 map[x][y] = '.';
        				 count ++;
        				 stack.push(new int[] {x,y});
        			 }
        		 }
        	 }
         }

        return count; // Return the size of the ship
    }
}
