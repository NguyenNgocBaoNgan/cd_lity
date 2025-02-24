package exam;
//There is a matrix A of integers, consisting of R rows and C columns. Rows are numbered from 0 to R-1; columns are numbered from 0 to
//
//Calculate the number of non-empty rectangular areas inside A, such that the sum of integers inside that area is equal to the sum of Integers outside of
//
//For example, for A [11.1.-211224/-1,-2,-2), one of such rectangular areas can be made of two cells with values 4 and-2, at positions (1, 2) and (2, 2) (marked in green in the picture below). Their sum is equal to 2, which is equal to the sum of the remaining Integers in A (marked In red in the picture below). There are six more other rectangular areas fulfilling the requirement in A
public class ex23 {
	public static int solution (int [][] A) {
		int rs =0; int S =0;
		for(int i =0; i < A.length; i++) {
			for(int j =0; j < A[0].length; j++) {
				S += A[i][j];
			}
		}
		if(S%2 !=0) return 0;
		
		for(int i =0; i < A.length; i++) {
			for(int j =0; j < A[0].length; j++) {
				for(int i1 =i; i1< A.length; i1++) {
					for(int j1 =j; j1 <A[0].length; j1++) {
						int subS =0;
						 
						for(int x = i; x <= i1; x++) {
							for(int y =j; y <=j1; y++) {
								subS += A[x][y];
							}
						}
						 
						if(subS == S/2) {
							rs++;
						}
					}
				}
			}
		}		return rs;
		
	}
	public static void main(String[] args) {
		 // Ví dụ 1
        int[][] A1 = {{1, 1,2}, {2, 0, 0}};
        System.out.println(solution(A1));  // Output: 3
        
        // Ví dụ 2
        int[][] A2 = {{5, -1}, {-3, 2}, {0,4}};
        System.out.println(solution(A2));  // Output: 0
        
        // Ví dụ 3
        int[][] A3 = {{-1, 0}, {1, 0}};
        System.out.println(solution(A3));  // Output: 5
        
     // Ví dụ 4
        int[][] A4 = {{1, 1,-2}, {3, 2, 4}, {-1,-2,-2}};
        System.out.println(solution(A4));  // Output: 7
        
	}
}