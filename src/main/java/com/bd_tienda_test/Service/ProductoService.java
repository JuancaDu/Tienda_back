package com.bd_tienda_test.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bd_tienda_test.Interfaces.IProducto;
import com.bd_tienda_test.Interfaces.Service.IProductoService;
import com.bd_tienda_test.Model.ProductoModel;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProducto productodb;
	
	@Override
	public List<ProductoModel> listarProductos() {
		return (List<ProductoModel>)productodb.findAll();
	}

	@Override
	public Optional<ProductoModel> listarIdProducto(String Codigo) {		
		return productodb.findById(Codigo);
	}

	@Override
	public int saveProducto (ProductoModel pr) {
		// TODO Auto-generated method stub
		int res =0;
		ProductoModel producto = productodb.save(pr);
		if(!producto.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void deleteProducto (String codigo) {
		productodb.deleteById(codigo);
		
	}
	
	
}
