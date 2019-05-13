package org.masterjung.service.videoboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;

import org.masterjung.dto.join.BoardDetailDto;


public class VideoBoardReadAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		
		Actionforward forward = null;
		BoardDao dao = new BoardDao();
		
		try {
			  
			  request.setCharacterEncoding("UTF-8");
			  
			  int id = Integer.parseInt(request.getParameter("id"));
			  BoardDetailDto dto = dao.getBoardDetailById(id);
  
			  request.setAttribute("result", dto);
			  
			  forward = new Actionforward();
			  forward.setRedirect(false);
			  forward.setPath("/WEB-INF/videoboard/videocontent.jsp");
		  	  
	  }catch (Exception e) {
		e.printStackTrace();
	  }	
	  
	
		return forward;
		
	}

}
