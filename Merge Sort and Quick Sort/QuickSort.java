//Solution 1 -->
public class QuickSort{
    public static void quickSort(int input[],int start,int end){
        if(start >= end){
            return;
        }
        int pivotpos = particion(input,start,end);
        quickSort(input,start,pivotpos-1);
        quickSort(input,pivotpos+1,end);
    }
    public static int particion(int input[],int start,int end){
        int count  = 0;
        int pivot = input[start];
        for(int i = start+1;i<input.length;i++){
            if(input[i] <= pivot){
                count++;
            }
        }
        int pivotpos = start+count;
        int temp = input[pivotpos];
        input[pivotpos] = input[start];
        input[start] = temp;

        int i = start;
        int j = end;
        while(i < pivotpos && j > pivotpos){
            if(input[i] <= pivot){
                i++;
            }else{
                if(input[j] > pivot){
                    j--;
                }else{
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                    i++;
                    j--;
                }
            }
        }
        return pivotpos;
    }
    public static void main(String args[]){
       int arr[] = {2,18,19,3,5,7,1};
       quickSort(arr,0,arr.length-1);
       for(int i = 0 ;i < arr.length; i++){
        System.out.print(arr[i]+" ");
       }
    }
}



//Second way to right the particion function
public static int particion(int input[],int start,int end)
    {
        int pivot = input[start];
        int count = 0;
        for(int i = start+1;i <= end; i++){
            if(input[i] <= pivot){
                count++;
            }
        }
        int pivotpos = start+count;
        input[start] = input[pivotpos];
        input[pivotpos] = pivot;
        
        int i = start;
        int j = end;
        while(i < j){
            while(i <= end && input[i] <=pivot){
                i++;
            }
            while(input[j] > pivot){
                    j--;
                }
                if(i <= j){
                    int temp = input[i];
                     input[i] = input[j];
                     input[j] = temp;
                     i++;
                     j--;
             }
            }
        return pivotpos;
        }
