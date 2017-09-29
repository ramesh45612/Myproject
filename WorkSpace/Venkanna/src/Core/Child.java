package Core;

interface ConnectionInterface
{
	public StatementInterface createStatement();
}

interface StatementInterface{
	
	public int executeUpdate();
	public ResultSetInterface executeQuery(String sql);
}

interface ResultSetInterface
{
	
}

class ConnectionInterfaceImpl implements ConnectionInterface
{
	public  StatementInterface createStatement()
	{
		StatementInterface ob = new StatementInterfaceImpl();
	
	return ob;
				
	}
	
}

class StatementInterfaceImpl implements StatementInterface
{
	

	@Override
	public ResultSetInterface executeQuery(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int executeUpdate() {
		// TODO Auto-generated method stub
		return 12;
	}
	
}

class DM
{
	public static ConnectionInterface getConn()
	{
	ConnectionInterface ob = new ConnectionInterfaceImpl();
	
	return ob;
				
	}
	
}

public class Child {
public static void main(String[] args) throws Exception {
ConnectionInterface con =DM.getConn();
System.out.println(con);
StatementInterface st =con.createStatement();
int a=st.executeUpdate();
System.out.println(a);
ResultSetInterface rs=st.executeQuery("select * from emp");
System.out.println(rs);
	}
	
	} 

