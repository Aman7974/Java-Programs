public class Factorial {
    public static void main(String[] args) {
        //Variable declaration
        int num = 5;
        long Factorial = 1;

        //Loop in Java
        for(int i=1;i<=num;i++){
            Factorial *= i;
        }

        System.out.println("Factorial of" + num + "is" + Factorial);
    }
}
