package org.masterjung.dao.newsboard;

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



public class NewsDAO {
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public NewsDAO() throws NamingException {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/mysql");
	}
	public List<BoardDto> getNewsList() throws SQLException {
		String sql = "select date_created, id, board_list_id, title, view_count, nick_name from board";
		// POOL 연결 객체 얻어오기
		Connection conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		List<BoardDto> boardList = new ArrayList<>();
		// []
		while (rs.next()) {
			BoardDto news = new BoardDto();
			news.setDate_created(rs.getDate("date_created"));
			news.setId(rs.getInt("id"));
			news.setBoard_list_id(rs.getInt("board_list_id"));
			news.setTitle(rs.getString("title"));
			news.setView_count(rs.getInt("view_count"));
			news.setNick_name(rs.getString("nick_name"));
			boardList.add(news);
		}

		conn.close();
		return boardList;
	}
	public int  InsertBoard(BoardDto boardDto) throws SQLException {
		int resultrow=0;
		String sql = "insert into board(title,content,nick_name,board_list_id,file_path) values(?,?,?,?,?)";
		Connection conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1,boardDto.getTitle());
		pstmt.setString(2, boardDto.getContent());
		pstmt.setString(3,boardDto.getNick_name());
		pstmt.setInt(4,boardDto.getBoard_list_id());
		pstmt.setString(5, boardDto.getFile_path());
		resultrow= pstmt.executeUpdate();
		conn.close();
		return resultrow;
	}
}
