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
import org.masterjung.service.imageboard.ImageBoardAction;
import org.masterjung.service.imageboard.ImageBoardDeleteAction;
import org.masterjung.service.imageboard.ImageDetailAction;
import org.masterjung.service.imageboard.ImageWriteEditAction;
import org.masterjung.service.imageboard.ImageWriteEditOkAction;
import org.masterjung.service.imageboard.ImageWriteOkAction;

@WebServlet("*.ib")
public class ImageBoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ImageBoardFrontController() {}
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	response.setContentType("text/html;charset=UTF-8");
   
	Actionforward forward = null; //view 페이지
	Action action = null;		  // 액션처리
	
	String requestURI = request.getRequestURI();
	String contextPath = request.getContextPath();
	String uriCommand = requestURI.substring(contextPath.length());	  
   
	System.out.println("requestURI:" + requestURI + ", contextPath:" + contextPath + ", uri_Command : " + uriCommand);
   
				   
	   if(uriCommand.equals("/imageboard.ib")) { // 이미지 카테고리로 이동
		System.out.println("/imageboard.ib 컨트롤러 작동");
	    action = new ImageBoardAction();
	    forward = action.execute(request, response);
	    
	   }else if(uriCommand.equals("/imagedetail.ib")){ // 게시물 상세보기(클릭)
	   action = new ImageDetailAction();
	   forward = action.execute(request, response);
	    
	   }else if(uriCommand.equals("/imagewrite.ib")){ //글쓰기 화면으로 이동
	   forward = new Actionforward();
	   forward.setRedirect(false);
	   forward.setPath("/WEB-INF/imageboard/imagewrite.jsp");	   
	   
	   }else if(uriCommand.equals("/imagewriteok.ib")){ // 글쓰기 버튼 클릭
		System.out.println("이미지 라잇오케이 컨트롤러 작동");
      	action = new ImageWriteOkAction();
      	System.out.println("ImageWriteOkAction 작동");
   		forward = action.execute(request, response); 
   		
	   }else if(uriCommand.equals("/imagewriteedit.ib")){ // 게시물 수정 화면으로 이동
	  	action = new ImageWriteEditAction();
		forward = action.execute(request, response);
		
	   }else if(uriCommand.equals("/imagewriteeditok.ib")){ // 게시물 수정 완료 버튼 클릭
	  	action = new ImageWriteEditOkAction();
		forward = action.execute(request, response);
		
	   }else if(uriCommand.equals("/imagedelete.ib")){ // 게시물 삭제 버튼 클릭
	  	action = new ImageBoardDeleteAction();
		forward = action.execute(request, response);		
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