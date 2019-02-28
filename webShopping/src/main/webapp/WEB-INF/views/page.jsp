<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/img" /> 
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
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
	
	
	
	
  <!-- Bootstrap Core CSS -->
  <link href="${css}/bootstrap.min.css" rel="stylesheet">
  <link href="${css}/shop-homepage.css" rel="stylesheet">
  <link href="${css}/myapp.css" rel="stylesheet">
  <!-- Bootstrap Readable Theme -->
  <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">
  <!-- Bootstrap DataTables -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">
</head>

<body>
	<div class="wrapper">

		<%@include file="./shared/navbar.jsp"%>

		<div class="content">
			
			<c:if test="${userClickHome==true}">
				<%@include file="home.jsp"%>
			</c:if>

			<c:if test="${userClicAbout== true}">
				<%@include file="about.jsp"%>
			</c:if>

			<c:if test="${userClicContact== true}">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<c:if test="${userClicCategoryProducts== true or userClickAllProducts == true}">
				<%@include file="listProducts.jsp"%>
			</c:if>
					
			<c:if test="${userClickProduct==true}">
				<%@include file = "singleProduct.jsp"%>
			</c:if>
			
			<c:if test= "${userClickManageProduct==true}">
				<%@include file = "manageProducts.jsp"%>
			</c:if>
					
				
					
					
						
		</div>




		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.min.js"></script>
		<script src="${js}/myjs.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		
		
		<!-- jQuery -->
		<script src="${js}/jquery.js"></script>

		<!-- jQuery validator -->
		<script src="${js}/jquery.validate.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>
		
		<!-- DataTable Plugin -->
		<script src="${js}/jquery.dataTables.js"></script>
		
		<!-- DataTable Bootstrap Script -->
		<script src="${js}/dataTables.bootstrap.js"></script>
		
		<!-- Bootbox-->
		<script src="${js}/bootbox.min.js"></script>		
		
		
		
		<!-- Self coded javascript -->
		<script src="${js}/myjs.js"></script>
		
		
		
	</div>
</body>

</html>
