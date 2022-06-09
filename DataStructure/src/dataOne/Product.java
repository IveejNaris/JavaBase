package dataOne;

import java.util.Stack;

public class Product 
{
	int pid;
	String name;
	
	Product(int pid, String name)
	{
		this.pid = pid;
		this.name = name;
	}
	Product()
	{
		
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + "]";
	}
	
	
}
