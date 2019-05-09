package org.masterjung.service.imageboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dto.BoardDto;

public class ImageWriteAction implements Action {
    //#31] request에 담긴 내용을 꺼내서 db에 쓰자!
	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
//        BoardDto vo = new BoardVO();
//        vo.setName(request.getParameter("name"));
//        vo.setPass(request.getParameter("pass"));
//        vo.setEmail(request.getParameter("email"));
//        vo.setTitle(request.getParameter("title"));
//        vo.setContent(request.getParameter("content"));
//        
//                        //#32] 글 삽입하러 가자
//        BoardDAO.getInstance().insertBoard(vo);
//        
//        
//        // #35] DB에 insert 하고 왔다 --> 글 목록으로 가보자!
//        //목록으로 가자!-프론트를 거치지 않고 바로 직행하는 방법으로 갈 거다!
//        
//        // #36] 목록보기로 넘어가자 --> boardList.jsp
//        new BoardListAction().execute(request, response);
        
        return null;
    }
 
}


