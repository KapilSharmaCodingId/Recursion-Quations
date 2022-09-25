/*
 Input 1 :
6 
2 6 8 5 4 3
 Output 1 :
2 3 4 5 6 8
 Input 2 :
5
2 1 5 2 3
 Output 2 :
1 2 2 3 5 
*/

//Solution 1 -- >
public class MergeSort{
    public static void merge(int input[],int start,int end){
        int mid = (start+end)/2;
        int i = start, j = mid+1;
        int index = 0;
        int arr[] = new int[end-start+1];
        while(i <= mid && j <= end){
            if(input[i] < input[j]){
             arr[index] = input[i];
             index++;
             i++;
            }else{
                arr[index] = input[j];
                index++;
                j++;
            }
        }
        while(i<=mid){
            arr[index] = input[i];
            index++;
            i++;
        }
        while(j<=end){
            arr[index] = input[j];
            index++;
            j++;
        }

        for(int k = 0;k< arr.length;k++){
            input[start+k] = arr[k];
        }
    }
    public static void mergeSort(int input[],int start,int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(input, start, mid);
        mergeSort(input, mid+1, end);
        merge(input,start,end);
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,65,2};
        mergeSort(arr, 0, arr.length-1);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

//Soution 2 -->

public static void mergeSort(int[] input){
	
        if(input.length  <= 1){
            return ;
        }
        int mid = input.length/2;
        int part1[] = new int[mid];
        int part2[] = new int[input.length-mid];
        for(int i =0;i<mid;i++){
            part1[i] = input[i];
        }
        int k = 0;
        for(int i=mid;i<input.length;i++){
            part2[k] = input[i];
            k++;
        }
        mergeSort(part1);
        mergeSort(part2);
        merge(part1,part2,input);
    }

    public static void merge(int input1[],int input2[],int output[]){
        int i =0 ,j = 0,k = 0;
        while(i < input1.length && j<input2.length){
            if(input1[i] < input2[j]){
                output[k] = input1[i];
                k++;i++;
            }
            else{
                output[k] = input2[j];
                k++;j++;
            }
        }
        while(i < input1.length){
            output[k] = input1[i];
            k++;i++;
        }
        while(j < input2.length){
            output[k] = input2[j];
            j++;
            k++;
        }
    }
