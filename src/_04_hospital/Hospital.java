package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	List<Doctor> getDoctors = new ArrayList<Doctor>();
	List<Patient> getPatients = new ArrayList<Patient>();

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

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return getPatients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub

		System.out.println(getPatients.size());

		for (int i = 0; i < getDoctors.size(); i++) {

			for (int j = 0; j < getPatients.size(); j++) {

				getDoctors.get(i).addPatient(getPatients.get(0));
				System.out.println(getDoctors.get(i));
				System.out.println(getDoctors.get(i).getPatients.size());
				getPatients.remove(0);

				if (getDoctors.get(i).getPatients().size() == 3) {

					break;

				}
			}

		}

	}

}
