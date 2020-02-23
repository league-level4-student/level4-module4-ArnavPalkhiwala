package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	List<Doctor> getDoctors = new ArrayList<Doctor>();
	List<Doctor> getPatients = new ArrayList<Doctor>();

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		getDoctors.add(generalPractitioner);
	}

	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub

		getDoctors.add(surgeon);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return getDoctors;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		getPatients.add(patient);
	}

	public List<Doctor> getPatients() {
		// TODO Auto-generated method stub
		return getPatients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub

	}

}
