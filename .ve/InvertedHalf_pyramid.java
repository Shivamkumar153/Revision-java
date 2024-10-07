import java.util.Scanner;
public class InvertedHalf_pyramid {
    public static void main(String args[]){
        Scanner ac = new Scanner(System.in);
        int n = ac.nextInt();
        for( int i=n; i>=1; i--){
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    
}
