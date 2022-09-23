/*Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
 Input 1 :
 3 4
 Output 1 :
81
 Input 2 :
 2 5
 Output 2 :
32 
*/

public class CalculatePower{
    public static int power(int x, int n) {
		if(n==0  ){
            return 1;
        }
        int ans = power(x,n-1);
        return ans * x;
	}
    public static void main(String[] args) {
          int x= 4;
          int n = 2;
            System.out.println(power(x, n));
      
    }
}
