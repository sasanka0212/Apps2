import java.io.BufferedReader;
import java.io.InputStreamReader;

// finally block in Java
public class Exception3 
{
    public static void main(String args[]) throws Exception
    {
        int k, n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("enter a number:");
        n = Integer.parseInt(br.readLine());
        try{
            k = 8/n;
            System.out.println("value of k = " + k);
        }
        catch(Exception ex)
        {
            System.out.println("exception = " + ex);
        }
        finally{
            System.out.println("Finally exit.");
        }
        br.close();
    }
}