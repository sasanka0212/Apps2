public class splitString {
    public static void main(String args[])
    {
        String str = "sasanka, siddhartha, aritra, soumo";
        System.out.println(str);
        String[] names = str.split(",");
        for(String i : names)
            System.out.println(i);
    }
}