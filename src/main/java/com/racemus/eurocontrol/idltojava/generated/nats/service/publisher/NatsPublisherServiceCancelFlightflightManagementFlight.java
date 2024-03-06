package com.racemus.eurocontrol.idltojava.generated.nats.service.publisher;

import com.racemus.eurocontrol.idltojava.generated.dto.Flight;
import io.nats.client.Connection;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import lombok.extern.slf4j.Slf4j;

/**
 * ****************************************************************************
 * * Copyright (c) 2024 Eurocontrol.                                          *
 * * All Rights Reserved                                                       *
 * * THIS IS UNPUBLISHED PROPRIETARY SOURCE CODE OF Eurocontrol               *
 * * The copyright notice above does not evidence any actual or               *
 * * intended publication of such source code.                                *
 * ****************************************************************************
 *
 * Automatically generated NATS publisher service for subject CancelFlight::flightManagement.Flight.
 */
@Slf4j
public class NatsPublisherServiceCancelFlightflightManagementFlight implements INatsPublisherServiceCancelFlightflightManagementFlight {
  private final Connection natsConnection;

  public NatsPublisherServiceCancelFlightflightManagementFlight(Connection natsConnection) {
    this.natsConnection = natsConnection;
  }

  @Override
  public void publishEvent(Flight dto) {
    publishEvent(this.natsConnection, "CancelFlight::flightManagement.Flight", dto);
  }

  public static void publishEvent(Connection natsConnection, String subject, Flight dto) {
    try {
      byte[] data = dto.toBinary();
      natsConnection.publish(subject, data);
    } catch (Exception e) {
      log.warn("Error while publishing DTO '%s' on subject '%s'", dto, subject, e);
    }
  }
}
