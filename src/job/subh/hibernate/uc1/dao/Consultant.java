package job.subh.hibernate.uc1.dao;

import java.io.Serializable;

public class Consultant implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int consultId;
	private int diseaseId;
	private int appointmentId;
	private String consultName;
	
	public int getConsultId() {
		return consultId;
	}
	public void setConsultId(int consultId) {
		this.consultId = consultId;
	}
	public int getDiseaseId() {
		return diseaseId;
	}
	public void setDiseaseId(int diseaseId) {
		this.diseaseId = diseaseId;
	}
	public String getConsultName() {
		return consultName;
	}
	public void setConsultName(String consultName) {
		this.consultName = consultName;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
}