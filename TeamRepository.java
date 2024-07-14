package com.gbjbuzz.repository;

import com.gbjbuzz.model.TeamMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamMember, Long> {
}
