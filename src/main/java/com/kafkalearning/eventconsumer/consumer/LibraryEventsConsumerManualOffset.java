package com.kafkalearning.eventconsumer.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kafkalearning.eventconsumer.service.LibraryEventService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.AcknowledgingConsumerAwareMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

/**
 * Demo consumer for manual acknowledgement of consumer messages
 */
//@Component
//@Slf4j
//@RequiredArgsConstructor
public class LibraryEventsConsumerManualOffset implements AcknowledgingConsumerAwareMessageListener<Integer, String> {



    @KafkaListener(topics = {"library-events"}, groupId = "library-events-listener-group")
    @Override
    public void onMessage(ConsumerRecord<Integer, String> data, Acknowledgment acknowledgment, Consumer<?, ?> consumer) {

    }
}
