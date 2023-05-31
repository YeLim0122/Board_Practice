<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="myctx" value="${pageContext.request.contextPath}"/>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Board Write Form</title>
	
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>My Shop</title>
	
	<!-- jQuery library -->
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.min.js"></script>
    
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">


    <!-- Popper JS -->
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>

	<script type="text/javascript">
	
	</script>
	
	<style>
	
	</style>

</head>
<body>

	<div class="jumbotron text-center" style="margin-bottom:0">
		<h1>Memo Board</h1>
		<p>Here is your own Memo Board</p>
	</div>
	
	<!-- Grey with black text -->
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  		<ul class="navbar-nav">
	    	<li class="nav-item active">
	      		<a class="nav-link" href="${myctx}/board/home">Home</a>
	    	</li>
	    	<li class="nav-item">
	      		<a class="nav-link" href="#">Write</a>
	    	</li>
	    	<li class="nav-item">
	      		<a class="nav-link" href="#">List</a>
	    	</li>
	    	<li class="nav-item">
	      		<a class="nav-link disabled" href="#">My Page</a>
	    	</li>
  		</ul>
	</nav>
	
	<h1 style="margin:20px;">Main Page</h1>
	
</body>
</html>