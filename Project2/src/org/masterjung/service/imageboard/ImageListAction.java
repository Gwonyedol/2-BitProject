package org.masterjung.service.imageboard;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dao.imageboard.ImageDAO;
import org.masterjung.dao.newsboard.NewsDAO;
import org.masterjung.dto.BoardDto;
import org.masterjung.dto.BoardListDto;

public class ImageListAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response){
		
		Actionforward forward = null;
		
		String url = "board/boardList.jsp";
		try {
    		forward = new Actionforward();
    		ImageDAO dao = new ImageDAO();
        //#8] dao의 db에 있는 모든 글을 가져오자!
        List<BoardDto> imagelist = dao.getImageList();
        //#11] dao에서 list에 글을 담아서 왔다.
        
        request.setAttribute("imagelist", imagelist);
        
        //#12] boardList.jsp로 이동하자
        request.getRequestDispatcher(url).forward(request, response);

		}catch(Exception e){
    		System.out.println(e.getMessage());	
    	}
		return forward;
	}

}
