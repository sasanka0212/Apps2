// Inner class examples in Java

public class innerClass1
{
	public static void main(String args[])
	{
		//Pqr obj1 = new Pqr();	// object of Pqr class
		//Pqr.Xyz obj2 = obj1.new Xyz();	//object of Xyz class(in the case of member inner class)
		//Pqr.Xyz obj2 = new Pqr.Xyz();		//object of Xyz class(in the case of abstract inner class)
		/*
			Pqr obj1 = new Pqr()		//object declaration of Inner class in Anonymous inner class
					{
						void output()
						{
							super.output();
							System.out.println("In Inner class of pqr");
						}
					};
		*/
		//obj1.output();
		//obj2.dis();
		//obj2.out();
		
		Pqr obj = () -> System.out.println("In inner lambda class of Pqr class");	//inner lambda class
		obj.output();
		
	}
}
/*	
 	class Pqr
	{
		int i;
		class Xyz	// Member class(Inner class)
		{
			void dis() {
				System.out.println("Hey Sasanka");
			}
		}
	}
*/

/*
	class Pqr
	{
		static class Xyz	// Abstract class(Inner class)
		{
			void out()
			{
				System.out.println("Abstract Inner Class");
			}
		}
	}
*/

/*
	class Pqr { 
		void output()
		{
			System.out.print("In Pqr");
		}
	}
*/
@FunctionalInterface
interface Pqr{ void output(); }




