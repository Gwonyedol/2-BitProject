package kr.or.bit.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import kr.or.bit.dto.Empdto;
import kr.or.bit.utils.SingletonHelper;

public class MemberDAO {
	
	DataSource ds = null;
	public MemberDAO() throws NamingException {
		//conn = SingletonHelper.getConnection("oracle");
		 Context context = new InitialContext(); //이름기반 검색
		 ds = (DataSource)context.lookup("java:comp/env/jdbc/oracle"); ///jdbc/oracle pool 검색
	}
	
	public int MemberAdd(String Mid, String Mpwd, String etc)  { // 회원가입 받는 기능
		int resultrow=0;
		PreparedStatement pstmt = null;
		Connection conn = null;
		try { 
			
			
			   conn = ds.getConnection();
			   String sql = "insert into P2_Member(Mid,Mpwd,etc) values(?,?,?)";

			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, Mid);
			   pstmt.setString(2, Mpwd);
			   pstmt.setString(3, etc);

			   
			   resultrow = pstmt.executeUpdate();
			
		}catch(Exception e) {
			System.out.println("Insert :" + e.getMessage());
			//executeUpdate(); 예외발생  (제약 위반, 컬럼 길이)
			resultrow = -1;
		}finally {
			SingletonHelper.close(pstmt);
			//POINT //반환하기
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			} 
		}
 
		return resultrow;
	}
	
	
	public MemberDTO loginok(String Mid) { // 로그인해주는 기능
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemberDTO m = new MemberDTO();

		try {
			
			String sql = "select Mid,Mpwd,etc from P2_Member where Mid=?";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, Mid);
			
			rs = pstmt.executeQuery();

			while(rs.next()) {
				m.setMid(rs.getString("Mid"));
				m.setMpwd(rs.getString("Mpwd"));
				m.setEtc(rs.getString("etc"));
			}


			
				
		} catch (Exception e) {
			System.out.println("Insert :" + e.getMessage());
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
			try {
				conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			} 
		}
		

		
		return m;
	}

}
