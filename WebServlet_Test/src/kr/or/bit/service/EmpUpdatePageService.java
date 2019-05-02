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
		  	  
		  	  
		  	  Empdao dao = new Empdao();
		  	  Empdto result = dao.updatefromEmp(empno);
		  	  
			/*
			 * String ename = result.getEname(); String job = result.getJob(); int mgr =
			 * result.getMgr(); String hiredate = result.getHiredate(); int sal =
			 * result.getSal(); int comm = result.getComm(); int deptno =
			 * result.getDeptno();
			 * 
			 * 
			 * request.setAttribute("ename", ename); request.setAttribute("job", job);
			 * request.setAttribute("mgr", mgr); request.setAttribute("hiredate", hiredate);
			 * request.setAttribute("sal", sal); request.setAttribute("comm", comm);
			 * request.setAttribute("deptno", deptno); request.setAttribute("empno", empno);
			 */
		  	  request.setAttribute("result", result);
			  forward = new ActionForward();
			  forward.setRedirect(false);
			  forward.setPath("/WEB-INF/view/EmpUpdatePage.jsp");
		  	  
	  }catch (Exception e) {
		e.printStackTrace();
	  }	
	  
	
		return forward;
		
		
	}

}
