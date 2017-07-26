package com.ecolavagem.ecolavagem.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;



@Entity
@Table(name = "LOCALIZATION")
public class Localization implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_LOCALIZATION")
	private int idLocalization;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE")
	private Date lastUpdate;

	private double latitude;

	private double longitude;

	//bi-directional many-to-one association to Client
	@OneToMany(mappedBy="localization")
	private List<Client> clients;

	//bi-directional many-to-one association to WashRegistry
	@OneToMany(mappedBy="localization1")
	private List<WashRegistry> washRegistries1;

	//bi-directional many-to-one association to WashRegistry
	@OneToMany(mappedBy="localization2")
	private List<WashRegistry> washRegistries2;

	//bi-directional many-to-one association to Washer
	@OneToMany(mappedBy="localization")
	private List<Washer> washers;

	public Localization() {
	}

	public Localization(Double latitude, Double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int getIdLocalization() {
		return this.idLocalization;
	}

	public void setIdLocalization(int idLocalization) {
		this.idLocalization = idLocalization;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public List<Client> getClients() {
		return this.clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Client addClient(Client client) {
		getClients().add(client);
		client.setLocalization(this);

		return client;
	}

	public Client removeClient(Client client) {
		getClients().remove(client);
		client.setLocalization(null);

		return client;
	}

	public List<WashRegistry> getWashRegistries1() {
		return this.washRegistries1;
	}

	public void setWashRegistries1(List<WashRegistry> washRegistries1) {
		this.washRegistries1 = washRegistries1;
	}

	public WashRegistry addWashRegistries1(WashRegistry washRegistries1) {
		getWashRegistries1().add(washRegistries1);
		washRegistries1.setLocalization1(this);

		return washRegistries1;
	}

	public WashRegistry removeWashRegistries1(WashRegistry washRegistries1) {
		getWashRegistries1().remove(washRegistries1);
		washRegistries1.setLocalization1(null);

		return washRegistries1;
	}

	public List<WashRegistry> getWashRegistries2() {
		return this.washRegistries2;
	}

	public void setWashRegistries2(List<WashRegistry> washRegistries2) {
		this.washRegistries2 = washRegistries2;
	}

	public WashRegistry addWashRegistries2(WashRegistry washRegistries2) {
		getWashRegistries2().add(washRegistries2);
		washRegistries2.setLocalization2(this);

		return washRegistries2;
	}

	public WashRegistry removeWashRegistries2(WashRegistry washRegistries2) {
		getWashRegistries2().remove(washRegistries2);
		washRegistries2.setLocalization2(null);

		return washRegistries2;
	}

	public List<Washer> getWashers() {
		return this.washers;
	}

	public void setWashers(List<Washer> washers) {
		this.washers = washers;
	}

	public Washer addWasher(Washer washer) {
		getWashers().add(washer);
		washer.setLocalization(this);

		return washer;
	}

	public Washer removeWasher(Washer washer) {
		getWashers().remove(washer);
		washer.setLocalization(null);

		return washer;
	}

}