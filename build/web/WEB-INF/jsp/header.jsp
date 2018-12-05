<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Store</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
                <style rel="stylesheet" >
                body {
            padding-bottom: 40px;
            padding-top: 60px;
        }

        .sidebar-nav-fixed {
                width:14%;
        }
                </style>
      
    </head>

    <body>
        <div class="navbar navbar-fixed-top navbar-default">
  	<div class="container">
      <div class="navbar-header"><a class="navbar-brand" href="#">Book Store</a><a class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="glyphicon glyphicon-bar"></span>
          <span class="glyphicon glyphicon-bar"></span>
          <span class="glyphicon glyphicon-bar"></span>
        </a>
      </div>
        <div class="navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="${pageContext.request.contextPath}/books/menu.htm">Home</a>
                </li>
                <li><a href="${pageContext.request.contextPath}/books/toinsertbook.htm">Add book</a>
                </li>
                <li><a href="#contact">Contact</a>
                </li>
            </ul>
        
        </div>
        <!--/.navbar-collapse -->
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-md-3">
            <div class="sidebar-nav-fixed affix">
                <div class="well">
                    
                    
                        <ul class="nav">
                            <li class="nav-header"> Categories</li>
                            <c:forEach items="${allcategories}" var="c">
                            <li class="active"><a href="${pageContext.request.contextPath}/books/book/${c.id}.htm">${c.title}</a></li>
                            </c:forEach>
                        </ul>
                  

                </div>
                <!--/.well -->
            </div>
            <!--/sidebar-nav-fixed -->
        </div>
