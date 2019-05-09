package org.masterjung.dao.videoboard;

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

import org.masterjung.dto.BoardDto;



public class VideoDao {
	
	static DataSource ds;
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
			ds = (DataSource) envCtx.lookup("/jdbc/mysql");
			System.out.println("DataSource 객체 생성 성공 !");
		} catch (NamingException e) {
			System.out.println("lookup Fail : " + e.getMessage());
		}
	}
	

	// 비디오 보드 리스트 보여주는 메소드
	public List<BoardDto> getVideoList() throws SQLException {
		
		System.out.println("보드dao");
		
		
		String sql = "select date_created, id, board_list_id, title, view_count, nick_name from board";

		Connection conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
	
		
		List<BoardDto> boardList = new ArrayList<>();

		while (rs.next()) {
			BoardDto Video = new BoardDto();
			Video.setNick_name(rs.getString("nick_name"));
			Video.setTitle(rs.getString("title"));
			Video.setContent("content");
			Video.setView_count(rs.getInt("view_count"));
			Video.setDate_created(rs.getDate("date_created"));

			
			boardList.add(Video);
		}


		conn.close();
		
		return boardList;
		
	}
	
}



