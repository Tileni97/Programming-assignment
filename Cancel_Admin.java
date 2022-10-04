import java.util.Scanner;

public class Cancel_Admin {
    public static void main(String[] args) {
        char DelayOrder;
        char Yes = 0;
        int count = 0;
        char CancelOrder;
        Scanner Input = new Scanner(System.in);
        System.out.print("Please confirm Cancelation: ");
        CancelOrder = (char) Input.nextInt();
        if (CancelOrder == Yes) {
            System.out.println("\n  Order" + CancelOrder[count] + "Cancelled Successfully");}
        else{
                System.out.println("Order: " + CancelOrder[count] + "Not Cancelled");
            }
        DelayOrder = (char) Input.nextInt();
        if (DelayOrder == Yes);{
            System.out.println("Order delayed");
        }
        }
    }