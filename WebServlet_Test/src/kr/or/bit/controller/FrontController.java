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
import kr.or.bit.board.BoardListService;
import kr.or.bit.member.MemberLoginService;
import kr.or.bit.member.MemberLogout;
import kr.or.bit.member.MemberRegisterService;
import kr.or.bit.service.EmpAddService;
import kr.or.bit.service.EmpDeleteService;
import kr.or.bit.service.EmpListService;
import kr.or.bit.service.EmpUpdatePageService;
import kr.or.bit.service.EmpUpdateService;

@WebServlet("*.com")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FrontController() {
		super();
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String url_Command = requestURI.substring(contextPath.length());

		Action action = null;
		ActionForward forward = null;

		if (url_Command.equals("/EmpList.com")) { // EMP조회리스트로 이동
			try {
				action = new EmpListService();
				forward = action.execute(request, response);
				System.out.println("forward 회원리스트 조회");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (url_Command.equals("/EmpAddPage.com")) { // EMP등록 페이지 이동
				forward = new ActionForward();
				forward.setRedirect(false);
				forward.setPath("/WEB-INF/view/EmpAddPage.jsp");
				System.out.println("Controller forward Add Page");
		}else if (url_Command.equals("/EmpAdd.com")) { // EMP등록
			try {
				action = new EmpAddService();
				forward = action.execute(request, response);
				System.out.println("Controller forward Add");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (url_Command.equals("/EmpUpdatePage.com")) { // EMP 수정페이지로 이동 하면서 파라메터 보내준다
			try { 
				action = new EmpUpdatePageService();
				forward = action.execute(request, response);
				System.out.println("Controller forward Update Page");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if (url_Command.equals("/EmpUpdate.com")) { // EMP 수정 버튼 
			try { 
				action = new EmpUpdateService();
				forward = action.execute(request, response);
				System.out.println("Controller forward Update");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (url_Command.equals("/EmpDelete.com")) { // EMP 삭제
			try { 
				action = new EmpDeleteService();
				forward = action.execute(request, response);
				System.out.println("Controller forward delete");
			} catch (Exception e) {
				e.printStackTrace();
			}

			
			
			
		} else if (url_Command.equals("/Main.com")) { // 메인이자 게시판으로 이동
			action = new BoardListService();
			forward = action.execute(request, response);
		} 
		
		else if (url_Command.equals("/Index.com")) { // 로그인페이지(첫화면)으로 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("index.jsp");
		}
		
		
		
		
		
		else if (url_Command.equals("/Register.com")) { // 회원가입 페이지로 이동
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/WEB-INF/view/Register.jsp");
		} else if (url_Command.equals("/RegisterOk.com")) { // 회원가입 처리
			action = new MemberRegisterService();
			forward = action.execute(request, response);
		} else if (url_Command.equals("/LoginOk.com")) { // 회원가입 처리
			action = new  MemberLoginService(); 
			forward = action.execute(request, response);
		} else if (url_Command.equals("/Logout.com")) { // 회원가입 처리
			action = new  MemberLogout();
			forward = action.execute(request, response);
		} 
		
		
		
		
		
		else if (url_Command.equals("/boardWrite.com")) { // 게시판에 글쓰기 화면으로 이동시켜줌
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("/WEB-INF/board/boardwrtie.jsp");
		} else if (url_Command.equals("/boardWriteOk.com")) { // 글쓰기 확인 버튼
			action = new  MemberLogout();
			forward = action.execute(request, response);
		} else if (url_Command.equals("/boardEdit.com")) { // 글쓴거 수정하는 화면으로 이동
			action = new  MemberLogout();
			forward = action.execute(request, response);
		} else if (url_Command.equals("/boardEdit.com")) { // 글쓴거 수정완료 버튼
			action = new  MemberLogout();
			forward = action.execute(request, response);
		} else if (url_Command.equals("/boardEdit.com")) { // 글쓴거 삭제하는 화면으로 이동
			action = new  MemberLogout();
			forward = action.execute(request, response);
		} else if (url_Command.equals("/Logout.com")) { // 글쓴거 삭제완료 버튼
			action = new  MemberLogout();
			forward = action.execute(request, response);
		} 
		
		
		

		if (forward != null) {
			if (forward.isRedirect()) { // true
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dis = request.getRequestDispatcher(forward.getPath());
				dis.forward(request, response);
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

}
