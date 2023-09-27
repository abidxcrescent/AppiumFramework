package com.library;



/**
 * @author Abid Ali
 *
 * This class is a child class of Exception class
 * It is implemented so that we can create our own custom Exception
 */
public class CustomException extends Exception{
	private static final long serialVersionUID = 1L;

	public CustomException (Object obj) {
		Log.error(obj.toString());
	}
	
	public CustomException (String errorName) {
		super(errorName);
		Log.error(errorName);
	}
}
