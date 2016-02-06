<%@page import="ua.ak.utils.JsonCalendarData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<link href='//cdnjs.cloudflare.com/ajax/libs/fullcalendar/2.4.0/fullcalendar.min.css' rel='stylesheet' />

<script>
    $(document).ready(function() {

	var calendarArray = ${ calendarData};

	//     		[ {
	// 		    title : 'All Day Event',
	// 		    start : '2015-02-01'
	// 		}, {
	// 		    title : 'Long Event',
	// 		    start : '2015-02-07',
	// 		    end : '2015-02-07'
	// 		} ]

	$('#calendar').fullCalendar({
	    header : {
		left : 'prev,next today',
		center : 'title',
		right : 'month,basicWeek,basicDay'
	    },
	    defaultDate : '2014-07-01',
	    editable : false,
	    eventLimit : true, // allow "more" link when too many events
	    events : calendarArray
	});

    });
</script>

</head>
<body>
	<br>

	<div id='calendar' ></div>


	<script src='http://momentjs.com/downloads/moment.min.js'></script>
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script> -->
	<script src='//cdnjs.cloudflare.com/ajax/libs/fullcalendar/2.4.0/fullcalendar.min.js'></script>

</body>
</html>