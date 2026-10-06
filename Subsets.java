
import java.util.ArrayList;

public class Subsets {

    public static void main(String[] args) {
        subsets("", "abc");

        ArrayList<String> result = subset("", "abc");
        System.out.println(result);
    }

    static void subsets(String p, String up) {
        if (up.isEmpty()) {
            System.err.println(p);
            return;
        }
        char ch = up.charAt(0);

        subsets(p + ch, up.substring(1));

        subsets(p, up.substring(1));

    }

    static ArrayList<String> subset(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subset(p + ch, up.substring(1));

        ArrayList<String> right = subset(p, up.substring(1));

        left.addAll(right);

        return left;
    }

}
