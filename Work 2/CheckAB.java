import java.util.*;
public class CheckAB{
    
    public static boolean check(String input){
        if(input.length() == 0){
            return true;
        }
        if(input.charAt(0) == 'a'){

            if(input.substring(1).length() > 1 && input.substring(1,3).equals("bb")){

                return check(input.substring(3));
            }
            else{

                return check(input.substring(1));
            }
        }
                return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String a = s.next();
        System.out.println(check(a));
    }
}