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
 * Automatically generated NATS consumer service for subject CancelFlight.flightManagement.
 */
@Slf4j
public class NatsConsumerServiceCancelFlightflightManagement implements INatsConsumerServiceCancelFlightflightManagement {
  private final Connection natsConnection;

  private Dispatcher dispatcher;

  public NatsConsumerServiceCancelFlightflightManagement(Connection natsConnection) {
    this.natsConnection = natsConnection;
  }

  @Override
  public void consumeMessages(MessageHandler messageHandler) {
    this.dispatcher = this.natsConnection.createDispatcher(messageHandler);
    this.dispatcher.subscribe("CancelFlight.flightManagement");
  }

  @Override
  public void stop() {
    this.dispatcher.unsubscribe("CancelFlight.flightManagement");
  }
}
