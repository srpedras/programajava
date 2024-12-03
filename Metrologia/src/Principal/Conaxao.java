package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/**
 * @author cpd
 * @version 1.0
 * @since 19/11/2024
 *  */

public class Conaxao {
	public static Connection fa_conexao() throws SQLException {
		try {
			
			//coxão com o banco de dados
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection("jdbc:mysql://localhost/db_metrologia", "root","");

			
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getException());
			
		}
		
		
	}

}
