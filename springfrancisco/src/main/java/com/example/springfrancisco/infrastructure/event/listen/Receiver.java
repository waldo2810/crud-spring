package com.example.springfrancisco.infrastructure.event.listen;

import java.nio.charset.StandardCharsets;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Receiver {
  public static String RECEIVE_METHOD_NAME = "receiveMessage";

  public void receiveMessage(byte[] message){
    log.info("Received message [{}]",new String(message, StandardCharsets.UTF_8));
  }
}
