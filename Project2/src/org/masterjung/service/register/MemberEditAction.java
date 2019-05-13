package org.masterjung.service.register;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.MainDao;
import org.masterjung.dto.UserDto;

public class MemberEditAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");

		Actionforward forward = null;
		String fileName = "";
		String fileName2 = "";
		
		
		try {
			Part part = request.getPart("upload");
			if (part.getHeader("Content-Disposition").contains("filename=")) {
				 fileName = part.getSubmittedFileName();
				 
				System.out.println("filename : " + fileName);
				fileName2="upload/"+fileName;
				fileName = "/upload/"+fileName;
				if (part.getSize() > 0) {
					part.write(request.getSession().getServletContext().getRealPath(fileName));
					part.delete();
				}
			}	
			 
			System.out.println(fileName2);
			forward = new Actionforward();
			MainDao md = new MainDao();
			UserDto ud = new UserDto();
			
			System.out.println("액션에서 파라미터받음");
			System.out.println(request.getParameter("email"));
			
			ud.setEmail(request.getParameter("email"));
			ud.setNick_name(request.getParameter("nick_name"));
			ud.setPhone_number(Integer.parseInt(request.getParameter("phone_number")));
			ud.setUser_name(request.getParameter("user_name"));
			ud.setUser_address(request.getParameter("user_address"));
			
			ud.setUser_auth(Integer.parseInt(request.getParameter("user_auth")));
			ud.setUser_image_path(fileName2);
			
			
			
			int result = md.editUser(ud);
			
			if(result > 0 ) {
				System.out.println(result);
			}else {
				System.out.println(result);
			}
			
			forward.setRedirect(false);
	   		forward.setPath("/index.reg");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return forward;
	}

}
