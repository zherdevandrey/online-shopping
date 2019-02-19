<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" /> 
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Online shopping</title>
	<script>
	var menu = '${title}';
	</script>
  <link href="${css}/bootstrap.min.css" rel="stylesheet">
  <link href="${css}/shop-homepage.css" rel="stylesheet">
  <link href="${css}/myapp.css" rel="stylesheet">
  <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
</head>

<body>
	<div class="wrapper">

		<%@include file="./shared/navbar.jsp"%>

		<div class="content">

			<c:if test="${userClickHome == true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${userClicAbout== true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userClicContact== true}">
				<%@include file="contact.jsp"%>
			</c:if>

			<c:if test="${userClicProducts== true}">
				<%@include file="productsList.jsp"%>
			</c:if>
			<!-- /.container -->
		</div>

		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/myjs.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
	</div>
</body>

</html>
