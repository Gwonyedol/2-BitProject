package org.masterjung.dao.tipboard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.masterjung.dto.join.BoardDetailDto;

public class TipDAO {
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public TipDAO() throws NamingException {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/mysql");
	}

	public int UpdateBoard(BoardDetailDto boardDto) throws SQLException {
		int resultrow = 0;
		boolean notUpload = isEmpty(boardDto.getFile_path());
		String sql = notUpload ? 
							"update board set title=?,content=?,nick_name=?,board_list_id=? where id=?" :
							"update board set title=?,content=?,nick_name=?,board_list_id=?,file_path=? where id=?";
		Connection conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, boardDto.getTitle());
		pstmt.setString(2, boardDto.getContent());
		pstmt.setString(3, boardDto.getNick_name());
		pstmt.setInt(4, boardDto.getBoard_list_id());
		if (notUpload) {
			System.out.println("파일존재x2");
			pstmt.setInt(5, boardDto.getId());
		} else {
			System.out.println("파일존재2");
			pstmt.setString(5, boardDto.getFile_path());
			pstmt.setInt(6, boardDto.getId());
		}
		resultrow = pstmt.executeUpdate();
		conn.close();
		return resultrow;
	}

	private boolean isEmpty(String param) {
		return param == null || param.equals("");
	}
}
