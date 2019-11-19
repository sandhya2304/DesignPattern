package compositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Account implements Employee
{
	private int id;
	private String name;
	private double salary;
	
	public Account(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	List<Employee> employees = new ArrayList<Employee>();
	
	@Override
	public int getid() {
		return id;
	}
	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public double getsalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	
	@Override
	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
	@Override
	public void removeEmployee(Employee emp) {
		employees.remove(emp);
	}
	@Override
	public Employee getChild(int i) {
		return employees.get(i);
	}
	@Override
	public void print() 
	{
	System.out.println("print the employe---");
	System.out.println("id :"+getid());
	System.out.println("name :"+getname());
	System.out.println("salary :"+getsalary());
	
	Iterator<Employee> itr = employees.iterator();
	while(itr.hasNext())
	{
		Employee emp = itr.next();
		emp.print();
		
	}
	
	
	
	}

}
