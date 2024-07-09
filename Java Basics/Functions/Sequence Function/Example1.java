public class Example1{
    int add(int a,int b){
        return a+b;
        }
        int multiply(int a,int b){
        return a*b;
        }
        void displayResult(int result){
            System.out.println("Result:"+result);
        }

        public static void main(String args[]){
            sequence calc = new sequence();
            int sum=calc.add(3,4);
            int product = calc.multiply(sum,3);
            calc.displayResult(product);
        }
}
