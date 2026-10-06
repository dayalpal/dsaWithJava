
import java.util.ArrayList;

public class DiagonalMaze{
    public static void main(String[] args) {

        System.err.println(diagonalMaze("",3,3));
        
    }

    static ArrayList<String> diagonalMaze(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> path =new ArrayList<>();
            path.add(p);
            return path;
        }

        ArrayList<String> path =new ArrayList<>();

        if(r>1 && c>1){
            path.addAll(diagonalMaze(p+'D', r-1, c-1));
        }

        if(r>1){
            path.addAll(diagonalMaze(p+'V', r-1, c));
        }

        if(c>1){
            path.addAll(diagonalMaze(p+'H', r, c-1));
        }
 
        return path;
    }
}