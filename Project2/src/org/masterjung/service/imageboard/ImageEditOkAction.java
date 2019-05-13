package org.masterjung.service.imageboard;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.BoardDto;
import org.masterjung.util.GetIp;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class ImageEditOkAction implements Action {

		
		Actionforward forward = new Actionforward();
		BoardDto dto = new BoardDto();	
		BoardDao dao = new BoardDao();
		
		String realfolder; 				//프로젝트 내에 만들어질 폴더를 저장할 변수 선언 
		String savefolder ="/upload";   //실제 만들어질 폴더명을 선언
		String utf8 = "utf-8";		    //한글설정 
		int maxSize = 1024*1024*10; 	//저장될 파일 사이즈 설정 -- 10메가
		
		String title="";
		String content="";
		@Override
		public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
			// TODO Auto-generated method stub
			return null;
		}
		
}
