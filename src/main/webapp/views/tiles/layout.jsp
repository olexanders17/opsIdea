<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href='//cdnjs.cloudflare.com/ajax/libs/fullcalendar/2.4.0/fullcalendar.min.css' rel='stylesheet' />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/3.1.3/css/jasny-bootstrap.min.css">
<script src="//cdnjs.cloudflare.com/ajax/libs/jasny-bootstrap/3.1.3/js/jasny-bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.9/css/dataTables.bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/1.0.3/css/buttons.bootstrap.min.css" />
<style type="text/css">
#left-menu {
	
}

#top {
	background-color: orange;
}

#center {
	
}

body {
	padding-top: 50px;
}

.navmenu-default {
	width: auto;
}
</style>

</head>
<body>


	<div>
		<tiles:insertAttribute name="header">
		</tiles:insertAttribute>
	</div>

	<div class="container-fluid">
		<div class="row" id="menu and body">

			<div class="col-lg-2 col-md-2 col-sm-2 col-xs-2 hidden-xs" id="left-menu" style="padding-left: 1px;">
				<tiles:insertAttribute name="menu">
				</tiles:insertAttribute>
			</div>
			<div class="col-lg-9 col-md-9 col-sm-9 col-xs-9" id="center">
				<tiles:insertAttribute name="body">
				</tiles:insertAttribute>
			</div>

		</div>
	</div>


</body>
</html>