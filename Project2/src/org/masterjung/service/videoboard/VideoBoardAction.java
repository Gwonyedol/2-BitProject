package org.masterjung.service.videoboard;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.videoboard.VideoDao;
import org.masterjung.dto.BoardDto;

public class VideoBoardAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("비디오 보드 액션");
		Actionforward forward = null;

		try {
			
			VideoDao dao = new VideoDao(); 
			List<BoardDto> videolist = dao.getVideoList();
			request.setAttribute("videolist", videolist);
			
			forward = new Actionforward();
			forward.setRedirect(false); // forward 방식
			forward.setPath("/WEB-INF/videoboard/videoboard.jsp");

			System.out.println("조회완료");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return forward;

	}
}
