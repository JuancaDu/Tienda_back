package com.bd_tienda_test.Interfaces.Service;

import java.util.List;
import java.util.Optional;

import com.bd_tienda_test.Model.FacturaModel;


public interface IFacturaService {
	public int saveFactura (FacturaModel f);
	public List<FacturaModel> listarFacturas();
	public Optional<FacturaModel> listarcodigoFactura(String Codigo);
	public void deleteFactura (String codigo);
		
}
