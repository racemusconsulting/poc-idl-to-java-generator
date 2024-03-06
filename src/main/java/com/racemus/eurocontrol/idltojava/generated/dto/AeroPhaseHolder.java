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
public final class AeroPhaseHolder
	implements org.omg.CORBA.portable.Streamable
{
	public AeroPhase value;

	public AeroPhaseHolder ()
	{
	}
	public AeroPhaseHolder (final AeroPhase initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type ()
	{
		return AeroPhaseHelper.type ();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = AeroPhaseHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream out)
	{
		AeroPhaseHelper.write (out,value);
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
    public static AeroPhaseHolder fromBinary(byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (AeroPhaseHolder) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Unable to deserialize from binary", e);
        }
    }

}
