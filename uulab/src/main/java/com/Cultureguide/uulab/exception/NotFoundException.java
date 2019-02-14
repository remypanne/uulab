package com.Cultureguide.uulab.exception;

public class NotFoundException extends RuntimeException {

	private static final long serialVersionUID = -1749672979746392283L;
	
	public NotFoundException() {
	}

	public NotFoundException(String msg) {
		super(msg);
	}
}
