package com.bd_tienda_test.Interfaces;

import org.springframework.data.repository.CrudRepository;

import com.bd_tienda_test.Model.ProductoModel;

public interface IProducto extends CrudRepository<ProductoModel, String> {

}
