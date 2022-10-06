package br.com.uberserverdriver.driver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.uberserverdriver.driver.domains.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
