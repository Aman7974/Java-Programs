public class largestOfThree {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = 15;
        int num3 = 30;

        //Logical Statements
        if(num1 >= num2 && num1>=num3) {
            System.out.println(num1 + "is the largest");
        }
        else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2 + "is the largest");
        }
        else {
            System.out.println(num3 + "is the largest");
        }
    }
}
