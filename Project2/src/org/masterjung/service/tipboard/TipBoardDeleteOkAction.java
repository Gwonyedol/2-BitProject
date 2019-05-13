package org.masterjung.service.tipboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.BoardDto;

public class TipBoardDeleteOkAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		BoardDao dao = new BoardDao();
		Actionforward forward = new Actionforward();

		try {
			String strid = request.getParameter("id");
			int id = Integer.parseInt(strid);
			dao.deleteFakeBoardContent(id);

			forward.setRedirect(true);
			forward.setPath("tipboard.tb?id=" + id);

		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		return forward;
}
}