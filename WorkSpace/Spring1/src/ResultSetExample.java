import java.sql.*;

public class ResultSetExample {

	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","anvi");
	/*Statement st =con.createStatement();*/
	
	Statement st =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
	ResultSet rs =st.executeQuery("select * from today1");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
	
	}
	
	System.out.println("Insert a Row");
	rs.moveToInsertRow();
	rs.updateInt("id", 5);
	rs.updateString("name", "Ramesh");
	rs.insertRow();
	System.out.println("Row Inserted Successfully");
		
	rs.close();
	st.close();
	con.close();
	}
}
	
