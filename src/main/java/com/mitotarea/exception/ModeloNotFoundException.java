package com.mitotarea.exception;

public class ModeloNotFoundException extends RuntimeException{

	public ModeloNotFoundException(String mensaje) {
		super(mensaje);
	}
}
