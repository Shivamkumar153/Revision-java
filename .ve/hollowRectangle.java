import java.util.Scanner;
public class hollowRectangle{
    public static void main(String args[]){
       Scanner ac = new Scanner(System.in);
       int row = ac.nextInt();
    //    Scanner bc = new Scanner(System.in);
       int col = ac.nextInt();
       for( int i=1 ; i<=row ; i++) {
        for (int j = 1; j<=col; j++){
            if (i == 1 || i == row || j == 1 || j == col){
            System.out.print("*");
            }else{
                System.out.print(" "); //you will have to print null like this ("  ")
            }

        }
        System.out.println();

       }
       
    }
}

