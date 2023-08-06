package JAVA;
import java.util.Scanner;
public class conditions {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value : ");
    int button = sc.nextInt();
        switch (button) {
        case 1 -> System.out.println("Namaste");
        case 2 -> System.out.println("Hello");
        case 3 -> System.out.println("Bonjour");
        default -> System.out.println("Invalid");
    }
}
}

