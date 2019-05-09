package org.masterjung.service.qaboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dto.BoardDto;

public class QaWriteOkAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		String title = request.getParameter("title");
		String content = request.getParameter("editor1");
		Object nick_name = request.getAttribute("nick_name");
		
		BoardDto dto = new BoardDto(1,nick_name,ip,title,content);
		
		System.out.println("temp : " + nick_name);
		System.out.println("title : "+title);
		System.out.println("content: " +content);
		
		
		Actionforward forward = new Actionforward();
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/qaboard/qaboard.jsp");
	
		return forward;
	}

}
