<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Delete page</title>

  <!-- Bootstrap 4 CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

  <style>
    body {
    background-image: url("https://images.pexels.com/photos/129731/pexels-photo-129731.jpeg");
    background-position: center;
    background-repeat: no-repeat;
    background-size: cover;
    position: relative;
    }
    .signup-container {
      max-width: 400px;
      margin: 80px auto;
      background: #e5d5ff;
      padding: 30px;
      border-radius: 10px;
      box-shadow: 0 4px 10px rgba(0,0,0,0.1);
    }
    .form-title {
      text-align: center;
      margin-bottom: 20px;
      font-weight: 600;
    }
    .btn-skip {
      color: #6c757d;
      text-decoration: none;
    }
    .btn-skip:hover {
      text-decoration: underline;
    }
  </style>
</head>
<body>
    <h4 class="form-title pt-5"><b>SAI KRISHNA SWEETS & BAKERY ,MADHIRA</b></h4>

  <div class="signup-container">
    <h4 class="form-title">Create Account</h4>

    <form name="registration" method="post" action="Delete" class="form-group">
						
						<div class="row pt-2">
							<div class="col-md-12">
								<input type="text" id="username" name="username" placeholder="Enter UserName" class="form-control">
							</div>	   
						</div>
						
						<div class="row pt-2">
							<div class="col-md-12">
								<input type="password" id="password" name="password" placeholder="Enter Password" class="form-control">
							</div>	   
						</div>
						
						
						<div class="row pt-2">
							<div class="col-md-12">
								<button type="submit" class="btn btn-primary btn-block">Conform To Delete</button>
							</div>
						</div>
		</form>
  </div>

</body>
</html>