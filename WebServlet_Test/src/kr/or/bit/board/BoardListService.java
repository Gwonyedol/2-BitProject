package kr.or.bit.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;

public class BoardListService implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = null;
		
		forward = new ActionForward(); //BoardListService
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/view/Main.jsp");

		return forward;
	}

}
