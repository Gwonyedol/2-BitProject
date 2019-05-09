<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>

<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<!-- 콘텐츠 영역 시작-->
<script>
	$(function() {
		$("#upload").change(function(e) {
			event.preventDefault();

			var file = e.target.files[0];
			var url = URL.createObjectURL(file);
			$("#previewImage").attr("src", url);
		});
	});
</script>

<!-- BEGIN page-header -->
<h1 class="page-header">
	회원정보 <small>page header description goes here...</small>
</h1>
<!-- END page-header -->
<!-- BEGIN setting-list -->
<form action="#" enctype="multipart/form-data" method="post">
<ul class="setting-list">
	<li class="setting-title">GENERAL</li>
	<li>
		<div class="field">User image</div>
		<div class="value">
			<img src="uploads/500x261.jpg" style="width: 100px; height: 100px"
				id="previewImage" />
		</div>
		<div class="action">
			<input type="file" name="files[]" multiple>
		</div>
	</li>
	<li>
		<div class="field">Email</div>
		<div class="value">Nov 19, 1928</div>
	</li>
	<li>
		<div class="field">Password</div>
		<div class="value">
			<div class="col-sm-9">
				<input type="password" class="form-control" id="inputPassword3"
					placeholder="Email">
			</div>
		</div>
	</li>
	<li>
		<div class="field">Nick name</div>
		<div class="value">
			<div class="col-sm-9">
				<input type="password" class="form-control" id="inputPassword3"
					placeholder="Email">
			</div>
		</div>
	</li>
	<li>
		<div class="field">Mobile Phone</div>
		<div class="value">
			<div class="col-sm-9">
				<input type="password" class="form-control" id="inputPassword3"
					placeholder="Email">
			</div>
		</div>
	</li>
	<li>
		<div class="field">User name</div>
		<div class="value">
			<div class="col-sm-10">
				<input type="password" class="form-control" id="inputPassword3"
					placeholder="Email">
			</div>
		</div>
		<div class="action">
						<a href="#" class="btn btn-default">중복확인</a>
					</div>
	</li>
	<li>
		<div class="field">User adress</div>
		<div class="value">
			<div class="col-sm-9">
				<input type="password" class="form-control" id="inputPassword3"
					placeholder="Email">
			</div>
		</div>
	</li>
	<li>
		<div class="field">User auth</div>
		<div class="value">
			<div class="form-group">
			 <select
					class="selectpicker form-control" data-style="btn-default">
					<option>Mustard</option>
					<option>Ketchup</option>
					<option>Relish</option>
				</select>
			</div>
		</div>
	</li>
</ul>
</form>
<br>
<div align="right">

</div>

<!-- END setting-list -->

<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>