<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<br>	
	<H4><label class=" label label-default ">File options </label></H4>

	<table class="tab-content table-hover table-bordered table-responsive">
		<thead>
			<tr style="font-weight: bold;">
				<td style="width : 300px">name</td>
				<td>value</td>


			</tr>

		</thead>

		<tbody >

			<tr>
				<td>name</td>
				<td>${name}</td>
			</tr>

			<tr>
				<td>size</td>
				<td>${size}</td>
			</tr>

			<tr>
				<td>lastModifiedTime</td>
				<td>${lastModifiedTime}</td>


			</tr>





		</tbody>


	</table>


</body>
</html>