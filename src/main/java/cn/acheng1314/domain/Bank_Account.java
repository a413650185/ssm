package cn.acheng1314.domain;

import java.io.Serializable;

/**
 * Created by luozhiyun on 16/10/28.
 */
public class Bank_Account implements Serializable {
	private int id;
	private int account;
	private Bank bank;
	private Company company;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
}
