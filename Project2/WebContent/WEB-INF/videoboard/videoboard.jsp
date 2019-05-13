<%@page import="org.masterjung.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/videolist.css" />	
<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<c:set var="boardlist" value="${requestScope.videolist}" />


<div class="row">
	<div class="col-6">
		<div class="text-left">
			<h3>
			<i class="fas fa-lg fa-fw m-r-10 fa-video"></i><span
			class="text-inverse">Play of the Game video</span>
			</h3>
		</div>
	</div>
	<div class="col-6">
		<div class="text-right">
			<button type="button" onclick="location.href='videowrite.vb'" class="btn btn-black m-b-5 m-r-3"
				id="new_content_button" >
				<i class="far fa-edit"></i>&nbsp;새 글 쓰기
			</button>
		</div>
	</div>
</div>
	<hr>
	
			<table class="table m-b-0">
								<tbody>
								<c:forEach var="board" items="${boardlist}" varStatus="status">
									<tr style="cursor:hand;" onclick="location.href='videoread.vb?id=${board.id}'">
									
										<td class = "type2" width="45%">	
<%-- 										 <video width="350" height="220" muted>
                           				 <source src="${pageContext.request.contextPath}/resource/img/오리사.mp4" type="video/mp4" style="display: block; margin: 0px auto;"
										 id = "vdimg"></video> --%>
										 
												<c:choose>
												<c:when test="${board.file_path=='upload/'}"></c:when>
												<c:otherwise>
												<video width="400" height="250" muted>
                    							<source src="${board.file_path}" type="video/mp4" style="display: block; margin: 0px auto;"
												></video>
												</c:otherwise>
												</c:choose> 
												
										</td>
										
										<td width="55%">
										
										<div style = "font-family: '맑은고딕'; font-size: 30px;">
										${board.title}
										</div>
										<div style = "color : #505050; font-size: 13px;">
										${board.nick_name} • 조회수 ${board.view_count} 회  • 추천수 ${board.vote_count} 회 • ${board.date_created} 
										</div>
										
										</td>
									</tr>
								</c:forEach>
								</tbody>				
			</table>
	

<!-- END #content -->


<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>