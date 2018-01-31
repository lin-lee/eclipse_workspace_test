package lilin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleDriverTest {
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException{
		System.out.println("jdbc test...");
		executeSql("select t.* from lvmama_ver.intf_pass_code t ");
	}
	
	private static void executeSql(String sql) throws ClassNotFoundException, SQLException{
		Statement st = null;
		boolean b = false;
		ResultSet rs = null;
		Class.forName("oracle.jdbc.OracleDriver");
		try {
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.0.16:1521:lvmamadb", "lvmama_ver", "lvmama_ver");
			st = conn.createStatement();
			b = st.execute(sql);
			rs = st.getResultSet();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(b){
			ResultSetMetaData rd = rs.getMetaData();
			System.out.println("字段.....");
			for(int i=1; i<rd.getColumnCount(); i++)
				System.out.print(rd.getColumnName(i)+"\n");
		}
	}

}
