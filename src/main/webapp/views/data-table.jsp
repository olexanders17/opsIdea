<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.9/css/dataTables.bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/buttons/1.0.3/css/buttons.bootstrap.min.css" />

<title>Insert title here</title>
</head>
<body>
	Data table
<div style="overflow: scroll;" >

	<table id="table1" class=" table  order-column row-border   " style="font-size: 11px;">
		<thead style="font-weight: bold;">
			<tr>
				<td>ID</td>
				<td>DATE_OPERATION</td>
				<td>FIELD_CODE</td>
				<td>FIED_AREA</td>
				<td>OPERATION</td>
				<td>DONE_HA</td>
				<td>TRACTOR</td>
				<td>REGISTRATION_NUMBER</td>
				<td>TRACTOR_DRIVER</td>
				<td>MOTOR_HOURS</td>
				<td>EQUIPMENT</td>
				<td>SERIAL_NUMBER</td>
				<td>FUEL_LITERS</td>
				<td>CROP</td>
				
				<td>SEEDS_NAME</td>
				<td>SEEDS_USAGE_QTY</td>
				<td>SEEDS_AMOUNT</td>
				
<!-- 				<td>FERTILIZER_NAME</td> -->
<!-- 				<td>FERTILIZER_USAGE_QTY</td> -->
<!-- 				<td>FERTILIZER_AMOUNT</td> -->
				
<!-- 				<td>CHEMICALS_NAME</td> -->
<!-- 				<td>CHEMICALS_USAGE_QTY</td> -->
<!-- 				<td>CHEMICALS_AMOUNT"</td> -->
				
				<td>YEAR</td>
				

			</tr>

		</thead>
		<tbody>
			<c:forEach var="t" items="${fieldOperationList}">
				<tr>
				
					<td>${t.id}</td>
					<td> <fmt:formatDate value="${t.date}" pattern="dd/MM/YYYY" type="DATE"/> </td>
					<td>${t.fieldCode}</td>
					<td> <fmt:formatNumber    value="${t.fiedArea}"   maxFractionDigits="0"  />   </td>
					<td>${t.operation}</td>
					<td>${t.doneHa}</td>
					<td>${t.tractor}</td>
					<td style="max-width: 5px">${t.registrationNumber}</td>
					<td>${t.tractordriver}</td>
					<td>${t.motorHours}</td>
					<td>${t.equipment}</td>
					<td>${t.serialNumber}</td>
					<td><fmt:formatNumber   value="${t.fuelLiters}" maxFractionDigits="0"/> </td>
					<td>${t.crop}</td>
					<td>${t.inputName}</td>
					<td>${t.inputUsageQty}</td>
					<td>${t.inputAmount}</td>
<%-- 					<td>${t.fertilizerName}</td> --%>
<%-- 					<td>${t.fertilizerUsageQty}</td> --%>
<%-- 					<td>${t.fertilizerAmount}</td> --%>
<%-- 					<td>${t.chemicalsName}</td> --%>
<%-- 					<td>${t.chemicalsUsageQty}</td> --%>
<%-- 					<td>${t.chemicalsAmount}</td> --%>
					<td>${t.year}</td>
					
					
					
					
				</tr>
			</c:forEach>
		</tbody>


	</table>
</div>	
	
	
	<script type="text/javascript">
	$(document).ready(
		function() {
		    var table = $('#table1').DataTable({
			buttons : [ 'copy', 'excel', 'pdf' ]
		    });

		    table.buttons().container().appendTo(
			    $('.col-sm-6:eq(0)', table.table().container()));

		});
    </script>




	
	<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
<script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/pdfmake.min.js"></script>
<script type="text/javascript" src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.18/build/vfs_fonts.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.9/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/1.10.9/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/dataTables.buttons.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.bootstrap.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.colVis.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.flash.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.html5.min.js"></script>
<script type="text/javascript" src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.print.min.js"></script>
</body>
</html>