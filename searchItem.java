import java.util.Scanner;

public class searchItem { //initalisation of the code
        public static void main(String[] args) {
    double total = 0.0;
//Give the user a choice of items to buy
    System.out.println("----------------------------------");
    System.out.println("|   1. Search Food Menu         |");
    System.out.println("|   2. Search Drink Menu        |");
    System.out.println("|   3. Search Desert Menu       |");
    System.out.println("|   4. Exit                     |");
    System.out.println("-----------------------------------");
//Ask the user to enter a choice
    System.out.println("Please enter your choice: ");
    Scanner input = new Scanner(System.in);
    int item = input.nextInt();

//Switch statement to determine the item the user wants to buy
    do {
        switch (item) {
            case 1 -> { //Food Menu
                System.out.println("Food Menu");
                System.out.println("1. Burger and chips");
                System.out.println("2. Pizza");
                System.out.println("3. Pasta and Sirloin Steak");
                System.out.println("4. Exit");
                System.out.println("Please enter your choice: ");
                input = new Scanner(System.in);
                item = input.nextInt();
                if (item == 1) {
                    System.out.println("Burger and chips");
                    System.out.println("Price: N$ 80.00");
                    System.out.println("Quantity: ");
                    input = new Scanner(System.in);
                    int quantity = input.nextInt();
                    total = total + (10.00 * quantity);
                    System.out.println("Total: N$ " + total);
                } else if (item == 2) {
                    System.out.println("Pizza");
                    System.out.println("Price: N$ 115.00");
                    System.out.println("Quantity: ");
                    input = new Scanner(System.in);
                    int quantity = input.nextInt();
                    total = total + (15.00 * quantity);
                    System.out.println("Total: N$ " + total);
                } else if (item == 3) {
                    System.out.println("Pasta and Sirloin Steak");
                    System.out.println("Price: N$ 300.00");
                    System.out.println("Quantity: ");
                    input = new Scanner(System.in);
                    int quantity = input.nextInt();
                    total = total + (12.00 * quantity);
                    System.out.println("Total: N$ " + total);
                } else if (item == 4) {
                    System.out.println("Exit");
                    System.out.println("Total: N$ " + total);
                } else {
                    System.out.println("Invalid choice");
                }
            }
            //Drink Menu
            case 2 -> {
                System.out.println("Drink Menu");
                System.out.println("1. Coke");
                System.out.println("2. Sprite");
                System.out.println("3. Fanta");
                System.out.println("4. Exit");
                System.out.println("Please enter your choice: ");
                input = new Scanner(System.in);
                item = input.nextInt();
                if (item == 1) {
                    System.out.println("Coke");
                    System.out.println("Price: N$ 30.00");
                    System.out.println("Quantity: ");
                    input = new Scanner(System.in);
                    int quantity = input.nextInt();
                    total = total + (5.00 * quantity);
                    System.out.println("Total: N$ " + total);
                } else if (item == 2) {
                    System.out.println("Sprite");
                    System.out.println("Price: N$ 30.00");
                    System.out.println("Quantity: ");
                    input = new Scanner(System.in);
                    int quantity = input.nextInt();
                    total = total + (5.00 * quantity);
                    System.out.println("Total: N$ " + total);
                } else if (item == 3) {
                    System.out.println("Fanta");
                    System.out.println("Price: N$ 30.00");
                    System.out.println("Quantity: ");
                    input = new Scanner(System.in);
                    int quantity = input.nextInt();
                    total = total + (5.00 * quantity);
                    System.out.println("Total: N$ " + total);
                } else if (item == 4) {
                    System.out.println("Exit");
                    System.out.println("Total: N$ " + total);
                } else {
                    System.out.println("Invalid choice");
                }
            }
            case 3 -> {//Desert Menu
                System.out.println("Desert Menu");
                System.out.println("1. Ice Cream");
                System.out.println("2. Chocolate Cake");
                System.out.println("3. Brownies");
                System.out.println("4. Exit");
                System.out.println("Please enter your choice: ");
                input = new Scanner(System.in);
                item = input.nextInt();
                if (item == 1) {
                    System.out.println("Ice Cream");
                    System.out.println("Price: N$ 60.00");
                    System.out.println("Quantity: ");
                    input = new Scanner(System.in);
                    int quantity = input.nextInt();
                    total = total + (5.00 * quantity);
                    System.out.println("Total: N$ " + total);
                } else if (item == 2) {
                    System.out.println("Chocolate Cake");
                    System.out.println("Price: N$ 80.00");
                    System.out.println("Quantity: ");
                    input = new Scanner(System.in);
                    int quantity = input.nextInt();
                    total = total + (10.00 * quantity);
                    System.out.println("Total: N$ " + total);
                } else if (item == 3) {
                    System.out.println("Brownies");
                    System.out.println("Price: N$ 45.00");
                    System.out.println("Quantity: ");
                    input = new Scanner(System.in);
                    int quantity = input.nextInt();
                    total = total + (8.00 * quantity);
                    System.out.println("Total: N$ " + total);
                } else if (item == 4) {
                    System.out.println("Exit");
                    System.out.println("Total: N$ " + total);
                } else {
                    System.out.println("Invalid choice");
                }
            }
            case 4 -> { //Exit
                System.out.println("Exit");
                System.out.println("Total: N$ " + total);
            }
            default -> System.out.println("Invalid choice");
        }
    } while (item != 4); //Loop to keep the program running until the user chooses to exit
    }
}
