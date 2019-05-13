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
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserDto userdto = new UserDto(email, password);
		MainDao maindao = new MainDao();
		int result = maindao.isMember(userdto);
		
		if (result == 1) {
			PrintWriter script;
			try {
				script = response.getWriter();
				System.out.println("로그인 성공");				
				UserDto dto = maindao.userDetail(email);
		   		session.setAttribute("email", userdto.getEmail());
		   		session.setAttribute("nick_name", dto.getNick_name());
		   		session.setAttribute("user_image_path", dto.getUser_image_path());
		   		session.setAttribute("user_auth", dto.getUser_auth());
		   		session.setAttribute("user_name", dto.getUser_name());
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
		
		forward.setRedirect(true);
		forward.setPath(".");
		return forward;
	}

}
