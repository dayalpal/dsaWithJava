
import java.util.ArrayList;
import java.util.List;

//Google interview problem

public class PhonePad {

    public static void main(String[] args) {
         ArrayList<String> result = pad("", "26");
        System.out.println(result);

        List<String> result1 = padlist("","23");
        System.out.println(result1);
    }

    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            ArrayList<String> res=pad(p + ch, up.substring(1));
            list.addAll(res);
        }
        return list;

    }

     static List<String> padlist(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        List<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            List<String> res=pad(p + ch, up.substring(1));
            list.addAll(res);
        }
        return list;

    }
}
