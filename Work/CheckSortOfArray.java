// Solution 1 -->
public class CheckSortOfArray{
    public static boolean checkSort(int input[]){
        if(input.length <=1){
            return true;
        }
        int smallInput[] = new int[input.length - 1];
        for(int i = 1;i <input.length; i++){
            smallInput[i-1] = input[i];
        }

        boolean smallAns = checkSort(smallInput);
        if(!smallAns){
            return false;
        }
        if(input[0] <=input[1]){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int input[] = {1,1,2,5};
        System.out.print(checkSort(input));
    }
}



//Solution 2 -->

 public static boolean checkSort(int input[],int startingIndex) {
        if(startingIndex >= input.length-1){
            return true;
        }
		if(input[startingIndex]>input[startingIndex+1]){
            return false;
        }
        boolean ans = checkSort(input, startingIndex+1);
        return ans;
	}
