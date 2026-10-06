//Amazon , Google , Microsoft interview question 

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {
        System.err.println(countMaze(3, 3));
        path("", 3, 3);
        System.err.println(pathReturn("",3, 3));
    }

    static int countMaze(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }

        int left = countMaze(r - 1, c);
        int right = countMaze(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.err.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);

        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }


    static ArrayList<String> pathReturn(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> path=new ArrayList<>();
            path.add(p);
            return path;
        }

        ArrayList<String> path =new ArrayList<>();
        if (r > 1) {
            path.addAll(pathReturn(p + 'D', r - 1, c));

        }
        if (c > 1) {
           path.addAll(pathReturn(p + 'R', r , c-1));
        }

        return path;
    }
}
