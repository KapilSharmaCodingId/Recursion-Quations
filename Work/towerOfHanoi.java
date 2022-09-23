/*  
Tower of Hanoi is a mathematical puzzle where we have three rods and n disks. The objective of the puzzle is to move all disks from source rod to destination rod using third rod (say auxiliary). The rules are :
1) Only one disk can be moved at a time.
2) A disk can be moved only if it is on the top of a rod.
3) No disk can be placed on the top of a smaller disk.
Print the steps required to move n disks from source rod to destination rod.
Source Rod is named as 'a', auxiliary rod as 'b' and destination rod as 'c'.
 Input 1 :
2
 Output 1 :
a b
a c
b c 
Input  :
3
 Output  :
a c
a b
c b
a c
b a
b c
a c
*/


public class towerOfHanoi{
    public static void towerOfHanoi(int disks, String source, String helper, String destination) {
       if(disks == 0){
       return ;
       }
       towerOfHanoi(disks-1,source,destination,helper);
       System.out.println(source+" "+destination);
       towerOfHanoi(disks-1,helper,source,destination);
       
       
       
   }
    
    public static void main(String[] args) {
         towerOfHanoi(3, "Pole1", "Pole2", "Pole3");
    }
}
