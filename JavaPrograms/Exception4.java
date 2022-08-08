import java.io.InputStreamReader;
import java.io.BufferedReader;

// try block with resources
public class Exception4 
{
    public static void main(String args[]) throws Exception
    {
        String str;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            System.out.print("enter a string :");
            str = br.readLine();
            System.out.println("entered strings = " + str);
        }
    }    
}
