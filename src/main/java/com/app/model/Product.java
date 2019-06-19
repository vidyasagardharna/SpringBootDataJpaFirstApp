package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prod_tab")
public class Product {
	@Id
	@GeneratedValue
	@Column(name="pid")
	private Integer id;
	@Column(name="pcode")
	private String prodCode;
	@Column(name="pcost")
	private Double prodCst;
	public Product() {
		super();
	}
	public Product(String prodCode, Double prodCst) {
		super();
		this.prodCode = prodCode;
		this.prodCst = prodCst;
	}
	
	
	public Product(Integer id, String prodCode, Double prodCst) {
		super();
		this.id = id;
		this.prodCode = prodCode;
		this.prodCst = prodCst;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public Double getProdCst() {
		return prodCst;
	}
	public void setProdCst(Double prodCst) {
		this.prodCst = prodCst;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodCode=" + prodCode + ", prodCst=" + prodCst + "]";
	}
	
	
	

}
