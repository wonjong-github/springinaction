package tacos.data;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import tacos.User;

import java.util.Optional;

@SpringBootTest
@Transactional
class UserRepositoryTest {

    @Autowired
    UserRepository userRepository;

    @Test
    void findByUsername() {
        User user = new User("user", "password", "Lee", "street", "city", "state", "zip", "phonenumber");
        User save = userRepository.save(user);
        System.out.println(save);

        Optional<User> byUsername = userRepository.findByUsername("user");
        System.out.println(byUsername.get());
    }

}