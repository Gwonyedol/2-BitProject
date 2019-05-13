package org.masterjung.service.qaboard;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.masterjung.action.Action;
import org.masterjung.action.Actionforward;
import org.masterjung.dao.BoardDao;
import org.masterjung.dto.join.BoardReplyDto;
import org.masterjung.util.Pagination;

public class QaboardAction implements Action {
	Pagination pagination = new Pagination();
	@Override
	public Actionforward execute(HttpServletRequest request, HttpServletResponse response) {
		
		int totalPage=0;
		int startPageBlock=0;
		int endPageBlock=0;
		BoardDao dao = new BoardDao();
		int totalListCount = dao.getCountContent(1);
		List<BoardReplyDto> resultList = null;
		
		
		if(request.getParameter("cp")!=null) {
			System.out.println("0번루트");
			String cp = request.getParameter("cp");
			int curPage = Integer.parseInt(cp);
			pagination.setCurPage(curPage);
		}
		
		if(request.getParameter("select")!=null) {
			System.out.println("1번루트");
			String select = request.getParameter("select");
			int pageSize = Integer.parseInt(select);
			pagination.setPageSize(pageSize);
			
			totalPage = pagination.totalPage(totalListCount, pagination.getPageSize());
			startPageBlock = pagination.startPageBlock(pagination.getCurPage(), pagination.getPageSize());
			endPageBlock = pagination.endPageBlock(pagination.getCurPage(), pagination.getPageSize(), totalPage);
		
		}else {
			System.out.println("2번루트");
			pagination.setPageSize(10);
			pagination.setCurPage(1);
			totalPage = pagination.totalPage(totalListCount, pagination.getPageSize());
			startPageBlock = pagination.startPageBlock(pagination.getCurPage(), pagination.getPageSize());
			endPageBlock = pagination.endPageBlock(startPageBlock, pagination.getPageSize(), totalPage);
		}
		
		int printStart = pagination.printStart(pagination.getCurPage(), pagination.getPageSize());
		int printEnd = pagination.printEnd(pagination.getCurPage(), pagination.getPageSize());
		resultList = dao.getContentList(1, printStart, printEnd);
		request.setAttribute("curPage", pagination.getCurPage());
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("startPageBlock", startPageBlock);
		request.setAttribute("endPageBlock", endPageBlock);
		
		request.setAttribute("result", resultList);
		
		Actionforward forward = new Actionforward();
		forward.setRedirect(false);
		forward.setPath("/WEB-INF/qaboard/qaboard.jsp");
	
		return forward;
	}

}
