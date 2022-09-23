/*
Given k, find the geometric sum i.e.
1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
using recursion.
  Input 1 :
3
 Output 1 :
1.87500
 Input 2 :
4
 Output 2 :
1.93750
 */
public class GeometricSum{
    public static double findGeometricSum(int k){
		if(k==0){
            return 1;
        }
        return findGeometricSum(k-1) + 1/Math.pow(2,k);

	}
    
    public static void main(String args[]){
        int k = 4;
        System.out.print(findGeometricSum(k));
      
    }
}