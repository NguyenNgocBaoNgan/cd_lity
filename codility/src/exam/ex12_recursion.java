package exam;

import java.util.ArrayList;
import java.util.Arrays;

//Battleships is a game played on a rectangular board. You are given a representation of such a board of size (width) with information about the locations of the ships.
//
//The board is given as an array B, whose every element is a string that corresponds to one row of the game be character of each string represents a cell of the board and is either
//
//character marking a part of a ship, or character, representing an empty cell
//
//Two cells that share a side and have a value of af are parts of the same ship. Cell (X, Y) shares a side with cell Y+1), (X-1, Y) and (X+1, Y)
//
//In the Battleships game there are three types of ships
//
//Patrol Boats of size 1:
//
//Submarines of size 2, which come in two shapes
public class ex12_recursion {
	static int M,N;
	static char[][] matrix;
	static int[][] visited;
	
	static int[] dx = {0,0, 1, -1};
	static int[] dy = {1,-1, 0, 0};

	public static int[] solution (String[] B) {
		int[] rs = new int [3];
		M = B.length; N= B[0].length(); visited = new int[M][N];
		matrix = new char[M][N];
		for(int i=0; i < B.length; i ++) {
			matrix[i] = B[i].toCharArray();
		}
		for(int i =0; i < M; i++) {
			for(int j =0; j <N; j ++) {
				if(matrix[i][j] == '#' && visited[i][j] ==0) {
					//visited[i][j] =1;
					ArrayList<int[]> ship = new ArrayList<>();
					dfs(i, j, ship);
					if(ship.size() ==1) {
						rs[0]++;
					} else {
					if(ship.size() ==2) {
						if(ship.get(0)[0] == ship.get(1)[0] || ship.get(0)[1] == ship.get(1)[1]) {
							rs[1]++;						
					}
					}
					else if (ship.size() ==3) {
						rs[2]++;					
				}
			}
		}
			}
		}
	
		return rs;
	
	}


	public static void dfs(int x, int y, ArrayList<int[]> ship) {
		// TODO Auto-generated method stub
		if(x <0 || y <0|| x >= M || y >= N || matrix[x][y] != '#' || visited [x][y] ==1 ) {
			return;
		}
		visited[x][y] =1; 
		ship.add(new int[] {x,y});
		for(int i=0; i <4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];
			dfs(newX, newY, ship);
			
		}
		
	}
	public static void main(String[] args) {
        String[] B1 = {".##.#", "#.#..", "#...#", "#.##."};

        String[] B2 = {".#..#", "##..#", "...#."};
        String[] B3 = {"##.", "#.#", ".##"};
        String[] B4 = {"...", "...", "..."};

        // In kết quả đếm số lượng tàu cho mỗi ví dụ
        System.out.println(Arrays.toString(solution(B1))); // Kết quả mong đợi: [2, 1, 2]
        System.out.println(Arrays.toString(solution(B2))); // Kết quả mong đợi: [1, 1, 1]
        System.out.println(Arrays.toString(solution(B3))); // Kết quả mong đợi: [1, 1, 1]
        System.out.println(Arrays.toString(solution(B4))); // Kết quả mong đợi: [1, 1, 1]

    }
	} 