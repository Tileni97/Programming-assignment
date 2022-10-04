import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        int count= 0;
        char Location;
        char Confirmation;
        char Yes = 0;
        Scanner Input= new Scanner(System.in);
        System.out.print("Please enter your Location");
        Location = (char) Input.nextInt();

        if (Location == Yes) {
            System.out.println("\n Location is: "+Location);
        }
        else {
            System.out.println("Location is not available");
            System.out.println("Confirm Location is: "+Location);
        }
        Confirmation = (char) Input.nextInt();
        if (Confirmation == Yes) {
            System.out.println("Order Successful");
            count++;
        }
        else {
            System.out.println("Order Cancelled");
            count--;
        }
    }
}