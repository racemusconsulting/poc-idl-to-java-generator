package com.racemus.eurocontrol.idltojava.generated.nats.service.consumer;

import io.nats.client.MessageHandler;

public interface INatsConsumerServiceAddFlightflightManagement {
  void consumeMessages(MessageHandler messageHandler);

  void stop();
}
