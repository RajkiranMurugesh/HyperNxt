import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        System.out.print("Enter a float number: ");
        float f = sc.nextFloat();
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();
        System.out.print("Enter a short value: ");
        short s = sc.nextShort();
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter a string: ");
        String st = sc.next();
        System.out.println("Int: " + n);
        System.out.println("Float: " + f);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Character: " + c);
        System.out.println("String: " + st);
    }
}