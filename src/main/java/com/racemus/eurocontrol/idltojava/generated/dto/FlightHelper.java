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
public abstract class FlightHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(FlightHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_struct_tc(com.racemus.eurocontrol.idltojava.generated.dto.FlightHelper.id(),"Flight",new org.omg.CORBA.StructMember[]{new org.omg.CORBA.StructMember("idFlight", org.omg.CORBA.ORB.init().create_string_tc(0), null),new org.omg.CORBA.StructMember("aircraftId", org.omg.CORBA.ORB.init().create_string_tc(0), null)});
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final com.racemus.eurocontrol.idltojava.generated.dto.Flight s)
	{
		any.type(type());
		write( any.create_output_stream(),s);
	}

	public static com.racemus.eurocontrol.idltojava.generated.dto.Flight extract (final org.omg.CORBA.Any any)
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
		return "IDL:com/racemus/eurocontrol/idltojava/generated/dto/Flight:1.0";
	}
	public static com.racemus.eurocontrol.idltojava.generated.dto.Flight read (final org.omg.CORBA.portable.InputStream in)
	{
		com.racemus.eurocontrol.idltojava.generated.dto.Flight result = new com.racemus.eurocontrol.idltojava.generated.dto.Flight();
		result.idFlight=in.read_string();
		result.aircraftId=in.read_string();
		return result;
	}
	public static void write (final org.omg.CORBA.portable.OutputStream out, final com.racemus.eurocontrol.idltojava.generated.dto.Flight s)
	{
		java.lang.String tmpResult0 = s.idFlight;
out.write_string( tmpResult0 );
		java.lang.String tmpResult1 = s.aircraftId;
out.write_string( tmpResult1 );
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
    public static FlightHelper fromBinary(byte[] data) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            return (FlightHelper) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Unable to deserialize from binary", e);
        }
    }

}
