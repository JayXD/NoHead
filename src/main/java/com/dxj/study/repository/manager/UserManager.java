package com.dxj.study.repository.manager;

import com.dxj.study.entity.User;
import com.dxj.study.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Optional;

@Component
@AllArgsConstructor
public class UserManager {
    @Resource
    private final UserRepository userRepository;

    public User queryOneUser(String email) {
        Optional<User> one = userRepository.findOne(Example.of(User.builder()
                .email(email).build()));
        return one.orElse(null);
    }

    public User save(User user) {
        if (user.getPassword() != null) {
            user.assignPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(10)));
        }
        return userRepository.save(user);
    }
}
