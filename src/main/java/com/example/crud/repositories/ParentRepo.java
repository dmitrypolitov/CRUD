package com.example.crud.repositories;

import com.example.crud.models.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepo extends JpaRepository<Parent, Long> {
}
