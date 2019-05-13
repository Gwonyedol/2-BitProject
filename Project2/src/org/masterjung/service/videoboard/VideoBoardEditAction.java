package org.masterjung.service.videoboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.BoardDto;

public class VideoBoardEditAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		Actionforward forward = null;
				
		BoardDao dao = new BoardDao();
		
		String fid = request.getParameter("id");
		int id = Integer.parseInt(fid);
		
		BoardDto dto = dao.getInfoEditById(id);
		request.setAttribute("result", dto);
		
		
	    forward = new Actionforward();
	    forward.setRedirect(false);
	    forward.setPath("/WEB-INF/videoboard/videoedit.jsp");
	    
	    return forward;
	}

}
