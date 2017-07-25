package com.ecolavagem.ecolavagem.model.entities_generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the client database table.
 * 
 */
@Entity
@Table(name = "CLIENT")
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_CLIENT")
	private int idClient;

	private byte active;

	@Temporal(TemporalType.DATE)
	private Date created;

	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_LOGIN")
	private Date lastLogin;

	private String name;

	private String pass;

	private String phone;

	private String photo;

	private double rating;

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

	public int getIdClient() {
		return this.idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
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