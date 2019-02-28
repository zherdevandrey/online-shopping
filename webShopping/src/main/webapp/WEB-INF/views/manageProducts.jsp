<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="container">
	<div class="row">
		<div class="col-md-offset-2 col-md-8">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h4>Product Management</h4>
				</div>

				<div class="panel-body">
     					 
					<sf:form class="form-horizontal" modelAttribute="product" action="${contextRoot}/manage/products" method="POST" enctype="multipart/form-data">
					
						<div class="form-group">
							<label class="control-label col-md-4" for="name">Enter
								product</label>
							<div class="col-md-8">
								<sf:input type="text" path="name" id="name"
									placeholder="Product name" class="form-control"/>
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-4" for="brand">Enter
								brand</label>
							<div class="col-md-8">
								<sf:input type="text" path="brand" id="brand"
									placeholder="Brand name" class="form-control"/>
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4" for="description">Product Description</label>
							<div class="col-md-8">
								<sf:textarea path="description" name="description" id="description" rows="4" placeholder="Please write description"/>
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4" for="unitPrice">Enter Unit Price</label>
							<div class="col-md-8">
								<sf:input type="text" path="unitPrice" id="unitPrice"
									placeholder="Please enter unit price" class="form-control"/>
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4" for="quantity">Enter Unit Quantity</label>
							<div class="col-md-8">
								<sf:input type="text" path="quantity" id="quantity"
									placeholder="Please enter unit quantity" class="form-control"/>
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-4" for="quantity">Select category</label>
							<div class="col-md-8">
								<sf:select path="categoryId" id="categoryId" class="form-control"
									items="${categories}"
									itemLabel="name"
									itemValue="id"
								/>
							</div>
						</div>

						<div class="form-group">
							<div class="col-md-offset-4 col-md-8">
								<input type="submit" name="submit" id="submit" value="Submit"
									class="btn btn-primary"/>
								<sf:hidden path="id"/>
								<sf:hidden path="code"/>
								<sf:hidden path="supplierId"/>
								<sf:hidden path="purchases"/>
								<sf:hidden path="views"/>
							</div>
						</div>

					</sf:form>


				</div>
			</div>
		</div>
	</div>
</div>