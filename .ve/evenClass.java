import java.util.Scanner;
public class evenClass {
    public static void main(String[]args){
        Scanner ev = new Scanner(System.in);
        int i = ev.nextInt();
        
        if(i % 2 == 0)
        {
           System.out.println("even");

        
        }
        else{
            System.out.println("odd");
        }

    }
    
}
