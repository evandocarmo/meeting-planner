package com.evandocarmo.meetingplanner.repository;

import com.evandocarmo.meetingplanner.model.Outline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutlineRepository extends JpaRepository<Outline, Long> {

}
