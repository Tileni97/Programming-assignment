/**
 * author: Muleka pandakna tresor 222038535
 * project: Prg Assignment
 * */


import java.util.Scanner;

public class Admin {
    public static void main(String[] args) {

        int code1,code2;
        int i,j;

//   After login as an admin the manager will have two options that will pop out to help him to add or remove
//   and for this it will be asks to entre a specific code either 1 or 2

        System.out.println("press 1 to Add");
        System.out.println("press 2 to remove");

        Scanner sc=new Scanner(System.in);
        code1 = sc.nextInt();

//   if the manager choice is to add then the system will ask him if he wants either to add item
//   or to set a new employee account

        if (code1 == 1) {

            System.out.println("Select 1 to Add item");
            System.out.println("Select 2 to add Employee Account");
            code2= sc.nextByte();

//   In the case he wants to add an item, first he needs to define how many of them he wants to add,
//   And that number will be the size of an array that the program will create

            if ( code2 == 1) {

                int Size;
                System.out.println("Enter size of array");

                Size= sc.nextInt();
                String[][] Itemprice = new String[Size][Size];

//   After the creation of the array(Itemprice) the system will now ask him the name of the item and price
//   and those data will be store in the array create and after ward message will be display on the screen
//   to confirm that the item has been adds

                for (i = 0; i < Size; i++){
                    System.out.println("entre item name and price ");

                    for (j = 0; j < Size; j++) {
                        Itemprice[i][j]= sc.nextLine();
                    }
                }
                for (i = 0; i < Size; i++) {
                    for (j = 0; j < Size; j++) {
                        System.out.println(Itemprice[i][j]+" ");
                    }
                }
                System.out.println("items have been add to the menu");

//   In the case of the manager want to create a new Employee account then by pressing 2,
//   a message will be display on the screen asking him to enter credential for the new account to be set

            }else if (code2==2) {

                int Size2 = 3;
                System.out.println("enter Employee credential= name + Surname + IdNumber");
                String[] EmployeeCredential = new String[Size2];

//   those credential will be keep in an array  and after ward they will be displays on the screen
//   with a confirmation message saying that the account has been created

                for (int k = 0; k <= Size2; k++) {
                    EmployeeCredential[k] = sc.nextLine();
                }
                for (int k = 0; k <= Size2; k++) {
                    System.out.println(EmployeeCredential[k] + " ");
                }
                System.out.println("Employee account create ");
            }

//   The first part was about adding item or account in this second part it abouts removing item and account
//   for that the input that the manager must enter is 2 that will display a message that will ask
//   what he wants to remove either an item or an account

        } else if (code1==2) {

                System.out.println("Select 1 to Delete Item");
                System.out.println("Select 2  to Delete Employee Account");
                code2 = sc.nextInt();

//   IF the manage want to remove an item by pressing 1 the system will ask him to enter the item name and price
//   and then the program will first check if there is an array create where item and price are store if yes
//   it will do a search to find if there is an item corresponding to the one enter and finally remove it form the array
//   unfortunately we didn't study yet how so save and java code and read it back :( :(
//   but we can do an example with a simple array with predefined value

            if (code2 == 1) {

                String item;
                String[][] listofItem = new String[3][2];

                System.out.println("Enter item and price");
                for (int k = 0; k <2; k++) {
                    for (int l = 0; l <2; l++) {
                        listofItem[k][l]=sc.nextLine();

                    }

                }

//   after our array with predefine value is set we are going to ask the manager to entre the name
//   of the item he wants to remove

                System.out.println("Please Enter item to Search");
                item =sc.nextLine();

//   the system will first check if the list is not empty if it not it will search for the item inside the array
//   when found it will assign a null value to it and displays a message saying that the item has been removed
//   else  if the list it empties it will just display a message ( the list of item is empty )

                if (listofItem != null) {

                    for (int k = 0; k <2; k++) {
                        for (int l = 0; l < 2; l++) {

                            if (listofItem[k][l].equals(item)) {
                                listofItem[k][l]=null;

                            }

                        }

                    }
                    for (int k = 0; k < 2; k++) {
                        for (int l = 0; l < 2; l++) {
                            System.out.println(listofItem[k][l]+" ");
                        }

                    }
                    System.out.println("Item removed");

                } else if (listofItem==null) {
                    System.out.println("The list is empty");


                }

//   in this case the manager want to remove or delete an employee account by pressing 2
//   the system will ask him only for the ID number the system will look for it int the database (array)
//   and if it found it will disable the account

            } else if (code2==2){

                System.out.println("Please entre ID number");

                int IDnumber;
                IDnumber= sc.nextInt();

                int[] AccountId = new int[1];
                for (int k = 0; k <1 ; k++) {
                    AccountId[k]=222038535;
                }

                for (int k = 0; k < 1; k++) {
                    if (AccountId[k]==IDnumber){
                        System.out.println("Account found and disable");
                    }else System.out.println("wrong IDnumber Account not found");
                }

            }


        }
    }
}