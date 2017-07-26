package com.ecolavagem.ecolavagem.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the washer database table.
 * 
 */
@Entity
@Table(name = "WASHER")
public class Washer extends User implements Serializable {
	private static final long serialVersionUID = 1L;

	private Boolean checked;

	private int cpf;

	//bi-directional many-to-one association to Commentary
	@OneToMany(mappedBy = "washer")
	private List<Commentary> commentaries;

	//bi-directional many-to-one association to Localization
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_LOCALIZATION")
	private Localization localization;

	//bi-directional many-to-one association to Company
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_COMPANY")
	private Company company;

	//bi-directional many-to-one association to Account
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ACCOUNT")
	private Account account;

	public Washer() {
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public List<Commentary> getCommentaries() {
		return commentaries;
	}

	public void setCommentaries(List<Commentary> commentaries) {
		this.commentaries = commentaries;
	}

	public Localization getLocalization() {
		return localization;
	}

	public void setLocalization(Localization localization) {
		this.localization = localization;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
}