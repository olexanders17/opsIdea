<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <title>Insert title here</title>
</head>
<body>
<br>
	<span class="  btn-success  btn-lg btn-block center-block" style="text-align: center;">


		<form action="fieldsInfo" method="post">
            Chose Field >> <select style="color: black;" name="fieldCode">
            <c:forEach var="t" items="${fieldProfileList}">
                <option>${t.fieldСode}</option>
            </c:forEach>


        </select> <input type="submit" value="Update inifo" class="btn btn-default">
        </form>

	</span>

<div></div>
<br>


<div>

    <!-- Nav tabs -->
    <ul class="nav nav-tabs" role="tablist">
        <li role="presentation" class="active"><a href="#generalInfo" aria-controls="home" role="tab" data-toggle="tab">General
            information</a></li>
        <li role="presentation"><a href="#budget" aria-controls="home" role="tab" data-toggle="tab">Actuals vs
            Budget</a></li>
        <li role="presentation"><a href="#chart" aria-controls="chart" role="tab" data-toggle="tab">Chart</a></li>
        <li role="presentation"><a href="#messages" aria-controls="messages" role="tab" data-toggle="tab">Messages</a>
        </li>
        <li role="presentation"><a href="#settings" aria-controls="settings" role="tab" data-toggle="tab">Settings</a>
        </li>
    </ul>

    <!-- Tab panes -->


    <div class="tab-content">

        <div role="tabpanel" class="tab-pane active" id="generalInfo">
            <br>
            <p>Table 1. Field info</p>
            <table class="table table-condensed">
                <thead style="font-weight: bold;">
                <tr>
                    <td>FIELD СODE</td>
                    <td>FIELD AREA (HA)</td>
                    <td>OBLAST</td>
                    <td>RAIJON</td>
                    <td>VILLAGE</td>


                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>${fieldProfile.fieldСode}</td>
                    <td>${fieldProfile.fieldArea}</td>
                    <td>${fieldProfile.oblast}</td>
                    <td>${fieldProfile.raijon}</td>
                    <td>${fieldProfile.village}</td>

                </tr>

                </tbody>

            </table>

            <br>


            <!-- 				 yield history list -->


            <p>Table 2. Crop rotation</p>
            <table class="table table-condensed">
                <thead style="font-weight: bold;">
                <tr>
                    <td>FIELD СODE</td>
                    <td>Crop</td>
                    <td>yearHarvest</td>
                    <td>harvestedArea</td>
                    <td>harvestedTones</td>
                    <td>grossYield</td>


                </tr>
                </thead>
                <tbody>
                <c:forEach items="${yieldHistoryList}" var="yh">
                    <tr>
                        <td>${yh.fieldCode}</td>
                        <td>${yh.сrop}</td>
                        <td>${yh.yearHarvest}</td>
                        <td>${yh.harvestedArea}</td>
                        <td>${yh.harvestedTones}</td>
                        <td>${yh.grossYield}</td>


                    </tr>
                </c:forEach>

                </tbody>

            </table>


        </div>


        <div role="tabpanel" class="tab-pane " id="budget">

            <label>Summary crops 2015 , all data inc VAT</label>
            <table class="table table-striped table-bordered  ">
                <thead style="">
                <tr>
                    <td>Type of Inputs</td>
                    <td>Total Q-TY Actuals H2 2015</td>
                    <td>Total Q-TY Budget H2 2015</td>
                    <td>Var Q-TY AvB H2 2015 over(under) budget</td>
                    <td>Var % (by group)</td>
                    <td style="width: 10px;"></td>
                    <td>Total USD Actuals H2 2015</td>
                    <td>Total USD Budget H2 2015</td>
                    <td>Var USD AvB H2 2015 over(under) budget</td>
                    <td>Var % (by group)</td>
                </tr>

                </thead>

                <tbody>
                <c:forEach var="ab" items="${actBudOneField}">
                    <tr>
                    <td>${ab.inputName}</td>
                    <td>${ab.qty}</td>
                    <td>_______</td>
                    <td>_______</td>
                    <td>_______</td>
                    <td>_______</td>
                    <td><fmt:formatNumber value="${ab.amount}" type="number" maxFractionDigits="2"></fmt:formatNumber></td>
                    <td>_______</td>
                    <td>_______</td>
                    <td>_______</td>


                    </tr>
                </c:forEach>
                </tbody>


            </table>


        </div>
        <div role="tabpanel" class="tab-pane" id="chart">Div profile</div>
        <div role="tabpanel" class="tab-pane" id="messages">Div profile</div>
        <div role="tabpanel" class="tab-pane" id="settings">...</div>
    </div>

</div>


<br>
<br>
<br>


</body>
</html>