/* 
Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
 Input 1 :
0
 Output 1 :
1
 Input 2 :
00010204
 Output 2 :
2
*/

public class CountZeros  {
    public static int countZerosRec(int input){
		if(input <= 10){
            if(input == 0){
                return 1;
            }else{
                return 0;
            }
        }
        if(input%10 == 0){
            return countZerosRec(input/10)+1;
        } 
        else{
            return countZerosRec(input/10);
        }
       
    }
    public static void main(String[] args) {
        int a = 0;
        System.out.print(countZerosRec(a));
    }
} 