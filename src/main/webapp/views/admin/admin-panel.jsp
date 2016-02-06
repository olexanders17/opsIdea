<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function doubleCheck() {
		var ask = confirm('Are you sure load data from file ?');
		if (!ask) {
			return false;
		}
		return true;
	}
</script>
</head>
<body>
	<br>
	<label class="label label-success" style="font-size: large;"> Admin panel </label>
	<br>
	<br>

<fieldset>
<legend> Data managing</legend>
	<a href="uplodFileForm" class="btn btn-primary">Upload file on server</a>
	<label> Uploading Excel file to server </label>
	</br>
	</br>

	<a href="updateFromFile" class="btn btn-primary" onclick="return doubleCheck()">Transfer data from file to database</a>
	<label> Delete all info from database table and load from source Excel file </label>
</fieldset>


</body>
</html>