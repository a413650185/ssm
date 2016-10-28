package cn.acheng1314.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by luozhiyun on 16/10/28.
 */
public class Company implements Serializable {
	private int id;
	private String address;
	private Date date;
	private String name;
	private int number;
	private int tel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
}
