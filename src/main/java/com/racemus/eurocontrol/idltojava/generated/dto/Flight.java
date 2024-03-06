package com.racemus.eurocontrol.idltojava.generated.dto;
import lombok.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.*;

/**
 * Generated from IDL struct "Flight".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 6 mars 2024, 10:45:51
 */


@Data
public final class Flight
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	public Flight(){}
	public java.lang.String idFlight = "";
	public java.lang.String aircraftId = "";
	public Flight(java.lang.String idFlight, java.lang.String aircraftId)
	{
		this.idFlight = idFlight;
		this.aircraftId = aircraftId;
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
    public static Flight fromBinary(byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (Flight) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Unable to deserialize from binary", e);
        }
    }

}
