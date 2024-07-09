import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (male/female): ");
        String Gender = sc.next();
        if (Gender.equals("male")) {
            System.out.println("Male");
        } else if (!Gender.equals("male") && Gender.equals("female")) {
            System.out.println("Female");
        } else {
            System.out.println("TransGender");
        }
        sc.close();
    }
}
