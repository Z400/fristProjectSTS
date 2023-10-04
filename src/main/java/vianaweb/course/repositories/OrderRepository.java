package vianaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vianaweb.course.entitie.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
