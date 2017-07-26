package com.ecolavagem.ecolavagem.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name = "CLIENT")
public class Client extends User implements Serializable{
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Car
	@OneToMany(mappedBy="client")
	private List<Car> cars;

	//bi-directional many-to-one association to Localization
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_LOCALIZATION")
	private Localization localization;

	//bi-directional many-to-one association to Commentary
	@OneToMany(mappedBy="client")
	private List<Commentary> commentaries;

	//bi-directional many-to-one association to WashRegistry
	@OneToMany(mappedBy="client")
	private List<WashRegistry> washRegistries;

	public Client() {
	}


	public List<Car> getCars() {
		return this.cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Car addCar(Car car) {
		getCars().add(car);
		car.setClient(this);

		return car;
	}

	public Car removeCar(Car car) {
		getCars().remove(car);
		car.setClient(null);

		return car;
	}

	public Localization getLocalization() {
		return this.localization;
	}

	public void setLocalization(Localization localization) {
		this.localization = localization;
	}

	public List<Commentary> getCommentaries() {
		return this.commentaries;
	}

	public void setCommentaries(List<Commentary> commentaries) {
		this.commentaries = commentaries;
	}

	public Commentary addCommentary(Commentary commentary) {
		getCommentaries().add(commentary);
		commentary.setClient(this);

		return commentary;
	}

	public Commentary removeCommentary(Commentary commentary) {
		getCommentaries().remove(commentary);
		commentary.setClient(null);

		return commentary;
	}

	public List<WashRegistry> getWashRegistries() {
		return this.washRegistries;
	}

	public void setWashRegistries(List<WashRegistry> washRegistries) {
		this.washRegistries = washRegistries;
	}

	public WashRegistry addWashRegistry(WashRegistry washRegistry) {
		getWashRegistries().add(washRegistry);
		washRegistry.setClient(this);

		return washRegistry;
	}

	public WashRegistry removeWashRegistry(WashRegistry washRegistry) {
		getWashRegistries().remove(washRegistry);
		washRegistry.setClient(null);

		return washRegistry;
	}

}