package com.ecolavagem.ecolavagem.model.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "BRAND")
public class Brand implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID_BRAND")
	private int idBrand;

	@Column(name = "BRAND", nullable = false)
	private String brand;

	//bi-directional many-to-one association to Model
	@OneToMany(mappedBy="brand")
	private List<Model> models;

	public Brand() {
	}

	public int getIdBrand() {
		return this.idBrand;
	}

	public void setIdBrand(int idBrand) {
		this.idBrand = idBrand;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Model> getModels() {
		return this.models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}

	public Model addModel(Model model) {
		getModels().add(model);
		model.setBrand(this);

		return model;
	}

	public Model removeModel(Model model) {
		getModels().remove(model);
		model.setBrand(null);

		return model;
	}

}