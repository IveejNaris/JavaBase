package dataOne;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class StackSample 
{
	
	public static void Stacking()
	{
		Stack<Integer> s = new Stack<Integer>();
		
		//adding elements onto the stack
		s.push(300);
		s.push(256);
		s.push(441);
		s.push(186);
		s.push(693);
		
		//displaying stack elements
		s.forEach(System.out::println);
		
		//searching an element in the stack (returns the index from the top of the stack)
		System.out.println(s.search(441));
		
		//Stack for a user-defined datatype
		Stack<Product> spro = new Stack<Product>();
		
		//Objects of class Product
		Product p1 = new Product(100, "Chips");
		Product p2 = new Product (131, "Biscuit");
		
		//adding objects to the stack
		spro.push(p1);
		spro.add(p2);
		spro.addElement(new Product(345, "Candy"));
		
		spro.forEach(System.out::println);
		Product product = new Product();
//		product.price(spro);
	}
	
	
	public static void Vectoring()
	{
		//Generic Type
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(256);
		vector.add(324);
		vector.add(441);
		vector.forEach(System.out::println);
	}
	
	
	public static void Queueing()
	{
		Queue<Float> q = new PriorityQueue<Float>();
		
		//Adding elements into the queue
		q.add(2.3f);
		q.add((float)8.9);
		q.add(3.7f);
		q.add(89.4f);
		
		//Removing the element from the queue
		q.remove();
		System.out.println("Queue: ");
		q.forEach(System.out::println);
		
		Queue<Float> q1 = new PriorityQueue<Float>();
		q1.add(5.6f);
		q1.addAll(q);
		
		System.out.println("Queue1: ");
		q1.forEach(System.out::println);
		
		//Boolean commands
		System.out.println(q1.containsAll(q));
		System.out.println(q.contains(8.8f));
		System.out.println(q1.equals(q));
		
	}
	
	
	public static void setCollections()
	{
		//Set doesn't allow duplicate elements
		Character[] ch = {'a', 'b', 'c'};
		Set<Character> set1 = new HashSet<Character>();
		set1.addAll(Arrays.asList(ch));
		set1.add('a');
		set1.add('d');
		
		for(Character i : set1)
			System.out.println(i);
		
		
		Set<Character> set2 = new HashSet<Character>();
		
		set2.add('g');
		set2.add('f');
		set2.add('e');
		set2.add('c');
		
		set2.addAll(set1);		//Union
		System.out.println("Set 2 = Set 2 Union Set 1:");
		for(Character i : set2)
			System.out.println(i);
		
		set2.retainAll(set1);	//Intersection
		System.out.println("Set 2 = Set 2 Intersection Set 1:");
		for(Character i : set2)
			System.out.println(i);
		
		set2.removeAll(set1);	//Difference
		System.out.println("Set 2 = Set 2 Minus Set 1:");
		for(Character i : set2)
			System.out.println(i);
	}
	
	
	public static void sortedSetCollections()
	{
		Character[] ch = {'a', 'b', 'c', 'b', 'e'};
		SortedSet<Character> set1 = new TreeSet<Character>();
		set1.addAll(Arrays.asList(ch));
		set1.add('d');
		
		System.out.println(set1.isEmpty());
		System.out.println(set1.hashCode());
		System.out.println(set1.removeIf(item->item == 'a'));
		set1.forEach(System.out::println);
		
		System.out.println(set1.getClass());
		System.out.println(set1.headSet('c'));
		set1.forEach(System.out::println);
		
		System.out.println(set1.tailSet('c'));
		System.out.println(set1.subSet('b', 'd'));
	}
	
	
	public static void doIt()
	{
		Vector<Integer> v = new Vector<Integer>();
		Random r = new Random();
		
		for(int i = 1 ; i <= 20 ; i ++)
			v.add(r.nextInt(100));
		System.out.println("Initial Vector: ");
		System.out.println(v);			//Initial Vector
		
		for(int j = 0 ; j < 10 ; j ++)
			v.remove(r.nextInt(19-j));
		System.out.println("Vector now: ");
		System.out.println(v);			//Vector after random removal of elements
		
		Set<Integer> s = new HashSet<Integer>();
		for(int i : v)
			s.add(i);					//Adding Vector elements to the Set
		System.out.println("Set");
		System.out.println(s);
	}
	
	
	public static void main(String[] args)
	{
		doIt();
	}
}
