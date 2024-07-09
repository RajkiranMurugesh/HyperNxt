import java.util.Scanner;
public class Example1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your choice:\n 1. Addition(+)\n 2. Subtraction(-)\n 3. Multiplication(*)\n 4. Division(/)\n 5. Modulus(%)");
        int ch = sc.nextInt();
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Addition: " + (a + b));
                break;
            case 2:
                System.out.println("Subtraction: " + (a - b));
                break;
            case 3:
                System.out.println("Multiplication: " + (a * b));
                break;
            case 4:
                System.out.println("Division: " + ((double) a / b));
                break;
            case 5:
                System.out.println("Modulus: " + (a % b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
