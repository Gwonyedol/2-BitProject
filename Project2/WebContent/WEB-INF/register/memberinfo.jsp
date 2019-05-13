<%@page import="org.masterjung.dto.UserDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>

<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<!-- 콘텐츠 영역 시작-->

<c:set var="user" value="${requestScope.userdto}" />
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
		<div class="value"><img src="<c:choose><c:when test ="${user.user_image_path != 'upload/'}">${user.user_image_path}</c:when>
				            					    <c:when test ="${user.user_image_path == null}">upload/500x261.jpg</c:when>
                                                                                                          <c:otherwise>upload/500x261.jpg</c:otherwise></c:choose>" style="width: 100px; height: 100px"
                id="previewImage"  name ="previewImage"/></div>
	</li>
	<li>
		<div class="field">Name</div>
		<div class="value">${userdto.user_name}</div>
	</li>
	<li>
		<div class="field">Email</div>
		<div class="value">${userdto.email}</div>
	</li>
	<li>
		<div class="field">Nick name</div>
		<div class="value">${userdto.nick_name}</div>
	</li>
	<li>
		<div class="field">Mobile Phone</div>
		<div class="value">0${userdto.phone_number}</div>
	</li>
	<li>
		<div class="field">User adress</div>
		<div class="value">${userdto.user_address}</div>
	</li>
	<li>
		<div class="field">User auth</div>
		<div class="value">${userdto.user_auth}</div>
	</li>
</ul>

<br>
<div align="right">
<button type="button" class="btn btn-primary active" onclick="location.href='membereditview.reg'">Edit</button>
</div>

<!-- END setting-list -->

<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>