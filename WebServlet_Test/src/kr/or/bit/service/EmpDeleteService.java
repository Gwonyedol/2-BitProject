package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.Empdao;

public class EmpDeleteService implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		  ActionForward	forward = null;
		  try {
			  
			  	  System.out.println("사원 삭제 서비스");
				  request.setCharacterEncoding("UTF-8");
				  
				  System.out.println(request.getParameter("empno"));
			  	  int empno = Integer.parseInt(request.getParameter("empno"));
			  	  System.out.println(empno);
			  	  
			  	  Empdao dao = new Empdao();
			  	  int result = dao.deleteEmp(empno);
			  	  
			  	  String msg="";
			  	  String url="";
			  	  
			  	  if(result > 0) {
			  		  msg ="삭제성공";
			  		  url ="EmpList.com";
			  	  }else { //-1 (제약, 컬럼길이 문제)
			  		  msg ="수정실패";
			  		  url ="EmpList.com";
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
