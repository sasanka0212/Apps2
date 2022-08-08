import java.io.*;

// own build Exception class
public class Exception6{
    public static void main(String args[])throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        System.out.print("enter value:");
        i = Integer.parseInt(br.readLine());
        try{
            if(i<0){
                throw new MyException("Error in input");
            }
            System.out.print("value of i:" + i);
        }
        catch(MyException e)
        {
            System.out.print(e);
        }
    }
}
class MyException extends Exception{
    public MyException(String s)
    {
        System.out.println(s);
    }
}