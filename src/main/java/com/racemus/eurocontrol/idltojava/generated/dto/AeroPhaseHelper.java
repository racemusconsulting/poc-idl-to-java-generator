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
public abstract class AeroPhaseHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(AeroPhaseHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_enum_tc(com.racemus.eurocontrol.idltojava.generated.dto.AeroPhaseHelper.id(),"AeroPhase",new String[]{"TAKE_OFF","INITIAL_CLIMB","CRUISE","APPROACH","LANDING"});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final com.racemus.eurocontrol.idltojava.generated.dto.AeroPhase s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static com.racemus.eurocontrol.idltojava.generated.dto.AeroPhase extract (final org.omg.CORBA.Any any)
	{
		org.omg.CORBA.portable.InputStream in = any.create_input_stream();
		try
		{
			return read (in);
		}
		finally
		{
			try
			{
				in.close();
			}
			catch (java.io.IOException e)
			{
			throw new RuntimeException("Unexpected exception " + e.toString() );
			}
		}
	}

	public static String id()
	{
		return "IDL:com/racemus/eurocontrol/idltojava/generated/dto/AeroPhase:1.0";
	}
	public static AeroPhase read (final org.omg.CORBA.portable.InputStream in)
	{
		return AeroPhase.from_int(in.read_long());
	}

	public static void write (final org.omg.CORBA.portable.OutputStream out, final AeroPhase s)
	{
		out.write_long(s.value());
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
    public static AeroPhaseHelper fromBinary(byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (AeroPhaseHelper) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Unable to deserialize from binary", e);
        }
    }

}
