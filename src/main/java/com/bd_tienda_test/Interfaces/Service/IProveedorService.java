package com.bd_tienda_test.Interfaces.Service;

import java.util.List;
import java.util.Optional;

import com.bd_tienda_test.Model.ProveedorModel;

public interface IProveedorService {

	public List<ProveedorModel> listarProveedores();
	public Optional<ProveedorModel> listarIdProveedor(String nit);
	public int saveProveedor (ProveedorModel p);	
	public void deleteProveedor (String nit);
}
