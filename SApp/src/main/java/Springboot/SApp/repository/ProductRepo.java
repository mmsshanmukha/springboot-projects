package Springboot.SApp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import Springboot.SApp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{

}
