public class Example1 {
    
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Example1 calculator = new Example1();
        int result = calculator.add(10, 20);
        int result1 = calculator.sub(30, 20);
        
        System.out.println("The sum of 10 and 20 is: " + result);
        System.out.println("The sub of 10 and 20 is: " + result1);
    }
    }