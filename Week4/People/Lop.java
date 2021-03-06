package People;

import java.io.PrintStream;
import java.util.List; 
import java.util.ArrayList;
public class Lop {

		private List<Person> list;
		PrintStream ps = new PrintStream(System.err);
		
		public Lop()
		{
			list = new ArrayList<>();
		}
		public void add(Person p)
		{
			list.add(p);
		}
		
		public void remove(Person p)
		{
			list.remove(p);
		}
		public void print()
		{
			System.out.println(); 
			for(Person element : list)
			{
				System.out.println(element.toString());
			}
		}
		
		public String find(String nameToFind)
		{
			String result = "";
			for(Person element : list)
			{
				if(element.getName().equals(nameToFind))
				{
					result = element.toString(); 
					break;
				}
				else result = null;
			}
			return result;
		}
		
}
