<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>

<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<!-- 콘텐츠 영역 시작-->

<h3>게임 사진 올리기</h3>
<form action="Image_UploadFormOK.jsp" method="post" enctype="multipart/form-data">
<table align="center" border="1">
	
	<tr>
		<td>제목</td>
	    <td><input type="text" name="subject"></td>
	</tr>
	<tr>
	    <td>파일첨부</td>
	    <td><input type="file" name="fileName"></td>
	</tr>
	<tr>
	    <td>내용</td>
	    <td><textarea name="content" cols="40" rows="8" name="textarea" ></textarea></td>
	</tr>
	<tr>
	    <td colspan="2" align=right>
	    <input type="submit" value="올리기"></td>
	</tr>
</table>
</form>


<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>