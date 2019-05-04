<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <title>
    Black Dashboard by Creative Tim
  </title>
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
  <!-- Nucleo Icons -->
  <link href="../assets/css/nucleo-icons.css" rel="stylesheet" />
  <!-- CSS Files -->
  <link href="../assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
  <!-- CSS Just for demo purpose, don't include it in your project -->
  <link href="../assets/demo/demo.css" rel="stylesheet" />
	<title>Insert title here</title>
</head>

<body>




<jsp:include page="/common/Top_Header.jsp"></jsp:include>
<jsp:include page="/common/Left_Navi.jsp"></jsp:include>

<button type="submit" class="btn btn-fill btn-primary" onclick="location.href='EmpAddPage.EMP'">회원등록</button>
                <c:set var="emplist" value="${requestScope.emplist}" />
                <h2 style="text-align: center;"> EMP LIST </h2>
                  <table class="table tablesorter " id="">
                    <thead class=" text-primary">
                      <tr>
	 	<th>Ename</th> 
	 	<th>Job</th>
	 	<th>Hiredate</th>
	 	<th>Sal</th>
	 	<th>Empno</th>
	 	<th>MGR</th>
	 	<th>Comm</th>
	 	<th>Deptno</th>
	 	<th>나는야...</th>
                      </tr>
                    </thead>
                    <tbody>
	 <c:forEach var="emp" items="${emplist}">
	 	<tr>
	 		<td>${emp.ename}</td>
	 		<td>${emp.job}</td>
	 		<td>${emp.hiredate}</td>
	 		<td>${emp.sal}</td>
	 		<td>${emp.empno}</td>
	 		<td>${emp.mgr}</td>
	 		<td>${emp.comm}</td>
	 		<td>${emp.deptno}</td>
	 		<td>
	 		<a href="EmpUpdatePage.EMP?empno=${emp.empno}&sal=${emp.sal}&job=${emp.job}&hiredate=${emp.hiredate}&mgr=${emp.mgr}&comm=${emp.comm}&deptno=${emp.deptno}&ename=${emp.ename}">수정</a>
	 		&ensp;&ensp;<a href="EmpDelete.EMP?empno=${emp.empno}">삭제</a> 
	 		</td>
	 		</tr>
  	</c:forEach>
                    </tbody>
                  </table>
                 



<jsp:include page="/common/Bottom.jsp"></jsp:include>
</body>
</html>
