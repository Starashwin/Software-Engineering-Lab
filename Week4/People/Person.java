package People;

import java.io.PrintStream;

public class Person implements Cloneable{
	protected String name;
	protected Date bdate;
	
	public Person(String nameOfPerson, Date dateOfBirth)
	{
		this.name = nameOfPerson;
		this.bdate = dateOfBirth;	
 	}
	
	public void print(PrintStream ps)
	{
		ps.print(name + "\n");
		bdate.print(ps);
	}

	public String getName() {
		return name;
	}

	public int getAge(Date today) {
		int age= this.bdate.diffInYears(today);
		return (age);
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Birth date = " + bdate;
	}
}
