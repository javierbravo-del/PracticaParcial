package utec.practicaparcial.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import utec.practicaparcial.User.Domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
