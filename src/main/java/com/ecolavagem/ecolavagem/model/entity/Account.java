package com.ecolavagem.ecolavagem.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ACCOUNT")
public class Account implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_ACCOUNT")
	private int idAccount;

	@Column(name="AGENCY", nullable = false)
	private String agency;

	@Column(name="BANK_NAME", nullable = false)
	private String bankName;

	@Column(name="NUMBER", nullable = false)
	private int number;

	@OneToOne
	private Company company;

	@OneToOne
	private Washer washer;

	public Account() {
	}

	public int getIdAccount() {
		return this.idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public String getAgency() {
		return this.agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Washer getWasher() {
		return washer;
	}

	public void setWasher(Washer washer) {
		this.washer = washer;
	}
}