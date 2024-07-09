import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of iterations to be carried out: ");
        int n = sc.nextInt();
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= n);
        sc.close();
    }
}

