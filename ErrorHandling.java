public class ErrorHandling {
    public static void main (String a[]){
        int i = 0;
        int j = 0;


      try {

        i=18;
        int result = i/j;
        System.out.println(result);
     } catch (Exception e) {
        System.out.println("Something went Wrong: " + e.getMessage());
        
     }
    }
    
}
