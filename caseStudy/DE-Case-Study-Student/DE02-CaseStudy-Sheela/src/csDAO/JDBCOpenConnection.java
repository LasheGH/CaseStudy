/**
 * 
 */
package csDAO;


/**
 * @author sheela
 *
 */


import java.sql.*;

public class JDBCOpenConnection {

	final private static String cName="com.mysql.jdbc.Driver";
	final private static String conPath="jdbc:mysql://localhost:3306/cdw_sapp?useSSL=false";
	final private static String uID = "root";
	final private static String pwd = "root";
	//final private static String sqlStmt = "Select * from cdw_sapp_branch";
	final private static String sqlStmt = "SELECT COUNT(TRANSACTION_TYPE) FROM cdw_sapp.cdw_sapp_creditcard WHERE TRANSACTION_TYPE = 'Gas'";
			//"SELECT * FROM cdw_sapp.cdw_sapp_creditcard INNER JOIN cdw_sapp.cdw_sapp_customer WHERE CUST_ZIP = 91010";
	Connection con;
	JDBCCloseConnection jdbcClCon = new JDBCCloseConnection();
	
		public void jdbcOpenConnection() {
			try{
					Class.forName(cName);
					con = DriverManager.getConnection(conPath, uID, pwd);
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery(sqlStmt);
					while(rs.next())
					{
						System.out.println(rs.getInt(1));
					//+ rs.getString(5)+ " " + rs.getString(3)+ " " + rs.getString(4));
						rs.next();
					}
					st.close();
					
			}
			catch(ClassNotFoundException eCNF)
			{
				System.out.println("In the catch block " + eCNF.getMessage());
			}
			catch(SQLException eSQL)
			{
				System.out.println("In the catch block " + eSQL.getMessage());
			}
			finally
			{
				jdbcClCon.jdbcCloseConnection(con);
			}
		
		}
	
}
