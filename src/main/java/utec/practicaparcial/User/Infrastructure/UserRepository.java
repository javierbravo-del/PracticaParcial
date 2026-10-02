package utec.practicaparcial.User.Infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import utec.practicaparcial.User.Domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
}
