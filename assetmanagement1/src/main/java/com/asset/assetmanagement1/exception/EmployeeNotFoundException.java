package com.asset.assetmanagement1.exception;

public class EmployeeNotFoundException extends Exception{

	private static final long serialVersionUID = -6031761730065128874L;
	
	public EmployeeNotFoundException(String errorMessage) {
		super(errorMessage);
	}
	
	public EmployeeNotFoundException(String errorMessage, Throwable t) {
		super(errorMessage, t);
	}
}
