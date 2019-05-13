package org.masterjung.service.videoboard;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.BoardDto;
import org.masterjung.util.GetIp;
public class VideoBoardWriteAction implements Action {
	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		System.out.println("비디오글쓰기 액션");
		
		String title = request.getParameter("title");
		String content = request.getParameter("editor1");
		
		HttpSession httpSession = request.getSession(true);
		String email = (String)httpSession.getAttribute("email");
			
		BoardDao dao = new BoardDao();
		
		String nick_name = dao.findNickNameByEmail(email);
		GetIp getip = new GetIp();
		String ip = getip.getIp();
		
		BoardDto dto = new BoardDto();
		
		dto.setBoard_list_id(5);
		dto.setNick_name(nick_name);
		dto.setCreate_ip(ip);
		dto.setTitle(title);
		dto.setContent(content);
		
		dao.addBoardContent(dto);
		
		System.out.println(dto.getBoard_list_id());
		System.out.println(dto.getNick_name());
		System.out.println(dto.getCreate_ip());
		System.out.println(dto.getTitle());
		System.out.println(dto.getContent());
		
		
		Actionforward forward = new Actionforward();
		forward.setRedirect(false);
		forward.setPath("/video.vb");
			return forward;
	}
}

