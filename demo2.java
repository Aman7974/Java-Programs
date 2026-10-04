//Enumerations
enum Status {
        PENDING,
        IN_PROGRESS,
        COMPLETED
    }


public class demo2 {
    public static void main(String[] args) {
        Status currentStatus = Status.IN_PROGRESS;

        switch (currentStatus) {
            case PENDING:
                System.out.println("The task is pending.");
                break;
            case IN_PROGRESS:
                System.out.println("The task is in progress.");
                break;
            case COMPLETED:
                System.out.println("The task is completed.");
                break;
        }
      

        for (Status status : Status.values()) {
            System.out.println("Status: " + status);
        }

    }


    

    
}
