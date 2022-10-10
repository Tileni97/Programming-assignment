// Gavin Theron 222052384

import java.util.Scanner;

public class Cancel_Admin {
    public static void main(String[] args) {
        int input,code1=1, ordreSum =20,orderNum=ordreSum;
        Scanner Input= new Scanner(System.in);
        String[] Location = new String[4];
        Location[0]="Eros";
        Location[1]="Khomasdal";
        Location[2]="Katutura";
        Location[3]="Klein windhoek";
        System.out.println("Please enter your Address ");
        String Address= Input.nextLine();

        for (int i = 0; i <Location.length ; i++) {
            if (Address.equals(Location[args.length]))
            {
                System.out.println(Address+ "is available ");
                break;
            }else System.out.println(Address+ "is not available");
        }

        System.out.println("  --------------------------    ");
        System.out.println("   Press 1. to make order       ");
        System.out.println("   Press 2. to cancel order     ");
        System.out.println("  --------------------------    ");

        input=Input.nextInt();
        if (code1 == input) {

            System.out.println("  --------------------------    ");
            System.out.println("   Press 3. to confirm order    ");
            System.out.println("   Press 2. to cancel order     ");
            System.out.println("  --------------------------    ");

            for (int i = 0; i <ordreSum ; i++) {
                if (code1 == input) {
                    System.out.println("  --------------------------    ");
                    System.out.println("  order"+ orderNum + "confirmed ");
                    System.out.println("  --------------------------    ");
                    break;
                }
            }
            ordreSum--;
        } else  {
            System.out.println ("  --------------------------    ");
            System.out.println ("  order"+ orderNum +  "canceled ");
            System.out.println ("  --------------------------    ");
        }

        System.out.println(ordreSum +" ------order are still available------ ");


    }
}