package org.masterjung.ajax.qaboard;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.masterjung.dao.BoardDao;


@WebServlet("/QaRecommand.qajax")
public class QaRecommand extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public QaRecommand() {}
    
    
    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {    	
    	BoardDao dao = new BoardDao();
    	HttpSession sesstion = request.getSession(true);
    	String content_voter = (String) sesstion.getAttribute("nick_name");
    	int boardid =  Integer.parseInt(request.getParameter("reply_id"));
    	System.out.println(boardid);
    	System.out.println(content_voter);
    	int resultrow = dao.insertVoteCount(boardid, content_voter);
    	   	
    	PrintWriter out = response.getWriter();
    	if(resultrow != -1) {
    		out.print("success");
    	}else {
    		out.print("update error");
    	}
    	
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
