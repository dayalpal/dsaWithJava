public class MazeWithObstacls{
    public static void main(String[] args) {
        boolean[][] board ={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        mazeWithObs("", board, 0, 0);
    }

    static void mazeWithObs(String p,boolean [][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.err.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r< maze.length-1){
            mazeWithObs(p+'D', maze, r+1, c);
        }

        if(c< maze[0].length-1){
            mazeWithObs(p+'R', maze, r, c+1);
        }
    }
}