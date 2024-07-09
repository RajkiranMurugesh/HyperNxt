import java.util.Scanner;
public class Example2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        if (num >= 99) {
            System.out.println(num + " is greater than or equal to 99");
        }
}
}
