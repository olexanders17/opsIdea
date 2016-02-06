<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	HEAD MENU -->
		<div class="row" id="top">

			<div class="navbar navbar-inverse navbar-fixed-top ">

				<div class="container-fluid">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#menu-block">
						
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						</button>
						<div class="navbar-brand"><a href="/home">AK</a> </div>

					</div>
					<div class="collapse navbar-collapse" id="menu-block">
						<ul class="nav navbar-nav ">
							<li><a href="#">Item1</a></li>
						<!--dropdown -->
							<li class="dropdown">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">Item2<b class="caret"></b></a>
								<ul class="dropdown-menu" >
								<li><a href="#">Item21</a></li>
								<li><a href="#">Item22</a></li>
								<li><a href="#">Item23</a></li>							
								</ul>
							</li>	
						<!--dropdown end-->
								
							<li><a href="#">Item3</a></li>
							<li><a href="#">Item4</a></li>

						</ul>


					</div>


				</div>


			</div>


		</div>
</body>
</html>