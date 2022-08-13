import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class XmlEncode
{
    public static void main(String a[]) throws Exception
    {
        Student s1 = new Student();
        s1.setRoll(17); s1.setName("Sasanka");

        Student s2 = new Student();
        s2.setRoll(03); s1.setName("Siddhartha");

        ArrayList<Student> al = new ArrayList<Student>();
        al.add(s1); 
        al.add(s2);

        College c = new College();
        c.setList(al);

        XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("StDetails.xml")));
        x.writeObject(c);
        x.close();
    }
}