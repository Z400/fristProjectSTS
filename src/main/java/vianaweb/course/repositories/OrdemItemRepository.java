package vianaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vianaweb.course.entitie.OrdemItem;

public interface OrdemItemRepository extends JpaRepository <OrdemItem, Long> {

}
