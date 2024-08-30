package com.api.crud.repositories;

import com.api.crud.models.ProductoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository<ProductoModel, Long> {





}
