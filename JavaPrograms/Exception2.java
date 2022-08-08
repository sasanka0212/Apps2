public class Exception2
{
    public static void main(String args[])
    {
        int arr[] = new int[5];
        try{
            for(int i = 0; i<=5; i+=1)
            {
                arr[i] = i+1;
            }
        }
        catch(Exception e)
        {
            System.out.println(e + "maximum size of the array is 5");
        }
        for(int value : arr)
            System.out.println(value);
    }
}