package com.mitotarea.service;

import java.util.List;

public interface ICRUD<T, ID> {
	T registrar (T per) throws Exception;
	T modificar (T per) throws Exception;
	List<T> listar() throws Exception;
	T listarPorId(ID id) throws Exception;
	void eliminar(ID id) throws Exception;
}