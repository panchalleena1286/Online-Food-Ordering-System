package com.foodapp.backend.serviceImpl;

import com.foodapp.backend.model.postgres.User;
import com.foodapp.backend.repository.postgres.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service                                 // <-- makes it a Spring bean
@RequiredArgsConstructor                 // <-- constructor-injection for userRepository
@Transactional(readOnly = true)         // <-- DB read-only optimisation
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    /**
     * Loads user by e-mail (you can switch to phone if you want).
     */
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        // 1️⃣  Fetch user from Postgres
        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found with email: " + email));

        // 2️⃣  Convert domain role to Spring Security authority
        List<GrantedAuthority> authorities = List.of(
                new SimpleGrantedAuthority("ROLE_" + user.getRole().name())
        );

        // 3️⃣  Return Spring-Security compatible user
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(),          // username
                user.getPassword(),       // hashed password
                authorities               // roles
        );
    }
}
