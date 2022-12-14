package Practise;
public class Stream{
    public static void main(String[] args) {
        System.out.println(skip("Raman"));
    }
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }else{
            return ch+skip(up.substring(1));
        }
    }
    static String skipString(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipString(up.substring(1));
        }else{
            return skipString(up.substring(1));
        }
    }
}