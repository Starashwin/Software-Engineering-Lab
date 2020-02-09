import People.*;
import Office.*;

public class MainClass {

	public static void main(String[] args) {
	
		/*week 2 main
		 * Date today = new Date(26,01,2020);
		Date bdateP1 = new Date(12,10,1998);
		System.out.println("----------Part 1----------");
		bdateP1.print(System.err);
		System.out.println("\nDay:"+ bdateP1.getDay());
		System.out.println("Month:"+ bdateP1.getMonth());
		System.out.println("Year:"+ bdateP1.getYear());
		System.out.println(bdateP1.diffInYears(today));
		
		Person p1 = new Person("Ashwin Bhatnagar", bdateP1);
		Person p2 = new Person("Person 2", bdateP1);
		Person p3 = new Person("Person 3", bdateP1);
		Person p4 = new Person("Person 4", bdateP1);
		System.out.println("----------Part 2----------");
		p1.print(System.err);
		System.out.println("\n" +p1.getName());
		System.out.println(p1.getAge(today));
		
		Lop list1 = new Lop();
		
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		list1.add(p4);
		System.out.println("----------Part 3----------");
		list1.print();
		list1.remove(p3);
		list1.print();
		
		System.out.println("----------Part 4----------");
		System.out.println("\n"+list1.find("Ashwin Bhatnagar"));
		*/
		
		Boss boss1 = new Boss("Ashwin Bhatnagar", new Date(12,10,1998));
		Boss boss2 = new Boss("Ali Utku Demir", new Date(12,12,1993));
		Boss boss3 = new Boss("Pranav Dadhich", new Date(17,10,1997));
		Worker worker1 = new Worker("Worker1 ", new Date(1,1,1991),boss1);
		Worker worker2 = new Worker("Worker2 ", new Date(2,2,1995),boss1);
		Worker worker3 = new Worker("Worker3 ", new Date(3,3,1993),boss1);
		Worker worker4 = new Worker("Worker4 ", new Date(4,4,1992),boss2);
		Worker worker5 = new Worker("Worker5 ", new Date(5,5,1980),boss2);
		Worker worker6 = new Worker("Worker6 ", new Date(6,6,1989),boss3);
		Worker worker7 = new Worker("Worker7 ", new Date(7,10,1988),boss3);
		
		Lop listOfPerson = new Lop();
		listOfPerson.add(boss1);
		listOfPerson.add(boss2);
		listOfPerson.add(boss3);
		listOfPerson.add(worker1);
		listOfPerson.add(worker2);
		listOfPerson.add(worker3);
		listOfPerson.add(worker4);
		listOfPerson.add(worker5);
		listOfPerson.add(worker6);
		listOfPerson.add(worker7);
		worker6.new_boss(boss1);
		
		listOfPerson.print();
		
	}

}
