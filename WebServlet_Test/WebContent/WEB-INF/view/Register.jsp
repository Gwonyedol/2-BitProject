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
  
  
</head>
<body>




<br><br><br><br>
      <div class="content">
        <div class="row">
          <div class="col-md-8">
          
            <div class="card">
              <div class="card-header">
                <h2 class="title">Register Form</h2>
              </div>
              <div class="card-body">
                <form action="RegisterOk.EMP" method="post">
                  <div class="row">
                    <div class="col-md-6 pr-md-1">
                      <div class="form-group">
                        <label>ID</label>
                        <input type="text" class="form-control" placeholder="ID" name="Mid">
                      </div>
                    </div>
                    <div class="col-md-6 pl-md-1">
                      <div class="form-group">
                        <label>PASSWORD</label>
                        <input type="text" class="form-control" placeholder="PASSWORD" name="Mpwd">
                      </div>
                    </div>
                  </div>
                  <div class="row">
                    <div class="col-md-8">
                      <div class="form-group">
                        <label>About Me</label>
                        <textarea rows="4" cols="80" class="form-control" placeholder="Here can be your description" ></textarea>
                      </div>
                    </div>
                  </div>
                </form>
              </div>
              <div class="card-footer">
                <button type="submit" class="btn btn-fill btn-primary">Save</button>
              </div>
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
