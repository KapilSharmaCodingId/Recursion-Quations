/* Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array. Return -1 if it is not present in the array.
Last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
You should start traversing your array from 0, not from (N - 1).
Do this recursively. Indexing in the array starts from 0. 
 Input :
4
9 8 10 8
8
 Output :
3
*/

public class LastIndexofNumber{
    public static int lastIndex(int input[],int x,int start){
        if(start == input.length){
            return -1;
        }
        int ans = lastIndex(input,x,start+1);
        if(ans != -1){
            return ans;
        }
        else{
            if(input[start]==x){
                return start; 
            }
            else{
                return -1;
            }
        }
    }
	public static int lastIndex(int input[], int x) {
       return lastIndex(input,x,0);   
        
    }
    public static void main(String[] args) {
          int x= 4;
          int arr[] = {4,4,6,1};
            System.out.println(lastIndex(arr,x));
      
    }
}