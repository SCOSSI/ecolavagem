package com.ecolavagem.ecolavagem.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the payment_type database table.
 * 
 */
@Entity
@Table(name="payment_type")
@NamedQuery(name="PaymentType.findAll", query="SELECT p FROM PaymentType p")
public class PaymentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_PAYMENT_TYPE")
	private int idPaymentType;

	private String description;

	private String name;

	//bi-directional many-to-one association to WashRegistry
	@OneToMany(mappedBy="paymentType")
	private List<WashRegistry> washRegistries;

	public PaymentType() {
	}

	public int getIdPaymentType() {
		return this.idPaymentType;
	}

	public void setIdPaymentType(int idPaymentType) {
		this.idPaymentType = idPaymentType;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<WashRegistry> getWashRegistries() {
		return this.washRegistries;
	}

	public void setWashRegistries(List<WashRegistry> washRegistries) {
		this.washRegistries = washRegistries;
	}

	public WashRegistry addWashRegistry(WashRegistry washRegistry) {
		getWashRegistries().add(washRegistry);
		washRegistry.setPaymentType(this);

		return washRegistry;
	}

	public WashRegistry removeWashRegistry(WashRegistry washRegistry) {
		getWashRegistries().remove(washRegistry);
		washRegistry.setPaymentType(null);

		return washRegistry;
	}

}