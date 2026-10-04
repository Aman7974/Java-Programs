public class calculator {
    public static void main(String[] args) {
        
        double num1 = 20;
        double num2 = 5;

        char operator = '+';

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

                case '-':
                result = num1 - num2;
                break;

                case '*':
                result = num1 * num2;
                break;

                case '/':
                if(num2 != 0)
                result = num1 / num2;
                else {
                    System.out.println("Cannot divide by zero");
                    break;

                }

             default:
              System.out.println(num1 + " " + operator + " " + num2 + "=" + result); 
        }
    }
}
