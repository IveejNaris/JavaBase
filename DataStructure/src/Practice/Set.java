package Practice;

import java.util.Random;
import java.util.Vector;

public class Set 
{	
	public static void main(String[] args)
	{
		Vector<Student> stud = new Vector<Student>();
		Student[] s = new Student[10];
		int[][] mark = new int[10][5];
		Random r = new Random();
		
		try
		{
			for(int i = 0 ; i < 10 ; i ++)
			{
				s[i] = new Student();
				s[i].setId(r.nextInt(100, 999));
				
				for(int j = 0 ; j < 5 ; j ++)
					mark[i][j] = r.nextInt(20, 100);
				
				s[i].setMarks(mark[i]);
			
				stud.add(s[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception caught! Exception: " + e);
		}
		
		System.out.println("ID  " + "|\t Marks\t\t   | " + "Result" + "\n");
		stud.forEach(System.out::println);
		
//		for(int i = 0 ; i < 10 ; i ++)
//			stud.removeIf(stud[i].grade() == "Fail");
	}
}
