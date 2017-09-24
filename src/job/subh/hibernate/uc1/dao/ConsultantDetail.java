package job.subh.hibernate.uc1.dao;

import java.io.Serializable;

public class ConsultantDetail implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int consultDetailId;
	private int appointId;
	private int diseaseId;
	private Consultant consultant;
	
	public int getConsultDetailId() {
		return consultDetailId;
	}
	public void setConsultDetailId(int consultDetailId) {
		this.consultDetailId = consultDetailId;
	}
	public int getAppointId() {
		return appointId;
	}
	public void setAppointId(int appointId) {
		this.appointId = appointId;
	}
	public int getDiseaseId() {
		return diseaseId;
	}
	public void setDiseaseId(int diseaseId) {
		this.diseaseId = diseaseId;
	}
	public Consultant getConsultant() {
		return consultant;
	}
	public void setConsultant(Consultant consultant) {
		this.consultant = consultant;
	}
	
	
}