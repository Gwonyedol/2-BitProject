package org.masterjung.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.masterjung.dto.UserDto;

public class MainDao {
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public MainDao()  {
		Context context;
		try {
			context = new InitialContext();
			ds = (DataSource) context.lookup("java:comp/env/jdbc/mysql");
		} catch (NamingException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	} //생성자 끝
	
	//회원 등록
	public boolean insertMember(UserDto userdto) {
		int resultrow = 0;
		String sql = "insert into user(email, password, nick_name, phone_number, user_name) values(?,?,?,?,?)";
		boolean joinOk = false;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, userdto.getEmail());
			pstmt.setString(2, userdto.getPassword());
			pstmt.setString(3, userdto.getNick_name());
			pstmt.setInt(4, userdto.getPhone_number());
			pstmt.setString(5, userdto.getUser_name());
			
			resultrow = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {pstmt.close();	}catch (SQLException e) {e.printStackTrace();}
			try {conn.close();	}catch (SQLException e) {e.printStackTrace();}
		}
		return joinOk;
	} //회원등록 끝
	
	//회원 확인
	public int isMember(UserDto userdto) {
		int result = -1;
        String sql = "SELECT password FROM user WHERE email = ?";
        try {
        	conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userdto.getEmail());
			rs = pstmt.executeQuery();
			
            if(rs.next()){
                if(rs.getString(1).equals(userdto.getPassword())) {
                	result =  1;    // 로그인 성공
                } else {
                	result = 0; // 비밀번호 불일치
                }
            } else {
            	result =  -1; // ID가 없음
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = 2; // DB 오류
        } finally {
        	if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(conn!=null) try{conn.close();}catch(SQLException ex){}
		}
        
        return result;
        
    } //회원 확인 끝
 

} //클래스 끝
