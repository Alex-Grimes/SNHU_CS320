package appointment;

import java.util.HashMap;
import java.util.Date;

public class AppointmentService {
	private HashMap<String, Appointment> appointments;

	public AppointmentService() {
		appointments = new HashMap<>();
	}
	
// All appointments will use a unique ID
	
	public void addAppointment (Appointment appointment) {
		appointments.put(appointment.getAppointmentId(), appointment);
	}
	

	public void deleteAppointment (String appointmentId) {
		appointments.remove(appointmentId);
	}
	
	public void updateAppointment (String appointmentId, Date newApptDate, String newDescription) {
		appointments.get(appointmentId).setAppointmentDate(newApptDate);
		appointments.get(appointmentId).setDescription(newDescription);
	}
	
	public HashMap<String, Appointment> getAppointments () {
		return appointments;
	}
}
