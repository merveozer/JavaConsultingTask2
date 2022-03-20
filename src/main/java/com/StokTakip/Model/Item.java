package com.StokTakip.Model;
import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name="item")
public class Item{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="category_id")
	private int category_id;
	
	@Column(name="store_id")
	private int store_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="price")
	private double price;
	
	@Column(name="created_at")
	private Date created_at;
	
	@Column(name="updated_at")
	private Date updated_at;
	
	
	public Item(int id, int user_id, int category_id, int store_id, String name, String description, int stock,
			double price, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.category_id = category_id;
		this.store_id = store_id;
		this.name = name;
		this.description = description;
		this.stock = stock;
		this.price = price;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public Item() {}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public int getStore_id() {
		return store_id;
	}


	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Date getCreated_at() {
		return created_at;
	}


	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}


	public Date getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	
}