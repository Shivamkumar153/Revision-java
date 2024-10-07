import java.util.Scanner;
public class HolfPyramid {
    public static void main(String[]agrs){
        Scanner ac = new Scanner(System.in);
        int n = ac.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
