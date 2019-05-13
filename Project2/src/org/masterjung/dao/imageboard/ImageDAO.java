package org.masterjung.dao.imageboard;

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
import org.masterjung.dto.BoardListDto;



public class ImageDAO {
	DataSource ds = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public ImageDAO() throws NamingException {
		Context context = new InitialContext();
		ds = (DataSource) context.lookup("java:comp/env/jdbc/mysql");
	}
	
	public List<BoardDto> getImageList() throws SQLException {
		String sql = "select date_created, id, board_list_id, title, view_count, nick_name from board";
		// POOL 연결 객체 얻어오기
		Connection conn = ds.getConnection();
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		List<BoardDto> boardList = new ArrayList<>();
		// []
		while (rs.next()) {
			BoardDto image = new BoardDto();
			image.setDate_created(rs.getDate("date_created"));
			image.setId(rs.getInt("id"));
			image.setBoard_list_id(rs.getInt("board_list_id"));
			image.setTitle(rs.getString("title"));
			image.setView_count(rs.getInt("view_count"));
			image.setNick_name(rs.getString("nick_name"));
			boardList.add(image);
		}

		conn.close();
		return boardList;
	}
	
//	public List<BoardListDto> selectAllBoards(){
//    	
//        List<BoardListDto> list = new ArrayList<BoardListDto>();
//        String sql="select * from board";
//        BoardListDto listdto = null;
//        
//        try{
//            conn = ds.getConnection();
//            pstmt = conn.prepareStatement(sql);  //conn.prepareStatement(sql);            
//            rs =  pstmt.executeQuery(sql);             // pstmt.executeQuery();
//            
//            while(rs.next()){  //행 단위 변화
//            	listdto = new BoardListDto();
//            	listdto.setBoard_name(rs.getString("name"));
//            	listdto.setBoard_name(rs.getString("name"));  
//            	listdto.setBoard_name(rs.getString("name"));  
//                
//                list.add(listdto);
//            }
//                
//            
//        }catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if(rs != null) rs.close();
//				if(pstmt != null) pstmt.close();
//				if(conn != null) conn.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}		
//        //#10] BoardListAction으로 가자!!!!!
//        return list;
//    }
//    /**
//     * 데이터 삽입
//     * @param vo
//     */
//    //#33] 만들어오기!
//    public void insertBoard(BoardVO vo){
//        String sql="insert into board(num, name, email, pass, title, content) values("
//                + "board_seq.nextval, ?, ?, ?, ?, ?)";
//        Connection conn=null;
//        PreparedStatement pstmt = null;
//        
//        try{
//            conn = DBManager.getConnection();
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, vo.getName());
//            pstmt.setString(2, vo.getEmail());
//            pstmt.setString(3, vo.getPass());
//            pstmt.setString(4, vo.getTitle());
//            pstmt.setString(5, vo.getContent());
//            
//            // int result = pstmt.executeUpdate();  // result에는 insert실행 row수가 담기게 된다.
//            pstmt.executeUpdate();
//            
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally{
//            DBManager.close(conn, pstmt);
//            
//        }
//        // #34] 다시 BoardWriteAction
//    }
//    /**
//     * 뷰를 볼 때, 조회 수를 증가시키자
//     */
//    // #77] (제목 클릭 시 조회 수 1증가) & 수정에서 넘어왔다.
//    public void updateReadCount(String num){
//        String sql="update board set readcount = readcount+1 where num=?";
//        Connection conn=null;
//        PreparedStatement pstmt = null;
//        
//        try{
//            conn = DBManager.getConnection();
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, num);
//            
//            pstmt.executeUpdate();
//            
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally{
//            DBManager.close(conn, pstmt);
//            
//        }
//        // #78] 복귀!
//        
//    }
//    
//    /**
//     * 글번호 한 건에 대한 모든 내용(6개 컬럼)을 읽어 와서 리턴 시키자!
//     * @param num
//     * @return
//     */
//    
//    
//    // #45] 
//    public BoardVO selectOneBoard(String num){
//        
//        String sql="select * from board where num =?";
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        BoardVO vo = null;
//        
//        try{
//            conn = DBManager.getConnection();
//            pstmt = conn.prepareStatement(sql);   //conn.prepareStatement(sql);
//            pstmt.setInt(1, Integer.parseInt(num));
//            
//            rs =  pstmt.executeQuery();             // pstmt.executeQuery();
//            
//            if(rs.next()){  // 글 한 건 
//                vo=new BoardVO();
//                vo.setNum(rs.getInt("NuM"));
//                vo.setPass(rs.getString("pass"));
//                vo.setName(rs.getString("name"));
//                vo.setEmail(rs.getString("email"));
//                vo.setTitle(rs.getString("title"));
//                vo.setContent(rs.getString("content"));
//                vo.setReadcount(rs.getInt("readcount"));
//                vo.setWritedate(rs.getTimestamp("writedate"));
//            }
//            
//        }catch(Exception e){
//                e.printStackTrace();
//        }finally{
//                DBManager.close(conn, pstmt, rs);
//                
//        }
//        return vo;
//            
//    }
//    // #67] 비번 체크하고 글 한건 리턴 시키자.
//    public BoardVO checkPassword(String num, String pass){
//        String sql="select * from board where num =? and pass=?";
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        BoardVO vo = null;
//        
//        try{
//            conn = DBManager.getConnection();
//            pstmt = conn.prepareStatement(sql);   //conn.prepareStatement(sql);
//            pstmt.setString(1, num);
//            pstmt.setString(2, pass);
//            
//            rs =  pstmt.executeQuery();             // pstmt.executeQuery();
//            
//            if(rs.next()){  // 글 한 건 
//                vo=new BoardVO();
//                vo.setNum(rs.getInt("NuM"));
//                vo.setPass(rs.getString("pass"));
//                vo.setName(rs.getString("name"));
//                vo.setEmail(rs.getString("email"));
//                vo.setTitle(rs.getString("title"));
//                vo.setContent(rs.getString("content"));
//                vo.setReadcount(rs.getInt("readcount"));
//                vo.setWritedate(rs.getTimestamp("writedate"));
//            }
//            
//        }catch(Exception e){
//                e.printStackTrace();
//        }finally{
//                DBManager.close(conn, pstmt, rs);
//                
//        }
//        // #68] BoardCheckPassAction으로 가자
//        return vo;
//    }
//    
//    
//    /**
//     * 수정할 내용을 vo에 저장시켜서 
//     * 온다.  
//     */
//    // #88] 글 쓰러 왔다.
//    public void updateBoard(BoardVO vo){
//        String sql="update board set name=?, email=?, pass=?, title=?, content=? where num=?";
//        Connection conn=null;
//        PreparedStatement pstmt = null;
//        
//        try{
//            conn = DBManager.getConnection();
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setString(1, vo.getName());
//            pstmt.setString(2, vo.getEmail());
//            pstmt.setString(3, vo.getPass());
//            pstmt.setString(4, vo.getTitle());
//            pstmt.setString(5, vo.getContent());
//            pstmt.setInt(6, vo.getNum());
//            
//            pstmt.executeUpdate();
//            
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally{
//            DBManager.close(conn, pstmt);
//            
//        }
//        
//    }
//    /**
//     * 글 번호에 해당하는 레코드를 db에서 삭제한다.
//     * @param num
//     */
//    public void deleteBoard(BoardVO vo){
//        String sql="delete from board where num=?";
//        Connection conn=null;
//        PreparedStatement pstmt = null;
//        
//        try{
//            conn = DBManager.getConnection();
//            pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(1, vo.getNum());
//            
//            pstmt.executeUpdate();
//            
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally{
//            DBManager.close(conn, pstmt);
//            
//        }
//    }   
}
