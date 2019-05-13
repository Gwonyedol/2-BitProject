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
 
	//회원 정보 출력
	public UserDto userDetail(String email) {
        String sql = "SELECT * FROM user WHERE email = ?";
        UserDto ud = null;
        try {
        	conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();
			rs.next();
			ud = new UserDto();
			ud.setUser_image_path(rs.getString("user_image_path"));
			ud.setUser_name(rs.getString("user_name"));
			ud.setEmail(rs.getString("email"));
			ud.setPassword(rs.getString("password"));
			ud.setNick_name(rs.getString("nick_name"));
			ud.setPhone_number(rs.getInt("phone_number"));
			ud.setUser_address(rs.getString("user_address"));
			ud.setUser_auth(rs.getInt("user_auth"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        	if(rs!=null) try{rs.close();}catch(SQLException ex){}
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(conn!=null) try{conn.close();}catch(SQLException ex){}
		}
        
        return ud;
        
    }//회원 정보  출력 끝
	
	//회원 정보 수정
	public int editUser(UserDto userDto) {
		int rowcount = 0;
		System.out.println("dao 시작");
        String sql = "update user set nick_name=?, phone_number=?, user_name=?,user_address=?,user_auth=? ,user_image_path=? where email=?";
        
        try {
        	
        	conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			System.out.println("닉네임 : "+ userDto.getNick_name());
			
			pstmt.setString(1, userDto.getNick_name());
			pstmt.setInt(2, userDto.getPhone_number());
			pstmt.setString(3, userDto.getUser_name());
			pstmt.setString(4, userDto.getUser_address());
			pstmt.setInt(5, userDto.getUser_auth());
			pstmt.setString(6, userDto.getUser_image_path());
			pstmt.setString(7, userDto.getEmail());
			rowcount = pstmt.executeUpdate();
			
			
			System.out.println("실행" + rowcount);
			
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
			if(pstmt!=null) try{pstmt.close();}catch(SQLException ex){}
			if(conn!=null) try{conn.close();}catch(SQLException ex){}
		}
        
        return rowcount;
        
    }//회원 정보 수정 끝
} //클래스 끝
