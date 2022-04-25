package id.ac.uin.kelompok5.matakuliah.repository;

import id.ac.uin.kelompok5.matakuliah.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}