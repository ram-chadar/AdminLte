package com.ram.adminlte.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="links",catalog = "adminlte")
public class Links implements Serializable{

	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	
	private String Content;
	
	private String Click;
	
	public Links() {
		// TODO Auto-generated constructor stub
	}

	public Links(Integer id, String content, String click) {
		super();
		this.id = id;
		Content = content;
		Click = click;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getClick() {
		return Click;
	}

	public void setClick(String click) {
		Click = click;
	}
	
	
}
