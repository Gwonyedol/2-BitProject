<%@page import="org.masterjung.dto.UserDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>

<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<!-- 콘텐츠 영역 시작-->
<script src="https://ssl.daumcdn.net/dmaps/map_js_init/postcode.v2.js"></script>
<script src="${pageContext.request.contextPath}/resource/js/address.js"
	type="text/javascript"></script>

<script>
$(function(){
  	$('#password, #nick_name, #phone_number, #user_name, #user_address').change(function(){
		alert("안녕");
  		if(!$('#password')){
			alert("안녕");
			$("#edit")
		      .prop("disabled", true);
		}
		
	});  

	
});
</script>

<c:set var="user" value="${requestScope.userdto}" />
<!-- BEGIN page-header -->
<h1 class="page-header">
	회원정보 <small>page header description goes here...</small>
</h1>
<!-- END page-header -->
<!-- BEGIN setting-list -->
<div>
<form action="memberedit.reg" method="POST" enctype="multipart/form-data">
	<ul class="setting-list">
		<li class="setting-title">GENERAL</li>
		<li>
			<div class="field">User image</div>
			<div class="value">
				            <img src="<c:choose><c:when test ="${user.user_image_path != '/upload/'}">${user.user_image_path}</c:when>    
                                                                                                          <c:otherwise>upload/500x261.jpg</c:otherwise></c:choose>" style="width: 100px; height: 100px"
                id="previewImage"  name ="previewImage"/>
			</div>
			<div class="action">
			<input type="file" class="form-control-file" id="upload"
						name="upload">
			</div>
		</li>
		<li>
			<div class="field">Email</div>
			<div class="col-sm-9">
				<input type="text" class="form-control" name="email" id="email"
					value="${userdto.email}" readonly/>
			</div>
		</li>
		<li>
			<div class="field">Password</div>
			<div class="value">
				<div class="col-sm-9">
					<input type="password" class="form-control" name="password" id="password"
						value="${userdto.password}"/>
				</div>
			</div>
		</li>
		<li>
			<div class="field">Nick name</div>
			<div class="value">
				<div class="col-sm-9">
					<input type="text" class="form-control" name="nick_name" id="nick_name"
						value="${userdto.nick_name}"/>
				</div>
			</div>
		</li>
		<li>
			<div class="field">Mobile Phone</div>
			<div class="value">
				<div class="col-sm-9">
					<input type="text" class="form-control" name="phone_number" id="phone_number"
						value="0${userdto.phone_number}" />
				</div>
			</div>
		</li>
		<li>
			<div class="field">User name</div>
			<div class="value">
				<div class="col-sm-10">
					<input type="text" class="form-control" name="user_name" id="user_name"
						value="${userdto.user_name}"/>
				</div>
			</div>
			<div class="action">
				<a href="#" class="btn btn-default">중복확인</a>
			</div>
		</li>
		<li>
			<div class="field">User adress</div>
			<div class="value">
				<div class="col-sm-10">
					<input type="text" class="form-control" name="user_address" id="user_address"
						value="${userdto.user_address}" />
				</div>
			</div>
			<div class="action">
				<a href="javascript:openAddrPop();" class="btn btn-default" id="addrPopBtn">주소검색</a>
			</div>
		</li>
		<li>
			<div class="field">User auth</div>
			<div class="value">
				<div class="form-group">
					<select class="selectpicker form-control" data-style="btn-default"
						name="user_auth" id ="user_auth">
						<option selected>3</option>
						<option>2</option>
						<option>1</option>
					</select>
				</div>
			</div>
		</li>
	</ul>
	<div align="right">
		<button type="submit" class="btn btn-primary" id="edit">Edit</button>
	</div>
	<br>
	
</form>
</div>
<br>


<!-- END setting-list -->

<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>