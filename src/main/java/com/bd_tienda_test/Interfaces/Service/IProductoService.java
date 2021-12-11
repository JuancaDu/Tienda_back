package com.bd_tienda_test.Interfaces.Service;

import java.util.List;
import java.util.Optional;

import com.bd_tienda_test.Model.ProductoModel;



public interface IProductoService {

	public List<ProductoModel> listarProductos();
	public Optional<ProductoModel> listarIdProducto(String Codigo);
	public int saveProducto (ProductoModel pr);	
	public void deleteProducto (String codigo);
}
