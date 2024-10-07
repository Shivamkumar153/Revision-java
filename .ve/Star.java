// printting star in pattern.
import java.util.Scanner;
public class Star {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        int a = ac.nextInt();
        Scanner bc = new Scanner(System.in);
        int b = bc.nextInt();
        for (int i = 0; i<=a; i++){
            for (int j = 0; j<= b; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
