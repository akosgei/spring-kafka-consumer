package com.kafkalearning.eventconsumer.reposity;

import com.kafkalearning.eventconsumer.entity.LibraryEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryEventRepository extends JpaRepository<LibraryEvent, Integer> {
}
