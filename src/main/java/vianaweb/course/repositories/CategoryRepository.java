package vianaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vianaweb.course.entitie.Category;

public interface CategoryRepository extends JpaRepository <Category, Long> {

}
