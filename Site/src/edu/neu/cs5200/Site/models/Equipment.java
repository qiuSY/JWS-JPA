package edu.neu.cs5200.Site.models;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
public class Equipment {
	@Id
	
	private Integer id;
	private String name;
	private String brand;
	private String description;
	private Float price;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonBackReference
	@JoinColumn(name="towerId")
	
	private Tower tower;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Tower getTower() {
		return tower;
	}

	public void setTower(Tower tower) {
		this.tower = tower;
	}

	public Equipment(Integer id, String name, String brand, String description,
			Float price, Tower tower) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.description = description;
		this.price = price;
		this.tower = tower;
	}

	public Equipment() {
		super();
	}
	

}
