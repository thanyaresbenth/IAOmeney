package com.tys.repositories;

import com.tys.entities.Transition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransitionRepository extends JpaRepository<Transition,Long> {
}
