//use of toString method in Java

public class stringexp2 
{
    public static void main(String args[])
    {
        student s1 = new student(17,"Sasanka");
        System.out.println(s1.toString());
    }
}

class student
{
    int rollNo;
    String sname;
    public student(int rollNo, String sname)
    {
        this.rollNo = rollNo;
        this.sname = sname;
    }
    @Override
    public String toString() 
    {
        return "student[" + "name:" + sname + ", roll:" + rollNo + "]";
    }
}
