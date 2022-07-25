import java.util.Scanner;
public class stringexp1 {
    public static void main(String args[])
    {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 1st string:");
        s1 = sc.nextLine();
        System.out.print("enter 2nd string:");
        s2 = sc.nextLine();
        System.out.println("length of 1st string:" + s1.length());
        System.out.println("length of 2nd string:" + s2.length());
        String s3 = s1.concat(s2);
        System.out.println("concatenated string:" + s3);
        System.out.println("uppercase string:" + s3.toUpperCase());
        sc.close();
    }
}