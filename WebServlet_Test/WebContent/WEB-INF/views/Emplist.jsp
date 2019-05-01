<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>
		table {
	
		    font-family: arial, sans-serif;
		    border-collapse: collapse; /* 붕괴하다 , 무너지다 */
		    width: 100%;
		}
		
		th {
		    border: 1px solid #dddddd;
		    text-align: center;
		    padding: 8px;
		}
		td{
		    border: 1px solid #dddddd;
			text-align: left;
			padding: 8px;
		}
		tr:nth-child(even) {  /* even 짝수     odd 홀수 */
		    background-color: #dddddd;
		}
	</style>
	
</head>
<body>
<c:set var="emplist" value="${requestScope.emplist}" />
<div align=center>
<hr color=green width=400><h2> EMP LIST </h2><hr color=green width=400>
<table> 
	 <tr>
	 	<th>Ename</th> 
	 	<th>Job</th>
	 	<th>Hiredate</th>
	 	<th>Sal</th>
	 	<th>Empno</th>
	 	<th>MGR</th>
	 	<th>Comm</th>
	 	<th>Deptno</th>
	 </tr>
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
	 	</tr>
  	</c:forEach>
</table>
</div>

</body>
</html>