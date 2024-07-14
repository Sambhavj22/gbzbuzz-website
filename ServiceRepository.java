package com.gbjbuzz.repository;

import com.gbjbuzz.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}
