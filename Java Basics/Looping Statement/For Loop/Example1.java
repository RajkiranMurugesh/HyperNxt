import java.util.Scanner;
public class Example1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Even numbers upto 100: ");
        for(int i=0; i<=100; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}

