import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// get the student details and show it descending order according to their marks -> 
public class Concept
{
	public static void main(String args[])
	{
		List<Students> ls = new ArrayList<>();	// 'Students' type list
		
		// add data of students
		ls.add(new Students(17,85));
		ls.add(new Students(3,55));
		ls.add(new Students(20,65));
		
		// sort the data according to student marks
		Collections.sort(ls);
		
		// fetch the students data
		for(Students s : ls)
		{
			System.out.println(s);
		}
	}
}
class Students implements Comparable<Students>	// comparable Interface in the place of comparator interface
{
	public int rollno, marks;
	public Students(int rollno, int marks)
	{
		this.rollno = rollno;
		this.marks = marks;
	}
	// toString is a overriding here
	public String toString()
	{
		return "student { rollno : " + rollno + " marks : " + marks + "}";
	}

	@Override
	public int compareTo(Students s) {
		return this.marks>s.marks?-1:this.marks<s.marks?1:0;
	}
}