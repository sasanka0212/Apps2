import java.io.*;

// throw an exception manually
public class Exception5 {
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 5, k, j;
        System.out.print("enter a value:");
        j = Integer.parseInt(br.readLine());
        try{
            k = i + j;
            if(k<=10){
                throw new ArithmeticException();
            }
            System.out.println("k = " + k);
        }
        catch(ArithmeticException a)
        {
            System.out.println("value should be greater then 10.");
        }
        catch(Exception e)
        {
            System.out.println("error is :" + e);
        }
        finally
        {
            System.out.println("end line of the program");
        }
    }   
}