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