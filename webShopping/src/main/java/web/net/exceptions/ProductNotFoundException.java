package web.net.exceptions;

import java.io.Serializable;

public class ProductNotFoundException extends Exception implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String message;
	public ProductNotFoundException() {
		this("Product is not available");
	}
	
	public ProductNotFoundException(String string) {
		this.message = System.currentTimeMillis() + ": "+message;
	}

	public String getMessage() {
		return message;
	}
}

