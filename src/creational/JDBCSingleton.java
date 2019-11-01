package creational;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSingleton
{
	
	private static JDBCSingleton jdbcSingleton;
	
	private  JDBCSingleton() {}
	
	public static JDBCSingleton getInstance()
	{
		if(jdbcSingleton==null)
		{
			jdbcSingleton = new JDBCSingleton();
		}
		return jdbcSingleton;
			
	}
	
	public static Connection getConn() throws SQLException, ClassNotFoundException
	{
		Connection con = null;
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root");
		
		return con;
	}
	public void viewAllDataByName(String uname)
	{
		Connection con =null;
		
		try
		{
			con = this.getConn();
			PreparedStatement ps = con.prepareStatement("select * from userData where uname =?");
			ps.setString(1, uname);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println("id is="+rs.getInt(1)+"name = "+rs.getString(2)+" : "+"password ="+rs.getString(3));	
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public int insertData(String uname,String upass)
	{
         Connection con =null;
         int status = 0;
		
		try
		{
			con = this.getConn();
			PreparedStatement ps = con.prepareStatement("insert into userData(uname,upass) values(?,?)");
			ps.setString(1,uname);
			ps.setString(2,upass);
			status = ps.executeUpdate();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
	}
	
	
	public int updateData(String uname,String upass,int id)
	{
		
		 Connection con =null;
         int status = 0;
		
		try
		{
			con = this.getConn();
			PreparedStatement ps = con.prepareStatement("update userData set uname=?, upass=? where userid='"+id+"'");
			ps.setString(1,uname);
			ps.setString(2,upass);
			status = ps.executeUpdate();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
		
		
	}
	
	public int deletData(int uid)
	{
		 Connection con =null;
         int status = 0;
		
		try
		{
			con = this.getConn();
			PreparedStatement ps = con.prepareStatement("delete from userData where userid =?");
			ps.setInt(1,uid);
			status = ps.executeUpdate();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
		
		
	}
	
	
	
	
	
	
	
	
	

}
