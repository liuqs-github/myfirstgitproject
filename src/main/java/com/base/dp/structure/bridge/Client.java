package com.base.dp.structure.bridge;

public class Client {
	public static void main(String[] args) throws Exception{
		Class.forName("com.base.dp.structure.bridge.OralcleJdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:localhost:1521:test");
//		Class.forName("com.base.dp.structure.bridge.MysqlJdbcDriver");
//		Connection con = DriverManager.getConnection("jdbc:mysql:localhost:3306/test");
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.execute("select * from user");
		while(rs.hasNext()){
			System.out.println("userName:"+rs.getString("username"));
			System.out.println("user age is"+ rs.getInt("age"));
		}
		rs.close();
		stmt.close();
		con.close();
		
		
	}
}
