package org.masterjung.service.newsboard;

import java.util.List;

import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dao.newsboard.NewsDAO;
import org.masterjung.dto.BoardDto;
import org.masterjung.dto.join.BoardDetailDto;
import org.masterjung.dto.join.ReplyJoinReplyVoteDto;

public class NewsEditAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		Actionforward forward = null;
		try {
			forward = new Actionforward();
			BoardDao dao = new BoardDao();
			BoardDetailDto boardDetailDto = dao.getBoardDetailById(Integer.parseInt(request.getParameter("id")));
			request.setAttribute("dto", boardDetailDto);
			forward.setPath("/WEB-INF/newsboard/newsEdit.jsp");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return forward;
	}

}
