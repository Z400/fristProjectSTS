package vianaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vianaweb.course.entitie.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
