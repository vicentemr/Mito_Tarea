package com.mitotarea.service;

import com.mitotarea.model.Venta;

public interface IVentaService extends ICRUD<Venta, Integer>{

	Venta registrarVenta(Venta venta) throws Exception;
}
