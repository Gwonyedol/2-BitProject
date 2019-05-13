<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    

<link rel="stylesheet" href="./resource/css/imageboard.css">    
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>


<h3>이미지 게시판 </h3> 
<a href="writeForm.ib">
<button type="button" class="btn btn-black m-b-5 m-r-3" id="new_content_button">글쓰기</button> 
<hr color=black>

<div id="columns">
	<figure>	
	<img src="./resource/img/gameimage1.jpg">
	<figcaption>Cinderella wearing European fashion of the mid-1860’s</figcaption>
	</figure>
	
	<figure>	
	<img src="./resource/img/gameimage2.jpg">
	<figcaption>Cinderella wearing European fashion of the mid-1860’s</figcaption>
	</figure>
	
	<figure>	
	<img src="./resource/img/gameimage3.jpg">
	<figcaption>Cinderella wearing European fashion of the mid-1860’s</figcaption>
	</figure>
	
	
	<figure>
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
	</figure>
</div>
	
<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>