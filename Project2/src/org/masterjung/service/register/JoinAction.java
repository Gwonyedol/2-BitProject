package org.masterjung.service.register;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.MainDao;
import org.masterjung.dto.UserDto;



public class JoinAction implements Action{
	

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {

		Actionforward forward = new Actionforward();
		
		MainDao maindao = new MainDao();
		UserDto userdto = new UserDto();
		
		boolean result;
		
		
		
		userdto.setEmail(request.getParameter("email"));
		userdto.setPassword(request.getParameter("password"));
		userdto.setNick_name(request.getParameter("nick_name"));
		userdto.setPhone_number(Integer.parseInt(request.getParameter("phone_number")));
		userdto.setUser_name(request.getParameter("user_name"));
		
		String a = userdto.getEmail();
		System.out.println(a);
		
		
		result = maindao.insertMember(userdto);
		if(result == false) {
			System.out.println("회원가입성공");
		}
		
		//회원가입 성공.
   		forward.setRedirect(false);
   		forward.setPath("/index.jsp");
		return forward;
	}
	
}
