package compositePattern1;

import java.util.ArrayList;
import java.util.List;

public class Emp
{
	
	private String name;
	private String dept;
	private int salary;
	private List<Emp> subordinate;
	
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Emp(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinate = new ArrayList<Emp>();
	}


	public void add(Emp e)
	{
		subordinate.add(e);
	}
	
	public void remove(Emp e)
	{
		subordinate.remove(e);
	}
	
	public List<Emp> getSubordinate()
	{
		return subordinate;
	}


	@Override
	public String toString() {
		return "Emp [name=" + name + ", dept=" + dept + ", salary=" + salary + ", subordinate=" + subordinate + "]";
	}
	
	
}
