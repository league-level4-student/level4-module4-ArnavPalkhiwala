package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends Hospital {

	boolean doM = false;
	Hospital h = new Hospital();

	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (getPatients.size() >= 3) {

			throw new DoctorFullException();

		}

		else {

			getPatients.add(patient);

		}
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		doM = true;
	}

}
