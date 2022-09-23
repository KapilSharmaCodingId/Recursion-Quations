/*   
Given an array of length N and an integer x, you need to find all the indexes where x is present in the input array. Save all the indexes in an array (in increasing order).
Do this recursively. Indexing in the array starts from 0.
 Input :
5
9 8 10 8 8
8
 Output :
1 3 4
*/

public class AllIndicesofNumber{
    public static int[] allIndexes(int input[],int x,int index,int count){
        if(index == input.length){
            int arr[] = new int[count];
            return arr;
        }
         if(input[index] == x){
           int arr1[] =  allIndexes(input, x, index+1, count+1);
           arr1[count] = index;
           return arr1;
         }else{
            int arr1[] = allIndexes(input, x, index + 1, count);
            return arr1;
         }
    }
    public static int[] indexInArr(int input[], int x){
        int count = 0;
        int index = 0;
        return allIndexes(input, x,index,count);
    }
    public static void main(String args[]){
          int arr[] ={9, 8, 10 ,8, 8};
          int x = 8;
          int arr1[] = indexInArr(arr,x);
          for(int i = 0; i < arr1.length ; i ++){
            System.out.print(arr1[i]+" ");
          }
    }
}