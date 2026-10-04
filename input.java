import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.Scanner;


public class input {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // System.out.println("Enter number: ");
        int num = 0;
        BufferedReader reader = null;

        //Older Method
     try {
        InputStreamReader input = new InputStreamReader(System.in);
         reader = new BufferedReader(input);

        num = Integer.parseInt(reader.readLine());
        System.out.println("You entered: " + num);
        
        

     }

     //finally keyword is used to execute the code after try and catch block. It is used to close the resources.
        finally {
            System.out.println("Finally block executed");
            reader.close();
        }

        //Newer Method
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println("You entered: " + num);

    }
}
