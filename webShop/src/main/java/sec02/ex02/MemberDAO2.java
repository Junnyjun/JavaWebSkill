package sec02.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import sec02.ex02.MemberVO;

public class MemberDAO2 {

	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private static final String user = "scott";
	private static final String pwd = "tiger";
	private PreparedStatement pstmt;
	private Connection con;
	
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
		
			connDB();
			String Query = "select * from t_member";
			System.out.println(Query);
			pstmt = con.prepareStatement(Query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pwd");
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
			pstmt.close();
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public void addMember(MemberVO memberVO) {
		try {
			connDB();
			String id = memberVO.getId();
			String pwd = memberVO.getPw();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			String query = "insert into t_member";
			query += " (id,pwd,name,email)";
			query += " values(?,?,?,?)";
			System.out.println("prepareStatememt: " + query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delMember(String id) {
		try {
			connDB();
			String query = "delete from t_member" + " where id=?";
			System.out.println("prepareStatememt:" + query);
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
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
