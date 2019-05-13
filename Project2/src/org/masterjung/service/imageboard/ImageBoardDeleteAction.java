package org.masterjung.service.imageboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;

public class ImageBoardDeleteAction implements Action{

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("이미지 보드 삭제 액션 동작");
		
		Actionforward forward = new Actionforward();
		
		try {
			
			int strBoardid = Integer.parseInt(request.getParameter("id"));			
			int boardid = strBoardid;
			int resultrow = new BoardDao().deleteFakeBoardContent(boardid);
			
			
			forward.setRedirect(true);
			forward.setPath("imageboard.ib");	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
		return forward;
	}

}
