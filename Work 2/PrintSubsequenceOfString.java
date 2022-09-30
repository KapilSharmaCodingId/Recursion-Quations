/*
Print the all subsequence of a stirng 
*/

public class PrintSubsequenceOfString {

    public static void findSubsequence(String input,String output){

        if(input.length() == 0){
            System.out.print(output + " ");
            return ;
        }
        
        //lets assum first element is not occure  
        findSubsequence(input.substring(1), output);
        //lets assum first element is  occure 
        findSubsequence(input.substring(1), output + input.charAt(0));
    }

    public static void PrintSubsequence(String input){

        findSubsequence(input,"");
    }
	public static void main(String args[]){
        String input  = "xyz";
         PrintSubsequence(input);
    }
}
