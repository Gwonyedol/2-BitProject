package org.masterjung.service.imageboard;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.newsboard.NewsDAO;
import org.masterjung.dto.BoardDto;



public class ImageBoardAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		Actionforward forward = null;
		try {
			forward = new Actionforward();
			NewsDAO dao = new NewsDAO();		
			List<BoardDto> boardList = dao.getNewsList();
			
			request.setAttribute("imageboardList",boardList);
			
			forward.setRedirect(false);		
			forward.setPath("/WEB-INF/imageboard/image.jsp");
		}catch(Exception e){
    		System.out.println(e.getMessage());	
		}
		return forward;
	}

}
