package com.ecolavagem.ecolavagem.model.entities_generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@Table(name = "COMPANY")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_COMPANY")
	private int idCompany;

	private byte checked;

	private String cnpj;

	private String name;

	//bi-directional many-to-one association to Commentary
	@OneToMany(mappedBy="company")
	private List<Commentary> commentaries;

	@OneToOne
	@JoinColumn(name="ID_ACCOUNT")
	private Account account;

	//bi-directional many-to-one association to Washer
	@OneToMany(mappedBy="company")
	private List<Washer> washers;

	public Company() {
	}

	public int getIdCompany() {
		return this.idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	public byte getChecked() {
		return this.checked;
	}

	public void setChecked(byte checked) {
		this.checked = checked;
	}

	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Commentary> getCommentaries() {
		return this.commentaries;
	}

	public void setCommentaries(List<Commentary> commentaries) {
		this.commentaries = commentaries;
	}

	public Commentary addCommentary(Commentary commentary) {
		getCommentaries().add(commentary);
		commentary.setCompany(this);

		return commentary;
	}

	public Commentary removeCommentary(Commentary commentary) {
		getCommentaries().remove(commentary);
		commentary.setCompany(null);

		return commentary;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Washer> getWashers() {
		return this.washers;
	}

	public void setWashers(List<Washer> washers) {
		this.washers = washers;
	}

	public Washer addWasher(Washer washer) {
		getWashers().add(washer);
		washer.setCompany(this);

		return washer;
	}

	public Washer removeWasher(Washer washer) {
		getWashers().remove(washer);
		washer.setCompany(null);

		return washer;
	}

}