<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>

<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<!-- 콘텐츠 영역 시작-->


<!-- BEGIN page-header -->
<h1 class="page-header">
	회원정보 <small>page header description goes here...</small>
</h1>
<!-- END page-header -->
<!-- BEGIN setting-list -->

<ul class="setting-list">
	<li class="setting-title">GENERAL</li>
	<li>
		<div class="field">User image</div>
		<div class="value"><img src="uploads/500x261.jpg" style="width: 100px; height: 100px"
				id="previewImage" /></div>
	</li>
	<li>
		<div class="field">Name</div>
		<div class="value">
			<div class="m-b-5">Sean Ngu</div>
			<p class="text-muted f-s-12 m-b-0 f-w-400">
				Please note: You won't be able to change your name within the next
				60 days. <br /> Make sure not to add any unusual capitalization,
				punctuation, characters or random words.
			</p>
		</div>
	</li>
	<li>
		<div class="field">Email</div>
		<div class="value">sean@admetro.com</div>
	</li>
	<li>
		<div class="field">Password</div>
		<div class="value">Male</div>
	</li>
	<li>
		<div class="field">Nick name</div>
		<div class="value">Nov 19, 1928</div>
	</li>
	<li>
		<div class="field">Mobile Phone</div>
		<div class="value">**** ****** 948</div>
	</li>
	<li>
		<div class="field">User name</div>
		<div class="value">Male</div>
	</li>
	<li>
		<div class="field">User adress</div>
		<div class="value">Male</div>
	</li>
	<li>
		<div class="field">User auth</div>
		<div class="value">Male</div>
	</li>
</ul>

<br>
<div align="right">
<button type="button" class="btn btn-primary active" onclick="location.href='gomemberedit.reg'">Edit</button>
</div>

<!-- END setting-list -->

<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>