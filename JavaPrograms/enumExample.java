import java.util.*;

public class enumExample 
{
	enum Brand		//inside of Main class
	{
		APPLE, REALME, OPPO, XIOAMI, SAMSUNG, VIVO;
	}
	public static void main(String args[])
	{
		List<Brand> ls = new ArrayList<>();		// type of enum list
		
		// add some values into the list
		ls.add(Brand.APPLE);
		ls.add(Brand.REALME);
		ls.add(Brand.SAMSUNG);
		ls.forEach(System.out::println);
	}
}
/*
	enum Brand		// ouside of Main class
	{
		APPLE, REALME, OPPO, XIOAMI, SAMSUNG, VIVO;
	}
*/