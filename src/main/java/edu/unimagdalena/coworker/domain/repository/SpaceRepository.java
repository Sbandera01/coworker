package edu.unimagdalena.coworker.domain.repository;

import edu.unimagdalena.coworker.domain.entity.Space;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpaceRepository extends JpaRepository<Space, Long> {
}

