package org.masterjung.service.tipboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.join.BoardDetailDto;

public class TipBoardEditAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		Actionforward forward = null;
		try {
			forward = new Actionforward();
			BoardDao dao = new BoardDao();
			BoardDetailDto board = dao.getBoardDetailById(Integer.parseInt(request.getParameter("id")));
			request.setAttribute("board", board);
			
			forward.setPath("/WEB-INF/tipboard/tipboardedit.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return forward;
	}

}
