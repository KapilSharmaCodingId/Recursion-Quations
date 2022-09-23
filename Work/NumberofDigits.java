/*Given the number 'n', find out and return the number of digits present in a number recursively. 
  Input 1 :
 156
 Output 1 :
3
 Input 2 :
 7
 Output 2 :
1

*/

public class NumberofDigits{
    static int power = 0;
    public static int count(int n){
		   
	    if(n!=0)
	    {
	        power++;
	        count(n/10);
	    }
        int ans = power;
	    return ans;
		
    }
    public static void main(String[] args) {
          int x= 445;
            System.out.println(count(x));
      
    }
}
*/

public class NumberofDigits{
    static int power = 0;
    public static int count(int n){
		   
	    if(n!=0)
	    {
	        power++;
	        count(n/10);
	    }
        int ans = power;
	    return ans;
		
    }
    public static void main(String[] args) {
          int x= 445;
            System.out.println(count(x));
      
    }
}
