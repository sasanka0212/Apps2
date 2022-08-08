import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exception1 {
    public static void main(String args[]) throws IOException
    {
        int a = 8, b, k = 0;
        BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter a value:");
        b = Integer.parseInt(bc.readLine());
        try{
            k = a/b;
        }
        catch(Exception e)
        {
            System.out.println("not divisible by zero." + e);
        }
        System.out.println("division is = " + k);
    }
}
