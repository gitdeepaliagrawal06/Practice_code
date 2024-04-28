package com.monthPac;

class Calender
{
	private int monthNum;
	public int get()
	{
	 return monthNum;
	}
	public void set(int monthNum)
	{
		if (monthNum>=1&& monthNum<=12)
		{
			this.monthNum=monthNum;
		}
		else
		{
			System.out.println("Invalid Month Number");
		}
	}
	}
public class Month {

	public static void main(String[] args) {
	Calender c=new Calender();
	c.set(5);
	System.out.println(c.get());
	c.set(13);
	System.out.println(c.get());
	}

}
