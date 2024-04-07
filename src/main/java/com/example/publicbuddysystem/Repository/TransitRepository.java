package com.example.publicbuddysystem.Repository;

import com.example.publicbuddysystem.Model.ActiveTransit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransitRepository extends JpaRepository<ActiveTransit, Integer> {

}