package tacos.data;

import org.springframework.data.jpa.repository.JpaRepository;
import tacos.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
