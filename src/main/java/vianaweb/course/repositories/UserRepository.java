package vianaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vianaweb.course.entitie.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
