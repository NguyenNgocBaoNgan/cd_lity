package exam;

public class ex11 {
    static int M, N;
    static int[] dX = {0, 0, 1, -1};
    static int[] dY = {1, -1, 0, 0};
    static int[][] beSeen;

    // Đánh dấu các ô bị lính canh nhìn thấy
    public static void guardVis(char[][] matrix) {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                switch (matrix[i][j]) {
                    case '>':
                        for (int z = j + 1; z < N; z++) {
                            if (matrix[i][z] == 'X') break;
                            beSeen[i][z] = 1;
                        }
                        break;
                    case '<':
                        for (int z = j - 1; z >= 0; z--) {
                            if (matrix[i][z] == 'X') break;
                            beSeen[i][z] = 1;
                        }
                        break;
                    case '^':
                        for (int z = i - 1; z >= 0; z--) {
                            if (matrix[z][j] == 'X') break;
                            beSeen[z][j] = 1;
                        }
                        break;
                    case 'v':
                        for (int z = i + 1; z < M; z++) {
                            if (matrix[z][j] == 'X') break;
                            beSeen[z][j] = 1;
                        }
                        break;
                }
            }
        }
    }

    public static boolean solution(String[] B) {
        M = B.length;
        N = B[0].length();
        char[][] matrix = new char[M][N];
        for (int i = 0; i < M; i++) {
            matrix[i] = B[i].toCharArray();
        }

        int[] startPos = new int[2];
        beSeen = new int[M][N];

        // Tìm vị trí sát thủ
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 'A') {
                    startPos[0] = i;
                    startPos[1] = j;
                    break;
                }
            }
        }

        // Đánh dấu các ô bị lính canh quan sát
        guardVis(matrix);

        // Sử dụng DFS để kiểm tra xem sát thủ có thể đến đích không
        boolean[][] visited = new boolean[M][N];
        return dfs(matrix, visited, startPos[0], startPos[1]);
    }

    // Hàm DFS để kiểm tra đường đi của sát thủ
    public static boolean dfs(char[][] matrix, boolean[][] visited, int x, int y) {
        // Nếu sát thủ đến đích và ô này không bị lính canh quan sát
        if (x == M - 1 && y == N - 1 && beSeen[x][y] != 1) {
            return true;
        }

        // Đánh dấu vị trí hiện tại đã thăm
        visited[x][y] = true;

        // Duyệt theo 4 hướng di chuyển
        for (int i = 0; i < 4; i++) {
            int newX = x + dX[i];
            int newY = y + dY[i];

            // Kiểm tra điều kiện hợp lệ của vị trí mới
            if (newX >= 0 && newY >= 0 && newX < M && newY < N
                    && matrix[newX][newY] == '.' && !visited[newX][newY] && beSeen[newX][newY] != 1) {
                if (dfs(matrix, visited, newX, newY)) {
                    return true;  // Tìm thấy đường đi đến đích
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] test1 = {
            "X....>..",
            "..v.X..^",
            "..X....A"
        };
        String[] test2 = {
            ".....Xv",
            "A..X..^",
            "......X"
        };
        String[] test3 = {
            "....A...",
            ".....X..",
            ".X...v..",
            ".....X..",
            "....^..."
        };
        System.out.println(solution(test1)); // Kết quả mong đợi: false
        System.out.println(solution(test2)); // Kết quả mong đợi: true
        System.out.println(solution(test3)); // Kết quả mong đợi: false
    }
}
