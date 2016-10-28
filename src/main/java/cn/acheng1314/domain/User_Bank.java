package cn.acheng1314.domain;

import java.io.Serializable;

/**
 * Created by luozhiyun on 16/10/28.
 */
public class User_Bank implements Serializable {
	private int id;
	private Bank_Account bank_account;
	private User user;
	private int count = 1;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Bank_Account getBank_account() {
		return bank_account;
	}

	public void setBank_account(Bank_Account bank_account) {
		this.bank_account = bank_account;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
