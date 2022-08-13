import java.util.ArrayList;

public class College
{
    ArrayList<Student> lis = new ArrayList<Student>();
    
    public void setList(ArrayList<Student> lis){
        this.lis = lis;
    }

    public ArrayList<Student> getList(){
        return this.lis;
    }
}