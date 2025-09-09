package edu.unimagdalena.coworker.domain.repository;

import edu.unimagdalena.coworker.domain.entity.MemberProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberProfileRepository extends JpaRepository<MemberProfile, Long> {
}

