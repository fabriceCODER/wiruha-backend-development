package rca.ac.WiruhaBackend.service;


import org.springframework.beans.factory.annotation.Autowired;
import rca.ac.WiruhaBackend.model.User;
import rca.ac.WiruhaBackend.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void save(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
    }

}

