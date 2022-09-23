/*Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
 Input 1 :
hello
 Output 1:
hel*lo
 Input 2 :
aaaa
 Output 2 :
a*a*a*a    
*/

    public class PairStar{
        public static String solution(String input){
             if(input.length() == 1){
                  return input;
             }
             if(input.charAt(0) == input.charAt(1)){
                  return input.charAt(0)+"*"+solution(input.substring(1));
             }
             else{
                  return  input.charAt(0)+ solution(input.substring(1));
             }
            
        }
        
        public static void main(String[] args) {
           String x = "kapill";
           System.out.print(solution(x));
        }
   }
