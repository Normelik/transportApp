package com.simple.backend.repositories;

import com.simple.backend.models.Window;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WindowRepository extends JpaRepository<Window, Long> {

}
