package org.masterjung.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.masterjung.dto.BoardDto;


public class BoardDao {
	DataSource ds;
	Connection conn;
	Context context;
	
	public BoardDao() {
		conn = null;	
		try {
			context = new InitialContext();
			ds = (DataSource)context.lookup("java:comp/env/jdbc/mysql");
		} catch (NamingException e) {
			System.out.println("memodao.java -> 기본생성자 오류 : " +e.getMessage());
		}
	}
	
	//create
	public int addBoardContent(BoardDto boarddto)  {
		int resultrow=0;
		PreparedStatement pstmt = null;
		try {
		    String sql="insert into board(board_list_id, nick_name, create_ip, refer, depth, step, title, content, file_path) values(?,?,?,?,?,?,?,?,?)";
			conn = ds.getConnection();
		    pstmt = conn.prepareStatement(sql);
		    pstmt.setInt(1, boarddto.getBoard_list_id());
		    pstmt.setString(2, boarddto.getNick_name());
		    pstmt.setString(3, boarddto.getCreate_ip());
		    pstmt.setInt(4, boarddto.getRefer());
		    pstmt.setInt(5, boarddto.getDepth());
		    pstmt.setInt(6, boarddto.getStep());
		    pstmt.setString(7, boarddto.getTitle());
		    pstmt.setString(8, boarddto.getContent());
		    pstmt.setString(9, boarddto.getFile_path());
		    resultrow = pstmt.executeUpdate();
		}catch(Exception e) {
			System.out.println("addBoardContent() 오류발생 :" + e.getMessage());
		}finally {
			try {
				if(conn!=null) {conn.close();}
				if(pstmt!=null) {pstmt.close();}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} 
		}
		return resultrow;
	}
	
	
} //클래스 끝 
