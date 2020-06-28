package com.example.streams.kafkastreams;

import org.apache.kafka.streams.kstream.KStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaStreamsApplication {

  public static void main(String[] args) {
    SpringApplication.run(KafkaStreamsApplication.class, args);
  }

  @Bean
  public java.util.function.Consumer<KStream<String, String>> process() {
    return stream -> stream.foreach((key, value) -> {
      System.out.println(key + ":" + value);
    });
  }
}
