package org.masterjung.service.imageboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.BoardDto;

public class ImageEditAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("이미지 수정 액션 도착");
		
		BoardDao dao = new BoardDao();
		String strId = request.getParameter("id");
		int id = Integer.parseInt(strId);
		BoardDto dto = dao.getInfoEditById(id);
		request.setAttribute("imageList", dto);

		Actionforward forward = new Actionforward();
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/imageboard/imageedit.jsp");

		return forward;
	}

}
