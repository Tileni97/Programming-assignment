import java.util.ArrayList; // import the ArrayList class
import java.util.Scanner;
//@Christofine>216049601
public class SearchMenu { // class Items

    public int itemQuantity; // itemQuantity variable of type int

    public SearchMenu() { // constructor for Items class
        this.itemQuantity = 0; // set itemQuantity to 0
    }

    public static void main(String[] args) {
        ArrayList<SearchMenu> items = new ArrayList<>(); // Create an ArrayList object called items
        Scanner input = new Scanner(System.in);
        int choice; // choice variable of type int
        int item; // item variable of type int
        double ItemPrice = 0.0; // ItemPrice variable of type double
        String ItemName = ""; // ItemName variable of type string

        do { // do while loop for the menu
            System.out.println("Welcome to the Restaurant"); // print out Welcome to the Restaurant and options
            System.out.println("1. Food Menu");
            System.out.println("2. Drink Menu");
            System.out.println("3. Dessert Menu");
            System.out.println("4. Search for an item");
            System.out.println("5. Exit");
            System.out.println("Please enter your choice: "); //prompt user to enter their choice
            choice = input.nextInt();

            switch (choice) { // switch statement for the menu options
                case 1 -> {
                    System.out.println("Food Menu"); // print out Food Menu and options
                    System.out.println("1. Burger and chips");
                    System.out.println("2. Pizza");
                    System.out.println("3. Pasta and Sirloin Steak");
                    System.out.println("4. Exit");
                    System.out.println("Please enter your choice: "); // prompt user to enter their choice
                    input = new Scanner(System.in); // create new scanner object called input and set
                    // it to the user input
                    item = input.nextInt(); // set item to the user input and convert it to an int

                    if (item == 1) { // if statement for the first option in the food menu
                        System.out.println("Burger and chips"); // print out Burger and chips
                        System.out.println("Price: N$ 180.00"); // print out the price of the item
                        System.out.println("Quantity: "); // prompt user to enter the quantity of the item
                        input = new Scanner(System.in);
                        int quantity = input.nextInt();
                        ItemPrice = ItemPrice + (180.00 * quantity); // calculate the price of the item
                        System.out.println("Total: N$ " + ItemPrice); // print out the total price of the item
                        ItemName = "Burger and chips"; // set ItemName to Burger and chips
                        items.add(new SearchMenu()); // add the item to the ArrayList called SearchMenu

                    } else if (item == 2) { // if statement for the second option in the food menu
                        System.out.println("Pizza");
                        System.out.println("Price: N$ 200.00");
                        System.out.println("Quantity: ");
                        input = new Scanner(System.in);
                        int quantity = input.nextInt();
                        ItemPrice = ItemPrice + (180.00 * quantity); // calculate the price of the item
                        System.out.println("Total: N$ " + ItemPrice); // print out the total price of the item
                        ItemName = "Pizza";
                        items.add(new SearchMenu()); // add the item to the ArrayList called SearchMenu

                    } else if (item == 3) { // if statement for the third option in the food menu
                        System.out.println("Pasta and Sirloin Steak"); // print out Pasta and Sirloin Steak
                        System.out.println("Price: N$ 300.00");
                        System.out.println("Quantity: ");
                        input = new Scanner(System.in);
                        int quantity = input.nextInt();
                        ItemPrice = ItemPrice + (300.00 * quantity); // calculate the price of the item
                        System.out.println("Total: N$ " + ItemPrice); // print out the total price of the item
                        ItemName = "Pasta and Sirloin Steak"; // set ItemName to Pasta and Sirloin Steak
                        items.add(new SearchMenu()); // add the item to the ArrayList called SearchMenu

                    } else if (item == 4) { // if statement for the fourth option in the food menu
                        System.out.println("Exit"); // print out Exit
                    }
                }
                case 2 -> { // case 2 for the second option in the menu
                    System.out.println("Drink Menu"); // print out Drink Menu and options
                    System.out.println("1. Coke");
                    System.out.println("2. Fanta");
                    System.out.println("3. Sprite");
                    System.out.println("4. Exit");
                    System.out.println("Please enter your choice: "); // prompt user to enter their choice
                    input = new Scanner(System.in);
                    item = input.nextInt();

                    if (item == 1) { // if statement for the first option in the drink menu
                        System.out.println("Coke"); // print out Coke
                        System.out.println("Price: N$ 35.00"); // print out the price of the item
                        System.out.println("Quantity: "); // prompt user to enter the quantity of the item
                        input = new Scanner(System.in);
                        int quantity = input.nextInt();
                        ItemPrice = ItemPrice + (35.00 * quantity); // calculate the price of the item
                        System.out.println("Total: N$ " + ItemPrice); // print out the total price of the item
                        ItemName = "Coke"; // set ItemName to Coke
                        items.add(new SearchMenu()); // add the item to the ArrayList called SearchMenu


                    } else if (item == 2) { // if statement for the second option in the drink menu
                        System.out.println("Fanta");
                        System.out.println("Price: N$ 35.00");
                        System.out.println("Quantity: ");
                        input = new Scanner(System.in);
                        int quantity = input.nextInt();
                        ItemPrice = ItemPrice + (35.00 * quantity); // calculate the price of the item
                        System.out.println("Total: N$ " + ItemPrice); // print out the total price of the item
                        ItemName = "Fanta";
                        items.add(new SearchMenu()); // add the item to the ArrayList called SearchMenu

                    } else if (item == 3) { // if statement for the third option in the drink menu
                        System.out.println("Sprite");
                        System.out.println("Price: N$ 35.00");
                        System.out.println("Quantity: ");
                        input = new Scanner(System.in);
                        int quantity = input.nextInt();
                        ItemPrice = ItemPrice + (35.00 * quantity);
                        System.out.println("Total: N$ " + ItemPrice);
                        ItemName = "Sprite";
                        items.add(new SearchMenu());

                    } else if (item == 4) { // if statement for the fourth option in the drink menu
                        System.out.println("Exit");
                    }
                }
                case 3 -> { // case 3 for the third option in the menu
                    System.out.println("Dessert Menu"); // print out Desert Menu and options
                    System.out.println("1. Ice Cream");
                    System.out.println("2. Chocolate Cake");
                    System.out.println("3. Fruit Salad");
                    System.out.println("4. Exit");
                    System.out.println("Please enter your choice: "); // prompt user to enter their choice
                    input = new Scanner(System.in);
                    item = input.nextInt();
//@Christofine216049601
                    if (item == 1) { // if statement for the first option in the dessert menu
                        System.out.println("Ice Cream"); // print out Ice Cream
                        System.out.println("Price: N$ 45.00"); // print out the price of the item
                        System.out.println("Quantity: "); // prompt user to enter the quantity of the item
                        input = new Scanner(System.in); // create new scanner object called input and set
                        // it to the user input
                        int quantity = input.nextInt();
                        ItemPrice = ItemPrice + (45.00 * quantity); // calculate the price of the item
                        System.out.println(" Total: N$ " + ItemPrice); // print out the total price of the item
                        ItemName = "Ice Cream"; // set the item name to Ice Cream
                        items.add(new SearchMenu()); // add the item to the ArrayList called items

                    } else if (item == 2) { // if statement for the second option in the dessert menu
                        System.out.println("Chocolate Cake");
                        System.out.println("Price: N$ 55.00");
                        System.out.println("Quantity: ");
                        input = new Scanner(System.in);
                        int quantity = input.nextInt();
                        ItemPrice = ItemPrice + (55.00 * quantity);
                        System.out.println("Total: N$ " + ItemPrice);
                        ItemName = "Chocolate Cake";
                        items.add(new SearchMenu());

                    } else if (item == 3) { // if statement for the third option in the dessert menu
                        System.out.println("Fruit Salad");
                        System.out.println("Price: N$ 60.00");
                        System.out.println("Quantity: ");
                        input = new Scanner(System.in);
                        int quantity = input.nextInt();
                        ItemPrice = ItemPrice + (60.00 * quantity);
                        System.out.println("Total: N$ " + ItemPrice);
                        ItemName = "Fruit Salad";
                        items.add(new SearchMenu()); // add the item to the ArrayList called items


                    } else if (item == 4) { // if statement for the fourth option in the dessert menu
                        System.out.println("Exit"); // print out Exit the dessert menu
                    }
                }
                case 4 -> {
                    do {


                        System.out.println("Enter the Name of the Item: "); // prompt user to enter the name of the item
                        input = new Scanner(System.in); // create new scanner object called input and set it to
                        // the user input
                        ItemName = input.nextLine(); // set ItemName to the user input

                        if (ItemName.equals("Pasta and Sirloin Steak")) { // if user input is equal to Pasta and
                            // Sirloin Steak
                            // then print out the price of the item
                            System.out.println("Price: N$ 300.00"); // print out the price of the dish
                            System.out.println("Quantity: "); // prompt user to enter the quantity of the dish
                            input = new Scanner(System.in);  // create new scanner object called input and
                            // set it to the user input
                            int quantity = input.nextInt(); // set quantity to the user input
                            ItemPrice = ItemPrice + (300.00 * quantity); // calculate the price of the dish
                            System.out.println("Total: N$ " + ItemPrice); // print out the total price of the dish
                            items.add(new SearchMenu()); // add the item to the ArrayList called items

                        } else if (ItemName.equals("Burger and chips")) {
                            System.out.println("Price: N$ 180.00");
                            System.out.println("Quantity: ");
                            input = new Scanner(System.in);
                            int quantity = input.nextInt();
                            ItemPrice = ItemPrice + (180.00 * quantity);
                            System.out.println("Total: N$ " + ItemPrice);
                            items.add(new SearchMenu());

                        } else if (ItemName.equals("Pizza")) {
                            System.out.println("Price: N$ 200.00");
                            System.out.println("Quantity: ");
                            input = new Scanner(System.in);
                            int quantity = input.nextInt();
                            ItemPrice = ItemPrice + (200.00 * quantity);
                            System.out.println("Total: N$ " + ItemPrice);
                            items.add(new SearchMenu());

                        } else if (ItemName.equals("Coke")) {
                            System.out.println("Price: N$ 35.00");
                            System.out.println("Quantity: ");
                            input = new Scanner(System.in);
                            int quantity = input.nextInt();
                            ItemPrice = ItemPrice + (35.00 * quantity);
                            System.out.println("Total: N$ " + ItemPrice);
                            items.add(new SearchMenu());

                        } else if (ItemName.equals("Fanta")) {
                            System.out.println("Price: N$ 35.00");
                            System.out.println("Quantity: ");
                            input = new Scanner(System.in);
                            int quantity = input.nextInt();
                            ItemPrice = ItemPrice + (35.00 * quantity);
                            System.out.println("Total: N$ " + ItemPrice);
                            items.add(new SearchMenu());

                        } else if (ItemName.equals("Sprite")) {
                            System.out.println("Price: N$ 35.00");
                            System.out.println("Quantity: ");
                            input = new Scanner(System.in);
                            int quantity = input.nextInt();
                            ItemPrice = ItemPrice + (35.00 * quantity);
                            System.out.println("Total: N$ " + ItemPrice);
                            items.add(new SearchMenu());

                        } else if (ItemName.equals("Ice Cream")) {
                            System.out.println("Price: N$ 45.00");
                            System.out.println("Quantity: ");
                            input = new Scanner(System.in);
                            int quantity = input.nextInt();
                            ItemPrice = ItemPrice + (45.00 * quantity);
                            System.out.println("Total: N$ " + ItemPrice);
                            items.add(new SearchMenu());

                        } else if (ItemName.equals("Chocolate Cake")) {
                            System.out.println("Price: N$ 55.00");
                            System.out.println("Quantity: ");
                            input = new Scanner(System.in);
                            int quantity = input.nextInt();
                            ItemPrice = ItemPrice + (55.00 * quantity);
                            System.out.println("Total: N$ " + ItemPrice);
                            items.add(new SearchMenu());

                        } else if (ItemName.equals("Fruit Salad")) { // if user input is equal to Fruit Salad
                            System.out.println("Price: N$ 60.00"); // print out the price of the dish
                            System.out.println("Quantity: ");// prompt user to enter the quantity of the dish
                            input = new Scanner(System.in); // create new scanner object called input and set it
                            // to the user input
                            int quantity = input.nextInt(); // set quantity to the user input
                            ItemPrice = ItemPrice + (60.00 * quantity); // calculate the price of the dish
                            System.out.println("Total: N$ " + ItemPrice); // print out the total price of the dish
                            items.add(new SearchMenu()); // add the item to the ArrayList called items

                        } else { // else statement to check if the item name is not in the menu
                            System.out.println("Item not found"); // print out Item not found

                        }
                        System.out.println("Enter 1 to add another item or 2 to exit"); // prompt user to enter 1 to
                    } while (input.nextInt() == 1); // add another item or 2 to exit
                }
                case 5 -> System.out.println("Exit"); // case 4 for the fourth option in the menu to exit the menu

                default -> throw new IllegalStateException("Unexpected value: " + choice); // default case for any
                // other input
            }
        } while (choice != 4); // while loop to keep the menu running until the user enters 4 to exit the menu
        System.out.println(items+ ItemName + " " + ItemPrice); // print out the items in the ArrayList called, items
        // items and the total price of the items
        System.out.println("Total Price: N$ " + ItemPrice); // print out the total price of the order
        System.out.println("Thank you for your order it has been added to the queue");// print out Thank you for your
        // order it has been added to the queue
        System.out.println("Please wait for your order to be prepared"); // print out Please wait for your order to
        // be prepared

    }
    }
//@Christofine Hango 216049601



