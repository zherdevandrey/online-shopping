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
	
	
	

	



		
		
		$('#productListTable').DataTable( {
			destroy: true,
			lengthMenu: [[3,5,10,-1], ['3 Records', '5 Records', '10 Records', 'ALL']],
			pageLength: 5,
			ajax: {
				url: 'http://localhost:8080/com/json/data/all/products',
				dataSrc: ''
			},
			columns: [
			          {
			        	  data: 'code',
			        	 
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
			        	 
			          },
			          {
			        	  data: 'id',
			        	
			          }
			          ]
		});
	

	
	
	
	
	
	
})