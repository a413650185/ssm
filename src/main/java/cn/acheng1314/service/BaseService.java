package cn.acheng1314.service;

import cn.acheng1314.domain.Company;
import cn.acheng1314.domain.User;

/**
 * Created by luozhiyun on 16/10/28.
 */
public interface BaseService {
	public int addUser(User user);

	void addUser(String username, String password, int sex);

	void addCompany(Company company);
}
