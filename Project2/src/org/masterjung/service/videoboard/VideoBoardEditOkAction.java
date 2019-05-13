package org.masterjung.service.videoboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.BoardDto;

public class VideoBoardEditOkAction implements Action{

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		Actionforward forward = null;
		BoardDao dao = new BoardDao();
		BoardDto dto = new BoardDto();
		
		String fid = request.getParameter("id");
		int id = Integer.parseInt(fid);
		String title = request.getParameter("title");
		String content = request.getParameter("editor1");
		String upload = request.getParameter("upload");
				
		dto.setId(id);
		dto.setTitle(title);
		dto.setContent(content);
		dto.setFile_path(upload);

		dao.updateBoardContent(dto);
		
		
	    forward = new Actionforward();
	    forward.setRedirect(false);
	    forward.setPath("videoread.vb?id="+id);
		
	
		return forward;
	}

}
