package edu.unimagdalena.coworker.domain.repository;

import edu.unimagdalena.coworker.domain.entity.Amenity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmenityRepository extends JpaRepository<Amenity, Long> {
}

