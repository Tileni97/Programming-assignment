import java.util.Scanner;

public class Cancel_Customer {
    public static void main(String[] args) {
        char Confirmation;
        char Yes = 0;
        int count = 0;
        char CancelOrder;
        double TimeSinceOrder = 0;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please confirm Cancelation: ");
        CancelOrder = (char) Input.nextInt();
        if (CancelOrder == Yes) {
            System.out.println("\n  Order" + CancelOrder[count] + "Cancelled Successfully");
            if (TimeSinceOrder <= 10) ;
            {
                System.out.println("Cancellation Successful");
                count--;
            }
            else{
                System.out.println("Cancellation unsuccessful");
            }
        }

        else{
            System.out.println("Order: " + CancelOrder[count]+"Not Cancelled");
        }

        }
    }