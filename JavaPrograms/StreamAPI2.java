import java.util.Arrays;
import java.util.List;

public class StreamAPI2 
{
	static int roll = 1;
	public static void main(String args[])
	{
		List<String> ls = Arrays.asList("Sasanka", "Sid", "Soumo", "Chaitri", "Raktim", "Snigdha", "Shubhadeep");
		
		// ls.forEach(System.out::println);
		
		ls.forEach(StreamAPI2::details);	// Method reference
	}
	public static void details(String sname)
	{
		System.out.println(roll++ + " : " + sname);
	}
}