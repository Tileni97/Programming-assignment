import java.util.Scanner;

public class Cancel_Admin {
    public static void main(String[] args) {
        int input;
        String reasonOfcancelation;
        Scanner Input = new Scanner(System.in);
        int[] ordernum = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.println("Enter Order number");
        input = Input.nextInt();
        for (int i = 0; i < ordernum.length; i++) {
            if (ordernum[20]!=input) {
                System.out.println("order " + input + " canceled");
                break;
            }
        }
        System.out.println("Entre a reason for cancellation");
        reasonOfcancelation= Input.nextLine();
        System.out.println(reasonOfcancelation);
    }
}