/*
 Given a string S, remove consecutive duplicates from it recursively.
  Input 1 :
aabccba
 Output 1 :
abcba
 Input 2 :
xxxyyyzwwzzz
 Output 2 :
xyzwz

 */
public class RemoveDuplicates{

    public static String RemoveDuplicate(String s){
        if(s.length() == 1){
            return s;
        }
        char c;
        c = s.charAt(0);
        String smallAns = RemoveDuplicate(s.substring(1));
        if(c == smallAns.charAt(0)){
            return smallAns;
        }
        else{
            return c+smallAns;
        }
    }
    public static void main(String[] args) {
        String s = "xxxyyyzwwzzz";
        System.out.println(RemoveDuplicate(s));
    }
}