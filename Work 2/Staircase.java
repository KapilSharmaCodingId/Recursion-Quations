/*
A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
Input format :
Integer N
Output Format :
Integer W
Constraints :
1 <= N <= 30
 Input 1 :
4
 Output 1 :
7
 Input 2 :
5
 Output 2 :
13
*/


public class Staircase{
    

     public static int staircase(int n){
		
            if(n == 1){
                return 1;
            }else{
                if(n == 2){
                    return 2;
                }else{
                    if(n == 3){
                        return 4;
                    }
                }
            }
       
            return staircase(n-1)+staircase(n-2)+staircase(n-3);
       }
    public static void main(String[] args) {
        int jump = 4;
        System.out.print(staircase(jump));
        
    }
}
