import java.util.Scanner;
public class compringClass {
    public static void main(String[]args){
        Scanner eq = new Scanner(System.in);
        int a = eq.nextInt();
        int b = eq.nextInt();
        if(a == b){
            System.out.println("equal");
        }else if(a > b){
            System.out.println("greater");
        }else if(a < b){
            System.out.println("less");
        }else{
            System.out.println("next time");
        }


    }
    
}
