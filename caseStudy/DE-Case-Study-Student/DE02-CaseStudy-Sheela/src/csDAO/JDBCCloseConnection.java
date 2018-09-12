/**
 * 
 */
package csDAO;

/**
 * @author sheela
 *
 */
import java.sql.*;

public class JDBCCloseConnection {
	
	public void jdbcCloseConnection(Connection c)
	{
	try 
	{
		c.close();
	} 
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	}

}
