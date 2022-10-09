import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamAPI3 
{
	public static void main(String args[])
	{
		List<Integer> l = Arrays.asList(2,5,8,11,14);
		
		/*
			Function<Integer, Integer> f = new Function<>()
					{
						public Integer apply(Integer val) {
							return val*val;
						}
					};
					
			BinaryOperator<Integer> bin = new BinaryOperator<>()
					{
						public Integer apply(Integer i, Integer j) {
							return i + j;
						}
					};
			
			Stream s1 = l.stream();
			
			Stream s2 = s1.map(f);
			
			Integer res = (Integer)s2.reduce(0,bin); 
			
			System.out.println(res);
		*/
		
		System.out.println(l.stream().map(val -> val*val).reduce(0,(i, j) -> i + j));
	}
}