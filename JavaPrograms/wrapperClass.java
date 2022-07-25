import java.util.ArrayList;
public class wrapperClass {
    public static void main(String args[])
    {
        Integer i = 5;
        System.out.println(i);
        int j = i;
        System.out.println(j);

        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(10);

        for(int num : nums )
        {
            System.out.println(num);
        }
    }
}
