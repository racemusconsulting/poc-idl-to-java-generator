package com.racemus.eurocontrol.idltojava.generated.dto;
import lombok.Data;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.*;
/**
 * Generated from IDL enum "AeroPhase".
 *
 * @author JacORB IDL compiler V 3.9
 * @version generated at 6 mars 2024, 10:45:52
 */


@Data
public final class AeroPhase
	implements org.omg.CORBA.portable.IDLEntity
{
	/** Serial version UID. */
	private static final long serialVersionUID = 1L;
	private int value = -1;
	public static final int _TAKE_OFF = 0;
	public static final AeroPhase TAKE_OFF = new AeroPhase(_TAKE_OFF);
	public static final int _INITIAL_CLIMB = 1;
	public static final AeroPhase INITIAL_CLIMB = new AeroPhase(_INITIAL_CLIMB);
	public static final int _CRUISE = 2;
	public static final AeroPhase CRUISE = new AeroPhase(_CRUISE);
	public static final int _APPROACH = 3;
	public static final AeroPhase APPROACH = new AeroPhase(_APPROACH);
	public static final int _LANDING = 4;
	public static final AeroPhase LANDING = new AeroPhase(_LANDING);
	public int value()
	{
		return value;
	}
	public static AeroPhase from_int(int value)
	{
		switch (value) {
			case _TAKE_OFF: return TAKE_OFF;
			case _INITIAL_CLIMB: return INITIAL_CLIMB;
			case _CRUISE: return CRUISE;
			case _APPROACH: return APPROACH;
			case _LANDING: return LANDING;
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	public String toString()
	{
		switch (value) {
			case _TAKE_OFF: return "TAKE_OFF";
			case _INITIAL_CLIMB: return "INITIAL_CLIMB";
			case _CRUISE: return "CRUISE";
			case _APPROACH: return "APPROACH";
			case _LANDING: return "LANDING";
			default: throw new org.omg.CORBA.BAD_PARAM();
		}
	}
	protected AeroPhase(int i)
	{
		value = i;
	}
	/**
	 * Designate replacement object when deserialized from stream. See
	 * http://www.omg.org/docs/ptc/02-01-03.htm#Issue4271
	 *
	 * @throws java.io.ObjectStreamException
	 */
	java.lang.Object readResolve()
	throws java.io.ObjectStreamException
	{
		return from_int(value());
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
    public static AeroPhase fromBinary(byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (AeroPhase) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Unable to deserialize from binary", e);
        }
    }

}
