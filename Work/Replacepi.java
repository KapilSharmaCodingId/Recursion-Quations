/* Given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14".
  Input 1 :
xpix
 Output :
x3.14x
 Input 2 :
pipi
 Output :
3.143.14
 Input 3 :
pip
 Output :
3.14p
 */

public class Replacepi{
    public static String  ReplacepiFunction(String input){
      
        if(input.length() == 0 || input.length() == 1){
            String ans = input + " ";
            return ans;
        }
        if(input.charAt(0) == 'p' && input.charAt(1) == 'i'){

            String k = ReplacepiFunction(input.substring(2, input.length()));
            
            return "3.14" + k;
        }
        else{
            String k = ReplacepiFunction(input.substring(1, input.length()));
            return input.charAt(0) + k;
        }
        
    }
    
    public static void main(String args[]){
       String s = "ppixypzpieir";
       System.out.print(ReplacepiFunction(s));
        
    }
}


//Solution

public static String  ReplacepiFunction(String input){
        String output;
       if(input.length() <= 1){
        return input;
       }
       String small = ReplacepiFunction(input.substring(1));
       if(input.charAt(0) == 'p' && small.charAt(0) == 'i'){
        output = "3.14" + small.substring(1);
       } 
       else{
        output = input.charAt(0) + small;
       }
        return output;
