package org.masterjung.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.service.newsboard.MoveNewsBoardAction;
import org.masterjung.service.newsboard.NewsDeleteAction;
import org.masterjung.service.newsboard.NewsDeleteOkAction;
import org.masterjung.service.newsboard.NewsDetailAction;
import org.masterjung.service.newsboard.NewsEditAction;
import org.masterjung.service.newsboard.NewsEditOkAction;
import org.masterjung.service.newsboard.NewsReplyDeleteAction;
import org.masterjung.service.newsboard.NewsReplyUpdateAction;
import org.masterjung.service.newsboard.NewsReplyWriteAction;
import org.masterjung.service.newsboard.NewsWriteOkAction;


@MultipartConfig(
		location = "../../../../wtpwebapps/GameCommunityMVC/uploads",
		maxFileSize = -1,
		maxRequestSize = -1,
		fileSizeThreshold = -1
)
@WebServlet("*.nb")
public class NewsBoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public NewsBoardFrontController() {
    	
        super();
    }


    private void doProcess(HttpServletRequest request, HttpServletResponse response) {
    	response.setContentType("text/html;charset=UTF-8");
    	String requestURI = request.getRequestURI();
    	String contextPath = request.getContextPath();
    	String url_Command = requestURI.substring(contextPath.length());
    	Actionforward forward = new Actionforward();
    	Action action = null;
    	try {
    	if(url_Command.equals("/newboard.nb")) {
    		action = new MoveNewsBoardAction();
    		forward = action.execute(request, response);
    	}else if(url_Command.equals("/moveWrite.nb")){
    		forward = new Actionforward();
    		forward.setRedirect(false);
    		forward.setPath("/WEB-INF/newsboard/newsWrite.jsp");
    	}else if(url_Command.equals("/writeOk.nb")) {
    		action = new NewsWriteOkAction();
    		forward = action.execute(request, response);
    	}else if(url_Command.equals("/newsDetail.nb")) {
    		action = new NewsDetailAction();
    		forward = action.execute(request, response);
    	}else if(url_Command.equals("/editboard.nb")) {
    		action = new NewsEditAction();
    		forward = action.execute(request, response);
    	}else if(url_Command.equals("/eidtOk.nb")) {
    		action = new NewsEditOkAction();
    		forward = action.execute(request, response);
    	}else if(url_Command.equals("/Insert.nb")) {
    		action = new NewsReplyWriteAction();
    		forward = action.execute(request, response);
    	}else if(url_Command.equals("/deletereply.nb")) {
    		action = new NewsReplyDeleteAction();
    		forward = action.execute(request, response);
    	}else if(url_Command.equals("/updatereply.nb")) {
    		action = new NewsReplyUpdateAction();
    		forward = action.execute(request, response);
    	}else if(url_Command.equals("/deleteboardok.nb")) {
    		action = new NewsDeleteOkAction();
    		forward = action.execute(request, response);    		
    	}else if(url_Command.equals("/deleteboard.nb")) {
    		action = new NewsDeleteAction();
    		forward = action.execute(request, response); 
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
    		e.getStackTrace();
    	}
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
