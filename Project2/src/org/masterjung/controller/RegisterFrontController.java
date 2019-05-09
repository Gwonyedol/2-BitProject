package org.masterjung.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.service.register.JoinAction;
import org.masterjung.service.register.LoginAction;



@WebServlet("*.reg")
public class RegisterFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegisterFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

    private void doProcess(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html;charset=UTF-8");
    	String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String url_Command = requestURI.substring(contextPath.length());
    	
    	Actionforward forward = null;
    	Action action = null;
    	
    	try {
    		if(url_Command.equals("/login.reg")){
        		action = new LoginAction();
        		forward = action.execute(request, response);
    		}else if(url_Command.equals("/registerform.reg")) {
        		forward = new Actionforward();
        		forward.setRedirect(false);
        		forward.setPath("/WEB-INF/register/register.jsp");
    		}else if(url_Command.equals("/index.reg")) {
        		forward = new Actionforward();
        		forward.setRedirect(false);
        		forward.setPath("/index.jsp");
    		}else if(url_Command.equals("/register.reg")) {
    			System.out.println("함수전");
    			action = new JoinAction();
    			System.out.println("함수후");
        		forward = action.execute(request, response);
    		}else if(url_Command.equals("/memberinfo.reg")) {
        		forward = new Actionforward();
        		forward.setRedirect(false);
        		forward.setPath("/WEB-INF/register/memberinfo.jsp");
    		}else if(url_Command.equals("/gomemberedit.reg")) {
        		forward = new Actionforward();
        		forward.setRedirect(false);
        		forward.setPath("/WEB-INF/register/memberedit.jsp");
    		}
    		
        	if(forward != null) {
        		if(forward.isRedirect()) { //true
        			response.sendRedirect(forward.getPath());
        		}else {
        			RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
        			dis.forward(request, response);
        			}
        	}
    	}catch(Exception e) {
    		
    	}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
