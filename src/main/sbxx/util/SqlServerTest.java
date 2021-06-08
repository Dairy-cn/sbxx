package main.sbxx.util;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SqlServerTest {
	public static void main(String[] arge) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			
			String url = "jdbc:sqlserver://39.98.237.208:1433;DatabaseName=T3_Case_Publish",
					user = "sa",
					password = "XXx";
			
			Connection conn = DriverManager.getConnection(url, user, password);
			
			Statement stmt = conn.createStatement();
			
			ResultSet rs;
			
			String strSql = "SELECT name ,Picture FROM [dbo].[PersonInfo] where ConferenceID='A0B8A636B2764DD8BB477B6A07BF8EBB'  and Unit like '%XX%'";
			
			InputStream in = null;
			
			FileOutputStream fileOutStream = null;
			
			rs = stmt.executeQuery(strSql);
			int count = 0;
			while (rs.next()) {
				String name = rs.getString("name");
				System.out.println(name);
				FileOutputStream sos = new FileOutputStream("d:\\bak\\" + rs.getString("name").replace(" ","") + ".png");
				in = rs.getBinaryStream("Picture");
			
				byte[] b = new byte[1024];
				int length;
				while((length = in.read(b))>0){
					sos.write(b,0,length);
				}
				sos.close();
				in.close();
				++count;
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}