<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/css/video.css" />	
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
			<a href="video.vb"><button type="button"
					class="btn btn-black m-b-5 m-r-3" id="new_content_button">
					<i class="far fa-edit"></i>&nbsp;목록
				</button></a>
		</div>
	</div>
</div>
<hr>






<div class="col-1"></div>
<div class="row">
	<div class="col-12 scroll">
		<div class="card">
			<div class="card-header card-header-inverse">
				<h4 class="card-header-title">작성일
					:${requestScope.result.date_created}</h4>
				<div class="text-right">추천수 :
					${requestScope.result.vote_count}</div>
				<div class="card-header-btn"></div>
			</div>

			<div class="card-body" id="detail_card">


				<div class="card-body" id="detail_card">
					<div class="row">
						<%-- 							<span class="badge badge-secondary">#${requestScope.count}</span>&nbsp;
							<span class="badge badge-pill badge-primary"><i class="fab fa-steam"></i>&nbsp;Play of the Game video</span>
							 --%>
					</div>
					<div class="row">
						<h3>${requestScope.result.title}&nbsp;[0]</h3>
					</div>
					<div class="text-right">${requestScope.result.nick_name}&nbsp;&nbsp;&nbsp;<span
							id="eye_align"><i class="fas fa-eye"></i>&nbsp;${requestScope.result.view_count}</span>
					</div>
					<hr>
					${requestScope.result.content}
				</div>

				<div style="text-align: center;">
					<h1>
						<span class="label label-default">&nbsp;<i
							class="fas fa-lg fa-fw m-r-10 fa-thumbs-up"></i> <span
							class="text-inverse">${requestScope.result.vote_count}</span>&nbsp;
						</span>
					</h1>
				</div>
				<br>
				<br>
				<br>
				<br>
			</div>
		</div>
		<br>
		<br>


		<!-- 댓글시작	 -->


		<div class="card">
			<div class="card-body">


				<div class="card-body">
					<div class="row"></div>
					<div class="col-md-6 col-sm-6 col-xs-6 m-b-10 text-ellipsis">
						<i class="fas fa-lg fa-fw m-r-10 fa-angle-down"></i> <span
							class="text-inverse"><b>코멘트</b></span>
					</div>
					<hr>
					<p>sunha &nbsp;| 언니 반가워요~^0^
					<p>
						<!-- 코멘트 내용 불러오는곳 -->
					<form>
						<div class="row">
							<div class="col-10">
								<div class="text-left">
									<div class="form-group">
										<textarea class="form-control" name="default_textarea"
											rows="4" placeholder="Textarea"></textarea>
									</div>
								</div>
							</div>
							<div class="col-1">
								<div class="text-right">
									<button type="submit" class="btn btn-default m-b-5 m-r-3" style="height: 96px; width: 80px;">등록</button>
								</div>
							</div>
						</div>
					</form>

					<!--  코멘트 내용 끝 -->


				</div>
			</div>
		</div>
		<!-- 		댓글 끝 -->
	</div>


	<div class="col-1"></div>
</div>
<br>
<div class="row" id="write-button">
	<div class="col-5">
		<div class="text-left">
			<a href="videodelete.vb?id=${requestScope.result.id}">
			<button type="button" class="btn btn-secondary" id="cancel-btn">삭제</button></a>
		</div>
	</div>
	<div class="col-7">
		<div class="text-right">
			<a href="videoedit.vb?id=${requestScope.result.id}">
			<button type="button" class="btn btn-primary" id="enter-btn">수정</button></a>
		</div>
	</div>
	<div class="col-1"></div>

</div>

<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>