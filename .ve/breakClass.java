import java.util.Scanner;
public class breakClass {
public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    switch(button){
        case 1: System.out.println("Namsta");
        break;
        case 2: System.out.println("parnam");
        break;
        case 3: System.out.println( "radha radha");
        break;
        default: System.out.println("you are not an Indian");
        break;
    }
}   
}
