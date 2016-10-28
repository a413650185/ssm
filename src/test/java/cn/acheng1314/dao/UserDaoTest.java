package cn.acheng1314.dao;

import cn.acheng1314.domain.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by luozhiyun on 16/10/28.
 */

public class UserDaoTest extends BaseTest{
	@Autowired
	private UserDao userDao;

	@Test
	public void add() throws Exception {
		User u = new User();
		u.setPassword("123456");
		u.setSex(1);
		u.setUsername("h哈a");
		userDao.add(u);
	}

}