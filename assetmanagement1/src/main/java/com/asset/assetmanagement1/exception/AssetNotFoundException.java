package com.asset.assetmanagement1.exception;

public class AssetNotFoundException extends Exception{
	public AssetNotFoundException(String errorMessage) {
		super(errorMessage);
	}
	
	public AssetNotFoundException(String errorMessage, Throwable t) {
		super(errorMessage, t);
	}
}
