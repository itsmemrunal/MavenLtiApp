package com.lti.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ICICIBANK")
@DiscriminatorValue("ICICI")
public class ICICI extends Bank{

	private String lombardIndurance;
	

	
	public ICICI() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICICI(int bankid, String bankName, String location) {
		super(bankid, bankName, location);
		// TODO Auto-generated constructor stub
	}

	public ICICI(String lombardIndurance) {
		super();
		this.lombardIndurance = lombardIndurance;
	}

	public String getLombardIndurance() {
		return lombardIndurance;
	}

	public void setLombardIndurance(String lombardIndurance) {
		this.lombardIndurance = lombardIndurance;
	}
}
