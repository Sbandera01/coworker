package edu.unimagdalena.coworker.domain.repository;

import edu.unimagdalena.coworker.domain.entity.Room;
import edu.unimagdalena.coworker.domain.entity.Space;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<Room, Long> {
    List<Room> findBySpace(Space space);
}

