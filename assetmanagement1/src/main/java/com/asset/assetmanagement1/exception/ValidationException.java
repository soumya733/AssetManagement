package com.asset.assetmanagement1.exception;

public class ValidationException extends Exception{


	private static final long serialVersionUID = -6031761730065128874L;
	
	public ValidationException(String errorMessage) {
		super(errorMessage);
	}

	public ValidationException(String errorMessage, Throwable t) {
		super(errorMessage, t);
	}


}