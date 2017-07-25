package com.ecolavagem.ecolavagem.model.entities_generated;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name="COMMENTARY")
public class Commentary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_COMMENTARY")
	private int idCommentary;

	private String commentary;

	//bi-directional many-to-one association to Client
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CLIENT")
	private Client client;

	//bi-directional many-to-one association to Washer
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_WASHER")
	private Washer washer;

	//bi-directional many-to-one association to Company
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_COMPANY")
	private Company company;

	public Commentary() {
	}

	public int getIdCommentary() {
		return this.idCommentary;
	}

	public void setIdCommentary(int idCommentary) {
		this.idCommentary = idCommentary;
	}

	public String getCommentary() {
		return this.commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Washer getWasher() {
		return this.washer;
	}

	public void setWasher(Washer washer) {
		this.washer = washer;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}