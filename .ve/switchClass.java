import java.util.Scanner;

public class switchClass {
    public static void main(String[] args) {
        Scanner bt = new Scanner(System.in);
        int button = bt.nextInt();

        switch (button) {
            case 1:
                System.out.println("Namsta");
                break;
            case 2:
                System.out.println("parnam");
                break;
            case 3:
                System.out.println("radha radha");
                break;
            default:
                System.out.println("sorry you are not an Indian");
        }
    }
}
