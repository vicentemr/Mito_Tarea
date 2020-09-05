package com.mitotarea.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitotarea.model.Venta;
import com.mitotarea.repo.IGenericRepo;
import com.mitotarea.repo.IVentaRepo;
import com.mitotarea.service.IVentaService;

@Service
public class VentaServiceImpl extends CRUDImpl<Venta, Integer> implements IVentaService{
	
	@Autowired
	private IVentaRepo repo;
	
	@Override
	protected IGenericRepo<Venta, Integer> getRepo(){
		return repo;
	}
	
	@Override
	public Venta registrarVenta(Venta venta) throws Exception{
		venta.getDetalleVenta().forEach(det -> det.setVenta(venta));
		
		return repo.save(venta);
	}
}
