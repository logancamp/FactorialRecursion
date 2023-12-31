public class FactorialRecursion {
    public static int Factorial(int n) {
        if(n==0) {
            return 1;
        }else {
            return n*Factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print(Factorial(5));
    }
}
