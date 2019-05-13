package org.masterjung.service.register;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.MainDao;
import org.masterjung.dto.UserDto;


public class MemberinfoAction implements Action{
	@Override
	 public Actionforward execute(HttpServletRequest request,HttpServletResponse response) {
					Actionforward forward = new Actionforward();
				 	
				 	HttpSession session=request.getSession();
				 	MainDao maindao = new MainDao();
					UserDto userdto = new UserDto();
			   		
			   		String email = (String)session.getAttribute("email");
			   		System.out.println(email);
			   		
			   		userdto = maindao.userDetail(email);
			   		
			   		if(userdto==null){
			   			System.out.println("회원 정보 보기 실패");
				   		return null;
				   	}
			   		
			   		request.setAttribute("userdto", userdto);
			   		
			   		forward.setRedirect(false);
			   		forward.setPath("/WEB-INF/register/memberinfo.jsp");
			   		return forward;
			}
		}

