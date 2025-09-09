package edu.unimagdalena.coworker.domain.repository;

import edu.unimagdalena.coworker.domain.entity.ReservationItem;
import edu.unimagdalena.coworker.domain.entity.Reservation;
import edu.unimagdalena.coworker.domain.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationItemRepository extends JpaRepository<ReservationItem, Long> {
    List<ReservationItem> findByReservation(Reservation reservation);
    List<ReservationItem> findByRoom(Room room);
}
