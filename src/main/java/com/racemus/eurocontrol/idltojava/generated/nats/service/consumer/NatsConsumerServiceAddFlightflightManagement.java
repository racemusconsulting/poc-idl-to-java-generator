package com.racemus.eurocontrol.idltojava.generated.nats.service.consumer;

import io.nats.client.Connection;
import io.nats.client.Dispatcher;
import io.nats.client.MessageHandler;
import java.lang.Override;
import lombok.extern.slf4j.Slf4j;

/**
 * ****************************************************************************
 * *                       Copyright (c) 2024 Eurocontrol.                    *
 * *                            All Rights Reserved                           *
 * *        THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF Eurocontrol        *
 * *        The copyright notice above does not evidence any actual or        *
 * *                intended publication of such source code.                 *
 * ****************************************************************************
 *
 * Automatically generated NATS consumer service for subject AddFlight.flightManagement.
 */
@Slf4j
public class NatsConsumerServiceAddFlightflightManagement implements INatsConsumerServiceAddFlightflightManagement {
  private final Connection natsConnection;

  private Dispatcher dispatcher;

  public NatsConsumerServiceAddFlightflightManagement(Connection natsConnection) {
    this.natsConnection = natsConnection;
  }

  @Override
  public void consumeMessages(MessageHandler messageHandler) {
    this.dispatcher = this.natsConnection.createDispatcher(messageHandler);
    this.dispatcher.subscribe("AddFlight.flightManagement");
  }

  @Override
  public void stop() {
    this.dispatcher.unsubscribe("AddFlight.flightManagement");
  }
}
