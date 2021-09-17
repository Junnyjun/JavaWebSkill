package sec02.ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberDAO2 {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "scott";
	private static final String pwd = "tiger";
	private PreparedStatement stmt;
	private Connection con;
	
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
		
			connDB();
			String Query = "select * from t_member";
			System.out.println(Query);
			stmt = con.prepareStatement(Query);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				
				MemberVO member = new MemberVO();
				member.setId(id);
				member.setPw(pw);
				member.setName(name);
				member.setEmail(email);
				member.setJoinDate(joinDate);
				list.add(member);
				
			}
			rs.close();
			stmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Loading Driver success");
			con = DriverManager.getConnection(url,user,pwd);
			System.out.println("create Connection success");
			
			System.out.println("create Statement success");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
