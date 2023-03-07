package com.YCG.Board.repository;

import com.YCG.Board.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
    Optional<Test> findById(Integer id);
}
