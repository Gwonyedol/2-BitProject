package org.masterjung.service.videoboard;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dao.videoboard.VideoDao;
import org.masterjung.dto.BoardDto;

public class VideoBoardAction implements Action {

	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {

		VideoDao dao = new VideoDao(); //비디오 리스트만 비디오 다오 사용함..
		List<BoardDto> videolist;
		Actionforward forward = new Actionforward();
		
		
		try {
			
			videolist = dao.getVideoList();
			
			
			request.setAttribute("videolist", videolist);
			System.out.println(videolist.size());

			forward.setRedirect(false);
			forward.setPath("/WEB-INF/videoboard/videoboard.jsp");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return forward;

	}
}
