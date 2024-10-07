// is code is not looing good so make it new.

import java.util.Scanner;
public class calculater {
    public static void main(String[]args){
    Scanner cl = new Scanner(System.in);
    int a= cl.nextInt();
    int b = cl.nextInt();
    int button = cl.nextInt();
    switch(button){
        case 1:System.out.println(a+b);
        break;
        case 2:System.out.println(a-b);
        break;
        case 3:System.out.println(a*b);
        break;
        case 4:System.out.println(a/b);
        break;
        case 5:System.out.println(a%b);
        break;
    }

    } 
}
