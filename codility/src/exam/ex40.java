package exam;
//The positions of the player (which is fixed at (0, 0)) and the enemies are different. There is at most one person in each position. The distance between two positions (x1, y1) and (x2, y2) is the square root of (x₁ - Х2)2 + (У1 -У2)2.
//Write a function:
//
//class Solution { public int solution(String direction, int radius, int[] X, int[] Y); }
//
//that, given string direction, integer radius, and arrays X and Y of N integers, returns the number of enemies highlighted by the flashlight.
//
//Examples:
//
//1. Given direction = "U", radius = 5, X = (-1, -2, 4, 1, 3, 0], Y = [5, 4, 3, 3, 1, -1], the function should return 2 as explained above.
//
//2. Given direction = "D", radius = 10, X = [0, -3, 2, 0], Y = [-10, -7, -5], the function should return 4. The player's forward direction is down. Even though the player and enemies in positions (0, -5) and (0,-10) are in a line, the enemy at position (0, -10) is still visible, so all four enemies are highlighted by the player's flashlight.
//
//For the enemy to be highlighted by the flashlight, their position has to be within both the light field and the light length of the player's flashlight.
//
//For example, given direction = "U", radius = 5, X = [-1, -2, 4, 1, 3, 0], Y = [5, 4, 3, 3, 1, -1], the function should return 2. The forward direction of the player is up. Enemies at positions (-2, 4) and (1,3) are highlighted by the flashlight of the player, as shown in the diagram.
public class ex40 {
	public static int solution (String direction, int radius, int[] X, int[] Y) {
		int rs =0;
		for(int i =0; i< X.length; i++) {
			double dis = Math.sqrt(X[i]*X[i] + Y[i]* Y[i]);
			double angle = Math.atan2(Y[i], X[i]);
			if(dis <= Math.abs(radius)) {
			
			 switch (direction) {
             case "U":
                 if (Y[i] > 0 && angle >= -Math.PI/4 && angle <= Math.PI/4) rs++;
                 break;
             case "D":
            	  if (Y[i] < 0 && (angle >= -Math.PI/4 && angle <= Math.PI/4)) rs++;
                     rs++;
                 break;
             case "L":
                 if (X[i] < 0 && angle >= 3*Math.PI/4 || angle <= -3*Math.PI/4) rs++;
                 break;
             case "R":
                 if (X[i] > 0 && angle >= 3*Math.PI/4 && angle <= -3*Math.PI/4) rs++;
                 break;
         
			 }
		}
		
	}
		return rs;
		
}
	public static void main(String[] args) {
        System.out.println(solution("L", 5, new int[]{-6, -4, -3, 1, 2, -5}, new int[]{0, -2, 3, 0, -1, 1})); // 2
        System.out.println(solution("D", 10, new int[]{0, -3, 2, 0}, new int[]{-10,-3, -7, -5})); // 4
        System.out.println(solution("R", 3, new int[]{-2,3}, new int[]{0,1})); // 0
		System.out.println(solution( "U", 5, new int[]{-1, -2, 4, 1, 3, 0}, new int[] {5, 4, 3, 3, 1, -1})); //2
	}
}