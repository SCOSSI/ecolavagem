package com.ecolavagem.ecolavagem.model.entities_generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the model database table.
 * 
 */
@Entity
@Table(name = "MODEL")
public class Model implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_MODEL")
	private int idModel;

	private String model;

	//bi-directional many-to-one association to Car
	@OneToMany(mappedBy="model")
	private List<Car> cars;

	//bi-directional many-to-one association to Brand
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_BRAND")
	private Brand brand;

	public Model() {
	}

	public int getIdModel() {
		return this.idModel;
	}

	public void setIdModel(int idModel) {
		this.idModel = idModel;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public List<Car> getCars() {
		return this.cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public Car addCar(Car car) {
		getCars().add(car);
		car.setModel(this);

		return car;
	}

	public Car removeCar(Car car) {
		getCars().remove(car);
		car.setModel(null);

		return car;
	}

	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}