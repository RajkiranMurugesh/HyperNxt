class Example2{
    int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
public class Example2{
    public static void main(String[] args){
        Factorial fact=new Factorial();
        int result=fact.factorial(5);
        System.out.println("factorial:"+result);
    }
}