package kr.or.bit.dao;

import java.sql.Connection;
import java.sql.Date;
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
	
	//EMP 직원 리스트 (한건)
	public Empdto getEmpListByEmpno(String id) {
		return null;
	}
	
	//EMP 직원 리스트 (여러건)
	public List<Empdto> getEmpList() throws SQLException{

		
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
			m.setHiredate(rs.getString("HIREDATE"));
			m.setSal(rs.getInt("SAL"));
			m.setComm(rs.getInt("COMM"));
			m.setMgr(rs.getInt("MGR"));
			m.setEmpno(rs.getInt("EMPNO"));
			m.setDeptno(rs.getInt("DEPTNO"));
			emplist.add(m);
		}
		
		SingletonHelper.close(rs);
		SingletonHelper.close(pstmt);
		conn.close();
		return emplist;
	}
	
	// List 요청에대한 서비스 
	
	
	
	
	//EMP 직원 INSERT
	public int insertEmp(String ename, String job, int empno, int mgr, String hiredate, int sal, int comm, int deptno)  {
		int resultrow=0;
		PreparedStatement pstmt = null;
		Connection conn = null;
		try { 
			
				String sql = "insert into EMP(ENAME,JOB,EMPNO,MGR,HIREDATE,SAL,COMM,DEPTNO) values(?,?,?,?,?,?,?,?)";
				conn = ds.getConnection();
				

			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, ename);
			   pstmt.setString(2, job);
			   pstmt.setInt(3, empno);
			   pstmt.setInt(4, mgr);
			   pstmt.setString(5, hiredate);
			   pstmt.setInt(6, sal);
			   pstmt.setInt(7, comm);
			   pstmt.setInt(8, deptno);
			   

			   
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
	
	public Empdto updatefromEmp(int empno) { // Update 할때 해당 사원의 정보를 저장해오는 부분
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Empdto m = new Empdto();

		try {
			
			String sql = "select ENAME,JOB,MGR,HIREDATE,SAL,COMM,DEPTNO from EMP where EMPNO=?";
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			rs = pstmt.executeQuery();
			
			System.out.println("이거안뜨면오바야 ㅠ..:" + rs.getString("ENAME"));
			
				m.setEname(rs.getString("ENAME"));
				m.setJob(rs.getString("JOB"));
				m.setMgr(rs.getInt("MGR"));
				m.setHiredate(rs.getString("HIREDATE"));
				m.setSal(rs.getInt("SAL"));
				m.setComm(rs.getInt("COMM"));
				m.setDeptno(rs.getInt("DEPTNO"));
				m.setEmpno(rs.getInt("EMPNO"));
			
				
				
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
	
	
	public int updateEmp(String ename, String job, int mgr, String hiredate, int comm, int sal, int deptno, int empno) {
		//update memo set email=? , content=? where id=?
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result=0;
		
		
		try { 
			
			   String sql = "update EMP set ENAME=?, JOB=?, MGR=?, HIREDATE=?, COMM=?, SAL=?, DEPTNO=? where EMPNO=?";
			   conn = ds.getConnection();			

			   pstmt = conn.prepareStatement(sql);
			   pstmt.setString(1, ename);
			   pstmt.setString(2, job);
			   pstmt.setInt(3, mgr);
			   pstmt.setString(4, hiredate);
			   pstmt.setInt(5, comm);
			   pstmt.setInt(6, sal);
			   pstmt.setInt(7, deptno);
			   pstmt.setInt(8, empno);
			   
			   result = pstmt.executeUpdate();
			   
			
		}catch(Exception e1) {
			System.out.println("Insert :" + e1.getMessage());
			//executeUpdate(); 예외발생  (제약 위반, 컬럼 길이)
			result = -1;
		}finally {
			SingletonHelper.close(pstmt);
			try {
				conn.close();
			} catch (Exception e2) {
				
				e2.printStackTrace();
			} 
		}
 
		return result;
		
		
	}
	
	//직원삭제
	public int deleteEmp(int empno) {
		//delete from memo where id=?
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result=0;
		
		
		try { 
			
			   String sql = "delete from EMP where empno=?";
			   conn = ds.getConnection();			

			   pstmt = conn.prepareStatement(sql);
			   pstmt.setInt(1, empno);
			   
			   result = pstmt.executeUpdate();
			   
			
		}catch(Exception e1) {
			System.out.println("Insert :" + e1.getMessage());
			//executeUpdate(); 예외발생  (제약 위반, 컬럼 길이)
			result = -1;
		}finally {
			SingletonHelper.close(pstmt);
			try {
				conn.close();
			} catch (Exception e2) {
				
				e2.printStackTrace();
			} 
		}
 
		return result;
		
	}
	
	
}
