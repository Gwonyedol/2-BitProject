package org.masterjung.service.tipboard;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.BoardDto;
import org.masterjung.dto.join.BoardReplyDto;

public class TipBoardAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		Actionforward forward = new Actionforward();
		try {
			BoardDao dao = new BoardDao();
//			List<BoardDto> resultList;
			List<BoardReplyDto> resultList = null;
			resultList = dao.getNewsListAndReplyCount(2);
		
			request.setAttribute("board", resultList);
			
			forward.setRedirect(false);
			forward.setPath("/WEB-INF/tipboard/tipboard.jsp");

		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forward;
	}

}
