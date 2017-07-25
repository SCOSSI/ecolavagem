package com.ecolavagem.ecolavagem.model.entities_generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the wash_registry database table.
 * 
 */
@Entity
@Table(name="WASH_REGISTRY")
public class WashRegistry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_WASH_REGISTRY")
	private int idWashRegistry;

	@Temporal(TemporalType.DATE)
	private Date date;

	//bi-directional many-to-one association to Client
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CLIENT")
	private Client client;

	//bi-directional many-to-one association to PaymentType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_PAYMENT_TYPE")
	private PaymentType paymentType;

	//bi-directional many-to-one association to Localization
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOCALIZATION_CAR")
	private Localization localization1;

	//bi-directional many-to-one association to Localization
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOCALIZATION_CLIENT")
	private Localization localization2;

	public WashRegistry() {
	}

	public int getIdWashRegistry() {
		return this.idWashRegistry;
	}

	public void setIdWashRegistry(int idWashRegistry) {
		this.idWashRegistry = idWashRegistry;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public PaymentType getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public Localization getLocalization1() {
		return this.localization1;
	}

	public void setLocalization1(Localization localization1) {
		this.localization1 = localization1;
	}

	public Localization getLocalization2() {
		return this.localization2;
	}

	public void setLocalization2(Localization localization2) {
		this.localization2 = localization2;
	}

}