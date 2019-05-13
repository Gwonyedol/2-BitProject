package org.masterjung.service.imageboard;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.BoardDto;
import org.masterjung.util.GetIp;

public class ImageBoardWriteAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		System.out.println("이미지글쓰기 액션");
		
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("editor1");	
	
		System.out.println(title + writer + content);
		
		HttpSession httpSession = request.getSession(true);
		String email = (String)httpSession.getAttribute("email"); //session값에 null인 닉네임값을 가져오기 위해 not null인 email과 연결
		
		BoardDao dao = new BoardDao();		
		String nick_name = dao.findNickNameByEmail(email);
		GetIp getip = new GetIp();
		String ip = getip.getIp();
		
		BoardDto dto = new BoardDto(4,nick_name,ip,title,content); //not null 값 생성자에 보내기
		
		dao.addBoardContent(dto);
		
		System.out.println(dto.getBoard_list_id());
		System.out.println(dto.getNick_name());
		System.out.println(dto.getCreate_ip());
		System.out.println(dto.getTitle());
		System.out.println(dto.getContent());
				
		Actionforward forward = new Actionforward();
		forward.setRedirect(true);
		forward.setPath("imageboard.ib");
	
		return forward;
	}

}
