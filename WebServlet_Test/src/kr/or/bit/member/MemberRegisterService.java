package kr.or.bit.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.Empdao;

public class MemberRegisterService implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		  ActionForward	forward = null;
		  try {
			  
			  
				  request.setCharacterEncoding("UTF-8");
				  
				  String Mid = request.getParameter("Mid");
			  	  String Mpwd = request.getParameter("Mpwd");
			  	  String etc = request.getParameter("etc");
			  	  
			  	  
			  	  MemberDAO dao = new MemberDAO();
			  	  int result = dao.MemberAdd(Mid, Mpwd, etc);
			  	  
			  	  String msg="";
			  	  String url="";
			  	  
			  	  if(result > 0) {
			  		  msg ="등록성공";
			  		  url ="index.com";
			  	  }else { //-1 (제약, 컬럼길이 문제)
			  		  msg ="등록실패";
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

