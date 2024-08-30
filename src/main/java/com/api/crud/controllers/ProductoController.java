package com.api.crud.controllers;

import com.api.crud.models.ProductoModel;
import com.api.crud.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public ArrayList<ProductoModel> getProductos(){
        return this.productoService.getProductos();
    }

    @PostMapping
    public ProductoModel saveProducto(@RequestBody ProductoModel producto){
        return this.productoService.saveProducto(producto);
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductoModel> getById(@PathVariable("id") Long id){
        return this.productoService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public ProductoModel updateById(@RequestBody ProductoModel request, @PathVariable("id") Long id){
        return this.productoService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.productoService.deleteById(id);

        if(ok){
            return "El producto con id " + id + " ha sido eliminado";
        }else{
            return "Error; no se pudo eliminar el producto";
        }
    }


}
