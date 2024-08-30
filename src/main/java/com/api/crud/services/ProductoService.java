package com.api.crud.services;

import com.api.crud.models.ProductoModel;
import com.api.crud.repositories.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class ProductoService {

    @Autowired
    IProductoRepository productoRepository;

    public ArrayList<ProductoModel> getProductos(){
        return (ArrayList<ProductoModel>) productoRepository.findAll();
    }

    public ProductoModel saveProducto(ProductoModel producto){
        return productoRepository.save(producto);
    }

    public Optional<ProductoModel> getById(Long id){
        return productoRepository.findById(id);
    }

    public ProductoModel updateById(ProductoModel request, Long id){
        ProductoModel producto = productoRepository.findById(id).get();
        producto.setNombre(request.getNombre());
        producto.setPrecio(request.getPrecio());
        producto.setStock(request.getStock());
        productoRepository.save(producto);
        return producto;
    }

     public Boolean deleteById(Long id){
        try {
            productoRepository.deleteById(id);
            return true;
        }catch (Exception e) {
            return false;
        }
    }




}
