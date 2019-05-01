package kr.or.bit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import kr.or.bit.dto.Empdto;
import kr.or.bit.utils.SingletonHelper;


public class Empdao {
	
	DataSource ds = null;
	public Empdao() throws NamingException {
		//conn = SingletonHelper.getConnection("oracle");
		 Context context = new InitialContext(); //이름기반 검색
		 ds = (DataSource)context.lookup("java:comp/env/jdbc/oracle"); ///jdbc/oracle pool 검색
	}
	
	//Read : 한건 데이터 (반드시 테이블에 primary key 컬럼 대상)
	public Empdto getEmpListByEmpno(String id) {
		return null;
	}
	
	//Read : 여러건 데이터(where 조건이 없어요)
	public List<Empdto> getEmpList() throws SQLException{
		//select id,email,content from memo
		//Class.forName("oracle.jdbc.OracleDriver");
		//conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","kosta","1004");
		//위 코드 생략
		
		PreparedStatement pstmt = null;
		String sql = "select EMPNO,ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO from emp";
		//POOL 연결 객체 얻어오기
		Connection conn = ds.getConnection();
		//
		pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		List<Empdto> emplist = new ArrayList<>();
		//[] 
		while(rs.next()) {
			Empdto m = new Empdto();
			m.setEname(rs.getString("ENAME"));
			m.setJob(rs.getString("JOB"));
			m.setHiredate(rs.getDate("HIREDATE"));
			m.setSal(rs.getInt("SAL"));
			m.setComm(rs.getInt("COMM"));
			m.setEmpno(rs.getInt("EMPNO"));
			m.setDeptno(rs.getInt("DEPTNO"));
			emplist.add(m);
		}
		
		SingletonHelper.close(rs);
		SingletonHelper.close(pstmt);
		//POINT
		conn.close(); //반환하기
		return emplist;
	}
	
	
	// List 요청에대한 서비스 
	
	
}
