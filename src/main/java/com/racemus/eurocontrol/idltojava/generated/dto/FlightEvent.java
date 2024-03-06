package com.racemus.eurocontrol.idltojava.generated.dto;
import lombok.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.*;

/**
 * Generated from IDL struct "FlightEvent".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 6 mars 2024, 10:45:51
 */


@Data
public final class FlightEvent
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public FlightEvent(){}
	public com.racemus.eurocontrol.idltojava.generated.dto.Flight eventFlight;
	public com.racemus.eurocontrol.idltojava.generated.dto.AeroPhase aeroPhaseFlight;
	public FlightEvent(com.racemus.eurocontrol.idltojava.generated.dto.Flight eventFlight, com.racemus.eurocontrol.idltojava.generated.dto.AeroPhase aeroPhaseFlight)
	{
		this.eventFlight = eventFlight;
		this.aeroPhaseFlight = aeroPhaseFlight;
	}
    // Utility method for JSON serialization
    public static String toJson(Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Unable to serialize to JSON", e);
        }
    }

    // Utility method for binary serialization
    public byte[] toBinary() {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(this);
            return baos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Unable to serialize to binary", e);
        }
    }

    // Utility method for binary deserialization
    public static FlightEvent fromBinary(byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (FlightEvent) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Unable to deserialize from binary", e);
        }
    }

}
