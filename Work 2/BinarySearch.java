public class BinarySearch {

    public static int binary(int[] input,int element,int start,int end){

        if(start > end){
            return -1;
        }
        int mid = (start + end)/2;
        if(input[mid] == element){
              return mid;
        }
         if(input[mid] < element){
            return binary(input, element, mid+1, end);
        }
            else{
                return binary(input, element, start, mid-1);
            }
    }
    public static int binarySearch(int input[] , int element){

        int start = 0;
        int end = input.length-1;
         return binary(input,element,start,end);
        
        

    }
    public static void main(String[] args) {
        int input[] = {1,3,5,7,9};
        int n = 71;
        System.out.println(binarySearch(input, n));
    }
}
