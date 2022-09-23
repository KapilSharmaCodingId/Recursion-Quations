/*
Given an array of length N, you need to find and return the sum of all elements of the array.
Do this recursively.
Input Format :
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
*/
public class SumOfArray{
    public static int sum(int input[]) {
		
        if(input.length <= 1){
            return input[0];
        }
        int ShortArr[] = new int[input.length-1];
        for(int i = 1;i < input.length;i++){
            ShortArr[i-1] = input[i];
        }
        int ans = sum(ShortArr);
        return ans + input[0];
		
	}
    public static void main(String[] args) {
        int arr[] = {2,1,3,8,5,6};
        System.out.print(sum(arr));
    }
}