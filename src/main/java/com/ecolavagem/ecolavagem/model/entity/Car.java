package com.ecolavagem.ecolavagem.model.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "CAR")
public class Car implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_CAR")
	private int idCar;

	@Column(name="PLATE_NUMBER")
	private String plateNumber;

	@Column(name="YEAR_FAB")
	private int yearFab;

	//bi-directional many-to-one association to Client
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CLIENT")
	private Client client;

	//bi-directional many-to-one association to Model
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_MODEL")
	private Model model;

	public Car() {
	}

	public int getIdCar() {
		return this.idCar;
	}

	public void setIdCar(int idCar) {
		this.idCar = idCar;
	}

	public String getPlateNumber() {
		return this.plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getYearFab() {
		return this.yearFab;
	}

	public void setYearFab(int yearFab) {
		this.yearFab = yearFab;
	}

	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

}