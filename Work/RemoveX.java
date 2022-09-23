/* Given a string, compute recursively a new string where all 'x' chars have been removed. 
  Input 1 :
xaxb
 Output 1:
ab
 Input 2 :
abc
 Output 2:
abc
 Input 3 :
xx
 Output 3:
*/

public class RemoveX{
    public static String  removeX(String input){
        String newString = "";
        String output = "";
        if(input.length() == 0){
             return input ;
        }
        if(input.charAt(0) == 'x'){
            output =  removeX(input.substring(1, input.length()));
            return output;
        }
        else{
           newString =  removeX(input.substring(1, input.length()));
            output =  input.charAt(0) + newString;
        }
        return output;
        
    }
    
    public static void main(String args[]){
       String s = "ppixypzpieir";
       System.out.print(removeX(s));
        
    }
} 


//Solution 2

public static String  removeX(String input){
        if(input.length() == 0){
            return "";
        }
        if(input.charAt(0) == 'x'){
            return removeX(input.substring(1));
        }
        return input.charAt(0) + removeX(input.substring(1));
    }
//Solution 3
    public static String removeX(String input){
        if(input.length() == 0){
            return input;
        }
		String ans = "";
        if(input.charAt(0) != 'x'){
            ans = ans + input.charAt(0);
        }
        String smallAns = removeX(input.substring(1));
        return ans+smallAns;

	}   