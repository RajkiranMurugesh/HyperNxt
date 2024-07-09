import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the age of the person to check eligibility for voting:");
            int age = sc.nextInt();
            if (age >= 18) {
                System.out.println(age + "The person is eligible to vote.");
            } else {
                System.out.println(age + "The person is not eligible to vote.");
            }
        }
    }
