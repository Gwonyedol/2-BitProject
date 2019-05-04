<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <link rel="apple-touch-icon" sizes="76x76" href="../assets/img/apple-icon.png">
  <link rel="icon" type="image/png" href="../assets/img/favicon.png">
  <!--     Fonts and icons     -->
  <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,600,700,800" rel="stylesheet" />
  <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
  <!-- Nucleo Icons -->
  <link href="assets/css/nucleo-icons.css" rel="stylesheet" />
  <!-- CSS Files -->
  <link href="assets/css/black-dashboard.css?v=1.0.0" rel="stylesheet" />
  <!-- CSS Just f
  or demo purpose, don't include it in your project -->
  <link href="assets/demo/demo.css" rel="stylesheet" />
  
  


<style> div { position:relative; } #cm { position:absolute; } .hc { width:200px; left:0; right:0; margin-left:auto; margin-right:auto; } /* 가로 중앙 정렬 */ .vc { height:40px; top: 0; bottom:0; margin-top:auto; margin-bottom:auto; } /* 세로 중앙 정렬 */ </style>



</head>

<body>


<center>
          <div class="col-md-4">
          <br><br><br><br><br><br><br><br><br>
            <div class="card card-user">
              <div class="card-body">
                <p class="card-text">
                  <div class="author">
                    <div class="block block-one"></div>
                    <div class="block block-two"></div>
                    <div class="block block-three"></div>
                    <div class="block block-four"></div>
                      <h1 class="title">Login</h1>
                    </a>
                    <p class="description">
                      With Bit-Team4
                    </p>
                  </div>
                </p>
                <div class="card-description"> <!-- 로그인폼 -->
                		<form action="LoginOk.EMP" method="post">
                  		<input type="text" name="id" placeholder="ID"><br>
						<input type="password" name="pwd" placeholder="PWD"><br><br>
						<input type ="submit" value = "Go" class="btn btn-icon btn-round btn-facebook">
						<input type ="button" onclick="location.href='Register.EMP'" value = "Join" class="btn btn-icon btn-round btn-facebook">
						</form>
						
                </div>
              </div>

            </div>
          </div>
          </center>
	      <footer class="footer">
        <div class="container-fluid">
          <div class="copyright">

          </div>
        </div>
      </footer>



</body>
</html>
