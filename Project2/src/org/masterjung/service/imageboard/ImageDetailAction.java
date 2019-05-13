package org.masterjung.service.imageboard;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.BoardDto;
import org.masterjung.dto.join.BoardDetailDto;
import org.masterjung.dto.join.ReplyJoinReplyVoteDto;


public class ImageDetailAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("게시글 상세보기 액션 도착");
		
		Actionforward forward = new Actionforward();
		BoardDao dao = new BoardDao();
		
		try {
			
			request.setCharacterEncoding("UTF-8");			
			
			int id = Integer.parseInt(request.getParameter("id"));
			BoardDetailDto dto = dao.getBoardDetailById(id);
			
			request.setAttribute("imageList", dto);
			System.out.println("이미지 리스트는" + dto.toString());
			
			forward.setRedirect(false);
			forward.setPath("/WEB-INF/imageboard/imagedetail.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		return forward;
	}
}
 