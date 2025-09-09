package edu.unimagdalena.coworker.domain.repository;

import edu.unimagdalena.coworker.domain.entity.Reservation;
import edu.unimagdalena.coworker.domain.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByMember(Member member);
}

