import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age of two Person: ");
        int Age1 = sc.nextInt();
        int Age2 = sc.nextInt();
        if (Age1 > Age2) {
            if (Age1 > Age2) {
                System.out.println(Age1 + " is greater than " + Age2 + " and is Elder");
            } else {
                System.out.println(Age1 + " is greater than " + Age2 + " and is Younger");
            }
        } else {
            System.out.println(Age1 + " is lesser than " + Age2);
        }
    }
}
