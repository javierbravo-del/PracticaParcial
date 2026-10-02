package utec.practicaparcial.MentorProfile.Infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import utec.practicaparcial.MentorProfile.Domain.MentorProfile;

import java.util.Optional;

public interface MentorProfileRespository extends JpaRepository<MentorProfile,Long> {
    Optional<MentorProfile> findByUser_username(String username);
    boolean existsById(Long userId);
}
