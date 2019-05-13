<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!-- BEGIN #sidebar -->
<sidebar id="sidebar" class="app-sidebar"> <!-- BEGIN scrollbar -->
<div data-scrollbar="true" data-height="100%">
	<!-- BEGIN nav -->
	<ul class="nav">
		<li class="nav-profile">
			<c:set var="auth" value="${user_auth}"/>
			<c:choose>
				<c:when test="${!empty auth}">
					<div class="profile-img">
						<img src="${user_image_path}" />
					</div>
					<div class="profile-info">
						<h4>${nick_name}<small>(${user_name})</small></h4>
						<p>일반 회원</p>
					</div>
				</c:when>
				<c:otherwise>
					<div class="profile-img">
						<img src="resource/img/masterjung.jpg" />
					</div>
					<div class="profile-info">
						<h4>게스트<small>님</small></h4>
						<p>환영합니다</p>
					</div>
				</c:otherwise>
			</c:choose>	
		</li>
		<li class="nav-divider"></li>
		<li class="nav-header">카테고리</li>
		<li class="active"><a href="index.home"> <span
				class="nav-icon"><i class="fas fa-home"></i></span> <span
				class="nav-text">Home</span>
		</a></li>

		<li class="active"><a href="memberinfo.reg"> <span
				class="nav-icon"><i
					class="fa fa-user-circle bg-gradient-green"></i></span> <span
				class="nav-text">회원정보</span>
		</a></li>
		<li><a href="gochart.cht"> <span class="nav-icon"><i
					class="fa fa-chart-bar bg-gradient-purple text-white"></i></span> <span
				class="nav-text">게임통계</span>
		</a></li>

		<!-- 네비추가 -->
		<li><a href="gameinformation.do"> <span class="nav-icon"><i
					class="fab fa-hackerrank"></i></span> <span class="nav-text">게임정보
					API 페이지</span>
		</a></li>

		<li><a href="tipboard.tb"> <span class="nav-icon"><i
					class="fa fa-th-large"></i></span> <span class="nav-text">게임
					공략게시판(동현)</span>
		</a></li>

		<li><a href="qaboard.qb"> <span class="nav-icon"><i
					class="far fa-comment bg-gradient-blue"></i> </span> <span
				class="nav-text"> STEAM Q&A</span>
		</a></li>

		<li><a href="newboard.nb"> <span class="nav-icon"><i
					class="fas fa-newspaper bg-gradient-yellow"></i></span> <span class="nav-text">게임
					뉴스게시판(다빈)</span>
		</a></li>

		<li><a href="imageboard.ib"> <span class="nav-icon"><i
					class="fas fa-file-image bg-gradient-pink"></i></span> <span
				class="nav-text">게임이미지 게시판(선하)</span>
		</a></li>

		<li><a href="video.vb"> <span class="nav-icon"><i
					class="fas fa-video"></i></span> <span class="nav-text">게임동영상
					게시판(예지)</span>
		</a></li>


		<li class="nav-divider"></li>
		<li class="nav-copyright">Copyright &copy;GROUP4 Corp. All Rights Reserved.</li>
	</ul>
	<!-- END nav -->
</div>
<!-- END scrollbar --> </sidebar>
<!-- END #sidebar -->

<div id="content" class="app-content margin-left0">

	<div class="row">
		<!-- 콘텐츠 row 시작  -->
		<div class="col-10">
			<!-- 콘텐츠 컬럼 col-10 시작 -->