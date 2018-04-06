import java.sql.*;

public class Today {

	public static void main(String[] args) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ram","root","anvi");
	Statement st =con.createStatement();
	
	ResultSet rs =st.executeQuery("select * from test");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
	}
	rs.close();
	st.close();
	con.close();
	}
}
	
