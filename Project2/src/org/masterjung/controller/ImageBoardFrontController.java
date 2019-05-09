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



@WebServlet("*.ib")
public class ImageBoardFrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;


   public ImageBoardFrontController() {}

   private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   response.setContentType("text/html;charset=UTF-8");
       String requestURI = request.getRequestURI();
       String contextPath = request.getContextPath();
       String uriCommand = requestURI.substring(contextPath.length());	   
	   Actionforward forward = null;
       Action action = null;
       
       System.out.println("requestURI: " + requestURI);
       System.out.println("contextPath: " + contextPath);
       System.out.println("uri_Command : " + uriCommand);
       
       try {    	
       if(uriCommand.equals("/imageboard.ib")) {
           action = new ImageBoardAction();
           forward = action.execute(request, response);
           
       }else if(uriCommand.equals("/image_UPloadForm.ib")) {
           action = new ImageBoardAction();
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