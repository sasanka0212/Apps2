//Scanner class example injava

import java.util.Scanner;

public class stringexp5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println(" I is :" + i);
        sc.close();
    }
} 