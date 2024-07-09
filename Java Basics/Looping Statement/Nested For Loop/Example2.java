import java.util.Scanner;

public class Example2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of i and j: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        sc.close();
    }
}
