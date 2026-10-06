public class SubString{
    public static void main(String[] args) {
       System.err.println(skip( "baccappledah")); 
    }

    static void skip(String p,String up){
        if(up.isEmpty()){
            System.err.println(p);
            return;
        }
        char ch= up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));
        } else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch=up.charAt(0);

        if(ch=='a'){
           return  skip(up.substring(1));
        } else{
            return ch+ skip(up.substring(1));
        }

    }


    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch=up.charAt(0);

        if(ch=='a'){
           return  skip(up.substring(1));
        } else{
            return ch+ skip(up.substring(1));
        }

    }
}