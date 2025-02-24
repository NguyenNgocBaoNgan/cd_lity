package exam;
//Charlemagne, the King of Frankia, is considering building some castles on the border with Servia. The border is divided into N segments. The King knows the height of the terrain in each segment of the border. The height of each segment of terrain is stored in array A, with A[P] denoting the height of the P-th segment of the border. The King has decided to build a castle on top of every hill and in the bottom of every valley.
//
//Let [P..Q] denote a group of consecutive segments from P to Q inclusive such that (0 <= P <= Q <= N - 1) Segments [P..Q] form a hill or a valley if all the following conditions are satisfied:
//
//• The terrain height of each segment from P to Q is the same ( A[P] = A[P + 1] =...=A[Q])
//
//• P > 0 A[P - 1] < A[P] (for a hill) or A[P - 1] > A[P] (for a valley);
//
//If Q < N - 1 then A[Q + 1] < A[Q] (for a hill) or A[Q + 1] > A[Q] (for a valley);
//
//That is, a hill is higher than its surroundings and a valley is lower than its surroundings. Note that if the surroundings on either side of the hill or valley don't exist (i.e. at the edges of the area under consideration, where P = 0 or Q = N - 1 ) then the condition is considered satisfied for that side of the hill/valley.
//
//The king is wondering how many castles is he going to build. Can you help him?
//
//For example, consider the following array A = [2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5]
public class ex33 {
    public static int solution(int[] A) {
        int rs = 0;
        int min = 0; // Điểm bắt đầu của đoạn hiện tại
        
        for (int i = 1; i < A.length; i++) {
            // Kiểm tra xem có đoạn mới không (A[i] khác A[i-1])
            if (A[i] != A[i - 1]) {
                int max = i - 1; // Điểm kết thúc của đoạn trước
                
                // Kiểm tra xem đoạn [P..Q] có phải là đỉnh đồi hoặc thung lũng không
                if ((min == 0 || A[min - 1] < A[min]) && (max == A.length - 1 || A[max + 1] < A[max])) {
                    // Đỉnh đồi
                    rs++;
                } else if ((min == 0 || A[min - 1] > A[min]) && (max == A.length - 1 || A[max + 1] > A[max])) {
                    // Thung lũng
                    rs++;
                }
                
                // Cập nhật P cho đoạn mới
                min = i;
            }
        }
        
        // Xử lý đoạn cuối cùng [P..A.length - 1]
        int max = A.length - 1;
        if ((min == 0 || A[min - 1] < A[min]) && (max == A.length - 1 || A[max + 1] < A[max])) {
            rs++;
        } else if ((min == 0 || A[min - 1] > A[min]) && (max == A.length - 1 || A[max + 1] > A[max])) {
            rs++;
        }
        
        return rs;
    }

    public static void main(String[] args) {
        int[] test = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 2, 5};
        int[] test1 = {-3, -3};

        System.out.println(solution(test));  // Kết quả mong đợi: 4
        System.out.println(solution(test1)); // Kết quả mong đợi: 1
    }
}

