/*
 Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Sample Input 1 :
3
9 8 10
8
Sample Output 1 :
true
 */


public class Check_Number_In_Array{
    public static boolean sum(int input[],int x) {
		if(input.length <= 1){
            if(input[0] == x){
                return true;
            }else{
                return false;
            }
        }

        int CheckInArray[] = new int[input.length-1];
        for(int i = 1;i < input.length;i++){
            CheckInArray[i-1] = input[i];
        } 

        boolean ans = sum(CheckInArray, x);
        if(ans){
            return true;

        }else{
            if(input[0] == x){
                return true;
            }
            else{

                return false;
            }
        }
		
	}
    public static void main(String[] args) {
        int arr[] = {1,3,8,5,6};
        int x = 87;
            System.out.println(sum(arr, x));
      
    }
}
