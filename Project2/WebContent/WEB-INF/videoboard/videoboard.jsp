<%@page import="org.masterjung.dto.BoardDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>
<!-- 스크립트 -->
<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>


<c:set var="boardlist" value="${requestScope.boardlist}" />

<div class="row">
	<div class="col-6">
		<div class="text-left">
			<h3>플레이 영상 게시판</h3>
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

<!-- BEGIN card -->
<div class="card ">
	<!-- BEGIN card-header -->


	<div class="card-header card-header-inverse">
		<h4 class="card-header-title">Play of the Game</h4>
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
		<table id="datatables-default"
			class="table table-striped table-td-valign-middle table-bordered bg-white">
			<thead>
				<tr>
					<th width="5%">순번</th>
					<th width="30%">제목</th>
					<th width="10%">작성일시</th>
					<th width="10%">글쓴이</th>
					<th width="6%">조회수</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<c:forEach var="board" items="${boardlist}">
						<tr>
							<td>${board.id}</td>
							<td>${board.title}</td>
							<td>${board.date_created}</td>
							<td>${board.nick_name}</td>
							<td>${board.view_count}</td>

						</tr>
					</c:forEach>

				</tr>
				<tr>
					<td>1</td>
					<td>배그 하다가 김재원 만났음</td>
					<td>2011/04/25</td>
					<td>김동현</td>
					<td>61</td>
				</tr>

			</tbody>
		</table>
		<!-- END table -->
	</div>
</div>
<!-- END #content -->


<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>