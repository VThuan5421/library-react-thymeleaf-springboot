package com.learning.library2.repository;

import com.learning.library2.entity.Profile;
import com.learning.library2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    User findByEmail(String email);
    // email is considered a username
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);


}
