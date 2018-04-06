import java.sql.*;


public class ExcelData {

	public static void main(String[] args)throws Exception  {
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	Connection con =DriverManager.getConnection("jdbc:odbc:Just");
	Statement st =con.createStatement();
	ResultSet rs=st.executeQuery("select * from [one$]");
	while (rs.next())
	{
		rs.getString("Name");
	}
	

	}

}
