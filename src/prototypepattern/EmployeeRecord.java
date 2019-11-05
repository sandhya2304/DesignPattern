package prototypepattern;

public class EmployeeRecord implements Prototype
{
	
	private int id;
	private String name,designation;
	
	
	public EmployeeRecord() {
		System.out.println("id:"+id+ " name :"+name +"desg "+designation);
	}


	public EmployeeRecord(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	
	public void showRecord()
	{
		System.out.println(id+" "+name+" "+designation);
	}


	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new EmployeeRecord(id, name, designation);
	}

}
