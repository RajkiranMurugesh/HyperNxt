import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks Obtained To Check the result:");
            int marks = sc.nextInt();
            if (marks >= 35) {
                System.out.println(marks + "The result is pass .");
            } else {
                System.out.println(marks + "The result is fail.");
            }
        }
    }
