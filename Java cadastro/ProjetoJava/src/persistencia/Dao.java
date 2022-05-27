package persistencia;

import java.sql.*;


public class Dao {
	Connection con; // $con = mysqli_connect(localhost,root,senha,banco)
	PreparedStatement stmt; // $sql ="insert..."
	ResultSet rs;
	
	
	
	public void open()throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/id18397714_topfaceestetica","root","");
	}
	
	public void close()throws Exception {
		con.close();
	}
	
}
