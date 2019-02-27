$(function() {
	
	switch(menu) {
	
		case 'About us':
			$('#about').addClass('active');
			break;
		case 'Contact us':
			$('#contact').addClass('active');
			break;
		case 'All Products':
			$('#listProducts').addClass('active');
			break;
		default:	
			$('#home').addClass('active');
			break;		
	}
	
	
	

	



			var jsonUrl = '';
			if(window.categoryId == '') {
				jsonUrl = 'http://localhost:8080/com' + '/json/data/all/products';
			}
			else {
				jsonUrl = 'http://localhost:8080/com' + '/json/data/category/'+ window.categoryId +'/products';
			}
		
		$('#productListTable').DataTable( {
			
			
			
			destroy: true,
			lengthMenu: [[3,5,10,-1], ['3 Records', '5 Records', '10 Records', 'ALL']],
			pageLength: 5,
			ajax: {
				url: jsonUrl,
				dataSrc: ''
			},
			columns: [
			          {
			        	  data: 'code',
			        	  bSortable: false,
			        	  mRender: function(data, type, row) {
			        		  
			      
			        		  
			        		  return '<img src="'+'http://localhost:8080/com'+'/resources/img/'+data+'.jpg" style="width:100px; height:100px"/>' ;
			        		 
			        	  }
			        	 
			          },
			          {
			        	  data: 'name'			        	  
			          },
			          {
			        	  data: 'brand'			        	  
			          },
			          {
			        	  data: 'unitPrice',
			        
			          },
			          {
			        	  data: 'quantity',
			        	  mRender: function(data, type, row) {
			        		
			        		  if(data < 1) {
			        			  return '<span style="color:red">Out of Stock!</span>';
			        		  }
			        		  
			        		  return data;
			        		  
			        	  }
			          },
			          {
			        	  data: 'id',
			        	  
			        	  mRender: function(data, type, row) {
			        		  var str = '';
			        		  	  str += '<a href="'+ 'http://localhost:8080/com' + '/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160;';
			        		  
				        	  if (row.quantity<1){
				        		  str += '<a href="javascript:void(0)" class="btn btn-success disabled"><span class="glyphicon glyphicon-shopping-cart"></span></a>';
				        	  }
				        	  else{
				        		  str += '<a href="'+ 'http://localhost:8080/com' + '/cart/add/'+data+'/product" class="btn btn-success"><span class="glyphicon glyphicon-shopping-cart"></span></a>'; 	 
				        	  }

			        		  return str;
			        		  
			        	  }
			        	
			          }
			          ]
		});
	

	
	
	
	
	
	
})