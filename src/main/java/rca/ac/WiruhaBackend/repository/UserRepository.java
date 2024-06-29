package rca.ac.WiruhaBackend.repository;

import rca.ac.WiruhaBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

