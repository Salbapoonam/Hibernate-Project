package map.oneToone.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	int pincode;
	String colonyName;
	String Area;

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", colonyName=" + colonyName + ", Area=" + Area + "]";
	}

	public Address(int pincode, String colonyName, String area) {
		super();
		this.pincode = pincode;
		this.colonyName = colonyName;
		Area = area;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getColonyName() {
		return colonyName;
	}

	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

}
