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
	
<c:set var="boardlist" value="${requestScope.videolist}" />
<!-- BEGIN card -->
<div class="card ">
	<!-- BEGIN card-header -->


	<div class="card-header card-header-inverse">
		<h4 class="card-header-title">POTG</h4>
		<div class="card-header-btn">
			<a href="#" data-toggle="card-expand" class="btn btn-success"><i
				class="fa fa-expand"></i></a> <a href="#" data-toggle="card-refresh"
				class="btn btn-warning"><i class="fa fa-redo"></i></a> <a href="#"
				data-toggle="card-remove" class="btn btn-danger"><i
				class="fa fa-trash-alt"></i></a>
		</div>
	</div>
	<!-- END card-header -->
	<div class="card-body">
		<!-- BEGIN table -->
		<table class ="type1">
			<tbody>
				<tr>
					<td>
						<div class="vdcard">
							<img src="${pageContext.request.contextPath}/resource/img/potg2.png" alt="Avatar"
								style="width: 340px; height: 240px; display: block; margin: 0px auto;"
								id = "vdimg">
							<div class="vdcontainer">
								<h4>
									<b>기후니님의 POTG</b>
								</h4>
								<p>2019.03.02</p>
							</div>
						</div>

					</td>
						<td>							
						<div class="vdcard">
<%-- 							<img src="${pageContext.request.contextPath}/upload/img_avatar2.png" alt="Avatar"
								style="width: 340px; height: 240px; display: block; margin: 0px auto;"
								id = "vdimg"> --%>
							 <video width="340" height="240" controls>
                            <source src="${pageContext.request.contextPath}/resource/img/오리사.mp4" type="video/mp4" style="display: block; margin: 0px auto;"
								id = "vdimg"></video>
							<div class="vdcontainer">
								<h4>
									<b>과즙뿜뿜동현이의 오리사</b>
								</h4>
								<p>2019.03.08</p>
							</div>
						</div>
					</td>
					</tr>


			</tbody>
		</table>
		
		
		
				<table id="datatables-default"
			class="table table-striped table-td-valign-middle table-bordered bg-white">
			<thead>
				<tr>
					<th width="5%">순번</th>
					<th width="28%">제목</th>
					<th width="4%">추천</th>
					<th width="8%">작성일시</th>
					<th width="8%">글쓴이</th>
					<th width="8%">조회수</th>

				</tr>
			</thead>
			<tbody>
		
					<c:forEach var="board" items="${boardlist}" varStatus="status">
						<tr style="cursor:hand;" onclick="location.href='videoread.vb?id=${board.id}'">
							<td>${status.count}</td>
							<td>${board.title}</td>
							<td>${board.vote_count}</td>
							<td>${board.date_created}</td>
							<td>${board.nick_name}</td>
							<td>${board.view_count}</td>

						</tr>
					</c:forEach>

			</tbody>
		</table>
		<!-- END table -->
	</div>
</div>



<!-- END #content -->


<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>