
import java.util.ArrayList;

//Amazon Interviwe problem
public class DiceProblem {

    public static void main(String[] args) {
        System.err.println(" 6 Face Dice ");
        System.err.println(dice("", 6));
        System.err.println("Dice Face");
        System.err.println(diceFace("", 8,10));
    }

    static ArrayList<String> dice(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            ArrayList<String> res = dice(p + i, target - i);
            list.addAll(res);
        }

        return list;
    }

     static ArrayList<String> diceFace(String p, int target,int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            ArrayList<String> res = diceFace(p + i, target - i,face);
            list.addAll(res);
        }

        return list;
    }
}
