package com.bd_tienda_test.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bd_tienda_test.Model.ProveedorModel;


@Repository
public interface IProveedor extends CrudRepository<ProveedorModel, String> {

}
