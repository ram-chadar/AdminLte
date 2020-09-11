package com.ram.adminlte.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="operators",catalog = "adminlte")
public class Operators {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	private Integer id;
	
	private String Person;
	
	private String Forr;
	
	private String contact;
	
	private String timing;
	
	private String whatsapp;
	
	private String phonecall;
	
	private String sms;
	
	private String eMail;
	
	public Operators() {
		// TODO Auto-generated constructor stub
	}

	public Operators(Integer id, String person, String forr, String contact, String timing, String whatsapp,
			String phonecall, String sms, String eMail) {
		super();
		this.id = id;
		Person = person;
		Forr = forr;
		this.contact = contact;
		this.timing = timing;
		this.whatsapp = whatsapp;
		this.phonecall = phonecall;
		this.sms = sms;
		this.eMail = eMail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPerson() {
		return Person;
	}

	public void setPerson(String person) {
		Person = person;
	}

	public String getForr() {
		return Forr;
	}

	public void setForr(String forr) {
		Forr = forr;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getTiming() {
		return timing;
	}

	public void setTiming(String timing) {
		this.timing = timing;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getPhonecall() {
		return phonecall;
	}

	public void setPhonecall(String phonecall) {
		this.phonecall = phonecall;
	}

	public String getSms() {
		return sms;
	}

	public void setSms(String sms) {
		this.sms = sms;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
}
