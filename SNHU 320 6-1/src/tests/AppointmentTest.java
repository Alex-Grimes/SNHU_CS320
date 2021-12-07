package tests;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import appointment.Appointment;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class AppointmentTest {
	
	@Test
	void testAppointmentClass() {
		Date now = new Date();
		Appointment appointment = new Appointment("09876", now, "Dull Description");
		assertTrue(appointment.getAppointmentId().equals("09876"));
		assertTrue(appointment.getAppointmentDate().equals(now));
		assertTrue(appointment.getDescription().equals("Dull Description"));
	}
	
	
	//Test Requirement 1: Appointment Id
	@Test
	void testAppointmentClassAppointmentIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("098766789123", new Date(), "Dull Description");
		});
	}
	
	@Test
	void testAppointmentClassAppointmentIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null, new Date(), "Dull Description");
		});
	}
	
	
	//Test Requirement 2: Appointment Date
	@Test
	void testAppointmentClassAppointmentDayInPast() throws ParseException {
		Date pastDate = new SimpleDateFormat("MMMM d, yyyy").parse("September 01, 2021");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("09876", pastDate, "Dull Description");
		});
	}
	
	@Test
	void testAppointmentClassAppointmentDayNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("09876", null, "Dull Description");
		});
	}
	
	
	//Test Requirement 3: Appointment Description
	@Test
	void testAppointmentClassDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("09876", new Date(), "This description is too long and should throw an exception");
		});
	}
	
	@Test
	void testAppointmentClassDescriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("09876", new Date(), null);
		});
	}
}
