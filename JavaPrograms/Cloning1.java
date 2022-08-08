public class Cloning1 {
    public static void main(String args[])
    {
        abc obj1 = new abc();
        obj1.i = 5;
        obj1.j = 6;

        // shallow copy
        abc obj2 = obj1;
        System.out.println(obj1);
        System.out.println(obj2);

        // deep copy
        abc obj3 = new abc();
        obj3.i = obj1.i;
        obj3.j = obj1.j;
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
class abc   //abc class
{
    int i, j;
    @Override
    public String toString()
    {
        return "abc{ i :" + i + " j :" + j + "}";
    }    
}
