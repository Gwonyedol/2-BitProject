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
import org.masterjung.service.videoboard.VideoBoardAction;

/**
 * Servlet implementation class VideoBoardFrontController
 */
@WebServlet("*.vb")
public class VideoBoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public VideoBoardFrontController() {}

    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Actionforward forward = null;
    	Action action = null;
    	
    	String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String uriCommand = requestURI.substring(contextPath.length());
    	
    	System.out.println("requestURI: " + requestURI);
    	System.out.println("contextPath: " + contextPath);
    	System.out.println("uri_Command>" + uriCommand+"<");
    	
    	
    	if(uriCommand.equals("/video.vb")) {
       		action = new VideoBoardAction();
    		forward = action.execute(request, response);

    	}else if(uriCommand.equals("/videowrite.vb")){
    		forward = new Actionforward();
    		forward.setRedirect(false);
    		forward.setPath("//WEB-INF/video/videowrite.jsp");
    		
    	}
    	
    	if(forward != null) {
    		if(forward.isRedirect()) {
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
		doProcess(request, response);
	}

}
