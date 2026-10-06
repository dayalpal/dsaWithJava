
import java.util.Arrays;
import java.lang.reflect.Array;

public class AllPathMaze {

    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
// allPathMaze("", board, 0, 0);
        int[][] path = new int[board.length][board[0].length];
        allPathCount("", board, 0, 0, path, 1);

    }

    static void allPathMaze(String p, boolean[][] maze, int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.err.println(p);
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;

        if (r < maze.length - 1) {
            allPathMaze(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            allPathMaze(p + 'R', maze, r, c + 1);
        }
        if (r > 0) {
            allPathMaze(p + 'U', maze, r - 1, c);
        }
        if (c > 0) {
            allPathMaze(p + 'L', maze, r, c - 1);
        }

        maze[r][c] = true;
    }

    /*                  ---------------------------------                              */
    static void allPathCount(String p, boolean[][] maze, int r, int c, int[][] path, int step) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            System.out.println(p);
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }

        if (!maze[r][c]) {
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            allPathCount(p + 'D', maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            allPathCount(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if (r > 0) {
            allPathCount(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if (c > 0) {
            allPathCount(p + 'L', maze, r, c - 1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
