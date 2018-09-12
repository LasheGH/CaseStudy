package csRunner;

import csDAO.*;

public class CreditCardApp {

	public static void main(String[] args) {
		JDBCOpenConnection jdbcOpCon = new JDBCOpenConnection();
//		JDBCCloseConnection jdbcClCon = new JDBCCloseConnection();
		
		jdbcOpCon.jdbcOpenConnection();
//		jdbcClCon.jdbcCloseConnection(c);
		
	}

}
