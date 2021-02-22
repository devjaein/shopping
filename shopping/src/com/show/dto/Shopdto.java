package com.show.dto;

public class Shopdto {
	
	private String id;
	private String passwrod;
	private String name;
	private String rnn;
	private String gender;
	private String mail;
	private String phone;
	private String addres;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswrod() {
		return passwrod;
	}
	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRnn() {
		return rnn;
	}
	public void setRnn(String rnn) {
		this.rnn = rnn;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}

	public Shopdto(String id, String passwrod, String name, String rnn, String gender, String mail, String phone, String addres) {
		super();
		this.id = id;
		this.passwrod = passwrod;
		this.name = name;
		this.rnn = rnn;
		this.gender = gender;
		this.mail = mail;
		this.phone = phone;
		this.addres = addres;
	}
}
