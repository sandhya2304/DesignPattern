package compositePattern;

public interface Employee 
{
	
	public int getid();
	public String getname() ;
	public double getsalary();
	
	public void print();
	public void addEmployee(Employee emp);
	public void removeEmployee(Employee emp);
	public Employee getChild(int i);
	

}
