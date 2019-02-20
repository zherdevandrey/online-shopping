<div class="container">

	<div class = "row">
		<div class="col-md-3">

			<%@include file="./shared/sideBar.jsp"%>

		</div>
		<!-- to display actual products -->
		<div class="col-md-9">
			<!-- Addded breadcrum component -->
			<div class="row">
				<div class = "col-lg-12">
				
					<c:if test="${userClickAllProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/com/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					
					<c:if test="${userClicCategoryProducts == true}">
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/com/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
					
				</div>
			</div>
		</div>
	</div>
</div>