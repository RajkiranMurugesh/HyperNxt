import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter a string: ");
        String st = sc.next();
        System.out.println("Character: " + c);
        System.out.println("String: " + st);
    }
}