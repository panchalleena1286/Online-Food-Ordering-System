package com.foodapp.backend.repository.postgres;

import com.foodapp.backend.model.postgres.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
