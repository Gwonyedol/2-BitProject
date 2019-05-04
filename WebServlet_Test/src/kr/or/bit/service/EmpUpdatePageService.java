package kr.or.bit.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.dao.Empdao;
import kr.or.bit.dto.Empdto;

public class EmpUpdatePageService implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		ActionForward forward = null;
		
		
		try {
			  
			  request.setCharacterEncoding("UTF-8");
			  
			  	 int empno = Integer.parseInt(request.getParameter("empno"));
		  	  	 int sal = Integer.parseInt(request.getParameter("sal"));
		  	  	 String ename = request.getParameter("ename");
				 String job =request.getParameter("job");
				 int mgr = Integer.parseInt(request.getParameter("mgr"));
				 String hiredate = request.getParameter("hiredate");
				 int comm = Integer.parseInt(request.getParameter("comm"));
				 int deptno = Integer.parseInt(request.getParameter("deptno"));
  
			  request.setAttribute("ename", ename); 
			  request.setAttribute("job", job);
			  request.setAttribute("mgr", mgr); 
			  request.setAttribute("hiredate", hiredate);
			  request.setAttribute("sal", sal); 
			  request.setAttribute("comm", comm);
			  request.setAttribute("deptno", deptno); 
			  request.setAttribute("empno", empno);

			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("/WEB-INF/view/EmpUpdatePage.jsp");
		  	  
	  }catch (Exception e) {
		e.printStackTrace();
	  }	
	  
	
		return forward;
		
		
	}

}
