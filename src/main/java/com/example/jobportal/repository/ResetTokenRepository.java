package com.example.jobportal.repository;

import com.example.jobportal.entity.ResetToken;
import com.example.jobportal.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ResetTokenRepository extends JpaRepository<ResetToken, Long> {
    void deleteByToken(String token);
    Optional<ResetToken> findByUser(Optional<Users> user);
    Optional<ResetToken> findByToken(String token);
}