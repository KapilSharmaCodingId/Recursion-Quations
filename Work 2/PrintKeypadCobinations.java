/*
Given an integer n, using phone keypad find out and print all the possible strings that can be made using digits of input n.
Note : The order of strings are not important. Just print different strings in new lines.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
Sample Input:
23
Sample Output:
ad
ae
af
bd
be
bf
cd
ce
cf
*/

//Solution
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

//Solution  2

public static void findKeypadCombination(int input,String output){
   
            if(input == 0){
                System.out.println(output);
                return ;
            }

            char ans[] = helper(input%10);
            for(int i = 0 ;i < ans.length;i++){
                findKeypadCombination(input/10,ans[i] + output);
            }
       }
