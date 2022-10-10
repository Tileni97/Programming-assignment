import java.util.Scanner;

class LinearSearchAlgorithm {
    static int LSA(int[] orderNUM, int length, int x)
    {
        for (int i = 0; i < length; i++) {
            if (orderNUM[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        String Reason;
        int[] ordrenum = { 0, 1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
        int length = ordrenum.length;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter reason");
        Reason=sc.nextLine();
        System.out.println("Enter order number");
        int x = sc.nextInt();
        int index = LSA(ordrenum, length, x);
        if (index == -1)
            System.out.println("order not found ");
        else
            System.out.println("order " + index +" Canceled "+" Due to the following reason : " + Reason );




    }
}
