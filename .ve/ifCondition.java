import java.util.Scanner;
 

public class ifCondition {
   public static void main(String[]args){
    Scanner bc = new Scanner(System.in);
    int age = bc.nextInt();
    
    if(age >= 18){
        System.out.println("Adult");
    }
    else {
        System.out.println("not Adult");
    }

   } 
}
