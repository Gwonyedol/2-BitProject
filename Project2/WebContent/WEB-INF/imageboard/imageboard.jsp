<%@ page import="org.masterjung.dto.BoardDto"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>    
<%@ page import="com.oreilly.servlet.MultipartRequest,com.oreilly.servlet.multipart.DefaultFileRenamePolicy,java.util.*,java.io.*" %>
<%@ page import="java.sql.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<link rel="stylesheet" href="./resource/css/imageboard.css">  

<h3 align="center">이미지 게시판 </h3> 
	<button type="button" class="btn btn-black m-b-5 m-r-3" id="new_content_button"
			onclick="location.href='imagewrite.ib'">글쓰기</button> 
<hr color=black>

<div id="columns">
	<c:forEach var="imageList" items="${imageList}" varStatus="status">	
		<figure>
			<img src="${imageList.file_path}" id="image" alt="" />			
			<figcaption>
				<a href="imagedetail.ib?id=${imageList.id}"><b>${imageList.title}</b></a> 
				<br>${imageList.nick_name}
				<br>${imageList.date_created} | 조회 ${boardList.view_count}
			</figcaption>	
		</figure>
	</c:forEach>
	
	
	
	<!-- <figure>	
			<img src="./resource/img/gameimage2.jpg">
			<figcaption><b>제목</b><br>작성자</figcaption>
	</figure> -->
	
		<!-- <script language="JavaScript">			
			for(i=1;i<=4;i++)
			{
			document.write("<figure>");
			document.write("<img src=\"./resource/img/");
			document.write("gameimage1.jpg"); 	//파일 이름 넣은 변수 넣기			
			document.write("\"><figcaption><b>");
			document.write("제목");				// 제목 이름 넣은 변수 넣기
			document.write("</b><br>");
			document.write("작성자");				// 작성자 값 넣은 변수 넣기
			document.write("</figcaption></figure>");
			}	
		</script> -->

<%-- <div id="columns">	
   	<c:forEach var="i" begin="1" end="5" escapeXml="false" >       
		<figure>			
			<img src="./resource/img/gameimage1.jpg">
			<figcaption><b>제목</b><br>작성자</figcaption>						
		</figure>
		이름 : <%= request.getParameter("title") %><br>
		이미지 : <img src="<%=fullpath%>"></img>      
   	</c:forEach> --%>
		

	<!-- <div id="columns">
		<figure>	
			<img src="./resource/img/gameimage1.jpg">
			<figcaption><b>제목</b><br>작성자</figcaption>
		</figure>
		
		<figure>	
			<img src="./resource/img/gameimage2.jpg">
			<figcaption><b>제목</b><br>작성자</figcaption>
		</figure>
		
		<figure>	
			<img src="./resource/img/gameimage3.jpg">
			<figcaption><b>제목</b><br>작성자</figcaption>
		</figure> -->	
	
	
	<!-- <figure>
	<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/rapunzel.jpg">
	<figcaption>Rapunzel, clothed in 1820’s period fashion</figcaption>
	</figure>
	
  <figure>
	<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/belle.jpg">
	<figcaption>Belle, based on 1770’s French court fashion</figcaption>
	</figure>
  
	<figure>
	<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/mulan_2.jpg">
	<figcaption>Mulan, based on the Ming Dynasty period</figcaption>
	</figure>
	
   <figure>
	 <img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/sleeping-beauty.jpg">
	<figcaption>Sleeping Beauty, based on European fashions in 1485</figcaption>
	</figure>
	
   <figure>
	 <img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/pocahontas_2.jpg">
	<figcaption>Pocahontas based on 17th century Powhatan costume</figcaption>
	</figure>
  
	<figure>
	<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/snow-white.jpg">
	<figcaption>Snow White, based on 16th century German fashion</figcaption>
	</figure>	
  
   <figure>
	<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/ariel.jpg">
	<figcaption>Ariel wearing an evening gown of the 1890’s</figcaption>
	</figure>
  
    <figure>
	<img src="//s3-us-west-2.amazonaws.com/s.cdpn.io/4273/tiana.jpg">
    <figcaption>Tiana wearing the <i>robe de style</i> of the 1920’s</figcaption>
	</figure> -->
</div>
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>