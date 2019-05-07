package kr.or.bit.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;

public class MemberLoginService implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		ActionForward forward = null;
		MemberDAO dao = null ;
		MemberDTO dto = null ;
		HttpSession session = request.getSession();
		try {
			  
			  request.setCharacterEncoding("UTF-8");
			  

		  	  	 String Mid = request.getParameter("Mid"); // 사용자가 iD를 yeji로 입력했고
				 String Mpwd =request.getParameter("Mpwd"); // 비밀번호를 1234로 입력했을때
				 
				 dao = new MemberDAO();
				 dto = dao.loginok(Mid); // sql에 yeji를 검색함
				 
				 
				 String id = dto.getMid(); //yeji에 해당되는 id가 있으면 yeji가 담기고 없으면 null이 담긴다
				 String pwd = dto.getMpwd(); //id에 해당되는 pwd가 있다면 담긴다.(비밀번호가 1234가 아닐수도 있음)
				 
				 
				 
			  	  String msg="";
			  	  String url="";
			  	  
/*			  	  if(id == null) { //db에 아이디가 없을때
			  		  msg ="해당 아이디가 존재하지 않습니다.";
			  		  url ="index.EMP";
			  	  }else if (id == Mid){  //db에 아이디가 로그인폼의 아이디와 같을때
			  		  if(pwd == null) {
				  		  msg ="비밀번호를 입력하세요";
				  		  url ="index.EMP";
			  		  } else if(pwd != Mpwd) {
				  		  msg ="비밀번호 틀렸어요";
				  		  url ="index.EMP";
			  		  } else if(pwd == Mpwd) {

			  		  }
			  	  }*/
			  	  
			  	  
			  	  if(Mid.equals(id) && Mpwd.equals(pwd)) {
			  		  msg ="로그인 성공";
			  		  url ="Main.com";
			  		  session.setAttribute("Userid", id);
			  	  }else {
			  		  msg ="실패";
			  		  url ="index.com";
			  	  }
			  	  
			  	  
			  	  request.setAttribute("board_msg", msg);
			  	  request.setAttribute("board_url", url);
			  	  
			  	  forward = new ActionForward();
			  	  forward.setRedirect(false); //forward 방식
			  	  forward.setPath("/WEB-INF/view/redirect.jsp");

		  	  
	  }catch (Exception e) {
		e.printStackTrace();
	  }	
	  
	
		return forward;
		
		
	}
	}
	


