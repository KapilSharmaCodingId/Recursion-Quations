/*
Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
Return empty string for numbers 0 and 1.
Note : 1. The order of strings are not important.
2. Input and output has already been managed for you. You just have to populate the output array and return the count of elements populated in the output array.
Input Format :
Integer n
Output Format :
All possible strings in different lines
Constraints :
1 <= n <= 10^6
 Input:
23
 Output:
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

public class keypadCode {

	// Return a string array that contains all the possible strings
    public static char[] helper(int n){
        if(n <= 1 && n>10){
            System.exit(0);
        }
      
        if(n == 2){
            char helper[] = {'a','b','c'};
                return helper;
        }
        else
            if(n == 3){
                char helper3[] = {'d','e','f'};
                return helper3;
            }
            else
                if(n == 4){
                    char helper4[] = {'g','h','i'};
                return helper4;
                }
                else
                    if(n == 5){
                        char helper5[] = {'j','k','l'};
                        return helper5;
                    }
                else
                    if(n == 6){
                      char helper6[] = {'m','n','o'};
                      return helper6;
                    }
                    else
                        if(n == 7){
                            char helper7[] = {'p','q','r','s'};
                            return helper7;
                        }
                        else
                            if(n == 8){
                                char helper8[] = {'t','u','v'};
                                return helper8;
                            }
                            else
                                {
                                    char helper9[] = {'w','x','y','z'};
                                    return helper9;
                                }
                            }
	public static String[] keypad(int n){
		
         if(n == 0){
             String ans[] = {""};
             return ans;
         }
        
        int lastdigit = n%10;
        int smallNo = n/10;
        String ans[] = keypad(smallNo);
        char find[] = helper(lastdigit);
        
        String solution[] = new String[ans.length * find.length];
        int k = 0;
        for(int i = 0;i < ans.length; i++){
            for(int j = 0;j < find.length; j++){
                 solution[k] = ans[i] + find[j];
                k++;
            }
        }
        return solution;
	}
    public static void main(String args[]){
        int n = 23;
        String ana[] = keypad(n);
        for(int i = 0;i < ana.length;i++){
            System.out.println(ana[i]);
        }
    }
	
}
