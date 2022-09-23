/* Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers,
you need to convert the string into corresponding integer and return the answer. 
 Input 1 :
00001231
 Output 1 :
1231
 Input 2 :
12567
 Output 2 :
12567
*/
public class StringtoInteger{
    public static int convertStringToInteger(String input){
          if(input.length() == 1){
              return input.charAt(0)-'0';
          }
          int smallOutput = convertStringToInteger(input.substring(0,input.length()-1));
          int lastDigit = input.charAt(input.length()-1)-'0';
          return smallOutput*10+lastDigit;
    }
    public static void main(String[] args) {
       String x = "12345";
       System.out.print(convertStringToInteger(x));
    }
}
