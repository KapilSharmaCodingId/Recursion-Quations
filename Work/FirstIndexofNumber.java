/*Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Sample Input :
4
9 8 10 8
8
Sample Output :
1
*/

public class FirstIndexofNumber{
    static int start = 0;
    public static int sum(int input[],int x) {
        if(start>= input.length-1){
            if(input[start] == x){
                
                return start;
            }else{
                return -1;
            }
        }
		if(input[start] ==x){
            return start;
        }
        start++;
        return sum(input,x);
        
	}
    public static void main(String[] args) {
        int arr[] = {1,3,5,6};
        int x = 3;
        // int start = 0;
            System.out.println(sum(arr, x));
      
    }
}
