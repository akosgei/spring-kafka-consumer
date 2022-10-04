package com.kafkalearning.eventconsumer.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kafkalearning.eventconsumer.service.LibraryEventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@RequiredArgsConstructor
public class LibraryEventsConsumer {

    private final LibraryEventService libraryEventService;

    @KafkaListener(topics = {"library-events"}, groupId = "library-events-listener-group")
    public void onMessage(ConsumerRecord<Integer, String> consumerRecord) throws JsonProcessingException {
        log.info("consumer record: {}", consumerRecord);
        libraryEventService.processLibraryEvent(consumerRecord);
    }
}