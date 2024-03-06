package com.racemus.eurocontrol.idltojava.generated.nats.service.consumer;

import io.nats.client.MessageHandler;

public interface INatsConsumerServiceCancelFlightflightManagement {
  void consumeMessages(MessageHandler messageHandler);

  void stop();
}
