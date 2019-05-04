<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<%  
       String ename = (String)request.getAttribute("ename");
	   String job = (String)request.getAttribute("job");
       int mgr = (Integer)request.getAttribute("mgr");
       String hiredate = (String)request.getAttribute("hiredate");
       int comm = (Integer)request.getAttribute("comm");
       int deptno = (Integer)request.getAttribute("deptno");
       int empno = (Integer)request.getAttribute("empno");
       int sal = (Integer)request.getAttribute("sal");

%>
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

</head>
<body>
<jsp:include page="/common/Top_Header.jsp"></jsp:include>
<jsp:include page="/common/Left_Navi.jsp"></jsp:include>

	<c:set var="ename" value="<%=ename%>" />
	<c:set var="job" value="<%=job%>" />
	<c:set var="mgr" value="<%=mgr%>" />
	<c:set var="hiredate" value="<%=hiredate%>"/>
	<c:set var="comm" value="<%=comm%>"/>
	<c:set var="deptno" value="<%=deptno%>"/>
	<c:set var="empno" value="<%=empno%>"/>
		<c:set var="sal" value="<%=sal%>"/>
	

      <div class="content">
        <div class="row">
          <div class="col-md-8">
            <div class="card">
              <div class="card-header">
                <h5 class="title">사원 수정</h5>
              </div>
              <div class="card-body">
                <form action="EmpUpdate.EMP" method="get">
                  <div class="row">
                    <div class="col-md-5 pr-md-1">
                      <div class="form-group">
                        <label>Company</label>
                        <input type="text" class="form-control" disabled="" placeholder="Company" value="비트캠프">
                      </div>
                    </div>
                    <div class="col-md-3 px-md-1">
                      <div class="form-group">
                        <label>이름</label>
                        <input type="text" class="form-control" value="${ename}" id = "ename" name = "ename">
                      </div> 
                    </div>
                    <div class="col-md-4 pl-md-1">
                      <div class="form-group">
                        <label for="exampleInputEmail1">직업</label>
                        <input type="text" class="form-control" value="${job}" id="job" name="job">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6 pr-md-1">
                      <div class="form-group">
                        <label>고용일</label>
                        <input type="text" class="form-control" value="${hiredate}" id="hiredate" name="hiredate">
                      </div>
                    </div>
                    <div class="col-md-6 pl-md-1">
                      <div class="form-group">
                        <label>연봉</label>
                        <input type="text" class="form-control" value="${sal}" id="sal" name="sal">
                      </div>
                    </div>
                  </div>                    
                  <div class="row">
                    <div class="col-md-6 pr-md-1">
                      <div class="form-group">
                        <label>사원번호</label>
                        <input type="text" class="form-control" value="${empno}" id="empno" name="empno">
                      </div>
                    </div>
                    <div class="col-md-6 pl-md-1">
                      <div class="form-group">
                        <label>부서번호</label>
                        <input type="text" class="form-control" value="${deptno}" id="deptno" name="deptno">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-6 pr-md-1">
                      <div class="form-group">
                        <label>사수번호</label>
                        <input type="text" class="form-control" value="${mgr}" id="mgr" name="mgr">
                      </div>
                    </div>
                    <div class="col-md-6 pl-md-1">
                      <div class="form-group">
                        <label>상여금</label>
                        <input type="text" class="form-control" value="${comm}" id="comm" name="comm">
                      </div>
                    </div>
                  </div>
              <div class="card-footer">
                <button type="submit" class="btn btn-fill btn-primary" id = "message">Save</button>
              </div>
                </form>
              </div>

            </div>
          </div>
        </div>
      </div>


<div id="messagediv" style="background-color: gold">


<jsp:include page="/common/Bottom.jsp"></jsp:include>
</body>
</html>
