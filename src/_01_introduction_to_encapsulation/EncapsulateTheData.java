package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */

public class EncapsulateTheData {
	// 1. Encapsulate the member variables.
	// Add restrictions to the setters according to the comment.

	// 2. Create a new JUnit Test case and write tests to verify that
	// the member variables' getters and setters are working

	private int itemsReceived;

	int getItemsReceived() {
		return this.itemsReceived;
	}

	void setItemsRecieved(int itemsRecieved) {

		if (itemsRecieved >= 0) {
			this.itemsReceived = itemsRecieved;
		}

		else {

			this.itemsReceived = 0;
		}

	}

	// must not be negative. All negative arguments get set to 0.

	private float degreesTurned; // must be locked between 0.0 and 360.0 inclusive.

	float degreesTurned() {
		return this.degreesTurned;
	}

	void setdegreesTurned(int degreesTurned) {
		if (degreesTurned >= 0.0 && degreesTurned <= 360.0) {
			this.degreesTurned = degreesTurned;
		}
	}

	private String nomenclature = " "; // must not be set to a blank string. Blank Strings get set to a space

	String nomenclature() {
		return this.nomenclature;
	}

	void setnomenclature(String noonmenclature) {

		if (nomenclature.equals(" ")) {

			nomenclature = " ";
		}

	}

	private Object memberObj; // must not be a String. If it is a String, set it equal to a new Object();

	Object memberObj() {
		return this.memberObj;
	}

	void memberObj(Object memberObj) {

		if (memberObj instanceof String) {
			memberObj = new Object();
		}

	}

	public static void main(String[] args) {
		
		EncapsulateTheData en = new EncapsulateTheData();
		en.getItemsReceived();
		en.degreesTurned();
		en.nomenclature();
		en.memberObj();

	}
}
