package org.lin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DriverTest {
	
	
	public static void main(String [] args) throws ClassNotFoundException, SQLException{
		executeSql("select * from INTF_INTERFACE_LOG ");
	}
	private static void executeSql(String sql) throws ClassNotFoundException, SQLException{
		String d = "com.mysql.jdbc.Driver";
		Statement st = null;
		boolean hasResultSet = false;
		//Class.forName(d);
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.73:3306/interface_log",
							"root", "1qaz2wsx");
			st = conn.createStatement();
			hasResultSet = st.execute(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(hasResultSet){
			//int m = st.executeUpdate(sql);
			ResultSet rs = st.executeQuery(sql);
			ResultSetMetaData rm = rs.getMetaData();
			
			for(int i=1; i<=rm.getColumnCount(); i++){
				System.out.println(rm.getColumnName(i));
			}
			while(rs.next()){
				for(int i=1; i<=rm.getColumnCount(); i++){
					System.out.print(rs.getString(i)+",");
					
				}
				System.out.print("\n");
				
			}
		}
		
	}

}
