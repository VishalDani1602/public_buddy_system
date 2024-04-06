package com.example.publicbuddysystem.Repository;

import com.example.publicbuddysystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
