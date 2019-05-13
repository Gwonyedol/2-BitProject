package ImageBoardDeleteAction.java;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dao.newsboard.NewsDAO;
import org.masterjung.dto.BoardDto;
import org.masterjung.dto.join.BoardReplyDto;

public class ImageBoardAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		
		BoardDao dao = new BoardDao();
		Actionforward forward = new Actionforward();
		
		try {
			List<BoardDto> imageList = null;
			imageList = dao.getBoardListById(4);
		
			request.setAttribute("imageList", imageList);			
			
			forward.setRedirect(false);
			forward.setPath("/WEB-INF/imageboard/imageboard.jsp");
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return forward;
	}

}
