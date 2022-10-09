import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPI1
{
	public static void main(String args[])
	{
		List<Integer> ls = Arrays.asList(11,12,13,14,15);
		
		Consumer<Integer> c = new Consumer<>()		// Anonymous Class
				{
					public void accept(Integer i)
					{
						System.out.println(i);
					}
				};
		
		ls.forEach(c);
		// ls.forEach(i -> System.out.println(i));   --> Lambda Expression
	}
}