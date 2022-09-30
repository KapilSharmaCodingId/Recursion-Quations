/*
Given an integer sorted array (sorted in increasing order) and an element x, find the x in given array using binary search. Return the index of x.
Return -1 if x is not present in the given array.
Note : If given array size is even, take first mid.
Input format :

Line 1 : Array size

Line 2 : Array elements (separated by space)

Line 3 : x (element to be searched)

 Input :
6
2 3 4 5 6 8 
5 
 Output:
3 
*/

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
