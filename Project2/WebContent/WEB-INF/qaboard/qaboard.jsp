<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/qaboard.css"/>

<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<!-- 콘텐츠 영역 시작-->
<div class="row">
	<div class="col-6">
		<div class="text-left">
			<h3>Q&A</h3>
		</div>
	</div>
	<div class="col-6">	
		<div class="text-right">
			<a href="qawrite.qb"><button type="button" class="btn btn-black m-b-5 m-r-3" id="new_content_button">
			<i class="far fa-edit"></i>&nbsp;새 글 쓰기</button></a>
		</div>
	</div>
</div>

<br>
<div class="row"><!-- 2번째 row 시작 -->
	<div class="col-6">
		<!-- 빈영역 -->
	</div>
	<div class="col-6">
		<div class="input-group mb-3">
		  <input type="text" class="form-control" placeholder="검색어" aria-label="검색어" aria-describedby="basic-addon2">
		  <div class="input-group-append">
		    <button class="btn btn-outline-secondary" type="button"><i class="fas fa-search"></i></button>
		  </div>
		</div>
	</div>
		
</div> <!-- 2번째 row 끝  -->

<div class="row">
	<table class="table table-hover m-b-0">
		<thead>
			<tr>
				<th class="text-center">#</th>
				<th class="text-center">제목</th>
				<th class="text-center"><i class="far fa-thumbs-up"></i>&nbsp;추천수</th>
				
				<th class="text-center">글쓴이</th>
				<th class="text-center">발행일</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td class="text-center">1</td>
				<td>크롬에서 .location.href 에러발생 &nbsp;<span class="badge badge-primary badge-pill">12</span></td>
				<td class="text-center"><i class="far fa-thumbs-up"></i>&nbsp;30</td>
				
				<td class="text-center">마스터정</td>
				<td class="text-center">2019-03-01</td>
			</tr>
		</tbody>
	</table>
</div>




<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>