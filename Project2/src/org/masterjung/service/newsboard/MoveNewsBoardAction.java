package org.masterjung.service.newsboard;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dto.BoardDto;
import org.masterjung.dto.join.BoardReplyDto;
import org.masterjung.dao.BoardDao;
import org.masterjung.dao.newsboard.NewsDAO;



public class MoveNewsBoardAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		Actionforward forward = null;
    	try {
    		forward = new Actionforward();
    		NewsDAO dao = new NewsDAO();
  		  	List<BoardReplyDto> boardList = dao.getNewsListAndReplyCount(3);
  		  	request.setAttribute("boardList",boardList);
  		  	
  		  	forward.setRedirect(false);
  		  	forward.setPath("/WEB-INF/newsboard/newsMain.jsp");
    	}catch(Exception e){
    		System.out.println(e.getMessage());	
    	}
		return forward;
	}

}
