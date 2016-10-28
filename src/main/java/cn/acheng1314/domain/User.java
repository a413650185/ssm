package cn.acheng1314.domain;

import java.io.Serializable;

/**
 * Created by luozhiyun on 16/10/28.
 */
public class User implements Serializable{
	private int id;
	private String password;
	private int sex;
	private String username;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
