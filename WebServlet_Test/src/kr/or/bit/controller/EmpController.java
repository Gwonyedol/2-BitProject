package kr.or.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.bit.action.Action;
import kr.or.bit.action.ActionForward;
import kr.or.bit.service.EmpListService;




@WebServlet("*.EMP")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EmpController() {
        super();
    }
    
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String url_Command = requestURI.substring(contextPath.length());
	
    	Action action = null;
    	ActionForward forward = null;
    	
    	if(url_Command.equals("/EmpSearch.EMP")) { //회원조회(리스트)
    		try {
    			action = new EmpListService();
	    		forward = action.execute(request, response);
	        	System.out.println("forward 회원리스트 조회");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    		
    		
    	}else if(url_Command.equals("/EmpAdd.EMP")) { //회원 등록
	    	try {	
	        		forward = action.execute(request, response);
	        		System.out.println("forward 목록보기");
			}catch(Exception e) {
				e.printStackTrace();
			}
    	}else if(url_Command.equals("/EmpEdit.EMP")) { //회원 수정
    		try {
	    			forward = action.execute(request, response);
	        		System.out.println("forward ID 검색하기");
			}catch(Exception e) {
					e.printStackTrace();
			}
    	}else if(url_Command.equals("/EmpDelete.EMP")) { //회원 삭제
    		//UI 제공  //지금은 없는 서비스 .... 만약 ...
    		forward = new ActionForward();
    		forward.setRedirect(false);
    		forward.setPath("/WEB-INF/views/MemoWrite.jsp");

    	}
    	
    	
    	
    	if(forward != null) {
    		if(forward.isRedirect()) { //true
    			response.sendRedirect(forward.getPath());
    		}else {
    			RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
    			dis.forward(request, response);
    		}
    	}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

}
