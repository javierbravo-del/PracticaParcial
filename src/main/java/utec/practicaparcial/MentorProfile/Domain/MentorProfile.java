package utec.practicaparcial.MentorProfile.Domain;

import jakarta.persistence.*;
import lombok.*;
import utec.practicaparcial.User.Domain.User;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mentor_profiles")

public class MentorProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    @Column(nullable = false)
    private String specialty;

    @Column(length = 300)
    private String bio;

    @Column(nullable = false)
    private String status;
}
