<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>  
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<!-- 콘텐츠 영역 시작-->
<div class="row">
	<div class="col-6">
		<div class="text-left">
		<h4>
			<i class="fas fa-lg fa-fw m-r-10 fa-info"></i>
			<span class="text-inverse"><B>Tip</B></span>
		</h4>	
		</div>
	</div>
	<div class="col-6">	
		<div class="text-right">
			<button type="button" onclick="location.href='tipboardwrite.tb'"
			class="btn btn-black m-b-5 m-r-3" id="new_content_button">
			<i class="far fa-edit"></i>&nbsp;새 글 쓰기
		</button>
		</div>

		
	</div>
</div>
			
		
			<!-- END page-header -->
			<!-- BEGIN card -->
			<div class="card ">
				<!-- BEGIN card-header -->
				<div class="card-header card-header-inverse">
					<h1 class="card-header-title">
					
					</h1>
					<div class="card-header-btn">
						<a href="#" data-toggle="card-expand" class="btn btn-success"><i class="fa fa-expand"></i></a>
						<a href="#" data-toggle="card-refresh" class="btn btn-warning"><i class="fa fa-redo"></i></a>
						<a href="#" data-toggle="card-remove" class="btn btn-danger"><i class="fa fa-trash-alt"></i></a>
					</div>
				</div>
				<!-- END card-header -->
				<div class="table-responsive">
					<!-- BEGIN table -->
					<table id="datatables-default" class="table table-dark m-b-0">
						<thead>
							<tr style="text-align: center;">
								<th width="5%" class="no-sort"style="text-align: center;">#</th>
								<th width="55%">제목</th>
								<th width="15%">작성자</th>
								<th width="11%">작성일</th>
								<th width="9%">조회</th>
							</tr>
						</thead>
						<tbody>
							<c:set var="boardList" value="${requestScope.board}"/>
							<c:forEach var="tipboard" items="${boardList}" varStatus="status">
								  <tr style="text-align: center;">
							  		<td class="text-center">${tipboard.id}</td>
									<td><a href="tipboarddetail.tb?id=${tipboard.id}"><B>${tipboard.title}</B> </a>
									&nbsp;
									<span class="badge badge-primary badge-pill"></span></td>
									<td class="text-center">${tipboard.nick_name}</td>
									<td class="text-center">${tipboard.date_created}</td>
									<td class="text-center">${tipboard.view_count}</td>
								  </tr>
							</c:forEach>
						</tbody>
					</table>
					<!-- END table -->
				</div>
			</div>
			<br>
			

	<div class="" style="text-align: center">
		<ul class="pagination m-b-10 m-t-0">
			<li class="page-item" id="lp"><a href="#" class="page-link"
				id="btnpre"> <span>«</span>
			</a></li>
			<li class="page-item active" id="l1"><a href="#"
				class="page-link" id="btn1">1</a></li> 
			<li class="page-item" id="l2"><a href="#" class="page-link"
				id="btn2">2</a></li>
			<li class="page-item" id="l3"><a href="#" class="page-link"
				id="btn3">3</a></li>
			<li class="page-item" id="l4"><a href="#" class="page-link"
				id="btn4">4</a></li>
			<li class="page-item" id="l5"><a href="#" class="page-link"
				id="btn5">5</a></li>
			<li class="page-item" id="ln"><a href="#" class="page-link"
				id="btnnext"> <span>»</span>
			</a></li>
		</ul>
	</div>
	
<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>