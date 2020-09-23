package com.be.productsprototype.dao;

import com.be.productsprototype.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.Path;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,Long> {
    @RestResource(path = " /byCodePage")
    public Page<Product> findByCodeContains(@Param("code")String code, Pageable pageable);
    @RestResource(path = " /byNamePage")
    public Page<Product> findByNameContains(@Param("name")String name, Pageable pageable);


}
