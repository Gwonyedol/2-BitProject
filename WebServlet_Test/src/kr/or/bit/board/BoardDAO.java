package kr.or.bit.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class BoardDAO {

	static DataSource ds;
	//https://opentutorials.org/module/3569/21223
	/*
	 * DataSource에 대해 정의하자면 아래와 같다.
	 * 
	 * 커넥션 풀의 Connection을 관리하기 위한 객체이다. JNDI Server를 통해서 이용된다. DataSource 객체를 통해서
	 * 필요한 Connection을 획득, 반납 등의 작업을 한다. DataSource를 이용하려면 다음의 절차를 따릅니다.
	 * 
	 * JNDI Server에서 lookup( ) 메소드를 통해 DataSource 객체를 획득한다. DataSource 객체의
	 * getConnection( ) 메소드를 통해서 Connection Pool에서 Free 상태의 Connection 객체를 획득한다.
	 * Connection 객체를 통한 DBMS 작업을 수행한다. 모든 작업이 끝나면 DataSource 객체를 통해서 Connection
	 * Pool에 Connection을 반납한다.
	 */
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	static {
		InitialContext ctx;
		try {
			/*
			 * Context context = new InitialContext(); DataSource datasource =
			 * (DataSource)context.lookup("java:comp/env/jdbc/oracle"); conn =
			 * datasource.getConnection();
			 */
			ctx = new InitialContext();
			Context envCtx = (Context) ctx.lookup("java:comp/env");
			ds = (DataSource) envCtx.lookup("/jdbc/oracle");
			System.out.println("DataSource 객체 생성 성공 !");
		} catch (NamingException e) {
			System.out.println("lookup Fail : " + e.getMessage());
		}
	}

	// jspboard (CRUD) 구현 하는 함수
	// select > 객체(DTO) 담는다 > return board ,
	// insert , update , delete > return 반영된 row
	// 객체 받는 선택

	// jspboard insert 함수 (원본 글쓰기)
	public int writeok(BoardDTO boardata) throws Exception {
		try {
			conn = ds.getConnection();
			String sql = "insert into jspboard(idx,writer,pwd,subject,content,email,homepage,writedate,readnum,filename,filesize,refer) values("
					+ " jspboard_idx.nextval,?,?,?,?,?,?,sysdate,0,?,0,?)";
			pstmt = conn.prepareStatement(sql);

			// parameter 설정하기
			pstmt.setString(1, boardata.getWriter());
			pstmt.setString(2, boardata.getPwd());
			pstmt.setString(3, boardata.getSubject());
			pstmt.setString(4, boardata.getContent());
			pstmt.setString(5, boardata.getEmail());
			pstmt.setString(6, boardata.getHomepage());
			pstmt.setString(7, boardata.getFilename());

			// 계층형 게시판
			// refer , depth , step
			// 1.원본글 : refer , depth(0) , step(0)
			// 2.답변글 : refer , depth(값이) , step(값이)

			// refer 설정규칙 : idx 동일 ( +1)
			int refer_max = getMaxRefer(conn);
			int refer = refer_max + 1;
			// int depth = 0;
			// int step = 0;
			pstmt.setInt(8, refer);

			int row = pstmt.executeUpdate();
			return row;

		} /*
		 * catch (Exception e) {
		 * 
		 * e.printStackTrace(); }
		 */finally {
			// System.out.println("close");
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close(); // pool conn 객체반환
		}

	}
	
	public int getMaxRefer(Connection conn) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int refer_max = 0;
		try {
			String maxRefer_sql = "select nvl(max(refer),0) from jspboard";
			pstmt = conn.prepareStatement(maxRefer_sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("rs_next :" + rs.getInt(1));
				refer_max = rs.getInt(1);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (pstmt != null)
				pstmt.close();
			// if(conn != null) conn.close(); //pool conn 객체반환
			return refer_max;
		}

	}

	
}
