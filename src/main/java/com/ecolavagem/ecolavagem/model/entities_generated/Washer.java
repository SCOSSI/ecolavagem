package com.ecolavagem.ecolavagem.model.entities_generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the washer database table.
 * 
 */
@Entity
@Table(name = "WASHER")
public class Washer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_WASHER")
	private int idWasher;

	private byte active;

	private byte checked;

	private int cpf;

	@Temporal(TemporalType.DATE)
	private Date created;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_LOGIN")
	private Date lastLogin;

	private String name;

	private String pass;

	private String phone;

	private String photo;

	private double rating;

	//bi-directional many-to-one association to Commentary
	@OneToMany(mappedBy="washer")
	private List<Commentary> commentaries;

	//bi-directional many-to-one association to Localization
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOCALIZATION")
	private Localization localization;

	//bi-directional many-to-one association to Company
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_COMPANY")
	private Company company;

	//bi-directional many-to-one association to Account
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_ACCOUNT")
	private Account account;

	public Washer() {
	}

	public int getIdWasher() {
		return this.idWasher;
	}

	public void setIdWasher(int idWasher) {
		this.idWasher = idWasher;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public byte getChecked() {
		return this.checked;
	}

	public void setChecked(byte checked) {
		this.checked = checked;
	}

	public int getCpf() {
		return this.cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getLastLogin() {
		return this.lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public double getRating() {
		return this.rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<Commentary> getCommentaries() {
		return this.commentaries;
	}

	public void setCommentaries(List<Commentary> commentaries) {
		this.commentaries = commentaries;
	}

	public Commentary addCommentary(Commentary commentary) {
		getCommentaries().add(commentary);
		commentary.setWasher(this);

		return commentary;
	}

	public Commentary removeCommentary(Commentary commentary) {
		getCommentaries().remove(commentary);
		commentary.setWasher(null);

		return commentary;
	}

	public Localization getLocalization() {
		return this.localization;
	}

	public void setLocalization(Localization localization) {
		this.localization = localization;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}