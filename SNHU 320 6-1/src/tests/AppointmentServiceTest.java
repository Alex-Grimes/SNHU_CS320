package tests;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import appointment.AppointmentService;
import appointment.Appointment;

import java.util.Date;

public class AppointmentServiceTest {
	
	@Test
	void testAppointmentServiceClass() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment appointment = new Appointment("09871", new Date(), "Dull Description");
		assertFalse(appointmentService == null);
		assertFalse(appointment == null);
	}
	
	@Test
	void testAppointmentServiceClassAddAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment appointment = new Appointment("23456", new Date(), "Dull Description");
		appointmentService.addAppointment(appointment);
		assertTrue(appointmentService.getAppointments().containsValue(appointment));
	}
	
	@Test
	void testAppointmentServiceClassDeleteAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment temp = new Appointment("23456", new Date(), "Dull Description");
		appointmentService.addAppointment(temp);
		appointmentService.deleteAppointment("23456");
		assertFalse(appointmentService.getAppointments().containsValue(temp));
	}
	
	
	@Test
	void testAppointmentServiceClassUpdateAppointment() {
		AppointmentService appointmentService = new AppointmentService();
		Appointment temp = new Appointment("09871", new Date(), "Dull Description");		
		appointmentService.addAppointment(temp);
		assertTrue(appointmentService.getAppointments().containsValue(temp));
		assertTrue(temp.getDescription().equals("Dull Description"));
		appointmentService.updateAppointment("09871", new Date(), "This is a NEW description");
		assertTrue(appointmentService.getAppointments().containsValue(temp));
		assertFalse(temp.getDescription().equals("Dull Description"));
	}
}
