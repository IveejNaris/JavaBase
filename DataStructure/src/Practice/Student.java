package Practice;

import java.util.Arrays;
import java.util.Vector;

public class Student 
{
	private String name;
	private int id;
	private int[] marks;
	
	Student()
	{
		
	}

	public String getName() 
	{	return name;	}
	public void setName(String name) 
	{	this.name = name;	}

	public int getId() 
	{	return id;	}
	public void setId(int id) 
	{	this.id = id;	}

	public int[] getMarks() 
	{	return marks;	}
	public void setMarks(int[] marks) 
	{	this.marks = marks;	}

	
	public String grade(int[] marks)
	{
		int count = 0;
		
		for(int i = 0 ; i < 5 ; i ++)
		{
			if(marks[i] < 40)
				count = -10;
			else
				count++;
		}
		if(count > 0)
			return "Pass";
		else
			return "Fail";	
	}
	
	
	@Override
	public String toString() {
		return id + " | " + Arrays.toString(marks) + " | " + grade(marks);
	}
}
