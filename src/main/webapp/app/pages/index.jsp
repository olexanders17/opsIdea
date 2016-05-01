<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html ng-app="ops">
<head>
    <title>AK</title>
<script src="/app/js/angular/angular.min.js"></script>
<script src="/app/js/angular/angular-resource.min.js"></script>
<script src="/app/js/angular/angular-route.min.js"></script>
<script src="/app/js/app/app.js"></script>
    <link rel="stylesheet" href="/app/css/bootstrap.min.css">
    <link rel="stylesheet" href="/app/css/style.css">

    </link>
</head>
<body>

<%--navigation panel--%>
<div class="container-fluid">
    <div class="row">

        <nav role="navigation" class="navbar">
            <div class="navbar navbar-header ">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12 ">AK</div>
                    </div>
                </div>

                <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">

                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>

                </button>
                <div id="navbarCollapse" class="collapse navbar-collapse navbar-right">

                    <ul class="nav nav-pills">
                        <li class=""><a href="#" class="btn btn-default " >Menu1</a></li>
                        <li><a href="#">Menu1</a></li>
                        <li><a href="#">Menu1</a></li>
                        <li><a href="#">Menu1</a></li>
                        <li><a href="#">Menu1</a></li>

                    </ul>


                </div>


            </div>
        </nav>
    </div>
</div>
<%--navigation panel end--%>


<div class="container-fluid">
    <diw class="row">
        <%--left panel--%>
        <div class="col-lg-2 col-md-2 col-sm-3 ">

    <div class="panel-info">
        <div class="panel-heading"><div class="sidebar-header">Links</div></div>
        <div class="panel-body">

            <ul class="list-group">
                <li class="list-group-item list-group-item-info">
                    <a href="#">Calendar</a>
                </li>


                <li class="list-group-item list-group-item-info">
                    <a href="#">Datatable</a>
                </li>

                <li class="list-group-item list-group-item-info">
                    <a href="#/fieldInfo">Field info</a>
                </li>

                <hr>
                <li class="list-group-item list-group-item-info">
                    <a href="#">Admin panel</a>
                </li>

            </ul>


        </div>
    </div>

        </div>
        <%--left panel end--%>


            <%--center panel--%>
            <div class="col-lg-9">
dddddddddddddddd
                <ng-view></ng-view>


            </div>
            <%--center panel end--%>



    </diw>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="/app/js/bootstrap/bootstrap.min.js"></script>
</body>
</html>
