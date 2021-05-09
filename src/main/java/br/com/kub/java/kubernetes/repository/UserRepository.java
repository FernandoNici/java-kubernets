package br.com.kub.java.kubernetes.repository;

import br.com.kub.java.kubernetes.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

