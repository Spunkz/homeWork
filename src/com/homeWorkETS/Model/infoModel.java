package com.homeWorkETS.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Info")
public class infoModel {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "firstName")
	String firstName;;
	
	@Column(name = "lastName")
	String lastName;

	@Column(name = "bloodGroup")
	String bloodGroup;

	@Column(name = "telephone")
	String telephone;

	@Column(name = "address")
	String address;


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public infoModel() {
		super();
	}

	public infoModel(int id, String firstName, String lastName, String bloodGroup, String telephone, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.bloodGroup = bloodGroup;
		this.telephone = telephone;
		this.address = address;
	}

}
