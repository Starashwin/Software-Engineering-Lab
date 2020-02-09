package People;

import java.io.PrintStream;

public class Date {
	private int day, month, year;
	
	public Date(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void print(PrintStream ps)
	{
		ps.print(String.format("%02d/%02d/%4d",day,month,year));
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}
	
	public int diffInYears(Date d)
	{
		return (d.year - this.year);
	}

	@Override
	public String toString() {
		return  day + "/" + month + "/" + year;
	}
	
}
