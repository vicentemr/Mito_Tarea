package com.mitotarea.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitotarea.model.Producto;
import com.mitotarea.repo.IGenericRepo;
import com.mitotarea.repo.IProductoRepo;
import com.mitotarea.service.IProductoService;

@Service
public class ProductoServiceImpl extends CRUDImpl<Producto, Integer> implements IProductoService{
	
	@Autowired
	private IProductoRepo repo;
	
	protected IGenericRepo<Producto, Integer> getRepo(){
		return repo;
	}
}
