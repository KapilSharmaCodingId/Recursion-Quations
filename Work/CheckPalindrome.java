/*
Check whether a given String S is a palindrome using recursion. Return true or false.

Sample Input 1 :
racecar
Sample Output 1:
true
Sample Input 2 :
kapil
Sample Output 2:
false
*/

public class CheckPalindrome
{
    public static boolean CheckPalindromeFunctio(String s,int starting,int ending){
        if(s.charAt(starting) == s.charAt(ending)){
            return true;
        }
        boolean ans = false;
        if(s.charAt(starting) == s.charAt(ending)){

            return  ans = CheckPalindromeFunctio(s, starting+1, ending-1);
        }
        else{
            return false;
        }
        
    }
    
    public static void main(String args[]){
        String s = "abcba";
        int starting = 0;
        int ending = s.length()-1;
        System.out.println(CheckPalindromeFunctio(s,starting,ending));
      
    }
}


//Solution 2

public static boolean isStringPalindrome(String input){
         if(input.length() <= 1){
                 return true;
        }
        if(input.charAt(0) == input.charAt(input.length()-1)){
            return isStringPalindrome(input.substring(1,input.length()-1));
        }
        else{
            return false;
        }
}
