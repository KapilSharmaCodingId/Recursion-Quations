public class PrintKeypadCobinations{

    public static char[] helper(int n){
        if(n <= 1 && n > 10){
            char ans[] = {'0'};
            return  ans;
        }
        if(n == 2){
            char ans[] = {'a','b','c'};
            return  ans;
        }
        else if(n == 3){
            char ans[] = {'d','e','f'};
            return  ans;
        }
        else if(n == 4){
            char ans[] = {'g','h','i'};
            return  ans;
        }
         else if(n == 5){
            char ans[] = {'j','k','l'};
            return  ans;
         }
         else if(n == 6){
            char ans[] = {'m','n','o'};
            return  ans;
         }
         else if(n == 7){
            char ans[] = {'p','q','r','s'};
            return  ans;
         }
         else if(n == 8){
            char ans[] = {'t','u','v'};
            return  ans;
         }
         else if(n == 9){
            char ans[] = {'w','x','y','z'};
            return  ans;
         }
        else{
            char ans[] = {'\0'};
            return  ans;
        }
    }
    public static void findKeypadCombination(int input,String output){
        if(input <= 0){
            System.out.print(output+" ");
            return ;
        }
        int lastdigit = input%10;
        input = input/10;
       char ans[] = helper(lastdigit);

       int count = 0;
       if(ans.length == 3){

           findKeypadCombination(input,ans[0] + output);
           findKeypadCombination(input, ans[1] + output);
           findKeypadCombination(input, ans[2] + output);
        }
        else{
           findKeypadCombination(input,ans[0] + output);
           findKeypadCombination(input, ans[1] + output);
           findKeypadCombination(input, ans[2] + output);
           findKeypadCombination(input, ans[3] + output);

       }


    }
    public static void KeypadCobinations(int input){
        
        findKeypadCombination(input,"");
    }
    public static void main(String args[]){
         int n = 9;
         KeypadCobinations(n);
    }        
}