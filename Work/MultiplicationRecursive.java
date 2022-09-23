/*  
Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.

Input 1 :
3 
5
 Output 1 :
15
 Input 2 :
4 
0
 Output 2 :
0
*/


public class MultiplicationRecursive  {
    public static int multiply(int n ,int m){
        if(m == 1){
            return n;
        }
        int ans = multiply(n, m-1);
        return ans + n ;
    }
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        System.out.print(multiply(a, b));
    }
} 