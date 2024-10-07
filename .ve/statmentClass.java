import java.util.Scanner;
public class statmentClass {
    public static void main(String[]args){
        Scanner ac = new Scanner(System.in);
        int age = ac.nextInt();
        if(age >= 18){
            System.out.println("adult");

        } 
        else {
            System.out.println(" not adult");
        }
    }
    
}
