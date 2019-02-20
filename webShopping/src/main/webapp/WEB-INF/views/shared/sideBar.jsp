

<h1 class="my-4">Categories</h1>
<div class="list-group">

	<c:forEach items="${categoties}" var="category">
		<a href="${contextRoot}/com/show/category/${category.id}/products" class="list-group-item">${category.name}</a> 
	</c:forEach>
	
</div>
