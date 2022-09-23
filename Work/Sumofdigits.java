/* Write a recursive function that returns the sum of the digits of a given integer.
 Input 1 :
12345
 Output 1 :
15
 Input 2 :
9
 Output 2 :
9
*/
public class Sumofdigits
{
    public static int sumOfDigits(int input){
       if(input == 0){
        return 0;
       }
        int ans = input%10;
        return sumOfDigits(input/10)+ans;
        
    }
    
    public static void main(String args[]){
       int k = 12345;
       System.out.println(sumOfDigits(k));
        
    }
}
