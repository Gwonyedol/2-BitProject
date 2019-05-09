package org.masterjung.service.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.MainDao;
import org.masterjung.dto.UserDto;

public class LoginAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		Actionforward forward = new Actionforward();

		HttpSession session = request.getSession();

		MainDao maindao = new MainDao();
		UserDto userdto = new UserDto();
		
		
		
		String id = request.getParameter("email");
		System.out.println(id);
		
		userdto.setEmail(request.getParameter("email"));
		userdto.setPassword(request.getParameter("password"));
		int result = maindao.isMember(userdto);
		System.out.println(result);
		if (result == 1) {
			PrintWriter script;
			try {
				script = response.getWriter();
				System.out.println("로그인 성공");
				//로그인 성공
				System.out.println(userdto.getEmail());
		   		session.setAttribute("email", userdto.getEmail());
		   		session.setAttribute("nick_name", userdto.getNick_name());
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (result == 0) {
			PrintWriter script;
			try {
				script = response.getWriter();
				System.out.println("비밀번호가 틀림");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (result == -1) {
			PrintWriter script;
			try {
				script = response.getWriter();
				System.out.println("없는 아이디입니다");
			} catch (IOException e) {
				e.printStackTrace();
			}

		} else if (result == 2) {
			PrintWriter script;
			try {
				script = response.getWriter();
				System.out.println("db오류발생");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		forward.setRedirect(false);
		forward.setPath("/index.jsp");
		return forward;
	}

}
